import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Your code goes here
        // Use getInput("Enter something: ") for strings
        // Use getIntInput("Enter a number: ") for integers
        String[]  questions = {"What is the biggest bird in the world? ", "What year did Neil Armstrong walk on the moon? ",
                "What year was the Declaration of Independence signed? ", "Who was the coolest richest person in the world? "};
        String[] answers = {"Ostrich", "1969", "1776", "Mansa Musa"};
        for (int i=0; i < questions.length; i++){
            String userAnswer = getInput(questions[i]);
            if (userAnswer.equals(answers[i])){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Sorry that's not correct.");
            }
        }
        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}