
package opdrachten;

import java.util.Scanner;


public class SquareRootWhile {
    public static void main(String args[])
    {
     System.out.print("Type a non-negative integer: (-1 om te stoppen)");
     Scanner console = new Scanner(System.in);
     int sum = 0;
     int number = console.nextInt();
     while (number != -1) {
    	 sum = sum + number;
    System.out.print("Type a non-negative integer: (-1 om te stoppen)");
    number = console.nextInt();
     }

	System.out.println("sum is "+sum);
    

	console.close();
}
}
