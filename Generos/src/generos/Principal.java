
package generos;
public class Principal {
    public static void main(String[] args) {
        Persona genero =new Persona("now");
        String Genero=genero.Genero();
        if (Genero=="mujer"){
            System.out.println("El usuario es una mujer");
        }else
            if (Genero =="hombre"){
                System.out.println("El usuario es un hombre");
            }
            else{System.out.println("genero no definido");
    }
    
}}
    
