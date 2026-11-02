package lab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnrollmentDAO {

    // Enroll student in a course
    public void enrollStudent(int studentId, int courseId) {

        String sql = "INSERT INTO enrollments (student_id, course_id) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, studentId);
            statement.setInt(2, courseId);

            statement.executeUpdate();

            System.out.println("Student enrolled successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Display students with their enrolled courses using JOIN
    public void listStudentCourses() {

        String sql = "SELECT students.student_id, students.name, courses.course_name " +
                "FROM students " +
                "JOIN enrollments ON students.student_id = enrollments.student_id " +
                "JOIN courses ON enrollments.course_id = courses.course_id";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {

                System.out.println("Student ID: " + result.getInt("student_id"));
                System.out.println("Student Name: " + result.getString("name"));
                System.out.println("Course Name: " + result.getString("course_name"));

                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
