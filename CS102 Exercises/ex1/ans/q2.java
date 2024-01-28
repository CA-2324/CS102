import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPositiveNumbers = 0;

        // Continuously ask the user to enter a number until -1 is entered
        while (true) {
            System.out.print("Enter a number (enter -1 to terminate): ");
            int userInput = scanner.nextInt();

            // Check if the user wants to terminate
            if (userInput == -1) {
                break;
            }

            // Check if the entered number is positive
            if (userInput > 0) {
                countPositiveNumbers++;
            }
        }

        // Print the count of positive numbers after termination
        System.out.println("Count of positive numbers: " + countPositiveNumbers);

        scanner.close();
    }
}
