/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.debuggerApp.model;

/**
 *
 * @author alumnot
 */
public class ClasePrueba {
    
    public void escribeMensaje(String mensaje, int veces){
        
        int sumatorio = 0;
        
        for(int i =0; i < veces; i++){
            System.out.println(mensaje);
            sumatorio += 10;
        }
    }
    
}
