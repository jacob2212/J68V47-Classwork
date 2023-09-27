import java.util.Scanner;

public class ExerciseL4E3 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the total purchase amount from the user
        System.out.print("Enter the total purchase amount in GBP: ");
        double totalPurchaseAmount = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the shipping charge based on the total purchase amount
        double shippingCharge = (totalPurchaseAmount < 50) ? 10.0 : 0.0;

        // Calculate the final total including shipping costs
        double finalTotal = totalPurchaseAmount + shippingCharge;

        // Display the results with currency formatting
        System.out.println("\nShipping Calculator Results:");
        System.out.printf("Total Purchase Amount: £%.2f%n", totalPurchaseAmount);
        System.out.printf("Shipping Charge: £%.2f%n", shippingCharge);
        System.out.printf("Final Total (including shipping): £%.2f%n", finalTotal);
    }
}