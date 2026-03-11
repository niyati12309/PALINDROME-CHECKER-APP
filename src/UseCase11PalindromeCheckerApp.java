import java.util.Scanner;

/**
 * ***************************************************************
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ***************************************************************
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * @author Developer
 * @version 11.0
 */

public class UseCase11PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call palindrome check method
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}