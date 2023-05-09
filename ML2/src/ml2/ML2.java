//imprimir en cada metodo con valores diferentes 
package ml2;
import java.util.Scanner;
public class ML2 {
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
        ordenar(letras,fil,col);
    }
     public static void ordenar (char letras[][],int fil,int col) {
             char inicio_A='z';
             System.out.println("METODO ORDENAR");
          for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               letras[f][c]=inicio_A;
               System.out.print(letras[f][c]+" ");
               inicio_A--;
            }
                 System.out.println(" ");
          }
}
}
    
    

