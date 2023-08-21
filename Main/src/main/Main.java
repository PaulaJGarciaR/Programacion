
package main;
public class Main {
    public static void main(String[] args) {
        Perro perro =new Perro("Labrador","Tovi");
        Gato gato=new Gato("monito","micho");
        
        String datosPerro=perro.motrarDatos();
        String datosGato=gato.motrarDatos();
        
        System.out.println(datosPerro);
        System.out.println(datosGato);
                
    }
    
}
