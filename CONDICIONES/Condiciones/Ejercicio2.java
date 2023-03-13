import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero de 3 digitos");
        int numero=entrada.nextInt();
        int total=numero%2;


        if (numero>99 && numero<1000){
            if (total==0){
                System.out.println("este es un numero par");
                
            }else if (total==1){
                System.out.println("este numero es impar");
            }
        }else{
            System.out.println("escriba un numero correcto");
        }
        
    

    }
}