
package numerosprimos;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero");
        Scanner numero=new Scanner (System.in);
        int primo;
        primo=numero.nextInt();
        int CO=0;
        for (int f=1;f<=primo;f++){
                if (primo%f==0) {
                CO=CO+1;
                }
        }
            if (CO==2) {
              System.out.println(primo+":ES UN NUMERO PRIMO");
            }
            else{
             System.out.println(primo+":NO ES UN NUMERO PRIMO");    
            }
            
        }
    }
    

