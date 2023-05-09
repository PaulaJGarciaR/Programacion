
package serie.aritmetica;
public class SerieAritmetica {
    public static void main(String[] args) {
       int A,B,C;
       A=1;
       B=3;
       System.out.print(A+",");
           System.out.print(B+",");
       for (int f=1;f<=5;f++){
           C=A+B;
            System.out.print(C+",");
           A=B;
           B=C;
       }
       
    }
   
}
