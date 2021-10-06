/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dibujarrectangulo;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class DibujarRectangulo {

    static Scanner scan = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int opcion;
        
        do {
            
            mostrarMenu();
            
            opcion = scan.nextInt();
            
            if(opcion < 0 || opcion > 2){
                System.out.println("*Opción errónea. Introduzca una opción de nuevo.*");
            } else if (opcion != 0){
                
                int base = introducirBase();
                int altura = introducirAltura();
                
                System.out.println("\n");
                
                switch (opcion) {
                    case 1:
                        System.out.println("");
                        break;
                    
                }
                
            }
            
        } while (opcion != 3);
        
        
        
    }
    
    
    public static void mostrarMenu() {
        
        System.out.println("\n");
        System.out.println("***** DIBUJANDO FIGURAS *****");
        System.out.println("1. Dibujar rectángulo");
        System.out.println("2. Dibujar triángulo");
        System.out.println("3. Salir");
        
        
    }
    
    public static int introducirBase() { 
        System.out.println("Introduce la base: ");
        int num = scan.nextInt();
        return num;
        
    }
    
    public static int introducirAltura() { 
        System.out.println("Introduce la altura: ");
        int num = scan.nextInt();
        return num;
        
    }
    
}
