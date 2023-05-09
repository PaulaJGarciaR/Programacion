
package principalnumero;
import java.util.Scanner;
public class PrincipalNumero {
    public static void main(String[] args) {
       Scanner  xx=new Scanner (System.in);
       int numerosIngresados[]=new int [4];
       for (int i=0;i<4;i++){
           System.out.println("Numero:"+(i+1));
           numerosIngresados[i]=xx.nextInt();
       }
       Numeros numeros=new Numeros(numerosIngresados);
       
       String [] numerosIngresadosenLetras =Numeros.NumerosenLetras(numerosIngresados,numeros.NUMEROS,numeros.numerosLetras);
       
        for(int i=0;i<4;i++){
            System.out.println(numerosIngresados[i]+":"+numerosIngresadosenLetras[i]); }
    
}}
