
package day4_Assessment;
class Shape {
    void area() {
        System.out.println("Area method in Shape class");
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class CalculatingArea {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(7);
        s.area();
        s = new Rectangle(5, 10);
        s.area();
    }
}

/*
output:
	Area of Circle: 153.86
	Area of Rectangle: 50.0
*/