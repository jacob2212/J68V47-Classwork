import java.util.Random;
import java.util.Scanner;

public class ExerciseL5E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        System.out.println("Welcome to the Math Quiz Game!");

        for (int i = 1; i <= 10; i++) {
            int num1 = random.nextInt(10); // Generate a random number between 0 and 9
            int num2 = random.nextInt(10); // Generate another random number between 0 and 9

            // Generate a random operator (+, -, or *)
            String[] operators = {"+", "-", "*"};
            int operatorIndex = random.nextInt(operators.length);
            String operator = operators[operatorIndex];

            // Calculate the correct answer
            int correctAnswer;
            switch (operator) {
                case "+":
                    correctAnswer = num1 + num2;
                    break;
                case "-":
                    correctAnswer = num1 - num2;
                    break;
                case "*":
                    correctAnswer = num1 * num2;
                    break;
                default:
                    correctAnswer = 0; // Default to 0 in case of an invalid operator
            }

            System.out.print("Question " + i + ": ");
            System.out.print(num1 + " " + operator + " " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct! Good job.");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer + ".");
            }
        }

        System.out.println("Quiz complete! Your score: " + score + " out of 10.");
        scanner.close();
    }
}