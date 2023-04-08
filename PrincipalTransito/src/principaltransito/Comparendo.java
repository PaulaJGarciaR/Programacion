
package principaltransito;
public class Comparendo {
    public double salarioMinimo=1160000;
    public String nombreComparendo="manejar sin Licencia";
    public String nombreInfractor[]=new String[3];
     public String tipoVehiculo[]=new String[3];
     public double porcentajeComparendo[]=new double [3];
    public Comparendo(Persona persona,Vehiculo vehiculo,double[] porcentajeComparendo){
        this.nombreInfractor=persona.nombrePersona;
        this.tipoVehiculo=vehiculo.tipoVehiculo;
        this.porcentajeComparendo=porcentajeComparendo;
    }
    public void Comparendo(){
        double comparendos[]=new double[3];
        for(int i=0;i<3;i++){
            comparendos[i]=this.salarioMinimo*this.porcentajeComparendo[i];
            System.out.println("INFRACTOR:"+this.nombreInfractor[i]);
            System.out.println("PRECIO A PAGAR:"+comparendos[i]);
        }
    }
    
    
}
