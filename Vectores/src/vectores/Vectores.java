
package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        
       int Nota []=new int [4];
       Scanner numero=new Scanner (System.in);
       
      for (int c=1;c<=(Nota.length);c++){
          System.out.println("Ingrese la nota:"+c);
          Nota[c]=(int) numero.nextDouble();             
    }
    
    }
    }
