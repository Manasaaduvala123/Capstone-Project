package day7_Assessments;
class Box {
    int length;
    Box(int length) {
        this.length = length;
    }
    static void changeLength(Box b, int newLength) {
        b.length = newLength;
    }
}
public class BoxCallByValue {
    public static void main(String[] args) {
        Box myBox = new Box(10);
        System.out.println("Before change: " + myBox.length);
        Box.changeLength(myBox, 20);
        System.out.println("After change: " + myBox.length);
    }
}

