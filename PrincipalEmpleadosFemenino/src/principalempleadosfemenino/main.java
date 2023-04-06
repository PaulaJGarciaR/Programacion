
package principalempleadosfemenino;

import java.util.*;

public class main {
    public static void main(String[] args) {
     String documentoEmpleados[]=new String[2];
     String nombreEmpleados[]=new String[2];
     String generoEmpleados[]=new String[2];
     int sueldoEmpleado[]=new int[2];
     String cargoEmpleado[]=new String[2];
      int edadEmpleados[]=new int[2];
      Scanner xx=new Scanner (System.in);
        for (int i=0;i<2;i++){
            System.out.println("Documento empleado:"+(i+1));
            documentoEmpleados[i]=xx.nextLine();
             System.out.println("Nombre empleado:"+(i+1));
            nombreEmpleados[i]=xx.nextLine();
             System.out.println("Genero empleado:"+(i+1));
            generoEmpleados[i]=xx.nextLine();
             System.out.println("Sueldo empleado:"+(i+1));
            sueldoEmpleado[i]=xx.nextInt();
             System.out.println("Cargo empleado:"+(i+1));
            cargoEmpleado[i]=xx.nextLine();
             System.out.println("Edad empleado:"+(i+1));
            edadEmpleados[i]=xx.nextInt();
        }
        Genero genero=new Genero(generoEmpleados);
        Sueldo sueldo=new Sueldo(sueldoEmpleado,cargoEmpleado);
        Persona persona=new Persona(documentoEmpleados,nombreEmpleados,edadEmpleados,genero,sueldo);
       persona.Identificador();
    }
    
}
