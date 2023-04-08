
package principaledificios;
import java.util.*;
public class Principaledificios {
    public static void main(String[] args) {
     double tiempoCaida[]=new double[3];
    String ubicacionGeografica[]=new String[3];
    Scanner xx=new Scanner (System.in);
    int contadorMar=0;
    int contadorMontaña=0;
    for(int i=0;i<3;i++){
        System.out.println("Tiempo de caida del objeto del edificio:"+(i+1));
       tiempoCaida[i]=xx.nextInt();
        System.out.println("Ubicacion Geografica edificio:"+(i+1));
        xx.skip("\n");
        ubicacionGeografica[i]=xx.nextLine();
        if(ubicacionGeografica[i].equals("en lo alto de una montana")){
            contadorMontaña=contadorMontaña+1;}
        else
        if(ubicacionGeografica[i].equals("sobre el nivel del mar")){
          contadorMar=contadorMar+1;
             }}
       UbicacionMontaña alturaEdificioMontaña = new UbicacionMontaña(tiempoCaida,contadorMontaña);
       alturaEdificioMontaña.CalculoAlturaMontaña();
       UbicacionMar alturaEdificioMar = new UbicacionMar(tiempoCaida,contadorMar);
             alturaEdificioMar.CalculoAltura();
       
    }
    
}
