import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamano = entrada.nextInt();

        int[] arreglo = new int[tamano];
        System.out.println("Ingresa los valores para llenar el arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor en posición " + i + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        System.out.print("Ingresa el número de movimientos: ");
        int numMovimientos = entrada.nextInt();

        for (int i = 0; i < numMovimientos; i++) {
            int temp = arreglo[0];
            for (int j = 0; j < tamano - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }
            arreglo[tamano - 1] = temp;

            System.out.println("Arreglo después del movimiento " + (i + 1) + ":");
            imprimirArreglo(arreglo);
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

