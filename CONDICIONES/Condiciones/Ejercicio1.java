import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola usuario, ingrese su edad ");
        int edad=entrada.nextInt();

        if (edad>=1 && edad<=120 ){
            if (edad<18){
            System.out.println("usted recibe un auxilio de $800.000");
         } else if(edad>18){
            System.out.println("usted recibe un auxilio de $200.000");
         }
            

        }else 
        System.out.println("escriba un numero correcto");



    }



}

