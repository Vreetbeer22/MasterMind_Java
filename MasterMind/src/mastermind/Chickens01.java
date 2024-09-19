
package mastermind;

import java.util.Scanner;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("eggs per chicken?");
    	int eggsPerChicken = sc.nextInt();
    	System.out.println("chicken count?");
    	int chickenCount = sc.nextInt();
    	int totalEggs = eggsPerChicken*chickenCount;
    	
        System.out.println("Total eggs day 1");
        System.out.println(totalEggs);
        
        chickenCount += 1;
        int totalEggs2 = eggsPerChicken*chickenCount;
        
        System.out.println("Total eggs day 2");
        System.out.println(totalEggs2);
        
        chickenCount /=2;
        int totalEggs3 = eggsPerChicken*chickenCount;
        
        System.out.println("Total eggs day 3");
        System.out.println(totalEggs3);
        
        int eggsTotal = totalEggs+totalEggs2+totalEggs3;
        
        System.out.println("Total eggs all days");
        System.out.println(eggsTotal);
        
        
    	System.out.println("eggs per chicken?");
        eggsPerChicken = sc.nextInt();
        System.out.println("chicken count?");
    	chickenCount = sc.nextInt();
    	totalEggs = eggsPerChicken*chickenCount;
    	
        System.out.println("Total eggs day 1");
        System.out.println(totalEggs);
        
        chickenCount += 1;
        totalEggs2 = eggsPerChicken*chickenCount;
        
        System.out.println("Total eggs day 2");
        System.out.println(totalEggs2);
        
        chickenCount /=2;
        totalEggs3 = eggsPerChicken*chickenCount;
        
        System.out.println("Total eggs day 3");
        System.out.println(totalEggs3);
        
        eggsTotal = totalEggs+totalEggs2+totalEggs3;
        
        System.out.println("Total eggs all days");
        System.out.println(eggsTotal);
        
        sc.close();
    }   
}
