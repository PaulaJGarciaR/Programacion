
package divisores;

import java.util.*;

public class Divisores {
    public static void main(String[] args) {
        int KK;
        System.out.println("Ingrese un numero para hallar sus divisores");
        Scanner num=new Scanner (System.in);
        KK=num.nextInt();
        
        calculo(KK);
    }
    public static void calculo(int KK){
        int C,S=0,M=1,D;
        System.out.println("Los Divisores son:");
        for (C=1;C<=KK;C++){
            D=KK%C;
            if (D==0){
                System.out.print(C+",");
                S=S+C;
                M=M*C;
            }
        }
        System.out.println(" ");
        System.out.println("La suma total de los divisores es:"+S);
        System.out.println("La Multiplicacion total de los divisores es:"+M);
    }
}
