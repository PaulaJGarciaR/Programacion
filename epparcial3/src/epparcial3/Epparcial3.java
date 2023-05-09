
package epparcial3;

import java.util.Arrays;
import java.util.Scanner;

public class Epparcial3 {
    public static void main(String[] args) {
      int NN[]=new int [7];
      Scanner tec=new Scanner (System.in);
      for(int i=0;i<7;i++){
          NN[i]=tec.nextInt();
      }
      int YY[]=Calculo(NN);
      System.out.println(Arrays.toString(YY));
    }
    public static int[]Calculo(int[] II) {
        
        int c=0;
        for(int i=0;i<II.length;i++){
        if (II[i]%2!=0){
           c++;
        }
        }
        int IM[]=new int [c];
        c=0;
       for(int i=0;i<II.length;i++){
        if (II[i]%2!=0){
            IM[c]=II[i];
            c++;
        }
    }
      return(IM);  
    }
}
