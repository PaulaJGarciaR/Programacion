
package javaapplication30;

import java.util.Scanner;

public class JavaApplication30 {

    public static void main(String[] args) {
       boolean R;
       System.out.println("¿las ballenas azules son los animales con el corazon mas grande?");
       Scanner respuesta=new Scanner (System.in);
       R=respuesta.nextBoolean();
       if (R==true){
           System.out.println("Su respuesta fue Correcta");
       }
       else 
           System.out.println("Su respuesta es incorrecta");
    }
    
}
