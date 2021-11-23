import java.util.Scanner;

public class Colours {
         public static String getUserColour() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the first letter of Your favourite color: ");
                String colour = scanner.nextLine().trim();
                if (colour.length() == 1) {
                    return colour;
                }
                System.out.println("Colour is too long. Try again.");
            }
        }

        public static String getUserChoice() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Select colour (B-blue, R-red, G-green");
                String colour = scanner.nextLine().trim().toUpperCase();
                switch (colour) {
                    case "B": System.out.println("Blue");
                    break;
                    case "R": System.out.println("Red");
                    break;
                    case "G":  System.out.println("Red");
                    default:
                        System.out.println("Wrong choice. Try again.");
                }
            }
        }

}
