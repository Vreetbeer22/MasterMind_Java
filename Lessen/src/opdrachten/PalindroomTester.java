package opdrachten;

import java.util.Scanner;

public class PalindroomTester {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Vraag de gebruiker om een string in te voeren
        System.out.print("Voer een string in: ");
        String input = scanner.nextLine();

        // Controleer of de string een palindroom is
        if (isPalindrome(input)) {
            System.out.println("De string \"" + input + "\" is een palindroom.");
        } else {
            System.out.println("De string \"" + input + "\" is geen palindroom.");
        }

        scanner.close();
    }


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



