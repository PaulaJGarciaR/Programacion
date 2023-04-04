
package epparcial4;

import java.util.Scanner;

public class Epparcial4 {
    public static void main(String[] args) {
       int cant=10;
        int [] serie=new int[cant];
        Scanner cap =new Scanner(System.in);
        for(int i=0;i<cant;i++){
            serie[i]=cap.nextInt();
        }
        int[] XX = Calculo(serie);
        for(int i=0;i<cant;i++){
            System.out.println("Los numeros son:"+XX[i]);
        }
    }
    public static int[] Calculo(int []A) {
    int [] nuevo_Arreglo=new int [A.length];
    for(int i=0;i<A.length;i++){
        if(A[i]%2==0){
            nuevo_Arreglo[i]=A[i];
        }
    }
    return(nuevo_Arreglo);
    
    }
}
    
