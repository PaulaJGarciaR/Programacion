
package dado;
import java.util.Scanner;
public class LanzamientodeDado {
    public static void main(String[] args) {
        int R;
        System.out.println("Digite el valor que obtuvo al lanzar el dado");
        Scanner numero=new Scanner (System.in);
        R=numero.nextInt();
        if (R==1){
            System.out.println("El valor obtenido fue:UNO");
        }
        else if (R==2){
            System.out.println("El valor obtenido fue:DOS");
    }
        else if (R==3){
            System.out.println("El valor obtenido fue:TRES");
        }
        else if (R==4){
            System.out.println("El valor obtenido fue:CUATRO");
        }
        else if (R==5){
            System.out.println("El valor obtenido fue:CINCO");
        }
        if (R==6){
            System.out.println("El valor obtenido fue:SEIS");
        }
}
}