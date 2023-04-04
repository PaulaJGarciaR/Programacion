
package ejerciciointegradorjava;

import java.util.Scanner;

public class EjercicioIntegradorJava {
    public static void main(String[] args) {
      double sueldo = 0;
      int categoria=0;
      Scanner numero=new Scanner (System.in);
      System.out.println("Por favor ingrese la categoria del empleado correspondiente:");
      categoria=numero.nextInt();
      switch (categoria){
          case 1:System.out.println("El empleado es un Repositor");
          sueldo=(15890*0.10)+15890;
          break;
          case 2:System.out.println("El empleado es un Cajero");
          sueldo=25630;
          break;
          case 3:System.out.println("El empleado es un Supervisor");
          sueldo=35560-(35560*0.11);
          break;  
      }
      System.out.println("El sueldo correspondiente al empleado:"+categoria+ "es:"+sueldo);
      }
      }
