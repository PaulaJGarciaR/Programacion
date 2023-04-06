
package principalnumeros;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        int numeroDado[]=new int[3];
        int size=numeroDado.length;
         System.out.println("Ingrese Tres numeros");
         
        for(int i=0;i<size;i++){
        numeroDado[i]=xx.nextInt(); 
        }
        
        
        Numeros numeroIngresado=new Numeros(numeroDado);
        
        numeroIngresado.nombreNumero();
        
    }
    
}
