
package principal;
public class Venta {
    public String nombre;
    public int PrecioComprado;
    
      public Venta(Vehiculo vehiculoTres,int PrecioVendido) {
          this.nombre=vehiculoTres.nombreVehiculo;
          this.PrecioComprado=PrecioVendido;
      }
      public String nombreVehiculo(){
          return(this.nombre);
      }
       public int PrecioComprado(){
          return(this.PrecioComprado);
      }
    }

    

   
   
    
    

