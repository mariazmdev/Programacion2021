/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajomaratonmaria;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class MetodosMaraton {
    
    
    
    public static void guardarDorsalesyTiempos(int[][] corredores, Scanner scan){
        
        //primero relleno el array a ceros
        for(int i = 0; i < corredores.length; i++){
            for(int j = 0; j < corredores[i].length; j++){
                corredores[i][j] = 0;
            }
        }
        
        //ahora se piden los tiempos y sobreescribimos los 0 con los minutos
        for (int i = 0; i <  corredores.length; i++){
            System.out.println("Introduce el número de dorsal del corredor " + (i+1) + ":");
            int aux = scan.nextInt();
            corredores[0][i] = aux;
            System.out.println("Tiempo del corredor " + (i+1) + " cada 5km: ");
            System.out.println("¿Cuántos tiempos vas a meter? (Del 0 al 4)");
            int no = scan.nextInt();           
                
            for(int j = 1; j < no+1; j++){
                    System.out.println("***Escribe el tiempo " + (j));
                    corredores[i][j] = scan.nextInt();
                }    
            
        }
        
    }
    
    
    public static void contarAbandonos(int[][] corredores){
        
        int km5 = 0,km10=0,km15 = 0;
        
        for(int i = 0; i < corredores.length; i++){
            for(int j = 0; j < corredores[i].length; j++){
                if(corredores[i][1] == 0) {
                    km5++;
                } else if(corredores[i][2] == 0){
                    km10++;
                } else if(corredores[i][3] == 0){
                    km15++;
                }
            }
        }
        
        System.out.println("Del km 0 al 5 han abandonado " + km5 + " corredores");
        System.out.println("Del km 5 al 10 han abandonado " + km10 + " corredores");
        System.out.println("Del km 15 al 15 han abandonado " + km15 + " corredores");
        System.out.println("El pordentaje total de abandonos a lo largo de toda la carrera ha sido un "+ (((km5+km10+km15)*100)/corredores.length));
        
        
    }
    
    public static void imprimirCorredores(int[][] corredores){
        
        int contador = 1;
        
        for(int i = 0; i < corredores.length; i++){
            for(int j = 0; j < corredores[i].length; j++){
                System.out.println("Tiempo del corredor con dorsal: " + corredores[0][i]);
                
                if(corredores[i][j] == 0) {
                    System.out.println("El corredor ha abandonado.");
                }else
                    System.out.println(corredores[i][5]);
                
            }
            
            
        }
    }
    
}
