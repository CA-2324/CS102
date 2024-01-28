import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.println(testReverseString("hello", "olleh"));
        System.out.println(testReverseString("q b", "b q"));
        System.out.println(testReverseString("", ""));
        System.out.println(testReverseString(null, null));
    }

    public static String testReverseString(String input, String expectedOutput) {
        String result = q3.reverseString(input);
        System.out.println("Input: " + input + " | Expected Output: " + expectedOutput + " | Actual Output: " + result);
        return result;
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }
}