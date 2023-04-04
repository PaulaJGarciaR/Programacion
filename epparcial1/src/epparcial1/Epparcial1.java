
package epparcial1;
import java.util.Scanner;
public class Epparcial1 {
    public static void main(String[] args) {
        int n;
        System.out.println("De que tamaño desea el arreglo:");
        Scanner teclado=new Scanner (System.in);
        n=teclado.nextInt();
        int TT[]=new int [n];
       for (int i=0;i<n;i++){
           System.out.println("ingrese el primer valor para la posicion:"+i);
           TT[i]=teclado.nextInt();
       }
       System.out.println("ingrese el valor para HH");
       int HH=teclado.nextInt();
       System.out.println("Ingrese el valor para PP");
       int PP=teclado.nextInt();
        int YY = calcular(TT,HH,PP);
        System.out.println("En el arreglo TT,son numeros divisores de "+(HH+PP)+":"+YY+" "+"numeros");
    }
    public static int calcular(int []TT,int HH,int PP){
      int S=0;
      S=HH+PP;
      int c=0;
      for(int i=0;i<TT.length;i++){
          if(S%TT[i]==0){
              c=c+1;
              System.out.println("Es divisor el numero:"+TT[i]);
          }
      }
      return(c);
    }
}
