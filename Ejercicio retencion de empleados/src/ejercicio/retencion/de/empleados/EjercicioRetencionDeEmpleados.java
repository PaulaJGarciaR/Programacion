
package ejercicio.retencion.de.empleados;

import java.util.Scanner;

public class EjercicioRetencionDeEmpleados {
    public static void main(String[] args) {
        String empleado[]=new String [3];
        double Sueldo []=new double [3];
        double ST,RTE=0;
        empleado[0]="Empleado 1";
        empleado[1]="Empleado 2";
        empleado[2]="Empleado 3";
        for (int f=0;f<3;f++){
           System.out.println("Ingrese el sueldo del:"+empleado[f]);
               Scanner numero= new Scanner (System.in);
               Sueldo[f]=numero.nextDouble();
               System.out.println("La retencion del empleado fue del 15%.");
               ST=Sueldo[f]-(Sueldo[f]*0.15);
               System.out.println("Ahora el sueldo del:"+empleado[f]+"es:"+ST);
               
               RTE=RTE+ST;     
        }
        System.out.println("El total liquidado por la empresa fue:"+RTE);
    }
    
}
