
package lanzamiento.de.un.dado;

public class LanzamientoDeUnDado {

    public static void main(String[] args) {
     int dado;
     dado=(int)(Math.random()*6)+1;
     System.out.println(dado);
     if (dado==1){
          System.out.println("el valor es:UNO");
     }
     else if (dado==2){System.out.println("el valor es:DOS");}
     else if (dado==3){System.out.println("el valor es:TRES");}
     else if (dado==4){System.out.println("el valor es:CUATRO");}
       else if (dado==5){System.out.println("el valor es:CINCO");}
       else System.out.println("El valor es:SEIS");
             
    }
    
}
