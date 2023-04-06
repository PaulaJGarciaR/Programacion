
package principalconversiondemonedas;

import java.util.*;

public class PrincipalConversiondeMonedas {
    public static void main(String[] args) {
        Scanner xx= new Scanner (System.in);
        double cantidad[]=new double[3];
        String moneda;
        System.out.println("Con que tipo de moneda cuenta:");
        moneda=xx.nextLine();
        System.out.println("Cantidades de:"+moneda);
        for (int i=0;i<3;i++){
        cantidad[i]=xx.nextDouble();}
        if(moneda.equals("dolares")){
            Dolares dolares=new Dolares(cantidad);
            dolares.Conversion();
        }else
            if(moneda.equals("pesoscolombianos")){
                PesoColombiano pesosColombianos =new PesoColombiano(cantidad);
                pesosColombianos.ConversionMoneda();
                
            }
    }
        
    
}
