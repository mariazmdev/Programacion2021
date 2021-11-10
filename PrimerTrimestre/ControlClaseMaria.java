/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlclasemaria;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class ControlClaseMaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        int cant = 0;
        String cadena = "";
        
        
        do{
            
            System.out.println("**Introduce un número de un dígito: ");
            num = scan.nextInt();
            
            if(num > 0 && num <= 9){
                if(num % 3 == 0){
                    suma = suma + num;
                    cant = cant +1;
                }            
            
            cadena += num;      
               
            }else{
                System.out.println("**Has introducido un número demasiado grande.");                
            }
            
        }while(num != 0);
        
        
        System.out.println("\n");
        System.out.println("** Sumatorio multiplos de 3: " + suma);
        System.out.println("** Número de múltiplos de 3: " + cant);
        System.out.println("** La cadena de los números en orden inverso: " );
        
        
        for(int i = cadena.length() -1; i >= 0; i-- ){
            System.out.print(cadena.charAt(i));
        }
        System.out.println("");
        
    }
    
}
