/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package es.daw.debuggerApp;

import es.daw.debuggerApp.model.*;
//import es.daw.debuggerApp.model.ClasePrueba;

/**
 *
 * @author alumnot
 */
public class DebuggerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 5;
        
        System.out.println("Hola.");
        
        ClasePrueba prueba = new ClasePrueba();
        
        String mensaje = "Adios";
        
        prueba.escribeMensaje(mensaje, i);
    }
    
}
