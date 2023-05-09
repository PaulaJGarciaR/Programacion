
package ml1;
//Metodo que devuelva la matriz resultante 
import java.util.*;
public class ML1 {
    public static void main(String[] args) {
        int fil,col;
        Scanner entrada=new Scanner (System.in);
        System.out.println("DEFINA LA CANTIDAD DE FILAS");
        fil=entrada.nextInt();
         System.out.println("DEFINA LA CANTIDAD DE COLUMNAS");
        col=entrada.nextInt();
        char [][] letras=new char [fil][col];
                
        char[][] YY=ordenar(letras,fil,col);
        
        for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               System.out.print(YY[f][c]+" ");
            }
            System.out.println(" ");
        }}
    
     public static char [][] ordenar (char letras[][],int fil,int col) {
             char inicio_A='a';
    
          for (int f=0;f<fil;f++){
            for (int c=0;c<col;c++){
               letras[f][c]=inicio_A;
               inicio_A++;
            }
    }
          return(letras);
    }
}
    

