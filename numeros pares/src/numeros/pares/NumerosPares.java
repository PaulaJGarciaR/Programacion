
package numeros.pares;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
       int X;
       System.out.println("Ingrese un numero:");
       Scanner numero=new Scanner (System.in);
       X=numero.nextInt();
       if (X%2==0){
           System.out.println(X+":"+"Es un numero par");  
       }
       else 
           System.out.println(X+":"+"Es un numero impar"); 
    }
    
}
