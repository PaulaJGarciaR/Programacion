
package epmultiplos;
import java.util.Arrays;
import java.util.Scanner;
public class EPMultiplos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int MM[]=new int[4];
        int GG[]=new int[4];
         System.out.println("Ingrese el valor para MM");
        for (int i=0;i<4;i++){
            MM[i]=teclado.nextInt();
        }
         System.out.println("Ingrese el valor para GG");
        for (int i=0;i<4;i++){
            GG[i]=teclado.nextInt();
        }
        System.out.println("Ingrese el valor para SS");
        int SS=teclado.nextInt();
        System.out.println("Ingrese el valor para UU");
        int UU=teclado.nextInt();
        int[] YY = Calcular(MM,GG,SS,UU);
        System.out.println(Arrays.toString(YY));
    }
     public static int[] Calcular(int []MM,int []GG,int SS,int UU) {
         Scanner teclado=new Scanner(System.in);
         int M=0;
         for (int i=0;i<MM.length;i++){
             if (MM[i]%SS==0){
                 M++;
             }
             else 
                 if(MM[i]%UU==0){
                     M++;
                 }
        }
         int G=0;
        for (int i=0;i<GG.length;i++){
            if (GG[i]%SS==0){
                 G++;
             }
             else 
                 if(GG[i]%UU==0){
                     G++;
                 }
           
        }
        int S=M+G;
        int []HH=new int [S];
        int X=0;
        for (int i=0;i<GG.length;i++){
            if (GG[i]%SS==0){
                 HH[X]=GG[i];
             }
             else 
                 if(GG[i]%UU==0){
                       HH[X]=GG[i];
                 } 
        }
        for (int i=0;i<GG.length;i++){
            if (GG[i]%SS==0){
                 HH[X]=GG[i];
                    X++;
             }
             else 
                 if(GG[i]%UU==0){
                       HH[X]=GG[i];
                          X++;
                 }
         
        }
        for (int i=0;i<MM.length;i++){
            if (MM[i]%SS==0){
                 HH[X]=MM[i];
                    X++;
             }
             else 
                 if(MM[i]%UU==0){
                       HH[X]=MM[i];
                          X++;
                 }
          
        }
        return(HH);
     }
    
}
