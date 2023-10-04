import java.util.Scanner;
public class ExerciseL6E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;



        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Say 'hello'");
            System.out.println("2. Tell me the time");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Hello!");
                    break;
                case "2":

                    System.out.println("Current time: <time>");
                    break;
                case "3":

                    System.out.println("Why did the chicken cross the road?");
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option (1-4).");
            }
        }
    }
}



