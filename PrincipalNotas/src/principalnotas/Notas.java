
package principalnotas;
public class Notas {
    public double notaFinal[]=new double [3];
    public String notaEscala[]=new String [3];
    public String []nombres= new String[3];
    public Notas(double notaFinal[],Estudiante estudiante){
        this.notaFinal=notaFinal;
        this.nombres=estudiante.nombreEstudiante;
        
    }
    
    public void Escala(){
        for(int i=0;i<3;i++){
            if(this.notaFinal[i]>=1.0 && this.notaFinal[i]<=2.9){
                System.out.println("NOMBRE:"+this.nombres[i]);
                System.out.println("Escala Nacional: DesempeñoBajo");
                 System.out.println("Escala Cualitativa: Insuficiente(I)");}
            else
              if(this.notaFinal[i]>=3.0 && this.notaFinal[i]<=3.9){
                System.out.println("NOMBRE:"+this.nombres[i]);
                System.out.println("Escala Nacional: Desempeño Basico");
                 System.out.println("Escala Cualitativa: Aceptable(A)");}
             else
              if(this.notaFinal[i]>=4.0 && this.notaFinal[i]<=4.5){
                System.out.println("NOMBRE:"+this.nombres[i]);
                System.out.println("Escala Nacional: Desempeño Alto");
                 System.out.println("Escala Cualitativa: Sobresaliente(S)");}
             else
              if(this.notaFinal[i]>=4.5 && this.notaFinal[i]<=5.0){
                System.out.println("NOMBRE:"+this.nombres[i]);
                System.out.println("Escala Nacional: Desempeño Alto");
                 System.out.println("Escala Cualitativa: Excelnte(E)");}
        }
        
    }
}
