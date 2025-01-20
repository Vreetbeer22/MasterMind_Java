package opdrachten;

public class FunctionsPalindroomTester extends PalindroomTester {

    public static boolean isPalindrome(String str) {
        // Verwijder hoofdletters en spaties
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Controleer karakters aan beide uiteinden
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
	
}
