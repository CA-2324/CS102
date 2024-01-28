import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // Test cases
        testBuzzOrNumber(5);  // Expected output: Buzz
        testBuzzOrNumber(0);  // Expected output: 0
        testBuzzOrNumber(-1); // Expected output: -1

        // your code here!
    }

    // Method for testing
    private static void testBuzzOrNumber(int input) {
        System.out.println("Test Case: " + input);
        if (input % 5 == 0) {
            System.out.println("Expected output: Buzz");
        } else {
            System.out.println("Expected output: " + input);
        }
        System.out.println();
    }
}
