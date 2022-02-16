/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.daw.parking.model;

/**
 *
 * @author alumnot
 */
public class Coche {
    
    private final String marca,modelo,matricula;
    private final boolean esElectrico;

    public Coche(String marca, String modelo, String matricula, boolean esElectrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.esElectrico = esElectrico;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", esElectrico=" + esElectrico + '}';
    }
    
    
    
}
