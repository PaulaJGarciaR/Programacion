
package principalimcrepaso;
public class CalculoIMC {
     public int pesoPaciente[]=new int[3];
      public double alturaPaciente[]=new double [3];
       public String nombrePaciente[]=new String[3];
       public CalculoIMC(int pesoPaciente[],double alturaPaciente[],Persona persona){
           this.alturaPaciente=alturaPaciente;
           this.pesoPaciente=pesoPaciente;
           this.nombrePaciente=persona.nombrePaciente;
       }
       public static void PacienteIMC(int pesoPaciente[],double alturaPaciente[],Persona persona){
           double IMCPaciente[]=new double [3];
           for(int i=0;i<3;i++){
               IMCPaciente[i]=pesoPaciente[i]/(alturaPaciente[i]*alturaPaciente[i]);
               System.out.println(IMCPaciente[i]);
           }
       }
}
