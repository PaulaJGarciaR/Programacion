
package javaapplication15;
public class JavaApplication15 {
    public static void main(String[] args) {
       int CO;
       for (int f=1;f<=10;f++){
           CO=0;
           for (int c=1;c<=f;c++){
               if (f % c==0) {
                 CO=CO+1;  
               }
           }
           if (CO==2) {
            System.out.println(f+":ES UN NUMERO PRIMO");
           }
           else {
               System.out.println(f+":NO ES UN NUMERO PRIMO");
           }
       }
    }
    
}
