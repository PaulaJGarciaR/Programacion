
package principalmeses;

import java.util.*;

public class PrincipalMeses {
    public static void main(String[] args) {
        String meses[]=new String[3];
        System.out.println("Meses:");
        Scanner xx=new Scanner (System.in);
        for (int i=0;i<3;i++){
            meses[i]=xx.nextLine();
        }
        Mes mesesDados =new Mes(meses);
        
        Estaciones estaciones=new Estaciones(mesesDados);
        
        estaciones.mesesEstaciones();
    }
    
}
