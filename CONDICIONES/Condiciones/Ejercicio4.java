import java.util.Scanner;

public class Ejercicio4{
   public static void main (String[]args){
     Scanner entrada = new Scanner(System.in);

     System.out.println("ingrese el primer numero");
     int numero1=entrada.nextInt();

     System.out.println("ingrese el segundo numero");
     int numero2=entrada.nextInt();

     System.out.println("ingrese el tercer numero");
     int numero3=entrada.nextInt();

     if(numero1>numero2 || numero1>numero3){
        System.out.println("este es el numero mayor "+ numero1 );

     } else  if(numero2>numero1 ||  numero2>numero3){
        System.out.println("este es el numero mayor "+ numero2 );

        } else  if(numero3>numero1 ||  numero3>numero2){
        System.out.println("este es el numero mayor "+ numero3);
        }

        if  (numero1<numero2 || numero1<numero3){
        System.out.println("este es el numero menor " + numero1);

     } else  if(numero2<numero1 ||  numero2<numero3){
        System.out.println("este es el numero menor "+ numero2 );

        } else  if(numero3<numero1 ||  numero3<numero2){
        System.out.println("este es el numero menor "+ numero3 );
        }

    }  
 
 }



