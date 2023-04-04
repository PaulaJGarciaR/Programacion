
package palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
       int P;
       double A,B,C,D;
       System.out.println("Por favor ingrese un numero de tres cifras");
       Scanner numero=new Scanner(System.in);
       P=numero.nextInt();
       A=P % 10;
       B=Math.round(P/100);
       if( A==B ){
           System.out.println("ES UN NUMERO PALINDROMO");
       }
       else {
           System.out.println("NO ES UN NUMERO PALINDROMO ");
       }
       }
       }
    
  
