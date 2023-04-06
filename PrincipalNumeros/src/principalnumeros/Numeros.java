
package principalnumeros;
public class Numeros {
    public final int NUMEROS[]={1,2,3,4,5,6,7,8,9,10};
    public String numerosLetras[]={"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};

  public int [] numero=new int[3];
  public Numeros(int numero[]){
      this.numero=numero;
  }
  
  public void nombreNumero(){
      int Size=this.NUMEROS.length;
         String numeroNombre[]=new String [3];
      for(int c=0;c<this.numero.length;c++){
      for(int i=0;i<Size;i++){
          if(this.numero[c]==this.NUMEROS[i]){
             numeroNombre[c]=this.numerosLetras[i];
              System.out.println("el numero es:"+numeroNombre[c]);   
      }}
      if(this.numero[c]<this.NUMEROS[0] || this.numero[c]>this.NUMEROS[c]){
                System.out.println(this.numero[c]+"No esta Registrado");
            }
          }}
   
      }


