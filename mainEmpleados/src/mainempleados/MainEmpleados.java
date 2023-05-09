
package mainempleados;
public class MainEmpleados {
    public static void main(String[] args) {
       
        Empleado empleadoUno=new Empleado("Paula Garcia","femenino",1100000,56);
        Empleado empleadoDos=new Empleado("Johana Garcia","femenino",3100000,26);
        Empleado empleadoTres=new Empleado("Paula Rodriguez","femenino",1100000,56);
        
        Suelso empleado =new Suelso (empleadoUno);
        empleado.IdetificacionEmpleados();
    }
    
}
