package JavaApplication62;
import java.util.Arrays;
import java.util.Scanner;
public class MP {
    public static void main(String[] args) {
       int T;
       //Comentarios: En primer lugar en el metodo main cree y defini los valores para los arreglos MM y GG, asi como una varable T para definir los tamaños del arreglo.
       //en este metodo defini el valor para las variables SS y MM, posteriormente envie los los arreglos MM y GG, y los valores SS y UU al metodo Calcular.
       System.out.println("Defina el tamaño para los arreglos");
       Scanner teclado=new Scanner (System.in);
       T=teclado.nextInt();
       int MM[]=new int[T];
       int GG[]=new int[T];
       System.out.println("Defina los valores para MM");
       for(int i=0;i<T;i++){
           MM[i]=teclado.nextInt();
       }
       System.out.println("Defina los valores para GG");
       for(int i=0;i<T;i++){
           GG[i]=teclado.nextInt();
       }
       System.out.println("Defina el valor para SS");   
       int SS=teclado.nextInt();
       System.out.println("Defina el valor para UU");
       int UU=teclado.nextInt();
        int[] YY = calcular(MM,GG,SS,UU);
       System.out.println(Arrays.toString(YY));
    }
    public static int [] calcular(int []MM,int []GG,int SS,int UU){
        //En este metodo se reciben los areglos y valores, y defini los arreglos y valores con el mismo nombre para no crear confusiones.
        //en primer lugar realizo dos ciclos y esto con el objetivo de evaluar en el arreglo cuantos numeros presentes en los areglos son multiplos de los valores SS y UU.
        //inicialice dos contadores para contar la cantindad de multiplos presentes, y esa cantidad de numeros presentes sera el tamaño para el arreglo HH.
        //inicializo una variable X con el objetivo de que si la condicion se cumple X tambien aumenta y esto quiere decir se ira agregando al arreglo los valores que cumplan la condicion.
       int G=0;
        for(int i=0;i<MM.length;i++){
            if(MM[i]%SS==0){
                G++;}
            else 
                if(MM[i]%UU==0){
                    G++;}
                }
        int M=0;
        for(int i=0;i<GG.length;i++){
            if(GG[i]%SS==0){
                M++;}
            else 
                if(GG[i]%UU==0){
                    M++;}
                }
        int S=G+M;
        int HH[]=new int [S];
        int X=0;
        for(int i=0;i<MM.length;i++){
            if(MM[i]%SS==0){
                HH[X]=MM[i];
                X++;
            }
            else 
                if(MM[i]%UU==0){
                    HH[X]=MM[i];
                    X++;}}
        for(int i=0;i<GG.length;i++){
            if(GG[i]%SS==0){
                HH[X]=GG[i];
                X++;
            }
            else 
                if(GG[i]%UU==0){
                    HH[X]=GG[i];
                    X++;}}
         return(HH);
        }
    } 
