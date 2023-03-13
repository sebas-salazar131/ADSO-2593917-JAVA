import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el primer numero");
        int numero1=entrada.nextInt();
        System.out.println("ingrese el segundo numero");
        int numero2=entrada.nextInt();
        System.out.println("ingrese el tercer numero");
        int numero3=entrada.nextInt();

        if (numero2>numero1 && numero3>numero2){
        System.out.println("los numeros se ingresaron en orden ascendente");
        
        } else
        System.out.println("no va en orden ascendete");

        
    }
}
