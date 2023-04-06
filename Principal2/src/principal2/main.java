
package principal2;
public class main {
    public static void main(String[] args) {
        Vocal vocal=new Vocal("B");
        
       boolean valor=vocal.esVocal();
        if(valor==true){
            System.out.println("Es una Vocal");
        }else{
            System.out.println("No es una Vocal");
        }
        
        
    }
    
}
