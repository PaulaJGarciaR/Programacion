
package genero;
public class principal {
    public static void main(String[] args) {
     Sexo Persona=new Sexo("M");
     
     boolean valor =Persona.DefinirGenero();
     if (valor == true){
         System.out.println("Su genero es femenino");
     }else {
         System.out.println("Su genero es Masculino");
     }
    }
}
