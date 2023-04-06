
package principalcomparendos;
public class Multa {
    public String nombrePersona;
    public String tipoVehiculo;
    public String nombreComparendo;
    public int precioComparendo;
    
    public Multa(Persona persona,Vehiculo vehiculo,Comparendo comparendoUno){
        this.nombrePersona=persona.nombrePersona;
        this.tipoVehiculo=vehiculo.tipoVehiculo;
        this.precioComparendo=comparendoUno.precioComparendo;
        this.nombreComparendo=comparendoUno.nombreComparendo;
    }
}
