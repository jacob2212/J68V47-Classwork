import java.util.Scanner;


public class pwwrdusername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //the user input
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();


        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your year of birth (e.g., 1999): ");
        int yearOfBirth = scanner.nextInt();

        scanner.close();
        //creating usernames
        char firstInitial = firstName.charAt(0);
        String username = Character.toString(firstInitial) + surname.toLowerCase();
        //creating password
        char surnameInitial = surname.charAt(0);
        String firstNameInitials = firstName.substring(0, Math.min(3, firstName.length())).toUpperCase();
        String password = Character.toString(surnameInitial) + firstNameInitials + yearOfBirth;

        //output Display the username and password
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + password);
    }
}










