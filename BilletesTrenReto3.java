/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billetestren;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class BilletesTrenReto3 {
    
    public static void main(String[] args) {
        // Declarando variables
        final int precioBillete = 2;
        int edad = 0;
        int precioFinalBillete = 0;
        
        int contador;
        int pTotal = 0;
        int recaudacion = 0;
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("¿Cuántas veces quieres que se ejecute el programa?");
        int repeticion = scan.nextInt();
        
        for(int i=0; i < repeticion; i++){            
            
        
            System.out.println("Introduce el número de billetes que quieres comprar: ");
            int nBilletes = scan.nextInt();


            for(contador=1; contador <= nBilletes; contador++){

                System.out.println("***************************");
                System.out.println("*Billete numero " + contador);

                System.out.print("Introduce tu edad: ");
                edad=scan.nextInt();


                    if (edad < 8) {
                        precioFinalBillete = 0;      
                    }
                    else if (edad >= 8 && edad <=17){
                        precioFinalBillete = precioBillete / 2;
                        pTotal += precioFinalBillete;
                    }
                    else if (edad >=18 && edad <=64){
                        precioFinalBillete = precioBillete;
                        pTotal += precioFinalBillete;
                    }
                    else if (edad > 64) {
                        precioFinalBillete = 0;
                    }

                System.out.println("El precio de tu billete " + contador + " es: "+ precioFinalBillete + "€");
                System.out.println("***************************");

            }

            System.out.println("El precio total es: " + pTotal + "€");
            recaudacion += pTotal;
            System.out.println("*******OPERACIÓN FINALIZADA*******");
            System.out.println("**********************************");
            contador = 1;
            pTotal = 0;
        
        }
        
        System.out.println("La recaudación final es: " + recaudacion + "€");
        System.out.println("**********ADIOS**********");
        
    }

    
}
