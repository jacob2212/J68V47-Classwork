import java.util.Scanner;

public class L7E1{
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        while (option != 4) {
            showMenu();
            option = getOption(scanner);

            if (option == 1) {
                option1();
            } else if (option == 2) {
                option2();
            } else if (option == 3) {
                option3();
            } else if (option == 4) {
                System.out.println("Bye!");
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }
        }

        scanner.close();
    }

    // Function to display the menu
    public static void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Quit");
    }

    // Function to get the user's choice
    public static int getOption(Scanner scanner) {
        int option = 0;
        while (option < 1 || option > 4) {
            System.out.print("Enter your choice (1-4): ");
            try {
                option = Integer.parseInt(scanner.nextLine());
                if (option < 1 || option > 4) {
                    System.out.println("Invalid option. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number between 1 and 4.");
            }
        }
        return option;
    }

    // Function for Option 1
    public static void option1() {
        System.out.println("Option 1 selected.");
    }

    // Function for Option 2
    public static void option2() {
        System.out.println("Option 2 selected.");
    }

    // Function for Option 3
    public static void option3() {
        System.out.println("Option 3 selected.");
    }
}