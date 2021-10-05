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
public class Ej6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduzca el precio que pagó: ");
        int pagado = scan.nextInt();
        
        System.out.println("Introduzca el precio real del artículo: ");
        int real = scan.nextInt();
        
        int descuento = (pagado * 100) / real;
        int porcentajeDescuento = 100 - descuento;
        
        System.out.println("El descuento que se le ha hecho corresponde a un: " + porcentajeDescuento + "%");
        
    }
    
}
