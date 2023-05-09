
package mainvaloraciones;
public class MainValoraciones {

    public static void main(String[] args) {
       Estudiante estudianteUno=new Estudiante("Paula Garcia",4.6);
         Estudiante estudianteDos=new Estudiante("Johana Garcia",3.6);
           Estudiante estudianteTres=new Estudiante("Paula Rodriguez",2.6);
           
           ClasificacionNota clasificacionNotas=new ClasificacionNota(estudianteDos);
           clasificacionNotas.ClasificacionDeNotas();
    }
    
}
