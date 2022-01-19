/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.polimorfismo.model;

/**
 *
 * @author alumnot
 */
public class Moto extends Vehiculo{
    private String marca;

        
    public Moto(String marca, String matricula, int potencia, int numRuedas) {
        super(matricula, potencia, numRuedas);
        this.marca = marca;
    }  
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    @Override
    public void mostrarEspecificaciones(){
        super.mostrarEspecificaciones();
        System.out.println("Marca de la moto" + marca);
        System.out.println("El Vehículo es una moto.");
    }
    
}
