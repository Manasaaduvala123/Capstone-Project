package day6_Assessment;
import java.util.Scanner;

public class DayaOfWeek {
    enum DaysOfWeeks {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            DaysOfWeeks day = DaysOfWeeks.valueOf(input);
            System.out.println("Position of " + day + " is: " + day.ordinal());

            switch (day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println(day + " is a weekend!");
                    break;
                default:
                    System.out.println(day + " is a weekday.");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day! Please enter a valid day of the week.");
        }

        scanner.close();
    }
}


