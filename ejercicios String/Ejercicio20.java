import java.util.Scanner;

public class Ejercicio20{
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
        System.out.println("Arreglo:");
        imprimirArreglo(arreglo);
        System.out.print("Ingresa una posición: ");
        int posicion = entrada.nextInt();

        if (posicion > 0) {
            int indice = posicion % tamano;
            System.out.println("El valor en la posición indicada es: " + arreglo[indice]);
        }
        else if (posicion < 0) {
            int indice = (tamano + (posicion % tamano)) % tamano;
            System.out.println("El valor en la posición indicada es: " + arreglo[indice]);
        }
        else {
            System.out.println("Error: la posición indicada no es válida.");
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
