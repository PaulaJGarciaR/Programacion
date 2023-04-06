
package principalproductos;
public class Productos {
    public String []productos =new String [2];
    public double []PrecioIVA =new double [2];
    public final int KILO_ARROZ=10000;
    public final int KILO_CARNE=20000;
    public final int LITRO_LECHE=40000;
    public final Double VALOR_IVA=0.19;
    
    public Productos( String []productos){
        this.productos=productos;
    }
    
    public void ProductoVenta(){
        for(int i=0;i<2;i++){
            if(this.productos[i].equals("arroz")){
                System.out.println("PRODUCTO:Arroz");
                System.out.println("Precio Real="+this.KILO_ARROZ);  
                 this.PrecioIVA[i]=this.KILO_ARROZ+(this.KILO_ARROZ*this.VALOR_IVA);
                 System.out.println("Precio con IVA="+this.PrecioIVA[i]);}
            else
            if(this.productos[i].equals("carne")){
                System.out.println("PRODUCTO:Carne");
                System.out.println("Precio Real="+this.KILO_CARNE);  
                 this.PrecioIVA[i]=this.KILO_CARNE+(this.KILO_CARNE*this.VALOR_IVA);
                 System.out.println("Precio con IVA="+this.PrecioIVA[i]);}
            else
                if(this.productos[i].equals("leche")){
                    System.out.println("PRODUCTO:");
                     System.out.println("Precio Real="+this.KILO_CARNE); 
                     System.out.println("Este producto no tiene recargo de IVA");
                }
           
        }
    }
    
  
}
