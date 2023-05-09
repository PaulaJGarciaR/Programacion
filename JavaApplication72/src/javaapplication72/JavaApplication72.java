 
package javaapplication72;

import java.util.Scanner;

public class JavaApplication72 {

    public static void main(String[] args) {
        int fil,col;
        Scanner entrada=new Scanner (System.in);
        System.out.println("DEFINA LA CANTIDAD DE FILAS");
        fil=entrada.nextInt();
         System.out.println("DEFINA LA CANTIDAD DE COLUMNAS");
        col=entrada.nextInt();
        int [][] letras=new int [fil][col];
                int inicio_A=1;
            System.out.println("METODO MAIN");
          for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               letras[f][c]=inicio_A;
               System.out.print(letras[f][c]+" ");
               inicio_A++;
            }
           System.out.println(" ");
          }
          int [][] suma=new int [fil][col];
        int [][] YY = ordenar(fil,col);
         
         System.out.println("TOTAL DE LA SUMA");
         int i=0;
        for (int f=0;f<fil;f++){
            int j=0;
            for (int c=0;c<col;c++){
               suma[i][j]=(char) (letras[f][c]+YY[f][c]);
               System.out.print(suma[f][c]+" ");
               j++;
            }
                 System.out.println(" ");
                 i++;
          }
           
    }
    public static int [][] ordenar (int fil,int col) {
            int ML[][]=new int [fil][col];
             int inicio_A=100;
             System.out.println("METODO ORDENAR");
          for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               ML[f][c]=inicio_A;
               System.out.print(ML[f][c]+" ");
               inicio_A++;
            }
                 System.out.println(" ");
          }
          return(ML);

     }
    
    
}
