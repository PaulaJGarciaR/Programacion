
package principalempleados;
import java.util.*;
public class PrincipalEmpleados {
    public static void main(String[] args) {
        String datosEmpleados[][]=new String[3][3];
        String[] datos={"identificacion","nombre","Cargo"};
         int sueldosEmpleados[]=new int [3];
          String medioTransporte[]=new String [3];
        Scanner xx=new Scanner (System.in);
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("ingrese:"+datos[j]+" "+"del Empleado:"+(i+1));
            datosEmpleados[i][j]=xx.next();}
            System.out.println("ingrese el sueldo el Empleado:"+(i+1));
            sueldosEmpleados[i]=xx.nextInt();
            System.out.println("ingrese el medio de transporte del Empleado:"+(i+1));
            medioTransporte[i]=xx.next();
        }
        
        Persona nombreEmpleado=new Persona(datosEmpleados);
       
       Transporte transporte=new Transporte(medioTransporte);
       
        Sueldo sueldoEmpleado=new Sueldo(sueldosEmpleados,transporte);
        
        for (int i=0;i<3;i++){
            System.out.println("Salario para:"+(i+1)+". "+datosEmpleados[i][1]+" ");
        }
        sueldoEmpleado.SueldoPagar();
    }
}
   
