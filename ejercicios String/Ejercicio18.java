import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio18{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño de los arreglos: ");
        int tamano = entrada.nextInt();

        int[] arreglo1 = new int[tamano];
        int[] arreglo2 = new int[tamano];
        System.out.println("Ingresa los valores para llenar el primer arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor en posición " + i + ": ");
            arreglo1[i] = entrada.nextInt();
        }
        System.out.println("Ingresa los valores para llenar el segundo arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor en posición " + i + ": ");
            arreglo2[i] = entrada.nextInt();
        }

        System.out.println("Primer arreglo:");
        imprimirArreglo(arreglo1);
        System.out.println("Segundo arreglo:");
        imprimirArreglo(arreglo2);

        boolean sonIguales = Arrays.equals(arreglo1, arreglo2);
        if (sonIguales) {
            System.out.println("Los arreglos contienen la misma información.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }

        entrada.close();
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}