/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdrachten;

import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int number = console.nextInt();
        
        int count = 1;
        int max = 10;
        while (count <= max) {
            sum = sum + number;     // moved to top of loop
            System.out.print("Enter a number: ");
            number = console.nextInt();
            count++;
        }

        System.out.println("The sum is " + sum);

    }
}
