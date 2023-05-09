
package javaapplication118;

import java.util.Scanner;

public class JavaApplication118 {
    public static void main(String[] args) {
       Scanner xx=new Scanner (System.in);
        System.out.println("De cuantos empleados va a ingresar datos:");
        int numeroEmpleados=xx.nextInt();
        String nombreEmpleado[]=new String [numeroEmpleados];
         String medioTransporteEmpleado[]=new String [numeroEmpleados];
         int sueldoEmpleado[]=new int[numeroEmpleados];
        for (int i=0;i<numeroEmpleados;i++){
            System.out.println("SUELDO:"+(i+1));
            sueldoEmpleado[i]=xx.nextInt();
            System.out.println("NOMBRE:"+(i+1));
            xx.skip("\n");
            nombreEmpleado[i]=xx.nextLine();
            System.out.println("MEDIO DE TRANSPORTE:"+(i+1));
            medioTransporteEmpleado[i]=xx.nextLine();  
        }
        
        Sueldo sueldo=new Sueldo (numeroEmpleados,nombreEmpleado, medioTransporteEmpleado,sueldoEmpleado);
        sueldo.CaculoSalario();
    }
    
}
