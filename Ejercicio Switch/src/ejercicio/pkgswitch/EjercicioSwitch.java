
package ejercicio.pkgswitch;
import java.util.Scanner;
public class EjercicioSwitch {
    public static void main(String[] args) {
        String dia=null;
        int numerodedia;
        Scanner numero=new Scanner (System.in);
        System.out.println("Ingrese el numero de dia que quiere seleccionar");
        numerodedia=numero.nextInt();
        switch (numerodedia){
            case 1:dia="Lunes";
            break;
            case 2:dia="Martes";
            break;
             case 3:dia="Miercoles";
            break;
             case 4:dia="Jueves";
            break;
             case 5:dia="Viernes";
            break;
             default:dia="numero INVALIDO";
             break;
        }
        System.out.println("El dia seleccionado fue:"+dia);
    }
    
}
