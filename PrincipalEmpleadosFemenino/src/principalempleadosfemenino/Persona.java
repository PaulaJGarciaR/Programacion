
package principalempleadosfemenino;

public class Persona {
     public String documentoEmpleados[]=new String[2];
    public String nombreEmpleados[]=new String[2];
     public int edadEmpleados[]=new int[2];
     public String generoEmpleados[]=new String[2];
      public int sueldoEmpleado[]=new int[2];
     
     public Persona( String documentoEmpleados[],String nombreEmpleados[],int edadEmpleados[],Genero genero,Sueldo sueldo){
         this.documentoEmpleados=nombreEmpleados;
         this.nombreEmpleados=nombreEmpleados;
         this.edadEmpleados=edadEmpleados;
         this.generoEmpleados=genero.generoEmpleados;
         this.sueldoEmpleado=sueldo.sueldoEmpleado;
     }
     
     public void Identificador(){
         String nombre[]=new String [2] ;
         System.out.println("EMPLEADOS FEMENINOS MAYORES DE 30 AÑOS,QUE GANEN UNA CANTIDAD MENOR AL SALARIO MINIMO");
        int c=0;
         for (int i=0;i<2;i++){
             if((this.generoEmpleados[i].equals("femenino")) && (this.edadEmpleados[i]>30)){
                 if (this.sueldoEmpleado[i] < 1160000) {
                 nombre[i]=this.nombreEmpleados[i];
                     System.out.println("NOMBRE"+":"+nombre[i]);
                     System.out.println("Obtiene un bono por 200000");
                     c=c+1;
                 }}}
          if (c==0){
              System.out.println("Los Empleados no cumplen con las caracteristicas");
          }
       
         
    
}
}
    

