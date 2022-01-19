package es.daw.polimorfismo.model;

/**
 *
 * @author alumnot
 */
public class Vehiculo {
    
    private int numRuedas;
    private int potencia;
    private String matricula;
    
    public Vehiculo(String matricula, int potencia, int numRuedas){
        this.matricula = matricula;
        this.potencia = potencia;
        this.numRuedas = numRuedas;
        
    }
    
    public void mostrarEspecificaciones(){
        System.out.println("Especificaciones del vehiculo:");
        System.out.println("Cantidad de ruedas: " + numRuedas);
        System.out.println("CV de potencia: " + potencia);
        System.out.println("Matricula: " + matricula);
    }
}
