/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajomaratonmaria;

import java.util.Scanner;

/**
 *
 * @author maria
 */
public class MainMaraton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("************ MARATON DE ALCALA 2021 ************");
        System.out.println("\tINTRODUCIR DATOS:");
        
        System.out.println("1. Introducir el número de corredores masculinos inscritos:");
        int numMasc = scan.nextInt();
        int[][] corredoresMasc = new int[numMasc][5];
        
        /*
        System.out.println("2. Introducir el número de corredores femeninos inscritos:");
        int numFem = scan.nextInt();
        int[][] corredoresFem = new int[numFem][5];
        */
        
        System.out.println("3. Introducir los datos de los corredores masculinos.");
        MetodosMaraton.guardarDorsalesyTiempos(corredoresMasc, scan);
        //System.out.print("\033[H\033[2J");
        
        System.out.println("\n");
        //MetodosMaraton.imprimirCorredores(corredoresMasc);
        
        //System.out.println("4. Introducir los datos de los corredores femeninos.");
        //MetodosMaraton.guardarDorsalesyTiempos(corredoresFem, scan);
        //System.out.print("\033[H\033[2J");
        
        System.out.println("\tIMPRIMIR DATOS:");
        System.out.println("***Información de abandonos masculinos:");
        MetodosMaraton.contarAbandonos(corredoresMasc);
        //System.out.print("\033[H\033[2J");
        
    }
    
}
