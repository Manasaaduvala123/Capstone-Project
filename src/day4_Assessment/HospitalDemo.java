package day4_Assessment;
//Superclass: Hospital
class Hospital2 {
 String hospitalName;
 String location;
 public Hospital2(String hospitalName, String location) {
     this.hospitalName = hospitalName;
     this.location = location;
 }
 public void showHospitalDetails() {
     System.out.println("Hospital Name: " + hospitalName);
     System.out.println("Location: " + location);
 }
}
class Patient2 extends Hospital2 {
 String patientName;
 int age;
 public Patient2(String hospitalName, String location, String patientName, int age) {
     super(hospitalName, location); 
     this.patientName = patientName;
     this.age = age;
 }
 public void showPatientDetails() {
     System.out.println("Patient Name: " + patientName);
     System.out.println("Age: " + age);
     System.out.println("--- Hospital Info ---");
     super.showHospitalDetails(); 
 }
}
public class HospitalDemo {
 public static void main(String[] args) {
     Patient2 p = new Patient2("City Care Hospital", "Hyderabad", "Manasa Aduvala", 25);
     p.showPatientDetails();
 }
}

