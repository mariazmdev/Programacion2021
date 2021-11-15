/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/**
 *
 * @author alumnot
 */
public class SalidasAnticipadas {
    
    public static void main(String[] args) {
       
        int i = 0;

        while( i < 10){
                i++;

                if(i % 2 == 0)
                    continue;
                
                System.out.println("La i vale " + i);
        }
        
        
        System.out.println("Estoy fuera del bucle...");
    
    }
}
