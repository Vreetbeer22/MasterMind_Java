package opdrachten;

import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	int leeftijd = sc.nextInt();
    	int nodigeLeeftijd = 18;
    	
    	boolean resultaat = leeftijd >= nodigeLeeftijd;
    	System.out.println(resultaat);
    	
    	sc.close();
    }
}