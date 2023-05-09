
package mainvocal;

import java.util.Scanner;

public class MainVocal {
    public static void main(String[] args) {
        System.out.println("Una palabra:");
        Scanner xx= new Scanner (System.in);
        String palabra =xx.nextLine();
        
        Letra palabraIngresada=new Letra(palabra);
        palabraIngresada.palabraArreglo();
        System.out.println("La cantidad de letras que contiene la palabra es:"+Letra.contadorVocales);
    }
    
}
