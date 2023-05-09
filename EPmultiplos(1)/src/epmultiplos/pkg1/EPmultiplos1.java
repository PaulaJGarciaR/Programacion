
package epmultiplos.pkg1;
import java.util.*;
public class EPmultiplos1 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
          System.out.println("Ingrese el tamaño para los arreglos");
          int T=teclado.nextInt();
        int KK[]=new int[T];
        int RR[]=new int[T];
         System.out.println("Ingrese los valores para KK");
        for (int i=0;i<T;i++){
            KK[i]=teclado.nextInt();
        }
         System.out.println("Ingrese los valores para RR");
        for (int i=0;i<T;i++){
            RR[i]=teclado.nextInt();
        }
        System.out.println("Ingrese el valor para QQ");
        int QQ=teclado.nextInt();
        Calcular(KK,RR,QQ);
    }
     public static void Calcular(int []KK,int []RR,int QQ) {
         Scanner teclado=new Scanner(System.in);
         int C=0;
         for (int i=0;i<KK.length;i++){
             if (KK[i]%QQ==0){
                 C++;
             }}
        for (int i=0;i<RR.length;i++){
            if (RR[i]%QQ==0){
                 C++;
             }}
        int []TT=new int [C];
        int X=0;
        for (int i=0;i<KK.length;i++){
            if (KK[i]%QQ==0){
                 TT[X]=KK[i];
                 X++;
             }} 
        for (int i=0;i<RR.length;i++){
            if (RR[i]%QQ==0){
                 TT[X]=RR[i];
                    X++;
             }}
        System.out.println("Los Muultiplos son:");
        System.out.println(Arrays.toString(TT)); 
     }
}

    
    

