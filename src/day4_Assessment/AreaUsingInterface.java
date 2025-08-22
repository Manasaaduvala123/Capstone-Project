package day4_Assessment;
interface Drawable {
    void draw();
}
abstract class Shape1 {
    abstract double area1();
}
class Circle1 extends Shape1 implements Drawable {
    double radius;
    Circle1(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
    double area1() {
        return Math.PI * radius * radius;
    }
}
class Rectangle1 extends Shape1 implements Drawable {
    double length, width;
    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
    double area1() {
        return length * width;
    }
}
class Triangle extends Shape1 implements Drawable {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void draw() {
        System.out.println("Drawing Triangle");
    }
    double area1() {
        return 0.5 * base * height;
    }
}
public class AreaUsingInterface {
    public static void main(String[] args) {
        Drawable d1 = new Circle1(5);
        Shape1 s1 = (Shape1) d1;
        d1.draw();
        System.out.println("Area of Circle: " +s1.area1());
        Drawable d2 = new Rectangle1(4, 6);
        Shape1 s2 = (Shape1) d2;
        d2.draw();
        System.out.println("Area of Rectangle: " +s2.area1());
        Drawable d3 = new Triangle(3, 7);
        Shape1 s3 = (Shape1) d3;
        d3.draw();
        System.out.println("Area of Triangle: " +s3.area1());
    }
}

/*
output:
Drawing Circle
Area of Circle: 78.53981633974483
Drawing Rectangle
Area of Rectangle: 24.0
Drawing Triangle
Area of Triangle: 10.5
*/
