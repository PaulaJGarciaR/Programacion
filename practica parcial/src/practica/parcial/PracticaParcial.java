
package practica.parcial;

import java.util.Scanner;

public class PracticaParcial {
    public static void main(String[] args) {
      
      int SS;
      System.out.println("Ingese los numeros que desea sumar");
      int suma=0;
    SS=calculo(suma);
    System.out.println(SS);
    }
    public static int calculo(int suma) {
        Scanner s=new Scanner(System.in);
         int A= s.nextInt();
      int B=s.nextInt();
        suma=A+B;
        return (suma);
    }
}
