import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="admin";
		// create table
		String sql="create table IF NOT EXISTS students(rollno int,"
				+ " name varchar(50),"
				+ " per int,"
				+ " email varchar(50))";
		//inserting values
		String insertSQL="insert IGNORE into students values(101,'neeva sharma',98,'neeva@gmail.com'),"
				+ "(102,'Robin sharma',98,'robin@gmail.com'),"
				+ "(103,'manasa aduvala',98,'manasa@gmail.com')";
		//update values
		String updateSQL="update students set per=88 where name='Robin sharma'";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("connection established");
		Statement stmt=con.createStatement();
		stmt.executeUpdate(sql);
		System.out.println("student table created");
		int rowInserted=stmt.executeUpdate(insertSQL);
		int rowUpdated =stmt.executeUpdate(updateSQL);
		if(rowInserted>0)
		{
			System.out.println("new student record inserted");
			System.out.println("updated the precntage value");
		}
		ResultSet rs=stmt.executeQuery("select * from students");
		//System.out.println("rollno\t name\t percentage\t email");
		System.out.printf("%-10s %-20s %-15s %-25s%n", "RollNo", "Name", "Percentage", "Email");
		while(rs.next())
		{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			int per=rs.getInt("per");
			String email=rs.getString("email");
			//System.out.println(rollno+ " "+name+" "+per+ " "+ email);
			System.out.printf("%-10d %-20s %-15d %-25s%n", rollno, name, per, email);
		}
		stmt.close();
		con.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}

	}

}
