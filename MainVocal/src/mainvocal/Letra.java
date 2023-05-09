
package mainvocal;

import java.util.Arrays;

public class Letra {
    private String palabra;
    public static final String VOCALES[]={"A","E","I","O","U"};
    public static int contadorVocales=0;
    public Letra(String palabra) {
        this.palabra=palabra;
    }
    public void palabraArreglo(){
            String [] palabraArreglo=this.palabra.split("");
            identificacionVocales(palabraArreglo);
    }
    
 
    public void identificacionVocales(String [] palabraArreglo){
        for(int i=0;i<palabraArreglo.length;i++){
            for(int j=0;j<Letra.VOCALES.length;j++){
                if(palabraArreglo[i].equals(Letra.VOCALES[j])){
                  Letra.contadorVocales++; 
                } 
            }
        }
    }}
