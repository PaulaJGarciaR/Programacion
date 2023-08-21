
package mainuno;
public class Docente extends Persona {
    private int codigoDocente;
    private String asignatura;

    public Docente(int codigoDocente, String asignatura, String nombre, String numeroIdentificacion) {
        super(nombre, numeroIdentificacion);
        this.codigoDocente = codigoDocente;
        this.asignatura = asignatura;
    }

    public int getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(int codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    @Override
   public String mostrarDatos(){
       return super.mostrarDatos()+"Codigo Docente:"+this.codigoDocente+"\n"+"Asignatura:"+this.asignatura;
   }
    
}
