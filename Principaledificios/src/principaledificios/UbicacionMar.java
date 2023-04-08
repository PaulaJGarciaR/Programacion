
package principaledificios;
public class UbicacionMar {
     public double tiempoCaida[]=new double[3];
       
      public final double GRAVEDAD_MAR=9.82;
     int contador;
     public UbicacionMar( double tiempoCaida[],int contador){
         this.tiempoCaida=tiempoCaida;
         this.contador=contador;
     }
     public void CalculoAltura(){
         double altura[]=new double[this.contador];
         System.out.println("UBICACION GEOGRAFICA:SOBRE EL NIVEL DEL MAR");
         for(int i=0;i<this.contador;i++){
         altura[i]=(this.GRAVEDAD_MAR*(this.tiempoCaida[i]*this.tiempoCaida[i]))/2;
         System.out.println("La altura para el efificio:"+(i+1)+" es="+altura[i]);
     }
     }
}
