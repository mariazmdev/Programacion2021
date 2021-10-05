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
public class Ej4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner scan = new Scanner(System.in);
       
        System.out.println("Introduce un número: ");
        int primero = scan.nextInt();
        
        System.out.println("Introduce otro número: ");
        int segundo = scan.nextInt();
        
        System.out.println("El valor de su suma es: " + (primero + segundo));
        System.out.println("El valor de su resta es: " + (primero - segundo));
        System.out.println("El valor de su producto es: " + (primero * segundo));
        System.out.println("El valor de la división es: " + (primero / segundo));
        
    }
    
}
