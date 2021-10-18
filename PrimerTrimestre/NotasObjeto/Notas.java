/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notasarray;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Notas {
    
    
    public static void notaIncorrecta(int numNotas, double notas[]) {
        
    Scanner sc = new Scanner(System.in);    
    
    for (int i=0; i < numNotas; i++){
            boolean notaIncorrecta = true;
            do{
                System.out.println("Introduce la nota ("+(i+1)+"): ");
                double nota = sc.nextDouble();
                if (nota < 0 || nota > 10)
                    System.out.println("Has introducido una nota incorrecta. Debe ser entre 0 y 10 (incluidos)");
                else{
                    notas[i] = nota;
                    notaIncorrecta = false;
                }
            }while(notaIncorrecta);
        }
         
    }
    
    
    public static double calcularMedia(double[] notas){
    //public static double calcularMedia(){
    //public static double calcularMedia(double nota1, double nota2, double nota3, double nota4, double nota5){
        //double media = (nota1 + nota2 + nota3 +nota4 +nota5) / 5;
        
        double suma = 0; //variable que almacena el sumatorio de todas las notas
        double media = 0; //variable que almacena la nota media
        
        for(int i=0; i< notas.length; i++){
            suma += notas[i];
        }
        
        media = suma / notas.length;
        
        return media;
    }
    
    
    public static void inicializaStringTextos(String[] calificaciones){
        calificaciones[0] = "Debes estudiar mucho mucho más";
        calificaciones[1] = "Debes estudiar mucho más";
        calificaciones[2] = "Debes practicar";
        calificaciones[3] = "Casi apruebas";
        calificaciones[4] = "Aprobado";
        calificaciones[5] = "Bien";
        calificaciones[6] = "Muy bien";
        calificaciones[7] = "Notable";
        calificaciones[8] = "Sobresaliente";
        calificaciones[9] = "Perfecto";
    }
    
}
