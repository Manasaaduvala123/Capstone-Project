import java.sql.*;
public class EmployeeClass {

	private static Object e;

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/mydb";
	    String user = "root";
	    String password = "admin";
	 
	    try (Connection con = DriverManager.getConnection(url, user, password)) {
	    	System.out.println("connection established");
	    	
	    	System.out.println("adding 500 bouns to all employees");
	    	CallableStatement cst1=con.prepareCall("{call addBonus()}");
	    	ResultSet rs=cst1.executeQuery();
	    	System.out.println();
	    	
	    	
	    	System.out.println("employees having same name");
	    	CallableStatement cst2=con.prepareCall("{call sameName()}");
	    	ResultSet rs1=cst2.executeQuery();
	    	System.out.println("name\t count");
	    	while(rs1.next())
	    	{
	    		System.out.println(rs1.getString("emp_name")+"\t\t"+rs1.getInt("count"));
	    		
	    	}
	    	System.out.println();
	    	
	    	System.out.println("highest and lowest salaries");
	    	CallableStatement cst3=con.prepareCall("{highestLowestSalary()}");
	    	ResultSet rs2=cst3.executeQuery();
	    	if(rs2.next())
	    	{
	    		double highest=rs2.getDouble("Highest_salary");
	    		double lowset=rs2.getDouble("Lowest_salary");
	    		System.out.println("Highest salary:"+highest);
	    		System.out.println("Lowest salary:"+lowset);
	    	}
	    }
	    catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }

	}

}
