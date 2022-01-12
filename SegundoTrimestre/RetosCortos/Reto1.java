/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segtrimsueltos;

/**
 *
 * @author alumnot
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int total = 0;
        
        for(int i = 0; i < 1000; i++){
            
            if (i % 3 == 0 || i % 5 == 0){
                total += i;
            }
            
        }
        
        System.out.println("El sumatorio de los múltimplos de 3 y 5 de los números naturales hasta el 1000 es: " + total);
    }
    
}
