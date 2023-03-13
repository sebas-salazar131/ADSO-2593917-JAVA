import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresando las coordenadas del punto A");
        System.out.print("ingresar valor X: ");
        int valor_x1=entrada.nextInt();
        System.out.print("ingresar valor Y: ");
        int valor_y1=entrada.nextInt();
        System.out.println("ingresando las coordenadas del punto B");
        System.out.print("ingresar valor X: ");
        int valor_x2=entrada.nextInt();
        System.out.print("ingresar valor Y: ");
        int valor_y2=entrada.nextInt();

        int m=valor_y1-valor_y2;
        int m1=valor_x1-valor_x2;
        int total=m/m1;

        System.out.println("valor de la pendiente es: "+total);
        if(total>0){
            System.out.println("la resta tiene la pendiente positiva ");

        }else if(total<0){
            System.out.println("la resta tiene la pendiente negativa ");
        }

        


    }
} 