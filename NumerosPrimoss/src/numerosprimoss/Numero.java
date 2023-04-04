
package numerosprimoss;
public class Numero {
    public int numero;
        public Numero (int valorNumero){
        this.numero=valorNumero;}
    
    public boolean numeroPrimo(){
       int c=0;
        for (int i=1;i<=this.numero;i++){
            if (this.numero%i==0){
                c=c+1;}
        }
        System.out.println(c);
        if (c==2){
            return true;
        }
        return false;
    }
}
