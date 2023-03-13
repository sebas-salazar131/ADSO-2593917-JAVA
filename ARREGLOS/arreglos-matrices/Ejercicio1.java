import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){

        Scanner entrada=new  Scanner(System.in);

        System.out.println("ingrese el alcance de las filas");
        int n=entrada.nextInt();
        System.out.println("ingrese el alcance de las columnas");
        int m=entrada.nextInt();

        int [][] arreglo = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("ingrese numero: "+i+"-"+j);
                arreglo[i][j]=entrada.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(i+"-"+j);
                System.out.println(arreglo[i][j]);
            }
        }

    }
}        
