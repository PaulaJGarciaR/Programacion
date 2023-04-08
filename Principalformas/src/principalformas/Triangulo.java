
package principalformas;
public class Triangulo {
    double medidasTriangulos[]=new double [2];
       
       
       Triangulo(double medidasTriangulo[]){
           this.medidasTriangulos=medidasTriangulo;
       }
       public double AreaTriangulo(){
           double areaTriangulo=(this.medidasTriangulos[0]*this.medidasTriangulos[1])/2;
           return(areaTriangulo);
       }
        
}

