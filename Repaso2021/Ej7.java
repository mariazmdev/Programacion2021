/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2021;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Ej7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escribe la distancia en millas marinas: ");
        int millas = scan.nextInt();
        
        int metrosTransformados = millas * 1852;
        
        System.out.println(millas + " millas marinas, corresponden a " + metrosTransformados + " metros.");
        
    }
    
}
