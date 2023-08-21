
package mainuno;
public class MainUno {
    public static void main(String[] args) {
      Estudiante estudiante=new Estudiante(192092,4.8,"Paula Johana Garcia Rodriguez","1010960903");
      Docente docente=new Docente(2234,"Programacion","Juan Santiago Garcia Rodriguez","1010963193");
      
      String datosEstudiante=estudiante.mostrarDatos();
      String datosDocente=docente.mostrarDatos();
        System.out.println("DATOS ESTUDIANTE");
        System.out.println(datosEstudiante);
        System.out.println("DATOS DOCENTE");
        System.out.println(datosDocente);
    }
    
}
