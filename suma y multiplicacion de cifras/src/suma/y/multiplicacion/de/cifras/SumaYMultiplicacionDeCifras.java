
package suma.y.multiplicacion.de.cifras;
import java.util.*;
public class SumaYMultiplicacionDeCifras {
    public static void main(String[] args) {
        operacion();
    }
     public static void operacion() {
        int num;
        Scanner numero=new Scanner (System.in);
        System.out.println("Ingrese un numero");
        num=numero.nextInt();
        int co=0;
         int S=0,M=1;
        for (int c=0;num>=1;c++){
            S=S+(num%10);
            M=M*(num%10);
            num=num/10;
           co=co+1;      
        }
        System.out.println("La cantidad de digitos es:"+co);
        System.out.println("El total de la suma de sus digitos es:"+S);
        System.out.println("El total de la multiplicacion de sus digitos es:"+M);
    }
    
}
    

