package day5_Assessment;
public class MoveableShapesSimulation {
    private double width;
    private double height;
    public MoveableShapesSimulation(double width, double height) {
        if (width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        } else {
            this.width = 1.0;
            this.height = 1.0;
        }
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
    public void displayDetails() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
    public static void main(String[] args) {
        MoveableShapesSimulation r1 = new MoveableShapesSimulation(5.0, 3.0);
        r1.displayDetails();

        r1.setWidth(-2.0);
        r1.setHeight(4.0);
        System.out.println("After trying to update dimensions:");
        r1.displayDetails();
    }
}