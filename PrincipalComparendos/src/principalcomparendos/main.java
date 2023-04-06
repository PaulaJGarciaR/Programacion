
package principalcomparendos;
public class main {
    public static void main(String[] args) {
    Persona persona =new Persona("Paula Garcia");
    
    Comparendo comparendoUno=new Comparendo("Estacionar en lugar prohibido",200);
    Comparendo comparendoDos=new Comparendo("Conducir sin Licencia",500);
    
    Vehiculo vehiculo =new Vehiculo("moto");
    
    Multa multa =new Multa (persona,vehiculo,comparendoDos);
    
        System.out.println("El nombre de la Persona es:"+multa.nombrePersona);
         System.out.println("El tipo de vehiculo es:"+ multa.tipoVehiculo);
          System.out.println("El tipo de infraccion cometida es:"+multa.nombreComparendo);
           System.out.println("El precio de la infraccion es:"+multa.precioComparendo);
    }
    
}
