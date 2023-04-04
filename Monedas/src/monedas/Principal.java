
package monedas;
public class Principal {
    public static void main(String[] args) {
        Conversion Cantidad = new Conversion (300);
        double Valor=Cantidad.ConversionMoneda();
        System.out.println("La cantidad ingresada corresponde a:"+Valor+":Pesos Colombianos");
    }
    
}
