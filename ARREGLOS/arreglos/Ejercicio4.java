import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){

        Scanner entrada=new  Scanner(System.in);

        System.out.println("señor usuario ingrese un numero");
        int n=entrada.nextInt();

        int [] arreglo = new int[n];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingrese los numeros enteros");
             arreglo[i]=entrada.nextInt();
        }    
        for (int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo.length;i++){
                if(arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        for(int i=0;i<arreglo.length;i++){
            System.out.println("este es el orden decendente");
            System.out.println("["+arreglo[i]+"]");
        }
    }
}    
