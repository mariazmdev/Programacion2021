/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nivel_4;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Ej4 {
    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("¿Hasta qué número quieres que te muestre?");
        int num = scan.nextInt();
        
        System.out.println("******************");
        
        
        for(int i = 1; i <=num; i++){            
            System.out.println(i);
        }
        
        
    }
    
}
