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
                
                System.out.println("\n");
                
                switch (opcion) {
                    case 1:
                        System.out.println("");
                        rectangulo();
                        break;
                    
                    case 2:
                        System.out.println("");
                        triangulo();
                        break;
                }
                
            }
            
        } while (opcion != 0);
        
        System.out.println("***Finalizando la ejecución del programa***");
        
    }
    
    
    public static void mostrarMenu() {
        
        System.out.println("\n");
        System.out.println("***** DIBUJANDO FIGURAS *****");
        System.out.println("1. Dibujar rectángulo");
        System.out.println("2. Dibujar triángulo");
        System.out.println("0. Salir");
        System.out.println("");
        System.out.println("**Introduce una opción válida: ");
        
        
    }
    
    public static void rectangulo() {
        
        System.out.println("Introduce la base: ");
        int base = scan.nextInt();      
        
        System.out.println("Introduce la altura: ");
        int altura = scan.nextInt();
        System.out.println("");
        
        for (int i = 0; i < altura; i++){
            
            for(int j = 0; j < base; j++){
                System.out.print("* ");                
            }
                        
            System.out.println("");
            
        }        
        
    }
    
    
    public static void triangulo(){
        System.out.println("Introduce la altura del triángulo: ");
        int altura = scan.nextInt();
        System.out.println("");
        
        for (int i = 1; i <= altura; i++) {
            
            for (int j = 1; j <= i; j++) {                
                System.out.print("* ");
            }

            System.out.println("");
        }      
    }
    
}
