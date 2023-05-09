
package principalrepasofemenino;
public class Identificacion {
    public int sueldoEmpleado[]=new int[3];
    public final int SALARIO_MINIMO=1160000;
    
     
     public Identificacion(int sueldoEmpleado[],Persona persona){
         this.sueldoEmpleado=sueldoEmpleado; }
     
     public static String[] PersonaQueCumleCaracteristicas(int sueldoEmpleado[],Persona persona,final int SALARIO_MINIMO){
         int contador=0;
          for(int i=0;i<3;i++){
              if((persona.generoEmpleado[i].equals(persona.MUJER))&&(persona.edadEmpleado[i]>30)&&(sueldoEmpleado[i]<SALARIO_MINIMO)){
                     contador=contador+1;}}
          System.out.println(contador);
         String nombreEmpleadosQueCumpleCaracterististicas[]=new String[contador];
             for (int j=0;j<3;j++){
                   if((persona.generoEmpleado[j].equals(persona.MUJER))&&(persona.edadEmpleado[j]>30)){
                       if((sueldoEmpleado[j]<SALARIO_MINIMO)){
                     nombreEmpleadosQueCumpleCaracterististicas[j]=persona.nombreEmpleado[j];}
             }
         }
         return( nombreEmpleadosQueCumpleCaracterististicas);
     }
}
