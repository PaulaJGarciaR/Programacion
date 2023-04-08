
package principalformasdos;

import java.util.Scanner;

public class Rectangulo {
    public String tipoFormaLote[]=new String [3];
       public Rectangulo(String tipoFormaLote[]){
           this.tipoFormaLote=tipoFormaLote;
           
       }
       public static int areaRectangulo(String tipoFormaLote[]){
             Scanner xx=new Scanner (System.in);
           int area=0;
           for (int i=0;i<3;i++){
               int altura=0;
               int base=0;
               if(tipoFormaLote[i].equals("rectangulo")){
                   System.out.println("FORMA LOTE:RECTANGULO");
                   System.out.println("Medida Alto:");
                   altura=xx.nextInt();
                    System.out.println("Medida Ancho:");
                   base=xx.nextInt();
                   
                   area=(base*altura);
               }
           }
           return(area);
       }}

