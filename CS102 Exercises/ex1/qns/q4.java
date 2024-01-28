import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scanner.nextInt();
        System.out.println("The factorial of " + num + " is " + factorial(num) + ".");

        System.out.println(testFactorial(1, 1));
        System.out.println(testFactorial(6, 720));
        System.out.println(testFactorial(0, 1));
        System.out.println(testFactorial(-1, null));
    }

    public static int factorial(int num) {
        // your implementation here!
    }

    public static String testFactorial(int input, Integer expectedOutput) {
        String result = null;
        try {
            int actualOutput = q4.factorial(input);
            result = "Input: " + input + " | Expected Output: " + expectedOutput + " | Actual Output: " + actualOutput;
        } catch (IllegalArgumentException e) {
            result = "Input: " + input + " | Threw exception: " + e.getMessage();
        }
        System.out.println(result);
        return result;
    }
}