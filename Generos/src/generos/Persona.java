
package generos;
public class Persona {
   public String GeneroDado; 
   public final String MUJER="femenino";
   public final String HOMBRE="masculino";
   public Persona (String genero){
       this.GeneroDado=genero;
   }
   public String Genero (){
       String GeneroObtenido="no definido";
       if (this.GeneroDado==this.MUJER){
           GeneroObtenido="mujer";
           return GeneroObtenido;
       }else 
           if(this.GeneroDado==this.HOMBRE){
               GeneroObtenido="hombre";
       
       return GeneroObtenido;}
       return GeneroObtenido;
        }}
