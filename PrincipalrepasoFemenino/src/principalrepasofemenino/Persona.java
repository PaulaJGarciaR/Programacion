
package principalrepasofemenino;
public class Persona {
    final String MUJER="femenino";
     final String HOMBRE="masculino";
    public int edadEmpleado[]=new int[3];
     public String nombreEmpleado[]=new String[3];
     public String generoEmpleado[]=new String[3];
     public Persona( int edadEmpleado[],String nombreEmpleado[],String generoEmpleado[]){
         this.edadEmpleado=edadEmpleado;
         this.nombreEmpleado=nombreEmpleado;
         this.generoEmpleado=generoEmpleado;
     }
}
