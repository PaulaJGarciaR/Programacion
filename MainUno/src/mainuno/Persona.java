
package mainuno;
public class Persona {
    protected String nombre;
    protected String numeroIdentificacion;

    public Persona(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

   public String mostrarDatos(){
       return "Nombre:"+this.nombre+"\n"+"Numero de Identificacion:"+this.numeroIdentificacion+"\n";
   }
   
    
    
}
