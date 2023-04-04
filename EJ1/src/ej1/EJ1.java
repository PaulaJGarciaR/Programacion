
package ej1;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
       int QQ[]=new int [5];
         Scanner entrada=new Scanner(System.in);
       for(int i=0;i<5;i++){
           System.out.println("Ingrese un numero para la posicion:"+i);
           QQ[i]=entrada.nextInt();
       }
        int XX=contador(QQ);
        System.out.println("El numero fue encontrado:"+XX+" "+"veces");
    }
    public static int contador(int qq[]) {
        Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese el numero que desea buscar:");
       int c=0;
       int YY=entrada.nextInt();
        for(int i=0;i<5;i++){
          if (YY==qq[i]){
              c=c+1;
          }
       }
       return(c); 
      } 
}
