
package promedio;
public class Promedio {
    public static void main(String[] args) {
       Estudiante estudianteUno = new Estudiante(2.4,"Paula");
       Estudiante estudianteDos = new Estudiante(4.3,"Johana");
        Estudiante estudianteTres = new Estudiante(3.0,"Juan");
        
        Estudiante.promedioEstudiante(estudianteUno, estudianteDos, estudianteTres);
       
    }

   
    
}
