package cancha;
import java.util.*;
//Comentario:En comparación al diseño y análisis entregado agregue algunas modificaciones ya que en análisis y diseño solo hice un programa para saber un cliente cuantas horas alquilo la cancha y cuál seria su valor a pagar, el valor a pagar de la hora la estableci a:$5000 agregue que la cancha vende dos productos de consumo agua, cuyo valor de la botella es igual a $2000 y gaseosa con valor de botella $4000.
public class Cancha {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        String Cl[]=new String [4];
        for (int i=0;i<4;i++){
            System.out.println("Cual es el nombre del cliente:"+(i+1));
            Cl[i]=t.nextLine();
        }
        int HA[]=new int [4];
        for (int i=0;i<4;i++){
            System.out.println("Cuantas horas alquilo la cancha el cliente:"+Cl[i]);
                HA[i]=t.nextInt();
        }
        //Comentario: En este método se llenan y crean dos vectores uno para los nombres de      los clientes y otro para determinar cuántas horas fueron alquiladas por el cliente.
        int PC[]=new int [4];
        int CP[]=new int [4];
        for (int i=0;i<4;i++){
         System.out.println("¿Que producto Compro:"+Cl[i]);
        System.out.println("1.Agua");
        System.out.println("2.Gaseosa");
           PC[i]=t.nextInt();
            System.out.println("Cuantas botellas compro:"+Cl[i]);
           CP[i]=t.nextInt();}
        //Comentario:Una de las modificaciones al programa es que realice un ciclo para que el usuario determine cuál de los dos productos compró y que cantidad de este producto adquirió.
          double VH=5000;//Comentario:Se define el valor de la hora.
           Calcular(Cl,HA,PC,CP,VH); }
//al método calcular se enviará el arreglo de la cantidad de horas alquiladas,los nombres de los clientes,que tipo de producto compró,la cantidad de productos comprados y el valor que costará una hora de alquiler.

     public static void Calcular(String []Cl,int []HA,int []PC,int[]CP,double VH) {
         //Comentario:en este método se realizarán los cálculos necesarios 
         double VPH[]=new double [4];
         for (int i=0;i<4;i++){
             VPH[i]=HA[i]*VH;
         }
         //Comentario:En primer lugar se realizará una multiplicación para determinar el valor que se debe pagar por las horas alquiladas
        double BA=2000;
        double BG=4000;
          double VPC[]=new double [4];
          for(int i=0;i<4;i++){
              if(PC[i]==1){
              VPC[i]=BA*CP[i];
          }
          if(PC[i]==2){
              VPC[i]=BG*CP[i];
          }}
          //Comentario:Aquí hice uso de condiciones para identificar qué tipo de producto fue el que compro el cliente, si el numero ingresado es igual a 1 el valor de la botella de agua será igual a 2000 y si el numero ingresado es 2, el valor de la botella de gaseosa será igual a 4000,y según lo ingresado por el usuario se multiplicará el valor de la botella por la cantidad de productos que compro.
          double TP[]=new double [4];
          for (int i=0;i<4;i++){
              TP[i]=VPH[i]+VPC[i];
          }
          //Comentario:cree un vector para guardar el total a pagar que seria la suma entre el total a pagar por las horas alquiladas y el total a pagar por los productos de consumo comprados.
          Facturar(Cl,HA,VPH,VPC,TP);}

      public static void Facturar(String []Cl,int []HA,double []VPH,double []VPC,double [] TP) {
          //En este método realizare la factura 
          //En primer lugar pasaré los valores de los vectores de horas de alquilo,valor a pagar por las horas,valor a pagar por los productos y total a pagar como string y esto con el fin de guardar todos los datos en una nueva matriz, para así poder imprimir una factura con los datos ingresados.
           String tp[]=new String [4];
           for (int i=0;i<4;i++){
              tp[i]=String.valueOf(TP[i]);
          }
           String ha[]=new String [4];
           for (int i=0;i<4;i++){
              ha[i]=String.valueOf(HA[i]);
          }
           String vhp[]=new String [4];
           for (int i=0;i<4;i++){
              vhp[i]=String.valueOf(VPH[i]);
          }
           String vpc[]=new String [4];
           for (int i=0;i<4;i++){
              vpc[i]=String.valueOf(VPC[i]);
          }
           String FAC[][]=new String [4][4];
           int i=0;
           for (int f=0;f<4;f++){
               int j=0;
               for (int s=0;s<1;s++){
                FAC[i][j]=ha[f];
                j++;
               }
               for (int p=0;p<1;p++){
                FAC[i][j]=vhp[f];
                j++;
               }
               for (int h=0;h<1;h++){
                FAC[i][j]=vpc[f];
                j++;
               }
               for (int z=0;z<1;z++){
                FAC[i][j]=tp[f];
                j++;
               }
               i++;
           }
           String C[]=new String[4];
           C[0]="HORAS ALQUILADAS";
           C[1]="VALOR TOTAL POR HORAS ALQUILADAS";
           C[2]="VALOR TOTAL POR COMPRA DE PRODUCTOS DE CONSUMO";
           C[3]="TOTAL A PAGAR";
         for (int f=0;f<4;f++){
             System.out.println("FACTURA");
             System.out.println("NOMBRE DEL CLIENTE:"+Cl[f]);
               for (int c=0;c<4;c++){
                   System.out.println(C[c]+":"+" "+FAC[f][c]+" "+" ");
               }
               System.out.println(" ");
         }  
}
}



