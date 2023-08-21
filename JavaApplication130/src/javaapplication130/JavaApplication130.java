
package javaapplication130;

import java.util.Scanner;

public class JavaApplication130 {
    public static void main(String[] args) {
        System.out.println("Ingresa dos Numeros");
        Scanner xx=new Scanner(System.in);
        int numeroUno=xx.nextInt();
        int numeroDos=xx.nextInt();
        Suma suma=new Suma (numeroUno,numeroDos);
        
        int resultado=suma.sumarDatos();
        System.out.println("Respuesta:"+resultado);
    }
    
}
