
package principalempleados;
public class Sueldo {
    public int sueldoEmpleados[]=new int [3];
    public String medioTransporte[]=new String [3];
    public final int BONO_TRANSPORTE=150000;

    public Sueldo (int sueldosEmpleados[], Transporte transporte) {
        this.sueldoEmpleados=sueldosEmpleados;
        this.medioTransporte=transporte.medioTransporte;
        
    }

    public void SueldoPagar(){
        int sueldoTotal[]=new int [3];
        for(int i=0;i<3;i++){
        if ((this.sueldoEmpleados[i]<1740000) && (this.medioTransporte[i].equals("bus"))){
           sueldoTotal[i]=(this.sueldoEmpleados[i] )+(this.BONO_TRANSPORTE);
           
            System.out.println((i+1)+". "+sueldoTotal[i]);}
        else{
            sueldoTotal[i]=sueldoEmpleados[i];
        System.out.println((i+1)+". "+sueldoTotal[i]);}
        
        }
    

    
}
}
