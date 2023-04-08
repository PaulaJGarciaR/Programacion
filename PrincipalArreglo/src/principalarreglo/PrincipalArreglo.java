
package principalarreglo;
public class PrincipalArreglo {
    public static void main(String[] args) {
        int arregloUno[]={2,6,8,10,5};
        int arregloDos[]={4,9,7,1,6};
        int arregloTres[]={1,6,8,10,8};
         
        Suma sumas=new Suma(arregloUno,arregloDos,arregloTres);
        Suma.SumaPosiciones(arregloUno, arregloDos, arregloTres);
    }
    
}
