
package principalimcrepaso;
import java.util.Scanner;
public class PrincipalIMCRepaso {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
       int pesoPaciente[]=new int[3];
       double alturaPaciente[]=new double [3];
       String nombrePaciente[]=new String[3];
          for(int i=0;i<3;i++){
              System.out.println("PESO PACIENTE:"+(i+1));
              pesoPaciente[i]=xx.nextInt();
               System.out.println("ALTURA PACIENTE:"+(i+1));
              alturaPaciente[i]=xx.nextDouble();
              xx.skip("\n");
               System.out.println("NOMBRE PACIENTE:"+(i+1));
              nombrePaciente[i]=xx.nextLine();
          }
          Persona persona=new Persona(nombrePaciente);
          CalculoIMC calculo=new CalculoIMC(pesoPaciente,alturaPaciente,persona);
  
    }  
}
