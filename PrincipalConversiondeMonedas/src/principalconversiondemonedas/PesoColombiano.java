
package principalconversiondemonedas;
public class PesoColombiano {
      public double cantidadPesosColombianos[]=new double [3];
      public double unPesoColombiano=0.00022;
     public PesoColombiano(double cantidadPesosColombianos[]){
         this.cantidadPesosColombianos=cantidadPesosColombianos;
     }
     public void ConversionMoneda(){
          double conversion[]=new double [3];
         for(int i=0;i<3;i++){
             conversion[i]=this.cantidadPesosColombianos[i]*this.unPesoColombiano;
             System.out.println("CANTIDAD PESOS COLOMBIANOS");
             System.out.println(this.cantidadPesosColombianos[i]);
             System.out.println("CONVERSION A DOLARES");
             System.out.println(conversion[i]);
                
         }
     }
}
