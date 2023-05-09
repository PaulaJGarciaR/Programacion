
package javaapplication7;
import java.util.Scanner;
public class JavaApplication7 {
    public static void main(String[] args) {
     int numerousuario;
     String nombre = null;
     System.out.println("Ingre el numero de Usuario");
     Scanner numero=new Scanner (System.in);
     numerousuario=numero.nextInt();
     switch (numerousuario){
         case 1:nombre="Paula";
         break;
         case 2:nombre="Johana";
         break;
         case 3:nombre="Samara";
         break;
         case 4:nombre="Natalia";
         break;
     }
        System.out.println("El Usuario seleccionado es:"+nombre);
    }
    
}
