import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        int n1=1;
        int n2;
        int suma=0;

         System.out.println("ingrese un numero para hacer la sucesion");
        int numero=entrada.nextInt();

        for(int i=0; i<numero;i++){
            n2=suma;
            suma=n1+suma;
            n1=n2;
            System.out.println( n1);
        }
        

    }
}            