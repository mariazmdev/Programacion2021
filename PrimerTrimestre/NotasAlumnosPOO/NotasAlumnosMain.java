/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalumnospoo;

/**
 *
 * @author alumnot
 */
public class NotasAlumnosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno = new Alumno("Sandra","González","Díaz");
        
        int[][] notas = {{5,4,6,0},{8,5,7,0},{1,2,3,0},{7,8,9,0},{5,4,6,0},{8,5,7,0}};
        
        alumno.setNotas(notas);
        
    }
    
}
