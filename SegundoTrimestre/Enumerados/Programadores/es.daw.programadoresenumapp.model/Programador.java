
package es.daw.programadoresenumapp.model;

/**
 *
 * @author alumnot
 */
public class Programador {
    
    private String DNI;
    private String nombre;
    private int edad;
    private Lenguajes lp;
    private int aniosExperiencia;

    public Programador(String DNI, String nombre, int edad, Lenguajes lp, int aniosExperiencia) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.lp = lp;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public Programador(String DNI){
        this(DNI,"",0,null,0);
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Lenguajes getLp() {
        return lp;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setLp(Lenguajes lp) {
        this.lp = lp;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Programador{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", lp=" + lp + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    
}
