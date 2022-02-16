package es.daw.parking.model;

import java.util.ArrayList;

/**
 *
 * @author alumnot
 */
abstract class Parking {
    protected int capacidad;
    protected int cantidadGanada;
    protected String nombre,direccion;
    protected ArrayList<Coche> Coches;    
    protected int cantidadTotalPlazas;
    protected static int ID;
    protected static int contCoches;

    public Parking(int capacidad, String nombre, String direccion) {        
        this.capacidad = capacidad;        
        this.nombre = nombre;
        this.direccion = direccion;
        this.ID = ID++;
        this.cantidadTotalPlazas += capacidad;
    }
    
    public abstract void porcentajeDeOcupacion();
    
    public abstract void porcentajeDeOcupacionTotal();
    

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

    public int getCantidadGanada() {
        return cantidadGanada;
    }

    public ArrayList<Coche> getCoches() {
        return Coches;
    }

    public int getID() {
        return ID;
    }
    
    
    
}
