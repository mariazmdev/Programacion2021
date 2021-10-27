/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasdemultiplicar;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class TablasArrayBidimensional {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [][] del1al10 = new int[10][11];
        int opcion;
        MetodosTablas.tablasDel1al10(del1al10);
        
        do { 
            
            menu();
            
                       
            switch (opcion) {
                case 1:
                    MetodosTablas.tablasDel1al10(del1al10);
                    break;
                
            }
        
        }while(opcion);
    }
