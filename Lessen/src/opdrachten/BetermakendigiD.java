package opdrachten;

import java.util.Scanner;

public class BetermakendigiD {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String feedback = "";
		
		double percentage = sc.nextDouble();
		
		int filledCount = (int) Math.round(percentage * 10); 
		feedback = ("🔵".repeat(filledCount) + "⚪".repeat(10 - filledCount));
		
		System.out.println(feedback);
		
		sc.close();
	}

}
