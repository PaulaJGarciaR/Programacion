
package principalconversiondemonedas;
public class Dolares {
    public double cantidadDolares[]=new double [3];
    public double unDolar=4574.62;
     public Dolares( double cantidadDolares[]){
         this.cantidadDolares=cantidadDolares;
     }
     public void Conversion(){
         double conversion[]=new double [3];
         for(int i=0;i<3;i++){
             conversion[i]=this.cantidadDolares[i]*this.unDolar;
             System.out.println("CANTIDAD PESOS DOLARES");
             System.out.println(this.cantidadDolares[i]);
             System.out.println("CONVERSION A PESOS COLOMBIANOS");
             System.out.println(conversion[i]);
         }
     }
}
