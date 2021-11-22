
package notasalumnospoo;

/**
 *
 * @author alumnot
 */
public class Alumno {
    
    private String nombre, apellido1,apellido2;
    private int[][] notas = new int[6][4];
    
    //constructores        
    public Alumno(String nombre,String apellido1){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = "";        
        
    }
    
    public Alumno(String nombre,String apellido1, String apellido2){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.notas = null;
    }
    
    public Alumno(String nombre,String apellido1, String apellido2, int[][] notas){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.notas = notas;
        
    }
    
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int[][] getNotas() {
        return notas;
    }

    public void setNotas(int[][] notas) {
        this.notas = notas;
    }
    
    //metodos de clase

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", notas=" + notas + '}';
    }
    
    
    
}
