/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alumnot
 */
public class Multiplos7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /*
        System.out.println("Introduce el número del que quieres saber los multiplos: ");
        int num = scan.nextInt();
        System.out.println("Introduce el límite: ");
        int limite = scan.nextInt();
        */
        
        String numCadena = JOptionPane.showInputDialog("Introduce el número del que quieres saber los multiplos: ");
        String limiteCadena = JOptionPane.showInputDialog("Introduce el límite: ");
        
        int num = Integer.parseInt(numCadena);
        int limite = Integer.parseInt(limiteCadena);
        
        multiplos(num,limite);
        
        
        
    }
    
    
    public static void multiplos(int num, int limite){
        
        int contador = 0;
        
        System.out.println("Los múltiplos de " + num + " son:");
        
        for(int i = 0; i <= limite; i += num){
                        
                contador++;
                System.out.print(i + " ");
        }
        
        System.out.println("\n");
        System.out.println("Del 1 al " + limite + " hay " + contador + " múltiplos de " + num);
        
    }
    
}
