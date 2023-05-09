
package mainsettgett;

import java.util.Scanner;

public class MainSettGett {
    public static void main(String[] args) {
       String nombreProducto;
        System.out.println("Nombre Producto:");
        Scanner xx=new Scanner (System.in);
       nombreProducto=xx.nextLine();
        System.out.println("Precio Producto:");
        double precioProducto=xx.nextDouble();
        System.out.println("El producto tiene iva");
        int opcion=xx.nextInt();
       Producto productoIngresado=new Producto (nombreProducto,precioProducto,opcion);
        System.out.println("El nombre del Producto es:"+ productoIngresado.getNombreProducto());
        productoIngresado.precioProducto();
         System.out.println("Precio Nuevo Producto:");
        double precioProductoDos=xx.nextDouble();
        System.out.println("El producto tiene iva");
        int opcionDos=xx.nextInt();
        xx.skip("\n");
        System.out.println("Nombre nuevo Producto");
        String nombreProductoDos=xx.nextLine();
        productoIngresado.setNombreProducto(nombreProductoDos);
        productoIngresado.setPrecioProducto(precioProductoDos);
        productoIngresado.setOpcion(opcionDos);
        System.out.println("El nombre del Producto es:"+ productoIngresado.getNombreProducto());
        productoIngresado.precioProducto();
       
    }
    
}
