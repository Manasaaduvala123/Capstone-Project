package day6_Assessment;
import java.util.Scanner;
public class CompassDirections {
    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter direction (NORTH, SOUTH, EAST, WEST): ");
        String input = scanner.nextLine().trim().toUpperCase();
        try {
            Direction dir = Direction.valueOf(input);
            switch (dir) {
                case NORTH:
                    System.out.println("Move north");
                    break;
                case SOUTH:
                    System.out.println("Move south");
                    break;
                case EAST:
                    System.out.println("Move east");
                    break;
                case WEST:
                    System.out.println("Move west");
                    break;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid direction! Please enter NORTH, SOUTH, EAST, or WEST.");
        }

        scanner.close();
    }
}