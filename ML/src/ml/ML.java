
package ml;

import java.util.*;

public class ML {
    public static void main(String[] args) {
        int fil,col;
        Scanner entrada=new Scanner (System.in);
        System.out.println("DEFINA LA CANTIDAD DE FILAS");
        fil=entrada.nextInt();
         System.out.println("DEFINA LA CANTIDAD DE COLUMNAS");
        col=entrada.nextInt();
        char [][] letras=new char [fil][col];
                
        ordenar(letras,fil,col);
        
        for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               System.out.print(letras[f][c]+" ");
            }
            System.out.println(" ");
        }}
    
    public static void ordenar (char letras[][],int fil,int col) {
             char inicio_A='a';
    
          for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               letras[f][c]=inicio_A;
               inicio_A++;
            }
    }
    }
}


