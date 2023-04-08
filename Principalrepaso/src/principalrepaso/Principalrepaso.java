
package principalrepaso;
public class Principalrepaso {
    public static void main(String[] args) {
        Comparendo comparendoUno=new Comparendo("Conducir sin licencia",500);
         Comparendo comparendoDos=new Comparendo("parquear en un lugar prohibido",600);
         Persona persona=new Persona("Paula Garcia");
         Multa multa=new Multa(comparendoDos,persona);
         
         Multa.Pantalla(multa.nombreInfractor, multa.nombreComparendo, multa.PrecioComparendo);
    }
    
}
