
package triangulo;

import java.util.Scanner;
public class ClasificacionTriangulo {
    public static void main(String[] args) {
        double M1,M2,M3;
        Scanner numero=new Scanner (System.in);
        System.out.println("Digite la primera medida del triangulo");
        M1=numero.nextDouble();
        System.out.println("Digite la segunda medida del triangulo");
        M2=numero.nextDouble();
        System.out.println("Digite las tercera medida del triangulo");
        M3=numero.nextDouble();
         if (M1==M2 && M1==M3 ){
                    System.out.println("Es un triangulo Equilatero");
         }
                   
         else if (M1==M2 || M1==M3||M2==M3){
            System.out.println("Es un triangulo Isoceles");
        }
         else System.out.println("Es un triangulo Escaleno");
                    
        }
    }
    

