/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablasdemultiplicar;

/**
 *
 * @author alumnot
 */
public class MetodosTablas {
    
    
    protected static void tablasDel1al10(int [][] del1al10){
        
        
        for(int i = 1; i < del1al10.length; i++){
            
            for(int j = 0; j < del1al10[i].length; j++) {
                
            del1al10[i][j] = (i+1)* j;
            
            }
            
        }
        
    }
    
    
    protected static void mostrarTablaMultiplicar(int [][] tablas){
        
        for(int i = 1; i < tablas.length; i++){
            System.out.println("Tabla de multiplicar del " + (i+1));
            
            for(int j = 0; j < tablas[i].length; j++) {
                
                System.out.println((i+1)+ " x " + j + " = " + tablas[i][j]);
                
            }
            
        }
        
    }
    
}
