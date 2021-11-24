package notasolimpiadas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class OlimpiadasSimulacroExamen {

    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double [][] niveles = new double [3][];
        
        niveles[0] = new double[3];
        niveles[1] = new double[4];
        niveles[2] = new double[5];   
        
        
        
        
        
    }
    
    
    
    public static void registrarNotasConcursantes(double [][] niveles){
        
              
        
        
        
    }
    
   
   public static void mostrarNotasTodosNivelesOrdDesc(double[][] niveles){
       
       for (int i = 0; i < niveles.length; i++){
           if(i == 0){
               System.out.println("Notas de nivel bajo:");
           }else if(i == 1){
               System.out.println("Notas de nivel medio:");
           }else if(i == 2){
               System.out.println("Notas de nivel alto:");
           }
           
           double[] notas = niveles[i];
           Arrays.sort(notas);
           System.out.println("Notas en orden ascendente: " + Arrays.toString(notas));
           
           ordenarPorNotasDesc(notas);
           System.out.println("Notas descendente: " + Arrays.toString(notas));
       }
            
       
       
   }
   
  public static void ordenarPorNotasDesc(double[] notas){
           
           double [] aux = Arrays.copyOf(notas, notas.length);
           
           int i = 0;
           for (int j = aux.length -1; j >= 0; j--){
               notas[i] = aux[j];
               i++;
           }
           
       }
    
    public static void mejorNotas(double[][] niveles){
        
        for(int i = 0; i < niveles.length; i++){
            double[] notas = new double[niveles[i].length];
            notas = niveles[i];
            Arrays.sort(notas);
            ordenarPorNotasDesc(notas);
            
            
            if (i == 0){
                System.out.println("Mejor nota nivel bajo: " + notas[0]);
            }else if (i == 1){
                System.out.println("Mejor nota nivel medio: " + notas[0]);
            }else if (i == 2){
                System.out.println("Mejor nota nivel alto: " + notas[0]);
            }
        }
        
    }
}
