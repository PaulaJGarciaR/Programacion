
package numerospares;
public class Par {
   public int numero;
    
    public Par (int numero){
        this.numero=numero;
    } 
    public boolean NumeroPar(){
        if (this.numero %2==0){
            return true;
        }return false;
    }
}
