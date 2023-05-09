
package principalnumero;
public class Numeros {
    public final int NUMEROS[]={1,2,3,4,5,6,7,8,9,10};
    public String numerosLetras[]={"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve","Diez"};
    public int numerosIngresados[]=new int [4];
    public Numeros(int numerosIngresados[]){
        this.numerosIngresados=numerosIngresados;
    }
    
    public static  String []NumerosenLetras (int numerosIngresados[],final int NUMEROS[],String numerosLetras[]){
        String numerosIngresadosenLetras[]=new String [4];
      
        for(int i=0;i<4;i++){
              int contador=0;
            for (int j=0;j<10;j++){
                if(numerosIngresados[i]==NUMEROS[j]){
                   contador=contador+1;
                numerosIngresadosenLetras[i]=numerosLetras[j];}
                else
                     if(contador==0){
                numerosIngresadosenLetras[i]="NUMERO NO REGISTRADO";}
                }}
        return(numerosIngresadosenLetras);
    }
   
}
