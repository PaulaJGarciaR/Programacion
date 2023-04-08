
package principalarreglo;
public class Suma {
    int arregloUno[]=new int [5];
     int arregloDos[]=new int [5];
     int arregloTres[]=new int [5];
     
     public Suma(int arregloUno[],int arregloDos[], int arregloTres[]){
         this.arregloUno=arregloUno;
         this.arregloDos=arregloDos;
         this.arregloTres=arregloTres;      
     }
     
     public static void SumaPosiciones(int arregloUno[], int arregloDos[],int arregloTres[]){
                 int sumaUno=arregloUno[0]+arregloDos[0]+arregloTres[0];
                 if(sumaUno%2==0){
                     System.out.println(sumaUno+" "+"ES UN NUMERO PAR");}
                     else
                      System.out.println(sumaUno+" "+"NO ES UN NUMERO PAR");
                 int sumaDos=arregloUno[1]+arregloDos[1]+arregloTres[1];
                 if(sumaDos%2==0){
                     System.out.println(sumaDos+" "+"ES UN NUMERO PAR");}
                     else
                      System.out.println(sumaDos+" "+"NO ES UN NUMERO PAR");
                  int sumaTres=arregloUno[2]+arregloDos[2]+arregloTres[2];
                 if(sumaTres%2==0){
                     System.out.println(sumaTres+" "+"ES UN NUMERO PAR");}
                     else
                      System.out.println(sumaTres+" "+"NO ES UN NUMERO PAR");
                  int sumaCuatro=arregloUno[3]+arregloDos[3]+arregloTres[3];
                 if(sumaCuatro%2==0){
                     System.out.println(sumaCuatro+" "+"ES UN NUMERO PAR");}
                     else
                      System.out.println(sumaCuatro+" "+"NO ES UN NUMERO PAR");
                  int sumaCinco=arregloUno[4]+arregloDos[4]+arregloTres[4];
                 if(sumaCinco%2==0){
                     System.out.println(sumaCinco+" "+"ES UN NUMERO PAR");}
                     else
                      System.out.println(sumaCinco+" "+"NO ES UN NUMERO PAR");
                 }
             
         
     }
       

