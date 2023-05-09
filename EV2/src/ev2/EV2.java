
package ev2;
import java.util.Scanner;
public class EV2 {
    public static void main(String[] args) {
        int TT[]=new int[5];
         int MM[]=new int[4];
         Scanner entrada=new Scanner(System.in);
         for (int i=0;i<TT.length;i++){
             System.out.println("Ingrese los numeros para la primera serie,posicion:"+i);
           TT[i]=entrada.nextInt();
         }
         for (int i=0;i<MM.length;i++){
             System.out.println("Ingrese los numeros para la segunda serie,posicion:"+i);
           MM[i]=entrada.nextInt();
       }
         int YY=suma(TT);
         int XX=multiplicacion(MM);
         System.out.println("La suma de los numeros contenidos en la primera serie es:"+YY);
         System.out.println("La multiplicacion de los numeros contenidos en la segunda serie es:"+XX);
    }
   public static int suma(int tt[]) {
       int AS=0;
       for (int i=0;i<tt.length;i++){
             AS=AS+tt[i];
         }
       return(AS);
   }
   public static int multiplicacion(int mm[]) {
       int AM=1;
       for (int i=0;i<mm.length;i++){
             AM=AM*mm[i];
         }
       return(AM);
   } 
}
