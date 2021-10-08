/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class cadenaLinea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("**Introduce la cadena: ");
        String cadena = scan.nextLine();
        
        System.out.println("");
        
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));         
            
        }
        
        
        
    }
    
}
