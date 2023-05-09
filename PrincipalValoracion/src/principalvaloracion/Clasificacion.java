
package principalvaloracion;
 
public class Clasificacion {
    int cantidadEstudiantes;
        double notaFinalEstudiante[]=new double[cantidadEstudiantes];
        String nombreEstudiante[]=new String [cantidadEstudiantes];
        public final double INSUFICIENTE[]={1.0,2.9};
         public final double ACEPTABLE[]={3.0,3.9};
          public final double SOBRESALIENTE[]={4.0,4.5};
           public final double EXCELENTE[]={4.5,5.0};
          
        
        public Clasificacion(int cantidadEstudiantes,double notaFinalEstudiante[],String nombreEstudiante[]){
            this.cantidadEstudiantes=cantidadEstudiantes;
            this.nombreEstudiante=nombreEstudiante;
            this.notaFinalEstudiante=notaFinalEstudiante;
        }
        
        public void ClasificacionNotas(){
            System.out.println("ESCALA NOTAS ESTUDIANTES");
            for(int i=0;i<this.cantidadEstudiantes;i++){
                if((this.notaFinalEstudiante[i]>=this.INSUFICIENTE[0]) &&(this.notaFinalEstudiante[i]<=this.INSUFICIENTE[1])){
                    System.out.println("NOMBRE:"+this.nombreEstudiante[i]);
                    System.out.println(this.notaFinalEstudiante[i]+":"+"ESCALA: INSUFICIENTE");}
                else
                     if((this.notaFinalEstudiante[i]>=this.ACEPTABLE[0]) &&(this.notaFinalEstudiante[i]<=this.ACEPTABLE[1])){
                           System.out.println("NOMBRE:"+this.nombreEstudiante[i]);
                    System.out.println(this.notaFinalEstudiante[i]+":"+"ESCALA: ACEPTABLE");}
                else
                     if((this.notaFinalEstudiante[i]>=this.SOBRESALIENTE[0]) &&(this.notaFinalEstudiante[i]<=this.SOBRESALIENTE[1])){
                           System.out.println("NOMBRE:"+this.nombreEstudiante[i]);
                    System.out.println(this.notaFinalEstudiante[i]+":"+"ESCALA: SOBRESALIENTE");}
                else
                     if((this.notaFinalEstudiante[i]>=this.EXCELENTE[0]) &&(this.notaFinalEstudiante[i]<=this.EXCELENTE[1])){
                           System.out.println("NOMBRE:"+this.nombreEstudiante[i]);
                    System.out.println(this.notaFinalEstudiante[i]+":"+"ESCALA:EXCELENTE");}
                }
            }
        }
    

