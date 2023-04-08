
package principaldatos;
public class Persona {
    public String nombres[]=new String [4];
     public String documento[]=new String [4];
     public long edad[]=new long[4];
     public final int MAYORIA_EDAD=18;
     public Persona(String nombres[],String documento[],long edad[]){
         this.nombres=nombres;
         this.documento=documento;
         this.edad=edad;
     }
     public static void DatosPersona(String nombres[],String documento[],long edad[],int MAYORIA_EDAD){
         for(int i=0;i<4;i++){
             System.out.println("DATOS PERSONALES");
             System.out.println("Nombre:"+nombres[i]);
             System.out.println("Documento"+documento[i]);
             System.out.println("Edad:"+edad[i]);
             if(edad[i]>=MAYORIA_EDAD){
                 System.out.println("Es mayor de edad");
             }else
                 System.out.println("No es mayor de edad");
             
         }
     }
}
