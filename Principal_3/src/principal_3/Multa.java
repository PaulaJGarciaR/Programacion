
package principal_3;
public class Multa {
    String nombreComparendo;
    int PrecioComparendo;
    String persona;

    public Multa(Comparendo ComparendoUno,Persona persona) {
        this.nombreComparendo = ComparendoUno.nombreComparendo;
        this.PrecioComparendo = ComparendoUno.precioComparendo;
        this.persona=persona.nombre;
    }

 
    
    
}
