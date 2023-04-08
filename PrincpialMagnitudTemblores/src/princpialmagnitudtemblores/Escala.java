
package princpialmagnitudtemblores;
public class Escala {
    public double magnitudesTemblores[]=new double [4];
    public Escala(double magnitudesTemblores[]){
        this.magnitudesTemblores=magnitudesTemblores; }

 public void EscalaMagnitudes(){
     for (int i=0;i<4;i++){
         if(this.magnitudesTemblores[i]>=1 && this.magnitudesTemblores[i]<=3.4){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR PERCEPTIBLE");}
         else
             if(this.magnitudesTemblores[i]>=3.5 && this.magnitudesTemblores[i]<=4.4){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR SUAVE");}
         else
              if(this.magnitudesTemblores[i]>=4.5 && this.magnitudesTemblores[i]<=5.3){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR MODERADO");}
         else
               if(this.magnitudesTemblores[i]>=5.4 && this.magnitudesTemblores[i]<=6.4){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR FUERTE");}
         else
               if(this.magnitudesTemblores[i]>=6.5 && this.magnitudesTemblores[i]<=7.2){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR DESTRUCTIVO");}
         else
                if(this.magnitudesTemblores[i]>=7.3 && this.magnitudesTemblores[i]<=7.9){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR DESASTROZO");}
         else
               if(this.magnitudesTemblores[i]>=8){
             System.out.println("La magnitud:"+this.magnitudesTemblores[i]+" FUE UN TEMBLOR CATRASTROFICO");}
     }}
 
  public static void Promedio( double magnitudesTemblores[]){
 double PromedioSuma=0;
 double Promedio=0;
   int size=magnitudesTemblores.length;
   for (int i=0;i<size;i++){
       PromedioSuma=(PromedioSuma+magnitudesTemblores[i]);
        Promedio=PromedioSuma/size;
   }
    if(Promedio>=1 && Promedio<=3.4){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA PERCEPTIBLE");}
         else
            if(Promedio>=3.5 && Promedio<=4.4){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA SUAVE");}
         else
             if(Promedio>=4.5 && Promedio<=5.3){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA MODERADO");}
         else
               if(Promedio>=5.4 && Promedio<=6.4){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA FUERTE");}
         else
              if(Promedio>=6.5 && Promedio<=7.2){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA DESTRUCTIVO");}
         else
               if(Promedio>=7.3 && Promedio<=7.9){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA DESASTROZO");}
         else
              if(Promedio>=8){
             System.out.println("El promedio:"+Promedio+" ESTA EN LA ESCALA CATASTROFICO");}
   
   
   
   
}}