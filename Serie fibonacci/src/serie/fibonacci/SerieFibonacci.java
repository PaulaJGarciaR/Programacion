
package serie.fibonacci;
public class SerieFibonacci {
    public static void main(String[] args) {
       int A,B,C;
       A=0;
       B=1;
       System.out.print(A+","+B+",");
       for (int f=1;f<=10;f++){
           C=A+B;
           System.out.print(C+",");
           A=B;
           B=C;
       }
    }
    
}
