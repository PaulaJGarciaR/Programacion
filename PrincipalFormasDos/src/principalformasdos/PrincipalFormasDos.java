
package principalformasdos;

import java.util.Scanner;

public class PrincipalFormasDos {
    public static void main(String[] args) {
        Scanner xx=new Scanner (System.in);
        String formaLote[]=new String[3];
        
          String tipoFormaLote[]=new String [3];
        for (int i=0;i<3;i++){
            System.out.println("tipo de forma del lote");
            formaLote[i]=xx.nextLine();
            if(formaLote[i].equals("cuadrado")){
                tipoFormaLote[i]="cuadrado";}
            else
            if(formaLote[i].equals("triangulo")){
                tipoFormaLote[i]="triangulo";}
            else
                 if(formaLote[i].equals("rectangulo")){
                tipoFormaLote[i]="rectangulo";}
                
        }
        Cuadrado cuadrado=new Cuadrado(tipoFormaLote);
        Triangulo triangulo=new Triangulo(tipoFormaLote);
        Rectangulo rectangulo =new Rectangulo(tipoFormaLote);
        int valorCuadrado=Cuadrado.areaCuadrado(tipoFormaLote);
         int valorTriangulo=Triangulo.areaTriangulo(tipoFormaLote);
         int valorRectangulo=Rectangulo.areaRectangulo(tipoFormaLote);
         
         int sumaAreas=valorRectangulo+valorTriangulo+valorCuadrado;
         System.out.println("EL AREA TOTAL ES:"+sumaAreas);
         if(sumaAreas>10000){
             System.out.println("Debe pagar un impuesto");
         }
        
    }
    
}
