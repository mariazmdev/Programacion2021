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
public class Factorial {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num, fact, total = 0;
        
        do {
            
            System.out.println("**Introduce un número (negativo para terminar):");
            num = scan.nextInt();
            
            for(int i = 1; i <= num; i++){
                System.out.println(num + "! = ");
                
                
            }
            
            
        }while(num > 0);
        
    }
    
}
