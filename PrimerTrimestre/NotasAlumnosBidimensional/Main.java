package ejerciciossueltos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class MainNotasAlumnosMejora3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("**Indica el número de alumnos de los que vas a guardar la nota: ");
        
        int numAlumnos = scan.nextInt();
        
        double[][] alumnos = new double[numAlumnos][];
        
        NotasAlumnosMetodos.crearMatrizNotas(alumnos, scan);   
        
        NotasAlumnosMetodos.guardarNotasAlumnos(alumnos, scan);
        NotasAlumnosMetodos.imprimirNotasAlumnos(alumnos);
        
        System.out.println("****NOTA MEDIA\n" + NotasAlumnosMetodos.mediaNotasAlumnos(alumnos, scan));
        
        NotasAlumnosMetodos.todasMediasNotasAlumnos(alumnos);
        
    }
    
    
    
}
