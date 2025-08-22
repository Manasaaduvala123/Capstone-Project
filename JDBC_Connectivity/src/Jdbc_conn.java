import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_conn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String password="admin";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("connection established");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		System.out.println("emp_id\t emp_name\t salary\t phonenum\t");
		while(rs.next())
		{
			int emp_id=rs.getInt("emp_id");
			String emp_name=rs.getString("emp_name");
			int salary=rs.getInt("salary");
			float phonenum=rs.getFloat("phonenum");
			System.out.println(emp_id+"  "+emp_name+"  "+salary+"  "+phonenum);	
		}
		rs.close();
		stmt.close();
		con.close();
		
	}

}
