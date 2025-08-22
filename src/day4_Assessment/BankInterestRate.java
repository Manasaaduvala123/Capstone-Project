package day4_Assessment;
class Bank {
    double getInterestRate() {
        return 0.0;
    }
}
class SBI extends Bank {
    double getInterestRate() {
        return 6.7;
    }
}
class ICICI extends Bank {
    double getInterestRate() {
        return 7.0;
    }
}
class HDFC extends Bank {
    double getInterestRate() {
        return 7.5;
    }
}

public class BankInterestRate {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

        bank = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank.getInterestRate() + "%");

        bank = new HDFC();
        System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");
    }
}

/*
output
SBI Interest Rate: 6.7%
ICICI Interest Rate: 7.0%
HDFC Interest Rate: 7.5%
*/

