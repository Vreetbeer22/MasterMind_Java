package opdrachten;

import java.util.ArrayList;
import java.util.Scanner;

public class Superhelden {

	public static void main(String[] args) {
		//ArrayList<E>o-generated method stub
		
		ArrayList<String> SuperHeroes = new ArrayList<>();
		SuperHeroes.add("Batman");
		SuperHeroes.add("Superman");
		SuperHeroes.add("Flash");
		SuperHeroes.add("Hulk");
		SuperHeroes.add("Iron-man");
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		System.out.println("welkom bij het superheldenprogamma!");
		
		while(running) {
			System.out.println("\nkies een optie:");
			System.out.println("1 voeg een held toe");
			System.out.println("2 haal een superheld weg");
			System.out.println("3 team bekijken");
			System.out.println("4 sorteer je team");
			System.out.println("5 ga op een missie");
			System.out.println("6 afsluiten");
			
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("geef de naam van je nieuwe held:");
					String newHero = sc.nextLine();
					SuperHeroes.add(newHero);
					System.out.println(newHero+" is toegevoegd aan je team!");
					break;
					
				case 2:
					System.out.println("welke superheld wil je verwijderen? kies uit:");
					String heroToRemove = sc.nextLine();
					if (SuperHeroes.remove(heroToRemove)) {
						System.out.println(heroToRemove+" is uit je team verrwijderd.");
					}
					else {
						System.out.println(heroToRemove+" zit niet in je teamn");
					}
					
				case 3:
					
					
				case 4:
					
					
				case 5:
					
					
				case 6:
				
			}
		}
		
		sc.close();
	}

}
