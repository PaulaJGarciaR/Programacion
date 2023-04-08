
package principalnomina;

import java.util.Scanner;

public class PrincipalNomina {
    public static void main(String[] args) {
     int documentoEmpleado[]=new int [3];
      int codigoEmpleado[]=new int [3];
     int diasTrabajados[]=new int [3];
     String nombreEmpleado[]=new String[3];
      double documentoEmpleadod[]=new double [3];
      String tipoEmpleado[]=new String [3];
        Scanner xx=new Scanner (System.in);
       for (int i=0;i<3;i++){
           System.out.println("Documento Empleado:"+(i+1));
           documentoEmpleado[i]=xx.nextInt();
           documentoEmpleadod[i]=documentoEmpleado[i]/1000;
           codigoEmpleado[i]=(int)documentoEmpleadod[i];
           System.out.println(codigoEmpleado[i]);
           if(codigoEmpleado[i]==1){
               tipoEmpleado[i]="operario"; }
           else
               if(codigoEmpleado[i]==0){
               tipoEmpleado[i]="administrativo"; }   
           xx.skip("\n");
           System.out.println("Nombre Empleado:"+(i+1));
           nombreEmpleado[i]=xx.nextLine();
           System.out.println("dias trabajados por el Empleado:"+(i+1));
           diasTrabajados[i]=xx.nextInt();
       }
       Persona persona=new Persona(documentoEmpleado,nombreEmpleado);
        Nomina nomina = new Nomina (diasTrabajados,tipoEmpleado,persona);
        nomina.nominaEmpleados();
    }

    
    
}
