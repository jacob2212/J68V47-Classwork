import java.util.Scanner;

public class L7E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int sum = calculateSum(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    // Subroutine to calculate the sum of two numbers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}
