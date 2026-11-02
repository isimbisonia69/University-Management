package lab2;

import java.sql.*;
import java.sql.ResultSet;
public class CreateTable {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/University_db";
        String user = "postgres";
        String password = "mukankusi";

        String students = """
                CREATE TABLE IF NOT EXISTS students (
                    student_id SERIAL PRIMARY KEY,
                    name VARCHAR(100) NOT NULL,
                    email VARCHAR(100) UNIQUE NOT NULL,
                    program VARCHAR(100)
                )
                """;

        String courses = """
                CREATE TABLE IF NOT EXISTS courses (
                    course_id SERIAL PRIMARY KEY,
                    course_name VARCHAR(100) NOT NULL,
                    course_code VARCHAR(20) UNIQUE NOT NULL
                )
                """;

        String enrollments = """
                CREATE TABLE IF NOT EXISTS enrollments (
                    enrollment_id SERIAL PRIMARY KEY,
                    student_id INT REFERENCES students(student_id),
                    course_id INT REFERENCES courses(course_id),
                    enrollment_date DATE DEFAULT CURRENT_DATE,
                    UNIQUE(student_id, course_id)
                )
                """;
        String sql = "SELECT table_name FROM information_schema.tables " +
                "WHERE table_schema = 'public'";

        try {
            Connection connection =
                    DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            statement.execute(students);
            statement.execute(courses);
            statement.execute(enrollments);

            System.out.println("Tables created successfully!");

            ResultSet result = statement.executeQuery(sql);


            while (result.next()) {
                System.out.println(result.getString("table_name"));
            }

            result.close();
            statement.close();
            connection.close();


            statement.close();

            connection.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());


        }
    }
}