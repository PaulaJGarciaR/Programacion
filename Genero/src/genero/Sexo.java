
package genero;
public class Sexo {
    String genero;
    
    public Sexo (String generoDado){
        this.genero=generoDado;}
    public boolean DefinirGenero (){
        if (this.genero=="F"){
            return true;
        }return false;
    }
}
