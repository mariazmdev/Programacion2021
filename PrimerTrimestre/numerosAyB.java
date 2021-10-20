/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciossueltos;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class numerosAyB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int num1, num2,opcion;
        
        System.out.println("\n");
        System.out.println("*****PINTAR NÚMEROS*****");
                
        do {
            
            System.out.println("Introduce el primer número: ");
            num1 = scan.nextInt();

            System.out.println("Introduce el segundo número: ");          
            num2 = scan.nextInt();
            
        }while(num1 < num2);
        
        
        do {
            
            System.out.println("***¿QUÉ HACEMOS?***");
            System.out.println("1. Quiero saber qué números hay entre medias.");
            System.out.println("2. Quiero saber cuántos números son pares.");
            System.out.println("0. Salir.");
            
            opcion=scan.nextInt();
            
            switch (opcion) {
                case 1:
                    pintarRangoDeNumeros(num1,num2);
                    break;
                    
                case 2:
                    numerosPares(num1,num2);
                    break;
                case 0:
                    System.out.println("*El programa se está cerrando.*");
                    break;
            }
            
            
        }while(opcion!=0);
        
        
        
    }
    
    
    
    public static void pintarRangoDeNumeros(int num1,int num2){
        
        for(int i = num2; i <= num1; i++){
            
            System.out.print(i);
        }
        
        System.out.println("\n");
        
        
    }
    
    public static void numerosPares(int num1, int num2){
        
        int contador = 0;
        
        for(int i = num2; i <= num1; i++){
            
            if(i%2 == 0){
                contador++;
            }
        }
        
        System.out.println("Hay un total de " + contador + " números pares.");
        
    }
    
    
}
