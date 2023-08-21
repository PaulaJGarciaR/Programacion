
package main;
public class Gato extends Animal {
    private String especieGato;

    public Gato(String especieGato, String nombre) {
        super(nombre);
        this.especieGato = especieGato;
    }

    public String getEspeciePerro() {
        return especieGato;
    }

    public void setEspeciePerro(String especiePerro) {
        this.especieGato = especiePerro;
    }

    @Override
    public String motrarDatos(){
        return "El sonido que hago es:MIAUUUU"+"Mi Nombre es:"+super.motrarDatos()+" Mi Especie es:"+this.especieGato;
    }
}
