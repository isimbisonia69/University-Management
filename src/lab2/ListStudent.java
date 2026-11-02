package lab2;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListStudent {
    public void listStudent() {
        String sql = "select * from students";
        try (Connection connection = DatabaseConnection.getConnection() ;
            Statement statement = connection.createStatement()){


            ResultSet result = statement.executeQuery(sql);


          while(result.next()) {
              System.out.println("Student ID:" + result.getInt("Student_Id"));

              System.out.println("Name:" + result.getString("name"));
              System.out.println("Email:" + result.getString("email"));
              System.out.println("Progrma:" + result.getString("program"));

              System.out.println();



          }

          }catch (SQLException e) {
              System.out.println(e.getMessage());
            }
        }
    }

