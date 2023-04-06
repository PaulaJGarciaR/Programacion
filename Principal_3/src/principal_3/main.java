
package principal_3;
public class main {

    public static void main(String[] args) {
        Comparendo ComparendoUno=new Comparendo("Conducir sin licencia",300);
        Comparendo ComparendoDos=new Comparendo("parquear en un lugar prohibido",500);
        
        Persona persona = new Persona("Paula Garcia","1010");
        Multa multa =new Multa(ComparendoUno,persona);
         
        System.out.println("Lainfraccion fue:"+multa.nombreComparendo+","+"Tiene el precio de:"+multa.PrecioComparendo+","+"El nombre del infractor es:"+multa.persona);
        
    }
    
}
