import java.sql.*;
public class HospitalCallable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "admin";
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database Connected Successfully\n");
            // patient count
            System.out.println("Average Patient Count Per Day:");
            CallableStatement cst1 = con.prepareCall("{CALL PrintAvgPatientCountDaily()}");
            ResultSet rs1 = cst1.executeQuery();
            if (rs1.next()) {
                double avgCount = rs1.getDouble("Avg_Patient_Count_Per_Day");
                System.out.println("Average Patient Count Per Day = " + avgCount + "\n");
            }
            // number of patients in same ward
            System.out.println("Patients in Ward No 2:");
            CallableStatement cst2 = con.prepareCall("{CALL PrintPatientsSameWard(?)}");
            cst2.setInt(1, 2);
            ResultSet rs2 = cst2.executeQuery();

            System.out.println("ID\tName\t\tWard\tAdmission Date");
            while (rs2.next()) {
                int id = rs2.getInt("patient_id");
                String name = rs2.getString("patient_name");
                int ward = rs2.getInt("ward_no");
                Date date = rs2.getDate("admission_date");
                System.out.printf("%d\t%-15s\t%d\t%s\n", id, name, ward, date);
            }
            System.out.println();
            System.out.println("Patients Admited on  same Date:");
            CallableStatement cst3 = con.prepareCall("{CALL PrintPatientsByAdmissionDate()}");
            ResultSet rs3 = cst3.executeQuery();

            System.out.println("ID\tName\t\tWard\tAdmission Date");
            while (rs3.next()) {
                int id = rs3.getInt("patient_id");
                String name = rs3.getString("patient_name");
                int ward = rs3.getInt("ward_no");
                Date date = rs3.getDate("admission_date");
                System.out.printf("%d\t%-15s\t%d\t%s\n", id, name, ward, date);
            }

        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
