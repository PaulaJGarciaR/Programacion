
package funcion.cuadratica;
import java.util.*;
public class FuncionCuadratica {
    public static void main(String[] args) {
       operacion();
    }
    public static void operacion(){
        int a,b,c;
        double X1,X2 ;
        Scanner num=new Scanner (System.in);
        System.out.println("Ingrese el valor para a:");
        a=num.nextInt();
         System.out.println("Ingrese el valor para b:");
         b=num.nextInt();
          System.out.println("Ingrese el valor para c:");
          c=num.nextInt();
          double o=Math.pow(b, 2)-(4*a*c);
          if (o<0){
              System.out.println("Esta ecuacion No tiene Solucion"); 
          }
          else if (o==0){
              System.out.println("X1 y X2 tienen soluciones iguales");
               X1=(-b+(Math.sqrt(o)))/(2*a);
              X2=(-b-(Math.sqrt(o)))/(2*a);
             System.out.println("la solucion para X1 es:"+X1);
              System.out.println("la solucion para X2 es:"+X2);
          }
          else if (o>0){
              X1=(-b+(Math.sqrt(o)))/(2*a);
              X2=(-b-(Math.sqrt(o)))/(2*a);
              System.out.println("la solucion para X1 es:"+X1);
              System.out.println("la solucion para X2 es:"+X2);
          }
       
        
    }
  
}
