package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int getal1 = sc.nextInt();
        int getal2 = sc.nextInt();
        int getal3 = sc.nextInt();
        int sum = getal1 + getal2 + getal3;
        
        
        System.out.print(getal1);
        System.out.print(getal2);
        System.out.print(getal3);
        System.out.print(sum);

        //Remember to close the Scanner
        sc.close();
    }
}
