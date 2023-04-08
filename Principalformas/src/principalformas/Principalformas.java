
package principalformas;

import java.util.*;

public class Principalformas {
    public static void main(String[] args) {
        Scanner xx=new Scanner(System.in);
        String formas[]=new String[3];
         String medidas[]={"lado","base","altura"};
        double medidasCuadrado;
        double medidasRectangulo[]=new double [2];
         double medidasTriangulo[]=new double [2];
        System.out.println("LOTE FORMA CUADRADO:");
        System.out.println("Medida del lado");
        medidasCuadrado=xx.nextDouble();
        System.out.println("LOTE FORMA RECTANGULAR");
        for(int i=0;i<2;i++){
            System.out.println("Medida:"+medidas[i+1]);
            medidasRectangulo[i]=xx.nextDouble();}
          System.out.println("LOTE FORMA TRIANGULAR");
        for(int i=0;i<2;i++){
            System.out.println("Medida:"+medidas[i+1]);
            medidasTriangulo[i]=xx.nextDouble();
        }
        Cuadrado cuadrado=new Cuadrado(medidasCuadrado);
        Rectangulo rectangulo=new Rectangulo(medidasRectangulo);
        Triangulo triangulo=new Triangulo(medidasTriangulo);
        
        double areaCuadrado=cuadrado.AreaCuadrado();
        double areaRectangulo=rectangulo.AreaRectangulo();
        double areaTriangulo=triangulo.AreaTriangulo();
        double sumatoriaAreas=areaCuadrado+areaRectangulo+areaTriangulo;
        System.out.println(sumatoriaAreas);
        if(sumatoriaAreas>10000){
            System.out.println("Debe Pagar un impuesto");
        }
        
    }
    
}
