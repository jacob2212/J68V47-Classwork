import java.util.Scanner;
public class ExerciseL4E1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter the total value of your order: ");
        double totalOrderValue = scanner.nextDouble();

        System.out.print("Enter the amount you wish to pay as a deposit: ");
        double depositAmount = scanner.nextDouble();

        double remainingAmount = totalOrderValue - depositAmount;

        boolean receivedFreeToaster = false;
        if (totalOrderValue >= 500) {
            receivedFreeToaster = true;
        }

        System.out.println("\nReceipt:");
        System.out.println("First Initial and Full Surname: " + firstName.charAt(0) + " " + surname + (receivedFreeToaster ? " (with free toaster)" : ""));
        System.out.println("Total Value of the Order: $" + String.format("%.2f", totalOrderValue));
        System.out.println("Amount Paid as Deposit: $" + String.format("%.2f", depositAmount));
        System.out.println("Remaining Amount to be Paid: $" + String.format("%.2f", remainingAmount));


        scanner.close();
    }
}

