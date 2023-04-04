
package numeros.ordenados;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        int A,B,C,Mayor,Menor,In;
        Scanner numero=new Scanner (System.in);
        System.out.println("Ingrese tres numeros");
        A=numero.nextInt();
        B=numero.nextInt();
        C=numero.nextInt();
        if (A>B && A>C){
            Mayor=A;
        }
        else 
            if (B>C && B>A){
                Mayor=B;
            }
            else 
             Mayor=C; 
        if (B>A && A>C || C>A && A>B){
            In=A;
        }
        else 
            if (A>B && B>C || C>B && B>A){
                In=B;
            }
            else 
                In=C;
        
        if (A<B && A<C){
            Menor=A;
        }
        else 
            if (B<C && B< A){
                Menor=B;
            }
            else 
             Menor=C; 
        System.out.println("Mayor"+":"+Mayor);
         System.out.println("Intermedio"+":"+In);
          System.out.println("Menor"+":"+Menor);
        
    }
    
}
