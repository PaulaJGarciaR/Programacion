
package principalimc2;
public class Persona {
   public String nombrePaciente []= new String [3];
  public double pesoPaciente[]=new double [3];
    public double alturaPaciente[]=new double [3];
     public double IMC[]=new double [3];
     
     public Persona(String []nombrePaciente,double []pesoPaciente,double[] alturaPaciente){
         this.nombrePaciente=nombrePaciente;
         this.pesoPaciente=pesoPaciente;
         this.alturaPaciente=alturaPaciente;
     }
     
     public void CalculoIMC(){
         for (int i=0;i<3;i++){
             this.IMC[i]=this.pesoPaciente[i]/(this.alturaPaciente[i]*this.alturaPaciente[i]);
              if(IMC[i]<18.4){
            System.out.println("paciente:"+this.nombrePaciente[i]+":Clasificacion IMC:BAJO DE PESO");}
              else
         if (IMC[i]>=18.5 && IMC[i]<=24.9){
             System.out.println("paciente:"+this.nombrePaciente[i]+":Clasificacion IMC:NORMOPESO");}   
        else
            if(IMC[i]>=25 && IMC[i]<=29.9){
             System.out.println("paciente:"+this.nombrePaciente[i]+":clasificacion IMC:SOBREPESO");}
            
            else
                if(IMC[i]>=30 && IMC[i]<=34.9){
                    System.out.println("paciente:"+this.nombrePaciente[i]+":clasificacionIMC:OBESIDAD I");}
        else
                if(IMC[i]>=35 && IMC[i]<=39.9){
                    System.out.println("paciente:"+this.nombrePaciente[i]+":clasificacionIMC:OBESIDAD II");}
        else
                if(IMC[i]>=40){
                    System.out.println("paciente:"+this.nombrePaciente[i]+":clasificacionIMC:OBESIDAD III");}
         }
     }
}
