import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el número de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int columnas = entrada.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 100); 
            }
        }
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        int tamanoArreglo1 = (filas * columnas + 1) / 2; 
        int tamanoArreglo2 = (filas * columnas) / 2; 

        int[] arreglo1 = new int[tamanoArreglo1];
        int[] arreglo2 = new int[tamanoArreglo2];

        int contador1 = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (contador1 < tamanoArreglo1) {
                    arreglo1[contador1++] = matriz[i][j];
                }
            }
        }

        int contador2 = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (contador2 < tamanoArreglo2) {
                    arreglo2[contador2++] = matriz[i][j];
                }
            }
        }

        System.out.println("Primer arreglo (tamaño " + tamanoArreglo1 + "):");
        imprimirArreglo(arreglo1);
        System.out.println("Segundo arreglo (tamaño " + tamanoArreglo2 + "):");
        imprimirArreglo(arreglo2);

        scanner.close();
    }
    public static void imprimirMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void imprimirArreglo(int[] arreglo) {
        int tamano = arreglo.length;

        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}