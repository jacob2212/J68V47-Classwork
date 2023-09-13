import java.util.Scanner;

    public class Exercise2Viva {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //making the questions
            String[] questions = {
                    "Q1. What is the capital of Spain?",
                    "Q2. Who wrote 'Romeo and Juliet'?",
                    "Q3. What is the largest planet in our solar system?"
            };


            //answers to the questions
            String[] answers = {
                    "madrid",
                    "shakespeare",
                    "jupiter"

            };

            // Display and check answers given
            for (String question : questions) {
                System.out.println(question);
                String userAnswer = scanner.nextLine().toLowerCase();

                boolean isCorrect = false;

                // Check if user's answer matches any part of the correct answer
                for (String correctAnswer : answers) {
                    if (userAnswer.contains(correctAnswer)) {
                        isCorrect = true;
                        break;
                    }
                }

                System.out.println(isCorrect ? "True" : "False");
            }

            scanner.close();
        }

    }








