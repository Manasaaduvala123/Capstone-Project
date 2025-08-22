package day1_day2_Assessment;

public class NestedIf {
	public static void main(String[] args) {
        int number = 8;
        if (number > 0) {
            System.out.println("The number is positive.");
            if (number % 2 == 0)
            {
                System.out.println("It is also even.");
            } else
            {
                System.out.println("It is also odd.");
            }
        } 
        else
        {
            System.out.println("The number is not positive.");
        }
    }
}
/*
output
The number is positive.
It is also even.
*/