
package notas;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        String nota[] = new String [4];
        double puntaje[]=new double [4];
        double N70,N30,NF;
        nota[0]="Parcial 1";
        nota[1]="Parcial 2";
        nota[2]="Nota 3";
        nota[3]="Examen Final";
        Scanner numero=new Scanner (System.in);
       for (int c=0;c<4;c++){
         System.out.println("Digita la calificacion de:"+nota[c]);  
         puntaje[c]=numero.nextDouble();
       }
       N70=((puntaje[0]+puntaje[1]+puntaje[2])/3)*0.70;
       N30=puntaje[3]*0.30;
       NF=N70+N30;
       System.out.println("Su nota definitiva es:"+NF);
    }
    }
