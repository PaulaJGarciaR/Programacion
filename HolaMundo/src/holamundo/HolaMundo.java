
package holamundo;

import java.util.Scanner;


public class HolaMundo {

    
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);
        double parcial1,parcial2,nota3,examenfinal,N70,E30,NF;
        System.out.println("Digite la nota del primer parcial");
        parcial1=numero.nextDouble();
        System.out.println("Digite la nota del segundo parcial");
        parcial2=numero.nextDouble();
        System.out.println("Digite tercera nota");
         nota3=numero.nextDouble();
         System.out.println("Digite la nota del examen final");
         examenfinal=numero.nextDouble();
        N70=(((parcial1+parcial2+nota3)/3)*0.70);
        E30=examenfinal*0.30;
        NF=N70+E30;
        System.out.println(NF);
                 
                 
                 
                 
                 
                 
                 
                 
                 ;
                
       
    }
    
}

        