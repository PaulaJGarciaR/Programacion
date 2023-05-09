
package ejercicio.practica;
import java.util.Scanner;
public class EjercicioPractica {
    public static void main(String[] args) {
        Scanner numero =new Scanner(System.in);
     System.out.println("FABRICA DE TORNILLOS");
     String Dia;
     int CJ1,CJ2,CJ3,CD;
     double PD;
     System.out.println ("Digite la cantidad de tornillos entregados en la mañana");
     CJ1=numero.nextInt();
      System.out.println ("Digite la cantidad de tornillos entregados en la tarde");
     CJ2=numero.nextInt();
      System.out.println ("Digite la cantidad de tornillos entregados en la noche");
     CJ3=numero.nextInt();
     CD=CJ1+CJ2+CJ3;
     System.out.println("La cantidad de tornillos entregados en dia fue:"+CD);
     PD=CD/3;
     System.out.println("El promedio de tornillos fue:"+PD);
    }
    
}
