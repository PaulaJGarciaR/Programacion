
package multiplos;

import java.util.*;

public class Multiplos {
    public static void calculo(int N,int SS){
        int C,M=0;
     if (N>SS){
            System.out.println("Error de Autenticacion");
        }
        else {
            for (C=1;C<=SS;C++){
              if (C%N==0){
             System.out.println(C);
              }
        }
    }
    }
    public static void main(String[] args) {
        int N,SS;
        Scanner num=new Scanner (System.in);
        System.out.println("Ingrese un numero para obtener sus multiplos");
        N=num.nextInt();
        System.out.println("Ingrese el numero limite");
        SS=num.nextInt();
      
      calculo(N,SS);     
    }
    
}
