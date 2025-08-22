package jdbc_Mini_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class AllSQLOperations {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="admin";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("connection established");
			Statement stmt=con.createStatement();
			//create table
			String CreateSQL= "create Table if not exists students("
			+"rollno int,"
			+"name varchar(50),"
			+"city varchar(50),"
			+"per decimal,"
			+"email varchar(50))";
			//insert values into table
			stmt.executeUpdate(CreateSQL);
			String insertSQL = "INSERT INTO students VALUES " +
					"(101,'Neeva Sharma','mumbai',98,'neeva@gmail.com')," +
	                "(102,'Robin Sharma','Delhi',88,'robin@gmail.com')," +
	                "(103,'Manasa Aduvala','Hyderabad',92,'manasa@gmail.com')";
	               
			//update query
			String updateSQL = "UPDATE students SET per = 90 WHERE rollno = 102";
			//Statement stmt=con.createStatement();
			System.out.println("students table is created");
			int inserted=stmt.executeUpdate(insertSQL);
			if(inserted>0)
			{
				System.out.println("rows are insrted into table");
			}
			int update=stmt.executeUpdate(updateSQL);
			if(update>0)
			{
				System.out.println("row is updated sucessfully");
			}
			System.out.println("student details");
			//printTable(stmt);
			System.out.println("highest percentage among  student:");
			ResultSet rs=stmt.executeQuery("select * from students order by per DESC limit 1");
			while(rs.next())
			{
				System.out.println(
						rs.getInt("rollno")+ " "
				+rs.getString("name")+ " "
				+rs.getBigDecimal("per")+" "
				+rs.getString("city")+" "
				+ rs.getString("email"));
			}
			System.out.println("students in ascending order");
			ResultSet rs1=stmt.executeQuery("select * from students order by name asc");
			while (rs1.next()) {
				System.out.println(
				        rs1.getInt("rollno")+ " " 
				        + rs1.getString("name")+ " "
				        + rs1.getBigDecimal("per")+" "
				        + rs1.getString("city")+" "
				        + rs1.getString("email"));
				}
			System.out.println("students from same city");
			ResultSet rs2 = stmt.executeQuery(
			    "SELECT city, GROUP_CONCAT(name) AS students " +
			    "FROM students " +
			    "GROUP BY city HAVING COUNT(*) > 1");

			while (rs2.next()) {
			    System.out.println(rs2.getString("city") + " → " + rs2.getString("students"));
			}

			//add column
			stmt.executeUpdate("alter table students add column phonenum varchar(10)");
			System.out.println("phone number column added");
			
			// change datatype
			stmt.executeUpdate("alter table students modify column per float");
			System.out.println("percentage datatype changed to float");
			
			
			
			//change table name
			 stmt.executeUpdate("alter table students rename to student_details");
			System.out.println("table name changed");
			
			//drop single column
			stmt.executeUpdate("alter table students_details drop column phonenum");
			System.out.println("phone number column deleted");
			
			//delete single row
			stmt.executeUpdate("delete from students_details where rollno=101");
			System.out.println("rollno 101 row deleted");
			
			//Delete all the records from table without affecting table attributes 
			//stmt.executeUpdate("truncate table student_details");
			//System.out.println("Deleted all the records from table without affecting table attributes");
			
			//Delete entire table 
			//stmt.executeUpdate("drop table student_details");*/
			

        } catch (SQLException e)
		{
            System.out.println("SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e)
		{
            System.out.println("Driver Error: " + e.getMessage());
        }
    }
}
