
package principalrepasofemenino;

import java.util.Arrays;
import java.util.Scanner;

public class PrincipalrepasoFemenino {
    public static void main(String[] args) {   
   int edadEmpleado[]=new int[3];
    int sueldoEmpleado[]=new int[3];
   String nombreEmpleado[]=new String[3];
   String generoEmpleado[]=new String[3];
   Scanner xx=new Scanner (System.in);
   for (int i=0;i<3;i++){
       System.out.println("Edad empleado:"+(i+1));
       edadEmpleado[i]=xx.nextInt();
        System.out.println("Sueldo empleado:"+(i+1));
       sueldoEmpleado[i]=xx.nextInt();
       xx.skip("\n");
       System.out.println("Nombre empleado:"+(i+1));
       nombreEmpleado[i]=xx.nextLine();
        System.out.println("Genero empleado:"+(i+1));
       generoEmpleado[i]=xx.nextLine();
       
   }
   Persona persona=new Persona(edadEmpleado,nombreEmpleado,generoEmpleado);
   Identificacion identificacion=new Identificacion(sueldoEmpleado,persona);
   
        String  empleadosQueRecibenBonos[]=Identificacion.PersonaQueCumleCaracteristicas(sueldoEmpleado,persona,identificacion.SALARIO_MINIMO);
        System.out.println("EMPLEADOS QUE RECIBEN BONO DE 200000");
         System.out.println(Arrays.toString(empleadosQueRecibenBonos));
        }
    }
    
