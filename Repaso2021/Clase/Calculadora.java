/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;
import java.lang.Integer;

/**
 *
 * @author alumnot
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int opcion;
        double solucion;
        
        //menú
        do {
        
            System.out.println("***** CALCULADORA *****");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("0. Salir del programa");
            System.out.println("Introduzca una opción válida:");  
        
            opcion = Integer.parseInt(scan.nextLine());
            
        } while (opcion < 0 || opcion > 5);
        
        //valorando el contenido de la variable opcion
        if(opcion == 0) {            
            System.out.println("*Finalizando la ejecución de la calculadora.*");
        } else {
        
            System.out.println("Introduzca el primer operando: ");
            double num1 = scan.nextDouble();        
            System.out.println("Introduzca el segundo operando: ");
            double num2 = scan.nextDouble();

            switch (opcion) {
                case 1:
                    solucion = sumar(num1,num2);
                    System.out.println("El resultado de la suma es: " + solucion);
                    break;

                case 2:
                    solucion = restar(num1,num2);
                    System.out.println("El resultado de la resta es: " + solucion);
                    break;

                case 3:
                    solucion = multiplicar(num1,num2);
                    System.out.println("El resultado de la multiplicación es: " + solucion);
                    break;

                case 4:
                    solucion = dividir(num1,num2);
                    System.out.println("El resultado de la división es: " + solucion);
                    break;

                case 5:
                    solucion = resto(num1,num2);
                    System.out.println("El resto de la operación es: " + solucion);
                    break;               

            }
        
        }
        
        
    }
    
    //método para sumar
    public static double sumar(double num1, double num2){
        double resultado;
        resultado = num1 + num2;
        
        return resultado;
    }
        
    //método para restar
    public static double restar(double num1, double num2){
        double resultado;
        resultado = num1 - num2;
        
        return resultado;
    }
    
    //método para multiplicar
    public static double multiplicar(double num1, double num2){
        double resultado;
        resultado = num1 * num2;
        
        return resultado;
    }
    
    //método para dividir
    public static double dividir(double num1, double num2){
        double resultado;
        resultado = num1 / num2;
        
        return resultado;
    }
    
    //método para obtener el resto
    public static double resto(double num1, double num2){
        double resultado;
        resultado = num1 % num2;
        
        return resultado;
    }
    
}
