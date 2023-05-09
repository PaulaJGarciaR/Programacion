
package main;
public class Estudiante extends Persona{
    private String codigoNombre;
    private double notaFinal;

    public Estudiante(String codigoNombre, double notaFinal, String numeroIdentificacion, String nombre, int edad) {
        super(numeroIdentificacion, nombre, edad);
        this.codigoNombre = codigoNombre;
        this.notaFinal = notaFinal;
    }

    public String getCodigoNombre() {
        return codigoNombre;
    }

    public void setCodigoNombre(String codigoNombre) {
        this.codigoNombre = codigoNombre;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre Estudiante:"+this.getNombre());
        System.out.println("Documento Estudiante:"+this.getNumeroIdentificacion());
        System.out.println("Edad Estudiante:"+this.getEdad());
        System.out.println("Codigo Estudiante:"+this.codigoNombre);
        System.out.println("Nota Final Estudiante:"+this.notaFinal);
    }
    
}
