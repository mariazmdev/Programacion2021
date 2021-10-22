/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class NumeroVocales {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        
        
        System.out.println("\n");
        System.out.println("**Escribe una palabra: ");
        String palabra = scan.nextLine().toLowerCase();        
        
        
        for(int i = 0; i < palabra.length(); i++) {
            
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u')){ 
                contador++;
            
            }
        }
        
        System.out.println("***La palabra " + palabra + " contiene " + contador + " vocales.***");
        
    }
    
}
