
package princpialmagnitudtemblores;
import java.util.*;
public class PrincpialMagnitudTemblores {
    public static void main(String[] args) {
       
     double magnitudesTemblores[]=new double [4];
     
     Scanner xx=new Scanner(System.in);
     for (int i=0;i<4;i++){
         System.out.println("Magnitud Temblor:"+(i+1));
         magnitudesTemblores[i]=xx.nextDouble();
     }
     Escala magnitud=new Escala(magnitudesTemblores);
     magnitud.EscalaMagnitudes();
        Escala.Promedio(magnitudesTemblores);
    
}}
