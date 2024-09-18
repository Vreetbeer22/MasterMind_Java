
package mastermind;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	int eggsPerChicken = 5;
    	int chickenCount = 3;
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
        
        
        eggsPerChicken = 5;
    	chickenCount = 8;
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
    }   
}
