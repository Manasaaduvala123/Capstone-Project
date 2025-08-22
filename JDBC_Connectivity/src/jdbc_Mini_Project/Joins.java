package jdbc_Mini_Project;
import java.sql.*;
public class Joins {
	    public static void main(String[] args) throws ClassNotFoundException, SQLException {

	        String url = "jdbc:mysql://localhost:3306/mydb";
	        String user = "root";
	        String password = "admin";

	        // Create Student table
	        String createStudent = "CREATE TABLE IF NOT EXISTS student (" +
	                "rollno INT PRIMARY KEY, " +
	                "name VARCHAR(50), " +
	                "city VARCHAR(50), " +
	                "per DECIMAL(5,2))";

	        // Create Institute table
	        String createInstitute = "CREATE TABLE IF NOT EXISTS institute (" +
	                "rollno INT PRIMARY KEY, " +
	                "instituteName VARCHAR(50))";

	        // Insert sample data into Student table
	        String insertStudents = "INSERT IGNORE INTO student VALUES " +
	                "(101,'Neeva Sharma','Delhi',98.0)," +
	                "(102,'Robin Sharma','Delhi',88.5)," +
	                "(103,'Manasa Aduvala','Hyderabad',92.0)," +
	                "(104,'Amit Verma','Mumbai',75.5)";

	        // Insert sample data into Institute table
	        String insertInstitutes = "INSERT IGNORE INTO institute VALUES " +
	                "(101,'IIT Delhi')," +
	                "(102,'IIT Bombay')," +
	                "(105,'NIT Warangal')";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url, user, password);
	            System.out.println("Connection Established");

	            Statement stmt = con.createStatement();
	            // Create tables
	            stmt.executeUpdate(createStudent);
	            stmt.executeUpdate(createInstitute);
	            System.out.println("Tables Created");
	            stmt.executeUpdate(insertStudents);
	            stmt.executeUpdate(insertInstitutes);
	            System.out.println("rows inserted");
	            System.out.println();

	            //INNER JOIN
	            System.out.println("INNER JOIN");
	            String innerJoin = "SELECT s.rollno, s.name, s.city, s.per, i.instituteName " +
	                               "FROM student s INNER JOIN institute i ON s.rollno = i.rollno";
	            ResultSet rs1 = stmt.executeQuery(innerJoin);
	            System.out.printf("%-8s %-18s %-12s %-10s %-20s%n",
	                    "RollNo", "Name", "City", "Percent", "Institute");
	            while (rs1.next()) {
	                System.out.printf("%-8d %-18s %-12s %-10.2f %-20s%n",
	                        rs1.getInt("rollno"),
	                        rs1.getString("name"),
	                        rs1.getString("city"),
	                        rs1.getDouble("per"),
	                        rs1.getString("instituteName"));
	            }
	            System.out.println();

	            //LEFT JOIN
	            System.out.println("LEFT JOIN");
	            String leftJoin = "SELECT s.rollno, s.name, s.city, s.per, i.instituteName " +
	                              "FROM student s LEFT JOIN institute i ON s.rollno = i.rollno";
	            ResultSet rs2 = stmt.executeQuery(leftJoin);
	            System.out.printf("%-8s %-18s %-12s %-10s %-20s%n",
	                    "RollNo", "Name", "City", "Percent", "Institute");
	            while (rs2.next()) {
	                System.out.printf("%-8d %-18s %-12s %-10.2f %-20s%n",
	                        rs2.getInt("rollno"),
	                        rs2.getString("name"),
	                        rs2.getString("city"),
	                        rs2.getDouble("per"),
	                        rs2.getString("instituteName"));
	            }
	            System.out.println();

	            //RIGHT JOIN
	            System.out.println("RIGHT JOIN");
	            String rightJoin = "SELECT s.rollno, s.name, s.city, s.per, i.instituteName " +
	                               "FROM student s RIGHT JOIN institute i ON s.rollno = i.rollno";
	            ResultSet rs3 = stmt.executeQuery(rightJoin);
	            System.out.printf("%-8s %-18s %-12s %-10s %-20s%n",
	                    "RollNo", "Name", "City", "Percent", "Institute");
	            while (rs3.next()) {
	                System.out.printf("%-8d %-18s %-12s %-10.2f %-20s%n",
	                        rs3.getInt("rollno"),
	                        rs3.getString("name"),
	                        rs3.getString("city"),
	                        rs3.getDouble("per"),
	                        rs3.getString("instituteName"));
	            }
	            System.out.println();

	            //FULL JOIN
	            System.out.println("FULL JOIN Prints All Records from Both Tables");
	            String fullJoin = "SELECT s.rollno, s.name, s.city, s.per, i.instituteName " +
	                              "FROM student s LEFT JOIN institute i ON s.rollno = i.rollno " +
	                              "UNION " +
	                              "SELECT s.rollno, s.name, s.city, s.per, i.instituteName " +
	                              "FROM student s RIGHT JOIN institute i ON s.rollno = i.rollno";
	            ResultSet rs4 = stmt.executeQuery(fullJoin);
	            System.out.printf("%-8s %-18s %-12s %-10s %-20s%n",
	                    "RollNo", "Name", "City", "Percent", "Institute");
	            while (rs4.next()) {
	                System.out.printf("%-8d %-18s %-12s %-10.2f %-20s%n",
	                        rs4.getInt("rollno"),
	                        rs4.getString("name"),
	                        rs4.getString("city"),
	                        rs4.getDouble("per"),
	                        rs4.getString("instituteName"));
	            }

	            stmt.close();
	            con.close();
	        } 
	        catch (SQLException e) {
	            System.out.println("SQL Error: " + e.getMessage());
	        } catch (ClassNotFoundException e) {
	            System.out.println("Driver Error: " + e.getMessage());
	        }
	    }
	}
