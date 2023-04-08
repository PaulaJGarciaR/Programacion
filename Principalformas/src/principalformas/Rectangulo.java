
package principalformas;
public class Rectangulo {
       double medidasRectangulo[]=new double [2];
       
       
       Rectangulo(double medidasRectangulo[]){
           this.medidasRectangulo=medidasRectangulo;
       }
       public double AreaRectangulo(){
           double areaRectangulo=this.medidasRectangulo[0]*this.medidasRectangulo[1];
           return(areaRectangulo);
       }
}
