package es.daw.programadoresenumapp;

import es.daw.programadoresenumapp.model.Lenguajes;
import es.daw.programadoresenumapp.model.Programador;
import java.util.ArrayList;

/**
 *
 * @author alumnot
 */
public class ProgramadoresEnumApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Programador> programadores = new ArrayList<>();
        
        programadores.add(new Programador("454545P","Luis",23,Lenguajes.C,2));
        programadores.add(new Programador("454545T","Pepe",35,Lenguajes.C,6));
        programadores.add(new Programador("454544Z","Ana",30,Lenguajes.JAVA,4));
        programadores.add(new Programador("888888J"));
        
        for(Programador p : programadores){
            System.out.println(p.toString());
        }
    }
    
}
