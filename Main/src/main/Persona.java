
package main;
public class Persona {
    private String numeroIdentificacion;
    private String nombre;
    private int edad;

    public Persona(String numeroIdentificacion, String nombre, int edad) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
     
    
}
