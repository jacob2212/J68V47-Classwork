import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years for the loan: ");
        int numberOfYears = scanner.nextInt();

        scanner.close();

        // Calculate monthly interest rate and number of payments
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = numberOfYears * 12;

        // Calculate monthly payment using the formula
        double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)));

        // Display the monthly payment
        System.out.printf("Your monthly payment will be: $%.2f%n", monthlyPayment);
    }
}