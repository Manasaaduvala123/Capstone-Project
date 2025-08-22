package day5_Assessment;
interface Polygon {
    double getArea();
    default double getPerimeter(int... sides) {
        double perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
    static String shapeInfo() {
        return "Polygon interface provides area and perimeter functionalities.";
    }
}
class Rectangle2 implements Polygon {
    private double length;
    private double width;
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}
class Triangle1 implements Polygon {
    private double base;
    private double height;
    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}
public class StaticMethodInInterface {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2(10, 5);
        Triangle1 tri = new Triangle1(8, 6);
        System.out.println("Info: " + Polygon.shapeInfo());
        System.out.println("Rectangle Area: " + rect.getArea());
        System.out.println("Rectangle Perimeter: " + rect.getPerimeter(10, 5, 10, 5));
        System.out.println("Triangle Area: " + tri.getArea());
        System.out.println("Triangle Perimeter: " + tri.getPerimeter(8, 7, 9));
    }
    
    /*
    output:
    Info: Polygon interface provides area and perimeter functionalities.
Rectangle Area: 50.0
Rectangle Perimeter: 30.0
Triangle Area: 24.0
Triangle Perimeter: 24.0
     */

}
