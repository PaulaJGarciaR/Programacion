
package ejercicio.matriz;
import java.util.*;
public class EjercicioMatriz {
    public static void main(String[] args) {
        System.out.println("INGRESE LA CANTUDAD DE ESTUDIANTES");
        Scanner ent=new Scanner (System.in);
        int e=ent.nextInt();
        String MCN[][]=new String [e][2];
         for (int f=0;f<e;f++){
         System.out.println("INGRESE EL CODIGO Y NOMBRE DEL ESTUDIANTE:"+(f+1));
           for (int c=0;c<2;c++){
            MCN[f][c]=ent.next();
            }
        }
       // for (int f=0;f<e;f++){
           // for (int c=0;c<2;c++){
              //  System.out.print(MCN[f][c]+" "+" ");  
            //}
           // System.out.println(" ");
       // }
       double [][] YY= MatrizNN(e);
       String MR[][]=new String[e][5];
       for (int f=0;f<e;f++){
            for (int c=0;c<5;c++){
              MR[f][c]=String.valueOf(YY[f][c]); 
            }    
        }
      // for (int f=0;f<e;f++){
           // for (int c=0;c<5;c++){
               // System.out.print(MR[f][c]+" "+" ");           
           // }
           // System.out.println(" ");
       // }
        String R[][]=new String [e][7];
        int i=0;
            for (int f=0;f<e;f++){
                 int j=0;
                for (int c=0;c<2;c++){
                   R[i][j]=MCN[f][c];
                   j++;
                }
                for(int s=0;s<5;s++){
                    R[i][j]=MR[f][s];
                    j++;
                } 
                i++;
        }  
          for (int f=0;f<e;f++){
            for (int c=0;c<7;c++){
                System.out.print(R[f][c]+" "+" ");           
            }
            System.out.println(" ");
        }  
    }
      public static double [][] MatrizNN(int e) {
          Scanner ent=new Scanner (System.in);
           double MNOTAS [][]=new double[e][5];
           for (int f=0;f<e;f++){
                System.out.println("INGRESE LAS NOTAS PARA PARCIAL1,PARCIAL2, TERCERA NOTA Y EXAMEN FINAL PARA EL ESTUDIANTE:"+f);
            for (int c=0;c<4;c++){
                MNOTAS[f][c]=ent.nextDouble();
            }
            
        }
           for(int f=0;f<e;f++){
               MNOTAS[f][4]=((((MNOTAS[f][0]+MNOTAS[f][1]+MNOTAS[f][2])/3)*0.70)+(MNOTAS[f][3]*0.30));
           }
         
           //for (int f=0;f<e;f++){
            //for (int c=0;c<5;c++){
             //   System.out.print(MNOTAS[f][c]+"  "+"  ");
           // }
              // System.out.println(" ");
      //  }
          return(MNOTAS); 
      }

    

    
    
    
}
