
package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
       int F = 0,N,R=1;
       Scanner numero=new Scanner (System.in);
       System.out.println("Ingrese el numero que desea saber el factorial");
       N=numero.nextInt();
      
           for (int c=1;c<=N;c++){
               R=R*c;
      
       }
       System.out.println("El resultado es:"+R);
    }
    
}
