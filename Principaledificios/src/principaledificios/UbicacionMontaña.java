
package principaledificios;
public class UbicacionMontaña {
     public double tiempoCaida[]=new double[3];
    public final double GRAVEDAD_MONTAÑA=9.80;
     public int contador;
    public UbicacionMontaña( double tiempoCaida[],int contador){
         this.tiempoCaida=tiempoCaida;
         this.contador=contador;
     }
     public void CalculoAlturaMontaña(){
         double altura[]=new double[this.contador];
         System.out.println("UBICACION GEOGRAFICA:EN LO ALTO DE UNA MONTAÑA");
         for(int i=0;i<this.contador;i++){
         altura[i]=(this.GRAVEDAD_MONTAÑA*(this.tiempoCaida[i]*this.tiempoCaida[i]))/2;
             System.out.println("La altura para el efificio:"+(i+1)+" es="+altura[i]);
     }
     }}

