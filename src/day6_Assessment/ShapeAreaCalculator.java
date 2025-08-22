package day6_Assessment;
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        for (Shape shape : Shape.values()) {
            double result = 0.0;
            switch (shape) {
                case CIRCLE:
                    result = shape.area(5);
                    break;
                case SQUARE:
                    result = shape.area(4); 
                    break;
                case RECTANGLE:
                    result = shape.area(4, 6); 
                    break;
                case TRIANGLE:
                    result = shape.area(3, 5); 
                    break;
            }
            System.out.println(shape + " area: " + result);
        }
    }
}
enum Shape {
    CIRCLE {
        public double area(double... params) {
            double radius = params[0];
            return Math.PI * radius * radius;
        }
    },
    SQUARE {
        public double area(double... params) {
            double side = params[0];
            return side * side;
        }
    },
    RECTANGLE {
        public double area(double... params) {
            double width = params[0];
            double height = params[1];
            return width * height;
        }
    },
    TRIANGLE {
        public double area(double... params) {
            double base = params[0];
            double height = params[1];
            return 0.5 * base * height;
        }
    };
    public abstract double area(double... params);
}
