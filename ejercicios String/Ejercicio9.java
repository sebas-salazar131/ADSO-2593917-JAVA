import java.util.Scanner;

public class Segundo{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int numero=entrada.nextInt();
        int arreglo[]=new int [numero];
        int i=0;
        while(i<numero){
            int aleatorio=(int)(Math.random()*1000);
            int acumulador = 0;
            int j=1;
            while (j<=aleatorio){
                if (aleatorio%j==0){
                    acumulador++;
                }
                j++;
            }
            if (acumulador==2){
                boolean valido = true;
                for (int k=0; k<numero; k++){
                    if (arreglo[k]== aleatorio){
                        valido = false;
                    }
                }

                if (valido){
                    arreglo[i]=aleatorio;
                    i++;
                    System.out.println("Numero primos: "+aleatorio);
                }


            }
        }

    }
}        