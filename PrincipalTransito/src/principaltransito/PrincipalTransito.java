
package principaltransito;

import java.util.*;

public class PrincipalTransito {
    public static void main(String[] args) {
       String nombrePersona[]=new String [3];
       String tipoVehiculo[]=new String [3];
       Scanner xx=new Scanner (System.in);
       double porcentajeComparendo[]=new double [3];
       for(int i=0;i<3;i++){
           System.out.println("Nombre Infractor:"+(i+1));
           nombrePersona[i]=xx.nextLine();
           System.out.println("Tipo de Vehiculo:"+(i+1));
           tipoVehiculo[i]=xx.nextLine();
           if(tipoVehiculo[i].equals("carro")){
               porcentajeComparendo[i]=0.10;}
           else
               if(tipoVehiculo[i].equals("moto")){
               porcentajeComparendo[i]=0.05;}
           else
               if(tipoVehiculo[i].equals("camion")){
               porcentajeComparendo[i]=0.25;}
       }
       Persona persona=new Persona(nombrePersona);
       Vehiculo vehiculo=new Vehiculo(tipoVehiculo);
       Comparendo comparendo=new Comparendo(persona,vehiculo,porcentajeComparendo);
       comparendo.Comparendo();
    }
    
}
