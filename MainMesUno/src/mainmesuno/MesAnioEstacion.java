
package mainmesuno;
public class MesAnioEstacion {
     public String EstacionM;
    public String Meses;
    public final int Mesanio=8;
    public MesAnioEstacion(String estacionM, String Meses, String meses){
        this.EstacionM = estacionM;
        this.Meses = meses;
    }
    public void Pedirmesdelanio(){
        
     if(EstacionM==Meses){
                
     System.out.println("Este mes tiene una estacion "+EstacionM+" y tiene un area de "+EstacionM);
     System.out.println("Este mes tiene un nombre "+Meses+" y tiene un area de "+Meses);
            
        }
    }
}
