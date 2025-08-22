package jdbc_Mini_Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllSQLOperations {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "admin";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connection established");

            Statement stmt = con.createStatement();

            // Use variable for table name
            String tableName = "students";

            // 1️⃣ Create Table
            String createSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                    + "rollno INT PRIMARY KEY, "
                    + "name VARCHAR(50), "
                    + "city VARCHAR(50), "
                    + "per DECIMAL(5,2), "
                    + "email VARCHAR(50))";
            stmt.executeUpdate(createSQL);
            System.out.println("✅ Table '" + tableName + "' created (if not exists)");

            // 2️⃣ Insert Records
            String insertSQL = "INSERT IGNORE INTO " + tableName + " VALUES "
                    + "(101,'Neeva Sharma','Mumbai',98,'neeva@gmail.com'),"
                    + "(102,'Robin Sharma','Delhi',88,'robin@gmail.com'),"
                    + "(103,'Manasa Aduvala','Hyderabad',92,'manasa@gmail.com')";
            int inserted = stmt.executeUpdate(insertSQL);
            if (inserted > 0) System.out.println("✅ Records inserted successfully");

            // 3️⃣ Update a Record
            String updateSQL = "UPDATE " + tableName + " SET per = 90 WHERE rollno = 102";
            int updated = stmt.executeUpdate(updateSQL);
            if (updated > 0) System.out.println("✅ Row updated successfully");

            // 4️⃣ Highest Percentage Student
            System.out.println("\n🎯 Highest Percentage Student:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM " + tableName + " ORDER BY per DESC LIMIT 1");
            printResult(rs);

            // 5️⃣ Students in Ascending Order
            System.out.println("\n📊 Students in Ascending Order by Name:");
            ResultSet rs1 = stmt.executeQuery("SELECT * FROM " + tableName + " ORDER BY name ASC");
            printResult(rs1);

            // 6️⃣ Students from Same City (Correct GROUP_CONCAT Query)
            System.out.println("\n🏙 Students from Same City (More than 1):");
            ResultSet rs2 = stmt.executeQuery(
                    "SELECT city, GROUP_CONCAT(name) AS students "
                            + "FROM " + tableName + " "
                            + "GROUP BY city HAVING COUNT(*) > 1");
            while (rs2.next()) {
                System.out.println(rs2.getString("city") + " → " + rs2.getString("students"));
            }

            // 7️⃣ Add New Column
            stmt.executeUpdate("ALTER TABLE " + tableName + " ADD COLUMN phonenum VARCHAR(10)");
            System.out.println("✅ Added column 'phonenum'");

            // 8️⃣ Modify Column Datatype
            stmt.executeUpdate("ALTER TABLE " + tableName + " MODIFY COLUMN per FLOAT");
            System.out.println("✅ Changed 'per' column datatype to FLOAT");

            // 9️⃣ Rename Table
            stmt.executeUpdate("ALTER TABLE " + tableName + " RENAME TO student_details");
            tableName = "student_details"; // ✅ Update table name variable
            System.out.println("✅ Table renamed to 'student_details'");

            // 🔟 Drop Single Column
            stmt.executeUpdate("ALTER TABLE " + tableName + " DROP COLUMN phonenum");
            System.out.println("✅ Deleted column 'phonenum'");

            // 1️⃣1️⃣ Delete Single Row
            stmt.executeUpdate("DELETE FROM " + tableName + " WHERE rollno=101");
            System.out.println("✅ Deleted row with rollno=101");

            // 1️⃣2️⃣ Delete All Records but Keep Table
            // stmt.executeUpdate("TRUNCATE TABLE " + tableName);
            // System.out.println("✅ All records deleted but table still exists");

            // 1️⃣3️⃣ Delete Entire Table
            // stmt.executeUpdate("DROP TABLE " + tableName);
            // System.out.println("✅ Entire table deleted");

            con.close();

        } catch (SQLException e) {
            System.out.println("❌ SQL Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver Error: " + e.getMessage());
        }
    }

    // ✅ Method to Print Query Results Dynamically
    static void printResult(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(
                    rs.getInt("rollno") + " "
                            + rs.getString("name") + " "
                            + rs.getFloat("per") + " "
                            + rs.getString("city") + " "
                            + rs.getString("email"));
        }
    }
}
