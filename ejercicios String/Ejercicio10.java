import java.util.Scanner;

public class Tercero{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int numero=entrada.nextInt();

        int arreglo[]=new int [numero];

        for(int i=0;i<arreglo.length;i++){
            int aleatorio=(int)(Math.random()*1000);
            arreglo[i]=aleatorio;
        }
        
        for(int a=0;a<arreglo.length;a++){
            for(int j=0;j<arreglo.length-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        for(int z=0;z<arreglo.length;z++){
            System.out.println("["+arreglo[z]+"]");
        }
    }
}        