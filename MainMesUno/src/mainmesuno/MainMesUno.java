
package mainmesuno;

import java.util.Scanner;

public class MainMesUno {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la estacion del aÃ±o de cada mes: ");
        System.out.println("Ingrese la letra S para definir que es la estaciÃ³n otoÃ±o: ");
        System.out.println("Ingrese la letra J para definir que es la estaciÃ³n verano: ");
        System.out.println("Ingrese la letra D para definir que es la estaciÃ³n invierno: ");
        System.out.println("Ingrese la letra M para definir que es la estaciÃ³n primavera: ");
        MesAnioEstacion Meses = new MesAnioEstacion(sc.nextLine(),sc.nextLine(),sc.nextLine());
        Meses.Pedirmesdelanio();
    
    }
    
}
