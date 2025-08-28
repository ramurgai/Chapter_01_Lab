import java.util.Scanner;

public class Task2 {
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
        float score1 = getIntInput("What was your  first test score? ");
        float score2 = getIntInput("What was your  second test score? ");
        float score3 = getIntInput("What was your  third test score? ");
        float average = (score1 + score2 + score3) /3;

        if (average >= 90) {
            System.out.print("Your average grade is an A");
        }
        else if (average >= 80) {
            System.out.print("Your average grade is an B");
        }
        else if (average >= 70) {
            System.out.print("Your average grade is an C");
        }
        else if (average >= 60) {
            System.out.print("Your average grade is an D");
        }
        else {
            System.out.print("Your average grade is an F");
        }


        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}