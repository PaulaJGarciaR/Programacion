
package principalformasdos;

import java.util.Scanner;

public class Triangulo {
  public String tipoFormaLote[]=new String [3];
       public Triangulo(String tipoFormaLote[]){
           this.tipoFormaLote=tipoFormaLote;
       }

 public static int areaTriangulo(String tipoFormaLote[]){
             Scanner xx=new Scanner (System.in);
           int area=0;
           for (int i=0;i<3;i++){
               int altura=0;
               int base=0;
               if(tipoFormaLote[i].equals("triangulo")){
                   System.out.println("FORMA LOTE:TRIANGULO");
                   System.out.println("Medida Alto:");
                   altura=xx.nextInt();
                    System.out.println("Medida Ancho:");
                   base=xx.nextInt();
                   
                   area=(base*altura)/2;
               }
           }
           return(area);
       }}