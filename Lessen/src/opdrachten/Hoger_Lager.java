package opdrachten;

import java.util.Scanner;
import java.util.Random;

public class Hoger_Lager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		int nummer = rnd.nextInt(100) + 1;
		
		System.out.println("Welkom");
		System.out.println("de bedoeling is dat je een getal tussen de 1 en 100 gaat raden");
		System.out.println("je hebt hier 7 pogingen voor");
		System.out.println("succes!!");
		
		for (int a = 6; a >= 0; a--) {
			System.out.println("geef je nummer op");
			int speler = sc.nextInt();
			
			if(speler >= 101) {
				System.out.println("ehmm dat is wel heel hoog");
			}
			else if(speler <= -1) {
				System.out.println("ehmm dat is te laag");
			}
			else if(nummer==speler) {
				System.out.println("precies goed");
				break;
			}
			else if(nummer>speler) {
				System.out.println("te laag");
			}
			else if(nummer<speler) {
				System.out.println("te hoog");
			}
			
			if(a == 0) {
				System.out.println("helaas volgende keer beter");
			}
		}
		
			
		
		sc.close();		

		
		
	}
	
}


