
package principaldiscoteca;
import java.util.*;
public class PrincipalDiscoteca {
    public static void main(String[] args) {
        String generoCliente[]=new String[3];
        String documentoCliente[]=new String [3]; 
        int edadCliente[]=new int [3];
        Scanner xx=new Scanner (System.in);
        for (int i=0;i<3;i++){
            System.out.println("Edad Cliente:"+(i+1));
            edadCliente[i]=xx.nextInt();
            xx.skip("\n");
            System.out.println("Documento Cliente:"+(i+1));
            documentoCliente[i]=xx.nextLine();
          
            System.out.println("Genero Cliente:"+(i+1));
            generoCliente[i]=xx.nextLine();
        }
        Genero genero=new Genero(generoCliente);
        Persona persona=new Persona(edadCliente,documentoCliente,genero);
        
        persona.EntradaClientes();
    }
    
}
