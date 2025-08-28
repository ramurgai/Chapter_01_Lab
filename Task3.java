import java.util.Scanner;

public class Task3 {
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
        String correctNum = "67";
        String correct = "incorrect";
        while (correct.equals("incorrect")) {
            String guess = getInput("Guess a number 1-100: ");
            if (guess.equals(correctNum)){
                correct = "correct";
                System.out.print("Congratulations that is the correct number!");
            }
            else{
                System.out.print("Sorry that's not correct \n");

            }
        }




        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}