package lab2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class UpdateEnrollement {
    public void updateEnrollement(int studentId,int oldCourseId,int newCourseId){

        String sql ="UPDATE enrollments SET course_id = ?" +
                " WHERE student_id = ? AND course_id = ?";

                try(Connection connection = DatabaseConnection.getConnection();
                    PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setInt(1,newCourseId);
                    statement.setInt(2,studentId);
                    statement.setInt(3,oldCourseId);

                    int rows = statement.executeUpdate();

                    if(rows <0) {
                        System.out.println("Updated enrollment successfully");

                    }else {
                        System.out.println("Failed to update enrollment");
                    }



                }catch (SQLException e){
                    System.out.println(e.getMessage());
                }
    }
}
