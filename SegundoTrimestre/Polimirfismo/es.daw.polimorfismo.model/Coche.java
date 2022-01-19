/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.polimorfismo.model;

/**
 *
 * @author alumnot
 */
public class Coche extends Vehiculo{
    private int numPuertas;

        
    public Coche(int numPuertas, String matricula, int potencia, int numRuedas) {
        super(matricula, potencia, numRuedas);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    
    
    @Override
    public void mostrarEspecificaciones(){
        super.mostrarEspecificaciones();
        System.out.println("Nº de puertas del coche " + numPuertas);
        System.out.println("El Vehículo es un coche.");
    }
}
