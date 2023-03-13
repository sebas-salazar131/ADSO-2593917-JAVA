import java.util.Scanner;

public class Ejercicio8{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int numero=entrada.nextInt();

        int arreglo []=new int[numero];
        int original []=new int [numero];
        int impares []=new int [numero];
        for (int i=0;i<arreglo.length;i++){
            original[i]=i;
            impares[i]=(i+1)*2-1;
            arreglo[i]=(i+1)*2;
           
        }
        System.out.print("arreglo de originales: ");
        for(int z=0;z<original.length;z++){
            System.out.print("["+original[z]+"]");
        }
        System.out.println(" ");
        System.out.print("arreglo con pares: ");
        for(int j=0;j<arreglo.length;j++){
            System.out.print("["+arreglo[j]+"]");
        }
        System.out.println(" ");
        System.out.print("arreglo con impares: ");
        for(int a=0;a<impares.length;a++){
            System.out.print("["+impares[a]+"]");
        }

    }
}        