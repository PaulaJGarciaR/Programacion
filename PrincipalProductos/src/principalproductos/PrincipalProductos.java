
package principalproductos;

import java.util.*;
public class PrincipalProductos {
    public static void main(String[] args) {
       String []productos =new String [2];
       Scanner xx=new Scanner(System.in);
       for (int i=0;i<2;i++){
           System.out.println("Arroz");
           System.out.println("Carne");
           System.out.println("Leche");
           System.out.println("Que producto se Compro en la Venta:"+(i+1));
           productos[i]=xx.nextLine();
       }
       Productos producto=new Productos(productos); 
       producto.ProductoVenta();
    }
    
}
