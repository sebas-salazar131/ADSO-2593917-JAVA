import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la cantidad de notas");
        int cantidad=entrada.nextInt();


        int notas=0;
        float acumulador=0;
        while(notas<cantidad){
            System.out.println("nota "+notas);
            float nota_recibida=entrada.nextFloat();
             acumulador=acumulador+nota_recibida;

           notas++;
        }
            float promedio=acumulador/notas;
            System.out.println("este es el promedio "+ promedio );


    }
}        