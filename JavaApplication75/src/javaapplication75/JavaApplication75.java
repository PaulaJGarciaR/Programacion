
package javaapplication75;

import java.util.Scanner;

public class JavaApplication75 {

    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
       int [][] vector =new int [3][1];
        int [][] vector1 =new int [3][1];
       int [][]Matriz=new int [3][2];
        for (int f=0;f<3;f++){
           for (int c=0;c<1;c++){
                vector[f][c]=t.nextInt();}}
         for (int f=0;f<3;f++){
           for (int c=0;c<1;c++){
                vector1[f][c]=t.nextInt();}}
        int i=0;
       for (int f=0;f<3;f++){
           int j=0;
           for (int c=0;c<3;c++){
            Matriz[i][j]=vector[f][c];
            j++;
            Matriz[i][j]=vector1[f][c];
            j++;
           }
           i++;
       }
       for (int f=0;f<3;f++){
           for (int c=0;c<3;c++){
               System.out.println(Matriz[f][c]+" ");
           }
       }
    }
    
}
