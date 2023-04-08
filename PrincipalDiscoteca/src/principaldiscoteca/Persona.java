
package principaldiscoteca;
public class Persona {
    public final int MAYORIA_EDAD=18;
   public String documentoCliente[]=new String [3]; 
   public int edadCliente[]=new int [3];
   public String genero[]=new String[3];
   public String hombre,mujer;
   public Persona( int edadCliente[],String documentoCliente[],Genero genero){
       this.edadCliente=edadCliente;
       this.documentoCliente=documentoCliente;
       this.genero=genero.generoCliente;
       this.hombre=genero.HOMBRE;
       this.mujer=genero.MUJER;}
   
   public void EntradaClientes(){
       for(int i=0;i<3;i++){
           if(this.genero[i].equals(this.mujer) && this.edadCliente[i]>=this.MAYORIA_EDAD){
               System.out.println("Cliente:"+(i+1)+" "+"ENTRA POR LA PUERTA ROSADA");}
           else
               if(this.genero[i].equals(this.hombre) && this.edadCliente[i]>=21){
               System.out.println("Cliente:"+(i+1)+" "+"ENTRA POR LA PUERTA AZUL");}
           else
              if(this.edadCliente[i]<this.MAYORIA_EDAD){
                   System.out.println("Cliente:"+(i+1)+" "+"ENTRA POR LA PUERTA BLANCA Y DEBE SER ACOMPAÑADO POR SUS ACUDIENTES");
              }     
       }
   }
   
}
