/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2021;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Ej9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Dime tu edad: ");
        int edad = scan.nextInt();
        
        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else {
            System.out.println("Eres mayor de edad.");
        }
        
    }
    
}
