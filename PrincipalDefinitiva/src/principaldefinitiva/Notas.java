
package principaldefinitiva;
public class Notas {
    public  double notasEstudiante[][]=new double [3][4];
    public Notas( double notasEstudiante[][]){
        this.notasEstudiante=notasEstudiante;
    }
    
    public void CalculoDefinitiva(){
        double setenta[]=new double[3];
         double treinta[]=new double[3];
         double definitiva[]=new double[3];
        for(int i=0;i<3;i++){
            System.out.println("Estudiante:"+(i+1));
         setenta[i]=((this.notasEstudiante[i][0]+this.notasEstudiante[i][1]+this.notasEstudiante[i][2])/3)*0.70;
         treinta[i]=this.notasEstudiante[i][3]*0.30;
         definitiva[i]=setenta[i]+treinta[i];
            System.out.println("La definitiva es:"+definitiva[i]);
         if(definitiva[i]<=2.9){
             System.out.println("NO FUE APROBADA LA ASIGNATURA");}
         else
             if(definitiva[i]>=3.0 && definitiva[i]<=5.0){
             System.out.println("FUE APROBADA LA ASIGNATURA");}
        }
    }
}
