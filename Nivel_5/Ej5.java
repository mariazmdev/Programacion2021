/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_5;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Ej5 {
    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("¿De qué número quieres saber el factorial?");
        int num = scan.nextInt();
        int factorial = 1;
        
        
        if(num == 0) {
            System.out.println("El factorial de 0 es 1.");
        } else {
            
            while (num > 1){                
                factorial = factorial * num;
                num--;                
            }
            
            System.out.println("El factorial es " + factorial);
        }      
        
        
    }
    
}
