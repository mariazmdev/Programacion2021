package ficherofecha;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumnot
 */
public class FicheroFecha {

    static String pathlog = "OutFile.log";
    static PrintWriter out = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            crearFicheroLog();            
            escribirEnFicheroDeLog("Hola caracola.");           
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    
    private static void crearFicheroLog() throws FileNotFoundException{
        out = new PrintWriter(pathlog);
        out.print("[" + dameFecha("dd/MM/yyyy HH:mm:ss ")+"] *** EMPEZANDO FICHERO DE LOG ***");
    }
    
    private static void escribirEnFicheroDeLog(String msg){
        out.println("(" + System.currentTimeMillis()+")");
        out.printf("Mi number %d%\n",8);
        out.println("Primera fecha: " + dameFechaByDefault());
        out.println("Este es el mensaje " + msg);
        out.println("********************");
    }
    
    private static String dameFecha(String formato){
        DateTimeFormatter dft = DateTimeFormatter.ofPattern(formato);
        return dft.format(LocalDateTime.now());
    }
    
    private static SimpleDateFormat dameFechaByDefault(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return date;
        
    }
}
