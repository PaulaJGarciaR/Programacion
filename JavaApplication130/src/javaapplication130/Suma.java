
package javaapplication130;
public class Suma {
    private int numeroUno;
    private int numeroDos;

    public Suma(int numeroUno, int numeroDos) {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    
    public int sumarDatos(){
        int suma=this.numeroUno+this.numeroDos;
        return suma;
    }
    
}
