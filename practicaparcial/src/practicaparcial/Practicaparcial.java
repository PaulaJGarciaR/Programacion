
package practicaparcial;

import java.util.Arrays;
import java.util.Scanner;

public class Practicaparcial {
    public static void main(String[] args) {
        int n;
        System.out.println("De que tamaño desea el vector");
        Scanner entrada=new Scanner (System.in);
        n=entrada.nextInt();
        int  CC []=new int [n];
        int YY []=new int [n];
        for (int i=0;i<YY.length;i++){
            System.out.println("Ingrese el valor para la posicion:"+i);
            YY[i]=entrada.nextInt();
        }  
        for (int i=0;i<CC.length;i++){
            System.out.println("Ingrese el valor para la posicion:"+i);
            CC[i]=entrada.nextInt();
        }  
        int XX = calcular(CC,YY);
        System.out.println("La sumatoria del arreglo es:"+XX);
    }
      public static int calcular(int YY[],int CC[]) {
        int ss=0;
        int mm=1;
        int MM[]=new int [YY.length];
        for (int i=0;i<CC.length;i++){
            MM[i]=YY[i]*CC[i];
          mm=mm*MM[i];
          ss=ss+MM[i];
        } 
        System.out.println(Arrays.toString(MM));
        System.out.println(mm);
        System.out.println(ss);
         
        return(ss);
      }
}
