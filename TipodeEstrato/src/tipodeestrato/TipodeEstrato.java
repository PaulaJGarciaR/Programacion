
package tipodeestrato;
import java.util.Scanner;
public class TipodeEstrato {
    public static void main(String[] args) {
        int SC;
        System.out.println("Cuantos Salarios Minimos reciben en su vivienda");
        Scanner numero=new Scanner (System.in); 
        SC=numero.nextInt();
        switch (SC){
            case 0:System.out.println("Pertenecen al estrato 0");
            break;
            case 1:System.out.println("Pertenecen al estrato 1");
            break;
            case 2:System.out.println("Pertenecen al estrato 2");
            break;
            case 3:System.out.println("Pertenecen al estrato 3");
            break;
            case 4:System.out.println("Pertenecen al estrato 4");
            break;
            case 5:System.out.println("Pertenecen al estrato 5");
            
        }
    }
    
}
