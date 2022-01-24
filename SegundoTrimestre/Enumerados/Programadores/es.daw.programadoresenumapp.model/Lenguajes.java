package es.daw.programadoresenumapp.model;

/**
 *
 * @author alumnot
 */
public enum Lenguajes {
    //Valores
    JAVA(4),
    PHP(2),
    C(5),
    PERL(6),
    RUBY(3),
    PYTHON(4);
    
    //Atributo
    private int aniosAprendizaje;
    
    //Constructor
    private Lenguajes(int aniosAprendizaje){
        this.aniosAprendizaje = aniosAprendizaje;
    }
    
    //Getters & Setters

    public int getAniosAprendizaje() {
        return aniosAprendizaje;
    }

    public void setAniosAprendizaje(int aniosAprendizaje) {
        this.aniosAprendizaje = aniosAprendizaje;
    }

    @Override
    public String toString() {
        return "Lenguajes{ Nombre: " + name() + "Años para ser experto=" + aniosAprendizaje + '}';
    }
    
    
    
}
