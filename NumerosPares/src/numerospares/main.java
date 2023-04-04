
package numerospares;
public class main {
    public static void main(String[] args) {
    Par numeroPar = new Par(25);
    
    boolean Valor=numeroPar.NumeroPar();
    
    if (Valor==true){
        System.out.println("Es un numero par");
    }else{
        System.out.println("No es un numero impar");
    }
    }
    
}
