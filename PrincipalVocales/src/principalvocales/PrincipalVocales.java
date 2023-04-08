
package principalvocales;


import java.util.*;

public class PrincipalVocales {
    public static void main(String[] args) {
       
         String letras[]=new String[5];
         Scanner xx=new Scanner(System.in);
         for (int i=0;i<5;i++){
             System.out.println("LETRA:"+(i+1));
             letras[i]=xx.nextLine();
         }
         Vocales vocales=new Vocales(letras);
         
         Vocales.Verificacion(letras, vocales.VOCALES);

    }
    
}
