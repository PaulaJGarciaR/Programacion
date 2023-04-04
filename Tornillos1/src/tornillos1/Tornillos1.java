
package tornillos1;
import java.util.Scanner;
public class Tornillos1 {
    public static void main(String[] args) {
        String DIA[]= new String [3];
        int Cantidad []=new int [3];
         String jornada[]= new String [3];
         DIA[0]="Viernes";
         DIA[1]="Sabado";
         DIA[2]="Domingo";
         jornada[0]="Mañana";
         jornada[1]="Tarde";
         jornada[2]="Noche";
         int TS=0;
         Scanner numero=new Scanner (System.in);
        for (int f=0;f<3;f++){
            int TD=0;
            double PD=0;
            for (int c=0;c<3;c++){
            System.out.println("Ingrese la Cantidad de la Jornada:"+jornada[c]+","+"dia:"+DIA[f]);
            Cantidad[c]=numero.nextInt();
            TD=TD+Cantidad[c];
            PD=TD/3;
            }
           System.out.println("El total de entregas del dia:"+DIA[f]+":fue:"+TD);
           System.out.println("El promedio de entregas del dia:"+DIA[f]+":fue:"+PD);
           TS=TS+TD;
        }
        System.out.println("El total entregado en la semana fue:"+TS);
    }  
}
