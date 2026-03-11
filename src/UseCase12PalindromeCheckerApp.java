import java.util.Scanner;

/**
 * ***************************************************************
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ***************************************************************
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 */

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * ***************************************************************
 * INTERFACE - PalindromeStrategy
 * ***************************************************************
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ***************************************************************
 * CLASS - StackStrategy
 * ***************************************************************
 * Stack-based palindrome algorithm implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        // Create stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters onto stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}