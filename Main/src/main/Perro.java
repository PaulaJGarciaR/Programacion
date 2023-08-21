
package main;
public class Perro extends Animal {
    private String especiePerro;

    public Perro(String especiePerro, String nombre) {
        super(nombre);
        this.especiePerro = especiePerro;
    }

    public String getEspeciePerro() {
        return especiePerro;
    }

    public void setEspeciePerro(String especiePerro) {
        this.especiePerro = especiePerro;
    }
    
    @Override
    public String motrarDatos(){
        return "El sonido que hago es: GUAUUUU"+" Mi Nombre es:"+super.motrarDatos()+" "+"Mi Especie es:"+this.especiePerro;
    }

   
    
}
