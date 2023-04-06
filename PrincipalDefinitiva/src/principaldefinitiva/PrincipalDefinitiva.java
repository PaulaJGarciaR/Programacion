
package principaldefinitiva;
import java.util.*;
public class PrincipalDefinitiva {
    public static void main(String[] args) {
        Scanner xx=new Scanner (System.in);
       double notasEstudiante[][]=new double [3][4];
       for (int i=0;i<3;i++){
       for (int j=0;j<4;j++){
           System.out.println("Nota:"+(j+1)+" del Estudiante: "+(i+1));
           notasEstudiante[i][j]=xx.nextDouble();
       }}
       Notas notas=new Notas(notasEstudiante);
       notas.CalculoDefinitiva();
    }
    
}
