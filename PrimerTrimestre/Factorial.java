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
        int num, fact = 1;
        String total = "";
        
        do {
            
            
            System.out.println("**Introduce un número (negativo para terminar):");
            num = scan.nextInt();
            
            if(num == 0){
                System.out.println("0! = 1");
            }
            
            else if(num > 0){
                System.out.print(num + "! = ");
                total = num +"! = ";

                for(int i = num; i > 0; i--){
                    fact *= i;
                    System.out.print(i);
                    
                    if(i > 1)
                        System.out.print(" * ");
                    else
                        System.out.print(" = ");
                 
                }
                
                System.out.println(fact + "\n");
                
            }
                    
        }while(num >= 0);   
        
        
        System.out.println("**Fin del programa.");
            
    }        
     
    
}
