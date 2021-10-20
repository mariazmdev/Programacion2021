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
public class Control1 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int suma = 0;
        int contador = 0;
        int num = 0;
        
               
        do {
            
            System.out.println("\n");
            System.out.println("Introduce un número: ");
            num = scan.nextInt();
            
            if(num >= 0){
                suma += num;
                
                if(num >= 10 && num <= 99) {
                    contador++;
                }
            }         
            
            
        }while (num >= 0);
        
        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("Hay " + contador + " números de dos cifras.");
        
        
        
        
    }
    
    
}
