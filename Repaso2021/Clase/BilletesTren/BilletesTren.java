/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billetestren;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class BilletesTren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int precioBillete = 2;
        int edad = 0;
        int precioFinalBillete = 0;
        

        Scanner sc= new Scanner(System.in);
        
        
        //Pedir la edad al usuario
        System.out.print("Introduce tu edad: ");
        edad=sc.nextInt();

        //Comprobando condiciones para aplicar precio final al billete
        if (edad < 8) {
            precioFinalBillete = 0;
        }
        else if (edad >= 8 && edad <=17){
            precioFinalBillete = precioBillete / 2;
        }
        else if (edad >=18 && edad <=64){
            precioFinalBillete = precioBillete;
        }
        else if (edad > 64) {
            precioFinalBillete = 0;
        }
        System.out.println("El precio final de tu billete es: "+ precioFinalBillete);
    }
    
}
