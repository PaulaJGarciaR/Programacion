
package contarv;
import java.util.*;
public class ContarV {
    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       String Palabra;
       System.out.println("Ingrese una palabra:");
        Palabra=entrada.nextLine().toUpperCase();
       y=contadorV(Palabra);
    }
    public static int contadorV(String Cadena) {
        int CV=0;
      for (int i=0;i<Cadena.length();i++){
            if ((Cadena.charAt(i)=='A')||(Cadena.charAt(i)=='E')||(Cadena.charAt(i)=='I')||(Cadena.charAt(i)=='O')||(Cadena.charAt(i)=='U')){
              CV++;  
            }
        }
      System.out.println("La cantidad de volocales que contiene la cadena de carecteres:"+" "+Cadena+" "+"es:"+CV);
        return 0;
    }
}
