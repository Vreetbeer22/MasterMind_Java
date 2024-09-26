/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdrachten;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number between 1 - 10:");
        num = in.nextInt();
        int sum = num % 2;
        if (sum == 1) {
        	System.out.println("je getal is oneven");
        }
        else {
        	System.out.println("je getal is even");
        }
        
        
        in.close();
        
        
    }
}
