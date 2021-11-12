/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import javax.swing.JOptionPane;

/**
 *
 * @author alumnot
 */
public class TablasMultiplicarRecursiva {
    
    public static void main(String[] args) {
               
        
        String numCadena = JOptionPane.showInputDialog("Introduce la tabla que quieres mostrar:  ");
        String limiteCadena = JOptionPane.showInputDialog("Introduce el número de multiplicadores: ");
        
        int num = Integer.parseInt(numCadena);
        int limite = Integer.parseInt(limiteCadena);
        
        tablas(num,limite);
        
    }
    
    public static void tablas(int num, int limite){
        
        System.out.println("\t" + "Tabla del 3");
        System.out.println("***************************");
        
        for(int i = 1; i <= limite; i++){
            int resultado = num * i;
            System.out.println("\t" + num + " x " + i + " = " + resultado);
        }
        
    }
    
    
}
