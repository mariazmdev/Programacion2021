/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class NotasAlumnosMetodos {
    
    
    
    public static void crearMatrizNotas(double[][] notasAlumnos, Scanner scan){
        
        for (int i = 0; i < notasAlumnos.length; i++){
            System.out.println("\t*Indica el numero de notas del alumno < " + (i+1) + " > ");
            int numNotas = scan.nextInt();
            double[] notas = new double[numNotas];
            
            notasAlumnos[i] = notas;
        }
        
    }
    
    
    public static void guardarNotasAlumnos(double[][] notasAlumnos, Scanner scan){
        
        for(int i = 0; i < notasAlumnos.length; i++){
            System.out.println("Notas del alumno " + (i + 1));
            
            for(int j = 0; j < notasAlumnos[i].length; j++){
                System.out.println("Escribe la nota < " + (j+1) + " >:");
                notasAlumnos[i][j] = scan.nextDouble();
            }
        }
    }
    
      
    
    public static void imprimirNotasAlumnos(double[][] notasAlumnos){
        
        int contador = 1;
        
        for(double[] alumno: notasAlumnos){
            System.out.println("Notas del alumno " + contador);
            System.out.println(Arrays.toString(alumno));
            contador++;
        }
        
    }
    
    public static double mediaNotasAlumnos(double[][] notasAlumnos, Scanner scan){
        
        System.out.println("***Escribe el numero del alumno del que quieres obtener la nota media:");
        int numAlumno = scan.nextInt();
        
        double[] notas = notasAlumnos[numAlumno - 1];
        
        
        return obtenerMedia(notas);
        
    }
    
    public static void todasMediasNotasAlumnos(double[][] notasAlumnos){
        
        //cada fila es un array con las notas de cada alumno
        for(int i=0; i< notasAlumnos.length; i++){
            double[] notasAlumno = notasAlumnos[i];
            double media = obtenerMedia(notasAlumno);
            //System.out.println("* Nota media del alumno <"+(i+1)+"> es: "+media);
            System.out.printf("* Nota media del alumno <%d> es %.2f%n ",i+1,media);
        }
        
    }
    
    
    public static double obtenerMedia(double[] notas){
        double media,suma = 0;
        
        //así recorro las notas de cada alumno y las sumo
        for(int i = 0; i < notas.length; i++){
            suma += notas[i];
        }
        
        media = suma / notas.length;
        
        return media;
        
    }
}
