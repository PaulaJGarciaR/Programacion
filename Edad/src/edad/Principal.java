
package edad;
public class Principal {
    public static void main(String[] args) {
        Persona Usuario=new Persona (3);
        boolean valor=Usuario.MayoriaEdad();
        if(valor==true){
            System.out.println("Usted es mayor de edad");
        } else{
            System.out.println("Usted es menor de edad");
        }
    }
    
}
