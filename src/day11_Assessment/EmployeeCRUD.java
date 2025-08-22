package day11_Assessment;
import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {
    static final String URL = "jdbc:mysql://localhost:3306/mydb";
    static final String USER = "root";
    static final String PASSWORD = "admin";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Scanner sc = new Scanner(System.in)) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            boolean exit = false;

            while (!exit) {
                System.out.println("\nEmployee Management System");
                System.out.println("1. Insert Employee");
                System.out.println("2. Display All Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Search Employee by ID");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> insertEmployee(con, sc);
                    case 2 -> displayAllEmployees(con);
                    case 3 -> updateEmployee(con, sc);
                    case 4 -> deleteEmployee(con, sc);
                    case 5 -> searchEmployeeByID(con, sc);
                    case 6 -> exit = true;
                    default -> System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        }
    }

    private static void insertEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter Phone Number: ");
        float phone = sc.nextFloat();

        String query = "INSERT INTO employee (emp_id, emp_name, salary, phonenum) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, salary);
            pstmt.setFloat(4, phone);

            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("Employee inserted successfully.");
            else System.out.println("Insertion failed.");
        }
    }

    private static void displayAllEmployees(Connection con) throws SQLException {
        String query = "SELECT * FROM employee";
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            System.out.println("ID\tName\tSalary\tPhone Number");
            while (rs.next()) {
                System.out.printf("%d\t%s\t%d\t%.0f%n",
                        rs.getInt("emp_id"),
                        rs.getString("emp_name"),
                        rs.getInt("salary"),
                        rs.getFloat("phonenum"));
            }
        }
    }

    private static void updateEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter new Salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter new Phone Number: ");
        float phone = sc.nextFloat();

        String query = "UPDATE employee SET emp_name = ?, salary = ?, phonenum = ? WHERE emp_id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, salary);
            pstmt.setFloat(3, phone);
            pstmt.setInt(4, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("Employee updated successfully.");
            else System.out.println("Employee ID not found.");
        }
    }

    private static void deleteEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        String query = "DELETE FROM employee WHERE emp_id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, id);

            int rows = pstmt.executeUpdate();
            if (rows > 0) System.out.println("Employee deleted successfully.");
            else System.out.println("Employee ID not found.");
        }
    }

    private static void searchEmployeeByID(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        String query = "SELECT * FROM employee WHERE emp_id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setInt(1, id);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("ID: " + rs.getInt("emp_id"));
                    System.out.println("Name: " + rs.getString("emp_name"));
                    System.out.println("Salary: " + rs.getInt("salary"));
                    System.out.println("Phone Number: " + rs.getFloat("phonenum"));
                } else {
                    System.out.println("Employee not found.");
                }
            }
        }
    }
}
