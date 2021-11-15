/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciossueltos;

/**
 *
 * @author alumnot
 */
public class PruebaStringBuilder {
    
    
    public static void main(String[] args) {
        
        // String builder
        //---------------------------------------
        
        StringBuilder texto = new StringBuilder("Otra prueba");
        
        texto.append(" mas");
        
        System.out.println(texto);
        
        texto.insert(2,"1");
        
        System.out.println("Ahora es: " + texto);
        
        texto.reverse();
        
        System.out.println("Y ahora: " + texto);
        
        System.out.println("En mayúsculas: " + texto.toString().toUpperCase());
        
        // String
        //----------------------------------------
        
        String cadena = "Cadena de ejemplo";
        
        //reemplazar caracteres
        cadena = cadena.replaceAll(" ","-");
        System.out.println("Cadena con espacios reemplazados:" + cadena);
        
        int indiceBuscar = cadena.indexOf("ejemplo");
        
        System.out.println("indiceBuscar: " + indiceBuscar);
        
        String nuevaCadena = cadena.substring(0,indiceBuscar);
        
        System.out.println("Nueva cadena: " + nuevaCadena);
        
        
    }
    
}
