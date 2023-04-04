
package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese un valor para i");
        int j=teclado.nextInt();
        int i=0;
        do{
            i++;
            j++;
        } while(i<=-1);
        System.out.println(j+" "+i);
    }
}
