
package principalmeses;

import java.util.Arrays;

public class Estaciones {
    public  final String VERANO[]={"junio","julio","agosto"};
     public final String OTOÑO[]={"septiembre","octubre","noviembre"};
      public final String INVIERNO[]={"diciembre","enero","febrero"};
       public final String PRIMAVERA[]={"marzo","abril","mayo"};
       public String meses[]=new String [3];
       
       public Estaciones(Mes mesesDados){
           this.meses=mesesDados.meses;
       }
  
       public void mesesEstaciones(){
           for(int i=0;i<3;i++){
               if(this.meses[i].equals(this.VERANO[i])){
               System.out.println(this.meses[i]+":"+"Es Verano");}
           else
            if(this.meses[i].equals(this.OTOÑO[i])){
               System.out.println(this.meses[i]+":"+"Es Otoño");}
           else
            if(this.meses[i].equals(this.INVIERNO[i])){
               System.out.println(this.meses[i]+":"+"Es invierno");}
               else
            if(this.meses[i].equals(this.PRIMAVERA[i])){
               System.out.println(this.meses[i]+":"+"Es Primavera");}}
       
}}