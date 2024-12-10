package opdrachten;

import java.util.Scanner;

public class Opdrachten10 {

	public static void main(String[] args) {

//		32, 33, 36, 37, 38, 39, 42, 43, 50, 69
		
		Scanner sc = new Scanner(System.in);
		
//		opdracht 32
		
		System.out.println("nummer 1:");
		int getal1 = sc.nextInt();
		System.out.println("nummer 2:");
		int getal2 = sc.nextInt();		
		if (getal1 != getal2) {
			if (getal1 < getal2) {
				System.out.println(getal1+" != "+getal2);
				System.out.println(getal1+" < "+getal2);
				System.out.println(getal1+" <= "+getal2);
			}
			if (getal1 > getal2) {
				System.out.println(getal1+" != "+getal2);
				System.out.println(getal1+" > "+getal2);
				System.out.println(getal1+" >= "+getal2);
			}
		}
		else {
			System.out.println(getal1+" = "+getal2);
		}
	
		
//		opdracht 33
		
		System.out.println("vul een getal van 2 cijfers zonder een comma ertussen");
		String nummer = sc.next();
		String[] split = nummer.split("");
		int nummer1 = Integer.valueOf(split[0]);
		int nummer2 = Integer.valueOf(split[1]);
		System.out.println(nummer1 + nummer2);
			
		
//		opdracht 36
		
		 final double RADIUS = 6371.01;
	 
	        System.out.print("Voer de breedtegraad van coördinaat 1 in: ");
	        double x1 = Math.toRadians(sc.nextDouble());
	        
	        System.out.print("Voer de lengtegraad van coördinaat 1 in: ");
	        double y1 = Math.toRadians(sc.nextDouble());
	       
	        System.out.print("Voer de breedtegraad van coördinaat 2 in: ");
	        double x2 = Math.toRadians(sc.nextDouble());
	        
	        System.out.print("Voer de lengtegraad van coördinaat 2 in: ");
	        double y2 = Math.toRadians(sc.nextDouble());
	       
	        double afstand = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + 
	                        Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

	        System.out.printf("De afstand tussen deze punten is: %.10f km%n", afstand);
		
	        
//		opdracht 37
		
		System.out.println("vul hier je zin in:");
		String zin = sc.next();
		String omgedraaid = "";
		for (int i = 0; i < zin.length(); i++) {
		  omgedraaid = zin.charAt(i) + omgedraaid;
		}
		System.out.println(omgedraaid);
			
		
//		opdracht 38
		
		System.out.println("vul een zin in:");
		String zin2 = sc.nextLine();
		
		int letters = 0;
		int spaties = 0;
		int cijfers = 0;
		int anderekarakters = 0;
		
		for (int i = 0; i < zin2.length(); i++) {
			   char karakter = zin2.charAt(i);
	  
	            if (Character.isLetter(karakter)) {
	                letters++;
	            } else if (Character.isDigit(karakter)) {
	                cijfers++;
	            } else if (Character.isWhitespace(karakter)) {
	                spaties++;
	            } else {
	                anderekarakters++;
	            }
		}
		
		System.out.println("Aantal letters: " + letters);
        System.out.println("Aantal spaties: " + spaties);
        System.out.println("Aantal cijfers: " + cijfers);
        System.out.println("Aantal andere karakters: " + anderekarakters);
			
        
//		opdracht 39
		
		int aantal = 0;
		for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                	if (i != j && j !=k && i !=k) {
                		System.out.println("" + i + j + k);
                        aantal++;
                	}
                }
            }
        }
		System.out.println("het totale aantal getallencombinaties is: "+aantal);
		
		
//		opdracht 42
		
		System.out.println("Input your password:");
		String wachtwoord = sc.next();
	    System.out.println("Your password was: "+wachtwoord);
		
	    
//		opdracht 43
		
		System.out.println("Twinkle, twinkle, little star,");
		System.out.println("	 How I wonder what you are!");
		System.out.println("		   Up above the world so high,");
		System.out.println("		   Like a diamond in the sky.");
		System.out.println("Twinkle, twinkle, little star,");
		System.out.println("	 How I wonder what you are!");
		
		
//		opdracht 50
		
		System.out.println("deelbaar door 3:");
		int i = 0;
		for (i =0; i <= 100; i++) {
			int over1 = i % 3;	
				if (over1 == 0) {
					System.out.print(i+", ");
				}
		}

		System.out.println("\ndeelbaar door 5:");
		for (i =0; i <= 100; i++) {
			int over2 = i % 5;	
				if (over2 == 0) {
					System.out.print(i+", ");
				}
		}
		System.out.println("\ndeelbaar door 3 en 5:");
		for (i =0; i <= 100; i++) {
			int over3 = i % 3;
			int over4 = i % 5;
			if (over3 == 0) {
				if (over4 == 0) {
				System.out.print(i+", ");
				}
			}
		}
		
		
//		opdracht 69
		
		System.out.print("Voer een zin in: ");
        String zin3 = sc.nextLine();
        int halvelengte = zin3.length() / 2;
        String halvestring = zin3.substring(0, halvelengte);
        System.out.println("De helft van de zin is: " + halvestring);
		
		sc.close();
	}

}
