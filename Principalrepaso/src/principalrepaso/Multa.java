
package principalrepaso;
public class Multa {
  String nombreInfractor;
  String nombreComparendo;
  int PrecioComparendo;
  
  public Multa(Comparendo comparendoDos,Persona persona){
      this.nombreInfractor=persona.nombreInfractor;
      this.nombreComparendo=comparendoDos.nombreComparendo;
      this.PrecioComparendo=comparendoDos.precioComparendo;
  }
  public static void Pantalla(String nombreInfractor,String nombreComparendo,int PrecioComparendo){
      System.out.println("NOMBRE INFRACTOR:"+nombreInfractor);
      System.out.println("TIPO DE COMPARENDO:"+nombreComparendo);
      System.out.println("TOTAL A PAGAR:"+PrecioComparendo);
  }
}
