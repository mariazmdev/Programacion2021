/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooempleados;

/**
 *
 * @author alumnot
 */
public class Operario extends Empleado{

    public Operario(){
        
    }
    
    public Operario(String nombre) {
        super(nombre);
        
        
    }

    @Override
    public String toString() {
        return super.toString() + " -> Operario";
    }
    
