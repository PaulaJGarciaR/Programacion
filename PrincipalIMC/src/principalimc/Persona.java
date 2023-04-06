
package principalimc;
public class Persona {
    public String nombrePaciente;
    public double pesoPaciente,alturaPaciente;
    
    public Persona(String nombrePaciente,double pesoPaciente,double alturaPaciente){
        this.nombrePaciente=nombrePaciente;
        this.pesoPaciente=pesoPaciente;
        this.alturaPaciente=alturaPaciente;   
    }
    
    public double CalculoIMC(){
        double IMC=this.pesoPaciente/(this.alturaPaciente*this.alturaPaciente);
        return IMC;
    }
}
