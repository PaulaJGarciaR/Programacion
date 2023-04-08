
package principalvocales;
public class Vocales {
   public final String VOCALES[][]={{"a","e","i","o","u"},{"A","E","I","O","U"}};
   public String letras[]=new String[5];
   public Vocales(String letras[]){
       this.letras=letras;
   }
  
   public static void Vocales(String letras[],String VOCALES[][]){
       int contador[]=new int [5];
       int cero=0;
       for (int i=0;i<2;i++){
           for(int j=0;j<5;j++){
           if(letras[j].equals(VOCALES[i][j])){
               System.out.println(letras[j]+" "+"ES UNA VOCAL");
               contador[j]=cero+1;}
          }}
       for (int i=0;i<5;i++){
           if(contador[i]==0){
               System.out.println(letras[i]+" "+"NO ES UNA VOCAL");}}
        
       }}
   

