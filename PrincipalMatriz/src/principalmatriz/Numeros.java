
package principalmatriz;

public class Numeros {
    public int matrizNumero[][]=new int[3][3];
   
    public Numeros(int matrizNumero[][]){
        this.matrizNumero=matrizNumero;
    }
    
    public int Sumatoria(){
        int sumatoria=0;
         for (int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            sumatoria=sumatoria+this.matrizNumero[i][j];
        }  
    }
     return (sumatoria); 
}
}
