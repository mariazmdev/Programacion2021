/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billetestren;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class BilletesTrenReto1 {

    public static void main(String[] args) {
        // Declarando variables
        final int precioBillete = 2;
        int edad = 0;
        int precioFinalBillete = 0;

        int contador = 1;
        int limite = 5;

        Scanner sc = new Scanner(System.in);

        while (contador <= limite) {

            System.out.println("***************************");
            System.out.println("*Billete numero " + contador);
            //Pedir la edad al usuario
            System.out.print("Introduce tu edad: ");
            edad = sc.nextInt();

            if (contador == limite) {
                precioFinalBillete = 0;
                System.out.println("Qué suerte, promoción especial!!!!");
            } else {

                //Comprobando condiciones para aplicar precio final al billete
                if (edad < 8) {
                    precioFinalBillete = 0;
                } else if (edad >= 8 && edad <= 17) {
                    precioFinalBillete = precioBillete / 2;
                } else if (edad >= 18 && edad <= 64) {
                    precioFinalBillete = precioBillete;
                } else if (edad > 64) {
                    precioFinalBillete = 0;
                }
            }
            System.out.println("El precio final de tu billete es: " + precioFinalBillete);
            System.out.println("***************************");
            contador++;
            
            System.out.println("Ejemplo con un salto de línea,\n" +
                    "un \t tabulador y \"comillas dobles\"");
        }
    }

}
