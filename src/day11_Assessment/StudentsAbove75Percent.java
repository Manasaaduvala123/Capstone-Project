package day11_Assessment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentsAbove75Percent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "admin";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();
            String query = "SELECT * FROM student WHERE percentage > 75";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ID\tName\tPercentage");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float percentage = rs.getFloat("percentage");
                System.out.println(id + "\t" + name + "\t" + percentage);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}

