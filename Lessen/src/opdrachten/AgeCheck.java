/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdrachten;

import java.util.Scanner;

public class AgeCheck {
   
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
        int myAge = in.nextInt();
        
        if (myAge >= 16) {
            System.out.println("I'm old enough to have a driver's license!");
        }
        else {
            System.out.println("I'm not old enough yet... :*(");
            
            
        in.close();
            
        }
    }
}
    

