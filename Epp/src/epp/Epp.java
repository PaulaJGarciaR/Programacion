
package epp;
import java.util.*;
public class Epp {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
       double PD=5000;
       double PA=10000;
       double PC=5000;
       int [] Cant=new int [3];
       double [] Prec=new double [3];
       double []MCP=new double [3];
       String [] N=new String[3];
        N[0]="desayuno";
        N[1]="almuerzo";
        N[2]="Cena";
       for (int i=0;i<3;i++){
           System.out.println("Ingrese la cantidad de:"+N[i]+","+"que se compraron");
           Cant[i]=t.nextInt();
           System.out.println("Ingrese los precios de:"+N[i]);
           Prec[i]=t.nextDouble();
       }
       for (int f=0;f<3;f++){
           MCP[f]=Cant[f]*Prec[f];
       }
         String [] mcp=new String [3];
         
         for (int f=0;f<3;f++){
            mcp[f]=String.valueOf(MCP[f]); }
         String [] can=new String [3];
         for (int i=0;i<3;i++){
             can[i]=String.valueOf(Cant[i]);
         }
         
         String [][] MR=new String [3][3];
        int i=0;
        for (int f=0;f<MR.length;f++){
            int j=0;
         for (int C=0;C<1;C++){
           MR[i][j]=N[f];
           j++;}
         for (int s=0;s<1;s++){
           MR[i][j]=can[f];
           j++;}
         for (int p=0;p<1;p++){
           MR[i][j]=mcp[f];
           j++;}
         i++;
       }
        
  
        for (int f=0;f<3;f++){
           for (int c=0;c<3;c++){
               System.out.print(MR[f][c]+" ");
           }
            System.out.println(" ");
       }
    }}
    

