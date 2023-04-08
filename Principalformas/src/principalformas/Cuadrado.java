
package principalformas;
public class Cuadrado {
     double medidasCuadrado;

    public Cuadrado(double medidasCuadrado) {
        this.medidasCuadrado = medidasCuadrado;
    }
     
    
     
     public double AreaCuadrado(){
         double areaCuadrado=this.medidasCuadrado*this.medidasCuadrado;
         return(areaCuadrado);
     }
}
