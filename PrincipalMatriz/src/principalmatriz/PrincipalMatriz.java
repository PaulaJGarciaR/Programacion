
package principalmatriz;

import java.util.*;

public class PrincipalMatriz {
    public static void main(String[] args) {
    int matrizNumero[][]=new int[3][3];
    Scanner xx=new Scanner (System.in);
    for (int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.println("Ingrese un numero:"+"["+(i+1)+","+(j+1)+"]");
            matrizNumero[i][j]=xx.nextInt();
        }  
    }
    Numeros numeros=new Numeros (matrizNumero);
    
    int totalSuma=numeros.Sumatoria();
    if(totalSuma%2==0){
        System.out.println(totalSuma+" "+"ES UN NUMERO PAR");}
    else
        System.out.println(totalSuma+" "+"ES UN NUMERO IMPAR");
        
    }
    
}
