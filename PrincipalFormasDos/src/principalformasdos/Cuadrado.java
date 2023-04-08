
package principalformasdos;

import java.util.Scanner;

public class Cuadrado {
       public String tipoFormaLote[]=new String [3];
       public Cuadrado(String tipoFormaLote[]){
           this.tipoFormaLote=tipoFormaLote;
       }
       
       public static int areaCuadrado(String tipoFormaLote[]){
             Scanner xx=new Scanner (System.in);
           int area=0;
           for (int i=0;i<3;i++){
               int lado=0;
               if(tipoFormaLote[i].equals("cuadrado")){
                   System.out.println("FORMA LOTE:CUADRADO");
                   System.out.println("Cuanto mide su lado:");
                   lado=xx.nextInt();
                   area=lado*lado;
               }
           }
           return(area);
       }
}
