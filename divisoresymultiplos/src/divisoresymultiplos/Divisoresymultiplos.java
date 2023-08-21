
package divisoresymultiplos;

import java.util.Scanner;

public class Divisoresymultiplos {
    public static void main(String[] args) {
       
        Scanner XX=new Scanner (System.in);
        int numero=XX.nextInt();
        
        System.out.println("DIVISORES");
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                System.out.println(i+"\n");
            }
        }
        System.out.println("MULTIPLOS");
         for(int j=1;j<=100;j++){
            if(j%numero==0){
                System.out.println(j+"\n");
            }
        }
    }
    
}
