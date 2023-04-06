
package principal2;
public class Vocal {
    public String letra;
    public final String VOCALES[][] ={{"a","e","i","o","u"},{"A","E","I","O","U"}};
    
      
    public Vocal(String letra) {
        this.letra = letra;
    }
    
    public boolean esVocal(){
      
        int size = VOCALES.length;
        for (int i=0;i<2;i++){
        for(int j =0; j<5;j++){
            if(letra == VOCALES[i][j]){
                return true;}}}
        return false;   }
}
    

