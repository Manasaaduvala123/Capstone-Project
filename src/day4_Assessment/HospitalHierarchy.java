/*
5.	Create Hospital super class and 
access this class inside the patient child class and 
access properties from Hospital class
 */
package day4_Assessment;

class Hospital {
    void hospitalDetails() {
        System.out.println("Welcome to the Hospital");
    }
}

class Doctors extends Hospital {
    void doctorDetails() {
        System.out.println("Doctors Department");
    }
}

class Nurses extends Hospital {
    void nurseDetails() {
        System.out.println("Nurses Department");
    }
}

class Accountants extends Hospital {
    void accountantDetails() {
        System.out.println("Accountant Department");
    }
}

class Gynac extends Doctors {
    void gynacDetails() {
        System.out.println("Gynaecology Specialist");
    }
}

class Endo extends Doctors {
    void endoDetails() {
        System.out.println("Endocrinology Specialist");
    }
}

class Cardiac extends Doctors {
    void cardiacDetails() {
        System.out.println("Cardiology Specialist");
    }
}

class Operation extends Cardiac {
    void operationDetails() {
        System.out.println("Cardiac Operation Section");
    }
}

class OPD extends Cardiac {
    void opdDetails() {
        System.out.println("Cardiac OPD Section");
    }
}

class Payments extends Accountants {
    void paymentDetails() {
        System.out.println("Handling Payments");
    }
}

class Documentation extends Accountants {
    void documentationDetails() {
        System.out.println("Handling Documentation");
    }
}

public class HospitalHierarchy {
    public static void main(String[] args) {
        Operation op = new Operation();
        op.hospitalDetails();
        op.doctorDetails();
        op.cardiacDetails();
        op.operationDetails();
        System.out.println();
        Payments pay = new Payments();
        pay.hospitalDetails();
        pay.accountantDetails();
        pay.paymentDetails();
    }
}

/* 
output
Welcome to the Hospital
Doctors Department
Cardiology Specialist
Cardiac Operation Section

Welcome to the Hospital
Accountant Department
Handling Payments
 */
