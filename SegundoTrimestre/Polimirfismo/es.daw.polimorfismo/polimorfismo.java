package es.daw.polimorfismo;

import es.daw.polimorfismo.model.*;

/**
 *
 * @author alumnot
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear objetos distintos vehiculos
        Vehiculo v1 = new Vehiculo("FWD-2343", 102, 3);
        
        Vehiculo v2 = new Moto("Yamaha","ASD-1234", 160, 2);
        
        Vehiculo v3 = new Coche(3,"FGH-5678", 200, 4);
        
        //imprimir 
        v1.mostrarEspecificaciones();
        v2.mostrarEspecificaciones();
        v3.mostrarEspecificaciones();
    }
    
}
