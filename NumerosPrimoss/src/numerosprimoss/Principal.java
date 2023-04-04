
package numerosprimoss;
public class Principal {
    public static void main(String[] args) {
     Numero numerosPrimos=new Numero(7);
      
     boolean Valor= numerosPrimos.numeroPrimo();
     
     if (Valor==true){
         System.out.println("Es un numero Primo");
     }else{
         System.out.println("No es un numero Primo");
     }
    }
    
}
