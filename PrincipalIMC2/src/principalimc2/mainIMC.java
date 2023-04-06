
package principalimc2;
import java.util.*;
public class mainIMC {
    public static void main(String[] args) {
       String nombrePaciente []= new String [3];
       double pesoPersona[]=new double[3];
      double alturaPersona[]=new double [3];
        Scanner xx=new Scanner (System.in);
     for (int i=0;i<3;i++){
         System.out.println("Nombre:Paciente:"+(i+1));
         nombrePaciente[i]=xx.next();
          System.out.println("Peso:Paciente:"+(i+1));
         pesoPersona[i]=xx.nextDouble();
          System.out.println("Altura:Paciente:"+(i+1));
         alturaPersona[i]=xx.nextDouble();
     }
     
     Persona persona = new Persona(nombrePaciente,pesoPersona,alturaPersona);
     
     persona.CalculoIMC();
     
    }
    
}
