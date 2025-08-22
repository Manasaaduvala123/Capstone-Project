package day6_Assessment;
public class CalculatorDemo {
    public static void main(String[] args) {
        double a = 10, b = 2;
        System.out.println("Calculator using switch-based enum:");
        for (Operation op : Operation.values()) {
            try {
                System.out.println(op + ": " + op.eval(a, b));
            } catch (ArithmeticException e) {
                System.out.println(op + ": Error - " + e.getMessage());
            }
        }
    }
    enum Operation {
        PLUS, MINUS, TIMES, DIVIDE;
        public double eval(double a, double b) {
            switch (this) {
                case PLUS:
                    return a + b;
                case MINUS:
                    return a - b;
                case TIMES:
                    return a * b;
                case DIVIDE:
                    if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                    return a / b;
                default:
                    throw new AssertionError("Unknown operation " + this);
            }
        }
    }
}

/*
output:
Calculator using switch-based enum:
PLUS: 12.0
MINUS: 8.0
TIMES: 20.0
DIVIDE: 5.0
*/