
package javaapplication118;
public class Sueldo {
        public int numeroEmpleados;
        public String nombreEmpleado[]=new String [numeroEmpleados];
        public  String medioTransporteEmpleado[]=new String [numeroEmpleados];
         public int sueldoEmpleado[]=new int[numeroEmpleados];
         public final int SALARIO_MINIMO_Y_MEDIO=1740000;
         public final String MEDIO_TRANSPORTE_REQUERIDO="bus";
         public final int BONO_TRANSPORTE=150000;
         
         public Sueldo(int numeroEmpleados, String nombreEmpleado[], String medioTransporteEmpleado[],int sueldoEmpleado[]){
             this.numeroEmpleados=numeroEmpleados;
             this.nombreEmpleado=nombreEmpleado;
             this.medioTransporteEmpleado=medioTransporteEmpleado;
             this.sueldoEmpleado=sueldoEmpleado;
         }
         public void CaculoSalario(){
         
             System.out.println("TOTAL A PAGAR EMPLEADOS");
             for(int i=0;i<this.numeroEmpleados;i++){
                 if ((this.medioTransporteEmpleado[i].equals(this.MEDIO_TRANSPORTE_REQUERIDO))&&(this.sueldoEmpleado[i]<this.SALARIO_MINIMO_Y_MEDIO)){
                     int Sueldo=this.sueldoEmpleado[i]+this.BONO_TRANSPORTE;
                     System.out.println("Nombre:"+this.nombreEmpleado[i]);
                     System.out.println("Total a Pagar:"+Sueldo);
                     }
                 else 
                   if(this.sueldoEmpleado[i]>this.SALARIO_MINIMO_Y_MEDIO){
                        System.out.println("Nombre:"+this.nombreEmpleado[i]+" "+"Total Salario:"+this.sueldoEmpleado[i]); }  
             }
         }
}
