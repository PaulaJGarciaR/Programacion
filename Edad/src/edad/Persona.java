
package edad;
public class Persona {
    int edad;
    final int MAYOR_EDAD=18;
    public Persona(int edadPersona){
        this.edad=edadPersona;
    }
    public boolean MayoriaEdad(){
        if (this.edad>=this.MAYOR_EDAD){
            return true;
            
        }return false;
    }
}

