
package tipo.de.estrato;

import java.util.Scanner;

public class TipoDeEstrato {

    
    public static void main(String[] args) {
        Scanner numero=new Scanner(System.in);
        int C;
       double C1;
        System.out.println("Cuanto ganan");
         C=numero.nextInt();
            switch (C){
            case (0):System.out.println("Estan en estrato cero");
            break;
            case 1:if (C>2 && C<3){
                System.out.println("Estan en estrato c");
            }
                    
            }
          
                
        }
    }
    

