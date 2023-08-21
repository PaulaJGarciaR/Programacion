
package mainuno;
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private double notaFinal;

    public Estudiante(int codigoEstudiante, double notaFinal, String nombre, String numeroIdentificacion) {
        super(nombre, numeroIdentificacion);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    @Override
   public String mostrarDatos(){
       return super.mostrarDatos()+"Codigo Estudiante:"+this.codigoEstudiante+"\n"+"Nota Final:"+this.notaFinal;
   }
    
    
}
