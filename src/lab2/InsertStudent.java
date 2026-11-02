package lab2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudent {
    public void insertStudent(String name,String email,String program){
        String sql = "insert into students(name,email,program) values(?,?,?)";
        try (Connection connection = DatabaseConnection.getConnection();PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1,name);
            statement.setString(2,email);
            statement.setString(3,program);

            statement.executeUpdate();

            System.out.println("Student inserted successfully!");

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
