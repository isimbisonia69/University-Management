package lab2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DeleteStudent {
    public void deleteStudent (int studentId){

        String sql = "DELETE FROM students WHERE student_Id = ?";
        try(Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql)) {
           statement.setInt(1,studentId);

           int rows = statement.executeUpdate();

           if (rows >0){
               System.out.println("Student deleted successfully");
           }else {
               System.out.println("Failed to delete student");
           }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
