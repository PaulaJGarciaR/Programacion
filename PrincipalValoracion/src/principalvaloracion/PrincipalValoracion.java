
package principalvaloracion;
import java.util.Scanner;
public class PrincipalValoracion {
    public static void main(String[] args) {
        Scanner xx=new Scanner (System.in);
        System.out.println("Cantidad Estudiantes:");
        int cantidadEstudiantes=xx.nextInt();
        double notaFinalEstudiante[]=new double[cantidadEstudiantes];
        String nombreEstudiante[]=new String [cantidadEstudiantes];
        for (int i=0;i<cantidadEstudiantes;i++){
            System.out.println("NOTA FINAL ESTUDIANTE:"+(i+1));
            notaFinalEstudiante[i]=xx.nextDouble();
            System.out.println("NOMBRE ESTUDIANTE:"+(i+1));
            xx.skip("\n");
            nombreEstudiante[i]=xx.nextLine();   
        }
         Clasificacion clasificacionNota=new Clasificacion (cantidadEstudiantes,notaFinalEstudiante,nombreEstudiante);
         clasificacionNota.ClasificacionNotas();
    }
    
}
