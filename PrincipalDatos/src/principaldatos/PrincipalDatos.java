
package principaldatos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PrincipalDatos {
    public static void main(String[] args) {
        String nombres[]=new String [4];
        String documento[]=new String [4];
        Scanner xx=new Scanner (System.in);
        long edad[]=new long[4];
      
        for (int i=0;i<4;i++){
             System.out.println("Año de nacimiento persona:"+(i+1));
            int AñoNacimiento=xx.nextInt();
            System.out.println("Mes de nacimiento persona:"+(i+1));
            int mesNacimiento=xx.nextInt();
            System.out.println("Dia de nacimiento persona:"+(i+1));
            int diaNacimiento=xx.nextInt();
            LocalDate fechaNacimiento = LocalDate.of(AñoNacimiento, mesNacimiento, diaNacimiento);
            edad[i]= ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
             xx.skip("\n");
            System.out.println("Documento persona:"+(i+1));
            documento[i]=xx.nextLine();
             System.out.println("Nombres persona:"+(i+1));
            nombres[i]=xx.nextLine();  
        }
      Persona persona=new Persona(nombres,documento,edad);
        Persona.DatosPersona(nombres, documento, edad, persona.MAYORIA_EDAD);
    }
    
}
