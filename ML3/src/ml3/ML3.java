//Sumar valores de la matriz 
package Ml3;
import java.util.*;
public class ML3 {
    public static void main(String[] args) {
        int fil,col;
        Scanner entrada=new Scanner (System.in);
        System.out.println("DEFINA LA CANTIDAD DE FILAS");
        fil=entrada.nextInt();
         System.out.println("DEFINA LA CANTIDAD DE COLUMNAS");
        col=entrada.nextInt();
        char [][] letras=new char [fil][col];
                char inicio_A='a';
            System.out.println("METODO MAIN");
          for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               letras[f][c]=inicio_A;
               System.out.print(letras[f][c]+" ");
               inicio_A++;
            }
           System.out.println(" ");
          }
          char [][] suma=new char [fil][col];
        char[][] YY = ordenar(fil,col);
         
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
    
     public static char [][] ordenar (int fil,int col) {
            char ML[][]=new char [fil][col];
             char inicio_A='*';
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
    
    

