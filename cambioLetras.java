/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.Random;

/**
 *
 * @author alumnot
 */
public class cambioLetras {
    
    public static void main(String[] args) {
        
        
        Random rn = new Random();
        
        String palabra = "programacion";
        System.out.println(palabra);
        
        char[] car = palabra.toCharArray();
        
        int aleatorio1 = rn.nextInt(car.length) +1;
        int aleatorio2;
        char char1;
        
        do{
            
            aleatorio2 = rn.nextInt(car.length) +1;
            
        } while (aleatorio2 == aleatorio1);
        
        char1 = car[aleatorio1];       
        
        car[aleatorio1] = car[aleatorio2];
        car[aleatorio2] = char1;     
       
        
        System.out.println(car);
        
    }
    
}
