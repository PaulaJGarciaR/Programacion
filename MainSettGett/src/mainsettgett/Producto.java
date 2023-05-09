
package mainsettgett;
public class Producto {
    private String nombreProducto;
    private double precioProducto;
    private int opcion;
    public static final double PORCENTAJE_IVA=0.19;
    public static double precioTotal=0;
    public Producto(String nombreProducto, double precioProducto,int opcion) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.opcion=opcion;
    }

    public int getOpcion() {
        return opcion;
    }
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    public void precioProducto(){
        if(this.opcion==1){
            double totalPrecio=this.precioProducto+(this.precioProducto*Producto.PORCENTAJE_IVA);
            System.out.println("El precio total es:"+totalPrecio);
        }else
            if(this.opcion==0){
                System.out.println("El precio total es:"+this.precioProducto);
            }
    }}
    
  

