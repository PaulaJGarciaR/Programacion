//Hallar el Índice de Masa Corporal de varios pacientes y clasificarlos
//El IMC es el peso en kilos divido por la altura (estatura) al cuadrado
//NOTA: Se necesita el nombre, el peso y la estatura de cada paciente

package principalimc;

import java.util.*;

public class main {
    public static void main(String[] args) {
         Scanner xx=new Scanner(System.in);
        System.out.println("¿Cual es su nombre?");
        String nombrePaciente=xx.nextLine();
          System.out.println("¿Cual es su peso?");
        double pesoPaciente=xx.nextDouble();
         System.out.println("¿Cual es su altura?");
        double alturaPaciente=xx.nextDouble();
        Persona paciente =new Persona(nombrePaciente,pesoPaciente,alturaPaciente);
        
        double IMC=paciente.CalculoIMC();
        if(IMC<18.4){
            System.out.println("paciente:"+paciente.nombrePaciente+":Clasificacion IMC:BAJO DE PESO");
    }else
         if (IMC>=18.5 && IMC<=24.9){
             System.out.println("paciente:"+paciente.nombrePaciente+":Clasificacion IMC:NORMOPESO");}
            
        else
            if(IMC>=25 && IMC<=29.9){
             System.out.println("paciente:"+paciente.nombrePaciente+":clasificacion IMC:SOBREPESO");}
            
            else
                if(IMC>=30 && IMC<=34.9){
                    System.out.println("paciente:"+paciente.nombrePaciente+":clasificacionIMC:OBESIDAD I");}
        else
                if(IMC>=35 && IMC<=39.9){
                    System.out.println("paciente:"+paciente.nombrePaciente+":clasificacionIMC:OBESIDAD II");}
        else
                if(IMC>=40){
                    System.out.println("paciente:"+paciente.nombrePaciente+":clasificacionIMC:OBESIDAD III");}
        
    }}
    

