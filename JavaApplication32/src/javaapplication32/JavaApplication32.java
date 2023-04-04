
package javaapplication32;

import java.util.Scanner;

public class JavaApplication32 {

    public static void main() {
       int a;
       a=calc();
               if (a==0){
                   System.out.println("Es par");
               }
               else
                System.out.println("Es impar");   
     
    }
     public static int calc() {
         Scanner Capt=new Scanner (System.in);
         int num;
         num=Capt.nextInt();
         return(num%2);
     }
        
         
     
    
}
