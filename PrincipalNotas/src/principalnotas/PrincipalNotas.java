
package principalnotas;

import java.util.*;

public class PrincipalNotas {
    public static void main(String[] args) {
        double notaFinal[]=new double [3];
         String []nombreEstudiante= new String[3];
         Scanner xx=new Scanner (System.in);
         for(int i=0;i<3;i++){
              System.out.println("Nota Final Estudinte:"+(i+1));
             notaFinal[i]=xx.nextDouble(); 
              xx.skip("\n");
             System.out.println("Nombre Estudinte:"+(i+1));
             nombreEstudiante[i]=xx.nextLine();
         }
         Estudiante estudiante=new Estudiante(nombreEstudiante);
         Notas Notafinal=new Notas(notaFinal,estudiante);
         
         Notafinal.Escala();
    }
    
    
}
