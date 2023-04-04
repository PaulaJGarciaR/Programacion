
package promedio;
public class Estudiante {
    double nota;
    String nombre;
    
    public Estudiante(double nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }
    
    public static void promedioEstudiante(Estudiante estudianteUno,Estudiante estudianteDos,Estudiante estudianteTres){
        double promedioFinal=(estudianteUno.nota+estudianteDos.nota+estudianteTres.nota)/3;
        System.out.println(promedioFinal);
    }

    
}
