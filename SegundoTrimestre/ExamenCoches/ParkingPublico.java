/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.parking.model;

/**
 *
 * @author alumnot
 */
public class ParkingPublico extends Parking {

    public ParkingPublico(int capacidad, String nombre, String direccion) {
        super(capacidad, nombre, direccion);
        
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public void porcentajeDeOcupacion() {
        
        int porcentaje = Coches.size()/capacidad;
        
        System.out.println("El porcentaje de ocupación del parking " + nombre + " es de un " + porcentaje + "%");
        
    }
    
    @Override
    public void porcentajeDeOcupacionTotal() {
        
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
    
}
