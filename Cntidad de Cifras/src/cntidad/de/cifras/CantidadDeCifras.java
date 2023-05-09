
package cntidad.de.cifras;
import java.util.Scanner;
public class CantidadDeCifras {
    public static void main(String[] args) {
        operacion();
    }
    public static void operacion() {
        int num;
        Scanner numero=new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num=numero.nextInt();
        int co=0;
        for (int c=0;num>=1;c++){
            num=num/10;
           co=co+1;
        }
        System.out.println("La cantidad de digitos es:"+co);
    }
    
}
