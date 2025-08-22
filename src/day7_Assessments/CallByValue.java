package day7_Assessments;
class Box1 {
    int length;

    Box1(int length) {
        this.length = length;
    }

    static void changeReference(Box1 b) {
        b = new Box1(50);
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Box1 myBox = new Box1(10);
        System.out.println("Before changeReference: " + myBox.length);
        Box1.changeReference(myBox);
        System.out.println("After changeReference: " + myBox.length);
    }
}
