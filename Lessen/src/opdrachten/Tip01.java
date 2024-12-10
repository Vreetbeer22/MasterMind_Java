package opdrachten;

import java.util.ArrayList;
import java.util.Scanner;

public class Tip01 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	Calculator calc = new Calculator();
    	
    	ArrayList<Double> kosten = new ArrayList<Double>();
    	kosten.add(10.00);
    	kosten.add(12.00);
    	kosten.add(9.00);
    	kosten.add(8.00);
    	kosten.add(7.00);
    	kosten.add(15.00);
    	kosten.add(11.00);
    	kosten.add(30.00);
    	
    	
    	boolean loopje = false;
    	while (!loopje) {
    		
    	System.out.println("1 - kosten toevoegen:");
    	System.out.println("2 - kosten verwijderen:");
    	System.out.println("3 - de kosten bekijken");
    	System.out.println("Wat wil je doen?");
    	
    	int keuze = sc.nextInt();
    	if (keuze == 1||keuze == 2||keuze == 3) {
        	switch (keuze){
        		case 1:
        			System.out.println("wat zijn de kosten die je wil toevoegen?");
        			double nieuwekosten = sc.nextDouble();
        			kosten.add(nieuwekosten);
        			System.out.println("€"+nieuwekosten+" is aan je kosten toegevoegd");
        			break;
        			
        		case 2:
        			System.out.println("welke kosten wil je verwijderen? kies uit:");
        			for (double kos : kosten) {
        			System.out.print("€"+kos + " ");
        			}
        			double kostenweg = sc.nextDouble();
        			kosten.remove(kostenweg);
        			System.out.println("€"+kostenweg+" is uit je lijst verwijderd!");
        			break;
        			
        		case 3:
        			System.out.println("je kosten met de 5% tax zijn:");
        			for (int i = 0; i < kosten.size(); i++) {
        				calc.originalPrice = kosten.get(i);
        				calc.FindTotal();
        				System.out.println("€"+String.format("%.2f", calc.belasting));
        			}
        			System.out.println("je kosten met de 15% tip zijn:");
        			for (int i = 0; i < kosten.size(); i++) {
        				calc.originalPrice = kosten.get(i);
        				calc.FindTotal();
        				System.out.println("€"+String.format("%.2f", calc.tippen));
        			}
        			System.out.println("je totale kosten zijn:");
        			for (int i = 0; i < kosten.size(); i++) {
        				calc.originalPrice = kosten.get(i);
        				calc.FindTotal();
        				System.out.println("€"+String.format("%.2f", calc.totaal));
        			}
        			loopje = true;
        			break;
        	}
    	}
    	else {
    		System.out.println("dit was niet een van de opties helaas.");
    	}
    	}
    
    	sc.close();
     
    }    
}
