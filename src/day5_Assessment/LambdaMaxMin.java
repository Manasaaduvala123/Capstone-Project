package day5_Assessment;
@FunctionalInterface
interface TwoNumberOperation {
    double operate(double a, double b);
}
public class LambdaMaxMin {
    public static void main(String[] args) {
    	TwoNumberOperation maxOperation = (a, b) -> (a > b) ? a : b;
        TwoNumberOperation minOperation = (a, b) -> (a < b) ? a : b;       
        double x = 15.7, y = 22.3;      
        System.out.println("Numbers: " + x + " , " + y);
        System.out.println("Max: " + maxOperation.operate(x, y));
        System.out.println("Min: " + minOperation.operate(x, y));
    }
}

