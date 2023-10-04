import java.util.Scanner;

public class ExerciseL5E1 {
    public static void main(String[] args) {
        //Creating scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a base number
        System.out.print("Enter a base number for the times table: ");
        int baseNumber = scanner.nextInt();

        // Display the times table from 1 to 12 for the entered base number
        System.out.println("Times Table for " + baseNumber + ":");
        for (int i = 1; i <= 12; i++) {
            int result = baseNumber * i;
            System.out.println(baseNumber + " x " + i + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}

