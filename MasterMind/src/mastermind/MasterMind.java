package mastermind;

import java.util.Scanner;

public class MasterMind {

	public static void main(String[] args) {

		String wit = "wi";
		String zwart = "zw";
		String punt = " - ";
		
		String rood = "ro";
		String blauw = "bl";
		String groen = "gr";
		String geel = "ge";
		String paars = "pa";
		String oranje = "or";
		
		String code1 = rood;
		String code2 = blauw;
		String code3 = rood;
		String code4 = rood;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welkom bij mastermind!");
		System.out.println("Het doel van het spel is om de code te kraken");
		System.out.println("Hier heb je 10 rondes voor");
		System.out.println("Er zijn 6 kleuren die je kan raden, de kleuren zijn:");
		System.out.println("(rood)-ro, (blauw)-bl, (groen)-gr, (geel)-ge, (paars)-pa en (oranje)-or");
		System.out.println("De code is 4 kleuren lang dus je vult elke ronde 4 kleuren in");
		System.out.println("Als je een kleur op de goede plek hebt staan krijg je de kleur wit terug");
		System.out.println("Als de kleur niet goed is krijg je de kleur zwart terug");
		System.out.println("Veel succes!! \n");
		
		System.out.println("code 1");
		String codebreaker1_1 = sc.next();
		String codebreaker1_2 = sc.next();
		String codebreaker1_3 = sc.next();
		String codebreaker1_4 = sc.next();
		
		
		String codemaker1_1 = " ";
		if (codebreaker1_1.equals(code1)) {
			codemaker1_1 = wit;
		}
		else if (codebreaker1_1.equals(code2)) {
			codemaker1_1 = zwart;
		}
		else if (codebreaker1_1.equals(code3)) {
			codemaker1_1 = zwart;
		}
		else if (codebreaker1_1.equals(code4)) {
			codemaker1_1 = zwart;
		}
		else {
			codemaker1_1 = punt;
		}
		System.out.println(codemaker1_1);
		
		String codemaker1_2 = " ";
		if (codebreaker1_2.equals(code2)) {
			codemaker1_2 = wit;
		}
		else if (codebreaker1_2.equals(code1)) {
			codemaker1_2 = zwart;
		}
		else if (codebreaker1_2.equals(code3)) {
			codemaker1_2 = zwart;
		}
		else if (codebreaker1_2.equals(code4)) {
			codemaker1_2 = zwart;
		}
		else {
			codemaker1_2 = punt;
		}
		System.out.println(codemaker1_2);
		
		String codemaker1_3 = " ";
		if (codebreaker1_3.equals(code3)) {
			codemaker1_3 = wit;
		}
		else if (codebreaker1_3.equals(code1)) {
			codemaker1_3 = zwart;
		}
		else if (codebreaker1_3.equals(code2)) {
			codemaker1_3 = zwart;
		}
		else if (codebreaker1_3.equals(code4)) {
			codemaker1_3 = zwart;
		}
		else {
			codemaker1_3 = punt;
		}
		System.out.println(codemaker1_3);
		
		String codemaker1_4 = " ";
		if (codebreaker1_4.equals(code4)) {
			codemaker1_4 = wit;
		}
		else if (codebreaker1_4.equals(code1)) {
			codemaker1_4 = zwart;
		}
		else if (codebreaker1_4.equals(code2)) {
			codemaker1_4 = zwart;
		}
		else if (codebreaker1_4.equals(code3)) {
			codemaker1_4 = zwart;
		}
		else {
			codemaker1_4 = punt;
		}
		System.out.println(codemaker1_4);
		
		
		System.out.println("code 2");
		String codebreaker2_1 = sc.next();
		String codebreaker2_2 = sc.next();
		String codebreaker2_3 = sc.next();
		String codebreaker2_4 = sc.next();
		
		String codemaker2_1 = " ";
		String codemaker2_2 = " ";
		String codemaker2_3 = " ";
		String codemaker2_4 = " ";
		
		
		System.out.println("code 3");
		String codebreaker3_1 = sc.next();
		String codebreaker3_2 = sc.next();
		String codebreaker3_3 = sc.next();
		String codebreaker3_4 = sc.next();
		
		String codemaker3_1 = " ";
		String codemaker3_2 = " ";
		String codemaker3_3 = " ";
		String codemaker3_4 = " ";
		
		
		System.out.println("code 4");
		String codebreaker4_1 = sc.next();
		String codebreaker4_2 = sc.next();
		String codebreaker4_3 = sc.next();
		String codebreaker4_4 = sc.next();
		
		String codemaker4_1 = " ";
		String codemaker4_2 = " ";
		String codemaker4_3 = " ";
		String codemaker4_4 = " ";
		
		
		System.out.println("code 5");
		String codebreaker5_1 = sc.next();
		String codebreaker5_2 = sc.next();
		String codebreaker5_3 = sc.next();
		String codebreaker5_4 = sc.next();
		
		String codemaker5_1 = " ";
		String codemaker5_2 = " ";
		String codemaker5_3 = " ";
		String codemaker5_4 = " ";
		
		
		System.out.println("code 6");
		String codebreaker6_1 = sc.next();
		String codebreaker6_2 = sc.next();
		String codebreaker6_3 = sc.next();
		String codebreaker6_4 = sc.next();
		
		String codemaker6_1 = " ";
		String codemaker6_2 = " ";
		String codemaker6_3 = " ";
		String codemaker6_4 = " ";
		
		
		System.out.println("code 7");
		String codebreaker7_1 = sc.next();
		String codebreaker7_2 = sc.next();
		String codebreaker7_3 = sc.next();
		String codebreaker7_4 = sc.next();
		
		String codemaker7_1 = " ";
		String codemaker7_2 = " ";
		String codemaker7_3 = " ";
		String codemaker7_4 = " ";
		
		
		System.out.println("code 8");
		String codebreaker8_1 = sc.next();
		String codebreaker8_2 = sc.next();
		String codebreaker8_3 = sc.next();
		String codebreaker8_4 = sc.next();
		
		String codemaker8_1 = " ";
		String codemaker8_2 = " ";
		String codemaker8_3 = " ";
		String codemaker8_4 = " ";
		
		
		System.out.println("code 9");
		String codebreaker9_1 = sc.next();
		String codebreaker9_2 = sc.next();
		String codebreaker9_3 = sc.next();
		String codebreaker9_4 = sc.next();
		
		String codemaker9_1 = " ";
		String codemaker9_2 = " ";
		String codemaker9_3 = " ";
		String codemaker9_4 = " ";
		
		
		System.out.println("code 10");
		String codebreaker10_1 = sc.next();
		String codebreaker10_2 = sc.next();
		String codebreaker10_3 = sc.next();
		String codebreaker10_4 = sc.next();
		
		String codemaker10_1 = " ";
		String codemaker10_2 = " ";
		String codemaker10_3 = " ";
		String codemaker10_4 = " ";
		
		System.out.println("gefeliciteerd je hebt gewonnen!");
		System.out.println("helaas je hebt verloren.");
		
		sc.close();
		
	}

}
