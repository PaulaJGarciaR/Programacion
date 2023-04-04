
package monedas;
public class Conversion {
    public double CantidadDolares;
    public Conversion(double Cantidad){
        this.CantidadDolares=Cantidad;
    }
    public double ConversionMoneda(){
        double MonedaColombia=5000;
        double CantidadColombia=this.CantidadDolares*MonedaColombia;
        return(CantidadColombia);
    }
    }
