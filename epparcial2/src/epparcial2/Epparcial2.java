
package epparcial2;
import java.util.Arrays;
import java.util.Scanner;
public class Epparcial2 {
    public static void main(String[] args) {
        int AA[]=new int [4];
        Scanner ent=new Scanner(System.in);
        for (int i=0;i<4;i++){
            AA[i]=ent.nextInt();
        }
        int[] YY=calculo(AA);
        System.out.println(Arrays.toString(YY));
    }
     public static int [] calculo(int []VV) {
         int SS[]=new int [VV.length];
         for(int i=0;i<VV.length;i++){
             SS[i]=VV[i]+1;
         }
         
         return(SS);
     }
    
}
