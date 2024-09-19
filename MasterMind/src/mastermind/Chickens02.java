
package mastermind;

import java.util.Scanner;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	
    	Scanner sc = new Scanner(System.in);
		
    	System.out.println("eggs day1?");
    	int eggsDay1 = sc.nextInt();
    	System.out.println("eggs day2?");
    	int eggsDay2 = sc.nextInt();
    	System.out.println("eggs day3?");
    	int eggsDay3 = sc.nextInt();
    	
    	double dailyAverage = (eggsDay1+eggsDay2+eggsDay3)/3.0;
    	
    	
    	System.out.println("\ndaily average");
    	System.out.printf("%,.2f \n",dailyAverage);
        
        double monthlyAverage = dailyAverage*30;
        System.out.println("monthly average");
        System.out.printf("%,.2f \n",monthlyAverage);
        
    	double monthlyProfit = monthlyAverage*0.18;
        System.out.println("monthly profit");
        System.out.printf("%,.2f \n",monthlyProfit);
        
        sc.close();
    }
    
}
