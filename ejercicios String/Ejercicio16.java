import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del arreglo: ");
        int tamano = entrada.nextInt();

        int[] arreglo = new int[tamano];
        System.out.println("Arreglo original:");
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1; 
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        int[] primos = new int[tamano];
        int[] noPrimos = new int[tamano];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;
        for (int i = 0; i < tamano; i++) {
            if (esPrimo(arreglo[i])) {
                primos[contadorPrimos++] = arreglo[i];
            } else {
                noPrimos[contadorNoPrimos++] = arreglo[i];
            }
        }

        System.out.println("Arreglo de números primos:");
        imprimirArreglo(primos, contadorPrimos);
        System.out.println("Longitud del arreglo de números primos: " + contadorPrimos);
        System.out.println("Arreglo de números no primos:");
        imprimirArreglo(noPrimos, contadorNoPrimos);
        System.out.println("Longitud del arreglo de números no primos: " + contadorNoPrimos);

        entrada.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void imprimirArreglo(int[] arreglo, int longitud) {
        for (int i = 0; i < longitud; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}