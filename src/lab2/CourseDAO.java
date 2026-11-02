package lab2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseDAO {

    // Insert course
    public void insertCourse(String courseName, String courseCode) {

        String sql = "INSERT INTO courses (course_name, course_code) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, courseName);
            statement.setString(2, courseCode);

            statement.executeUpdate();

            System.out.println("Course added successfully!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // List courses
    public void listCourses() {

        String sql = "SELECT * FROM courses";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet result = statement.executeQuery()) {

            while (result.next()) {
                System.out.println("Course ID: " + result.getInt("course_id"));
                System.out.println("Course Name: " + result.getString("course_name"));
                System.out.println("Course Code: " + result.getString("course_code"));

                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Delete course
    public void deleteCourse(int courseId) {

        String sql = "DELETE FROM courses WHERE course_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, courseId);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println("Course deleted successfully!");
            } else {
                System.out.println("Course not found!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}