import java.util.Scanner;

/**
 * ***************************************************************
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ***************************************************************
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to check palindrome: ");
        String input = scanner.nextLine();

        // Normalize input: remove spaces and convert to lowercase
        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using recursion
        boolean isPalindrome = check(normalizedInput, 0, normalizedInput.length() - 1);

        // Display result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index
     * @param end Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base case: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // If characters at start and end do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: move inward
        return check(s, start + 1, end - 1);
    }
}