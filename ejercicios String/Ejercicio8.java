import java.util.Scanner;

public class Primero{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese el tamaño del arreglo: ");
        int t=entrada.nextInt();

        int arreglo []=new int [t];
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=(i+1)*2-1;
            

        }
        for(int j=0;j<arreglo.length;j++){
            System.out.println("[ "+arreglo[j]+" ]");
        }
    }
}        