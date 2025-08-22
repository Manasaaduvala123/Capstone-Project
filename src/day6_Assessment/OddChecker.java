package day6_Assessment;
public class OddChecker {
    public static void checkOdd(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Odd number: " + n);
        } else {
            System.out.println(n + " is even.");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2, 7, 4, 9, 6};

        for (int num : numbers) {
            try {
                checkOdd(num);
            } catch (OddNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
    public static class OddNumberException extends Exception {
        public OddNumberException(String message) {
            super(message);
        }
    }
}