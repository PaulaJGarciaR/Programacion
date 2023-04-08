
package principalnomina;
public class Nomina {
   public int diasTrabajados[]=new int [3];
   public int diaTrabajadoOperario=38666;
   public int diaTrabajadoAdministrativo=120000;
   public String tipoEmpleado[]=new String [3];
   public String nombreEmpleado[]=new String [3];
   public final int SALARIO_MINIMO=1160000;

   public Nomina( int diasTrabajados[], String tipoEmpleado[],Persona persona){
    this.diasTrabajados=diasTrabajados;
    this.tipoEmpleado=tipoEmpleado;
    this.nombreEmpleado=persona.nombreEmpleado;
}
   
   public void nominaEmpleados(){
       double totalPagar[]=new double[3];
     double auxilioTrasporte=0.11;
      for(int i=0;i<3;i++){
           double valorDia=0;
          if(this.tipoEmpleado[i].equals("operario")){
              valorDia=this.diaTrabajadoOperario;
             totalPagar[i]=(this.diasTrabajados[i]*this.diaTrabajadoOperario+(this.SALARIO_MINIMO*auxilioTrasporte));
              System.out.println("El total a pagar al Empleado:"+this.nombreEmpleado[i]+" "+totalPagar[i]);
          }
          else
              if(this.tipoEmpleado[i].equals("administrativo")){
              valorDia=this.diaTrabajadoAdministrativo;
               totalPagar[i]=(this.diasTrabajados[i]*this.diaTrabajadoOperario);
              System.out.println("El total a pagar al Empleado:"+this.nombreEmpleado[i]+" "+totalPagar[i]);
              }}
   }
}