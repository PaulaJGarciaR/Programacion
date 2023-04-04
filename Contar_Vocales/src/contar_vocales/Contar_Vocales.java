
package contar_vocales;

import java.util.Scanner;

public class Contar_Vocales {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        String Palabra;
        int CL=0,CV=0;
        System.out.println("Ingrese una palabra:");
        Palabra=entrada.nextLine();
        for(int i=0;i<Palabra.length();i++){
            CL++;
        }
        for (int i=0;i<Palabra.length();i++){
            if ((Palabra.charAt(i)=='a')||(Palabra.charAt(i)=='e')||(Palabra.charAt(i)=='i')||(Palabra.charAt(i)=='o')||(Palabra.charAt(i)=='u')){
              CV++;  
            }
        }
  
      System.out.println("La cantidad de volocales que contiene la cadena de carecteres es:"+" "+CV);
    }
    
}
