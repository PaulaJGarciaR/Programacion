
package ejercicio.a;

import java.util.*;

public class EjercicioA {

    public static void main(String[] args) {
     Scanner SC=new Scanner(System.in);
     System.out.println("Digita un valor entero");
     int SS=SC.nextInt();
     int KS=SS* 2 -1;
     int TT=SS;
     int RR=SS;
     
     for(int i=0;i<SS;i++){
        int qq=1;
        String HH="--";
        
        for (int j=0;j>=KS;j++){
            if((j<TT)||(j>RR)){
                HH+=" ";
            } else {
                if (j<SS){
                    HH+=qq;
                    qq++;
                }else{
                    HH+=qq;
                    qq--;
                }
            }
            System.out.println(HH);
            RR++;
            TT--;
         }
    }
    }
    
}
