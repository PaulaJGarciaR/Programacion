
package mainempleados;
public class Suelso {
    public final String MUJER="femenino";
    public final int SALARIO_MINIMO=1160000;
    public final int EDAD_REQUERIDA=30;
     public String nombreEmpleado;
    public String generoEmpleado;
    public int sueldoEmpleado;
    public int edadEmpleado;
    public Suelso(Empleado empleadoUno){
        this.nombreEmpleado=empleadoUno.nombreEmpleado;
        this.generoEmpleado=empleadoUno.generoEmpleado;
        this.sueldoEmpleado=empleadoUno.sueldoEmpleado;
        this.edadEmpleado=empleadoUno.edadEmpleado;
    }
    public void IdetificacionEmpleados(){
        int contador=0;
        System.out.println("EMPLEADOS QUE CUMPLEN LAS CARACTERISTICAS");
        if((this.generoEmpleado.equals(this.MUJER))&&(this.edadEmpleado>this.EDAD_REQUERIDA)&&(this.sueldoEmpleado<this.SALARIO_MINIMO)){
        System.out.println(this.nombreEmpleado);
        contador=contador+1;
        }
        else
            if(contador==0){
            System.out.println("NINGUN EMPLEADO CUMPLE CON LOS REQUISITOS");}
        
    }
}
