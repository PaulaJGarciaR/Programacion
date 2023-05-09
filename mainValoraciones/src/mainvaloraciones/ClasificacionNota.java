
package mainvaloraciones;
public class ClasificacionNota {
   public String nombreEstudiante;
    public double notaFinalEstudiante;
    public final double INSUFICIENTE[]={1.0,2.9};
     public final double ACEPTABLE[]={3.0,3.9};
      public final double SOBRESALIENTE[]={4.0,4.5};
       public final double EXCELENTE[]={4.5,5.0};
    public ClasificacionNota(Estudiante estudianteDos){
        this.nombreEstudiante=estudianteDos.nombreEstudiante;
        this.notaFinalEstudiante=estudianteDos.notaFinalEstudiante;
    }
    public void ClasificacionDeNotas(){
        if((this.notaFinalEstudiante>=this.INSUFICIENTE[0])&&(this.notaFinalEstudiante<=this.INSUFICIENTE[1])){
            System.out.println("NOMBRE ESTUDIANTE:"+this.nombreEstudiante);
            System.out.println(this.notaFinalEstudiante+":"+"INSUFICIENTE");
        }
        else
            if((this.notaFinalEstudiante>=this.ACEPTABLE[0])&&(this.notaFinalEstudiante<=this.ACEPTABLE[1])){
            System.out.println("NOMBRE ESTUDIANTE:"+this.nombreEstudiante);
            System.out.println(this.notaFinalEstudiante+":"+"ACEPTABLE");
        }
        else
         if((this.notaFinalEstudiante>=this.SOBRESALIENTE[0])&&(this.notaFinalEstudiante<=this.SOBRESALIENTE[1])){
            System.out.println("NOMBRE ESTUDIANTE:"+this.nombreEstudiante);
            System.out.println(this.notaFinalEstudiante+":"+"SOBRESALIENTE");      
    }
        else
            if((this.notaFinalEstudiante>=this.EXCELENTE[0])&&(this.notaFinalEstudiante<=this.EXCELENTE[1])){
            System.out.println("NOMBRE ESTUDIANTE:"+this.nombreEstudiante);
            System.out.println(this.notaFinalEstudiante+":"+"EXCELENTE"); }}}  
    

