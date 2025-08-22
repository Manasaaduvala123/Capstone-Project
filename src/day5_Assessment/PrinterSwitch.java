package day5_Assessment;
interface Printer {
    void print(String document);
}
class LaserPrinter implements Printer {
    public void print(String document) {
        System.out.println("LaserPrinter printing: " + document.toUpperCase());
    }
}
class InkjetPrinter implements Printer {
    public void print(String document) {
        System.out.println("InkjetPrinter printing: " + document.toLowerCase());
    }
}
public class PrinterSwitch {
    public static void main(String[] args) {
        Printer p;
        p = new LaserPrinter();
        p.print("Contract Programming Document");
        p = new InkjetPrinter();
        p.print("Contract Programming Document");
    }
}
