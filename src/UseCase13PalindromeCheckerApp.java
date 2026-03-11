import java.util.Scanner;

/**
 * ***************************************************************
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ***************************************************************
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Capture start time
        long startTime = System.nanoTime();

        // Palindrome checking logic
        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Print result
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");

        sc.close();
    }
}