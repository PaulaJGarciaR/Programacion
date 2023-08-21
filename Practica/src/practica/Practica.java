
package practica;
public class Practica {
    public static void main(String[] args) {
        String [] letrasMiNombre={"P","A","U","L","A"};
        String miNombre="paula";
        
        int tamañoPalabra=miNombre.length();
        System.out.println(tamañoPalabra);
        int tamañoArreglo=letrasMiNombre.length;
        System.out.println(tamañoArreglo);
//        
//        String s1="Hola";
//        String s2="Mundo";
//        String S3=s1+" "+s2;
//        System.out.println(S3);
        
        int a=5;
        int b=3;
        double c=2.5;
        System.out.println(a+b+c);
                
        
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = new String("Hola");

         if (s1 == s2) {
         System.out.println("s1 y s2 son iguales");
         } else {
         System.out.println("s1 y s2 son distintos");
         }

       if (s1 == s3) {
       System.out.println("s1 y s3 son iguales");
       } else {
       System.out.println("s1 y s3 son distintos");
       }
      
       String valor= s1.equals(s2) ? "Es correcto" : "es incorrecto";
        System.out.println(valor);
        
         int x = 10;
        if (y > 5) {
            int y = 20;
            System.out.println(x + y);
        }
    }
    
}
