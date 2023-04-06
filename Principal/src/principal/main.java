
package principal;
public class main {
    public static void main(String[] args) {
        Vehiculo vehiculoUno=new Vehiculo("Camioneta",10000);
        Vehiculo vehiculoDos=new Vehiculo("Camio",20000);
        Vehiculo vehiculoTres=new Vehiculo("Moto",2000);
        
        Venta ventaRealizada=new Venta(vehiculoTres,3000);
        
        System.out.println("El vehiculo Vendido fue:"+ventaRealizada.nombreVehiculo()+","+"y fue vendido en:"+ventaRealizada.PrecioComprado());
        
    }

   

   
    
}
