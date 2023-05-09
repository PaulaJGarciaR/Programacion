
package epmultiplos2;
import java.util.Arrays;
import java.util.Scanner;
public class EPmultiplos2 {
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
        int[] YY = Calcular(KK,RR,QQ);
         System.out.println("Los Muultiplos son:");
        System.out.println(Arrays.toString(YY));
    }
     public static int[] Calcular(int []KK,int []RR,int QQ) {
         Scanner teclado=new Scanner(System.in);
         int u=0;
         for (int i=0;i<KK.length;i++){
             if (KK[i]%QQ==0){
                 u++;
             }}
         int d=0;
        for (int i=0;i<RR.length;i++){
            if (RR[i]%QQ==0){
                 d++;
             }}
        int []U=new int [u];
         int []D=new int [d];
         u=0;
        d=0;
        for (int i=0;i<KK.length;i++){
            if (KK[i]%QQ==0){
                 U[u]=KK[i];
                 u++;
             }} 
        for (int i=0;i<RR.length;i++){
            if (RR[i]%QQ==0){
                 D[d]=RR[i];
                    d++;
             }}
        int TT[]=new int[U.length+D.length];
        int j=0;
        for (int i=0;i<RR.length;i++){
            TT[j]=U[i];
            j++;
            TT[j]=D[i];
            j++;
        }
        return(TT);
     }
    
}

    
    

