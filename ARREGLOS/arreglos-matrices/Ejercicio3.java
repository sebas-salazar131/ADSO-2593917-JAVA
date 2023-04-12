import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el número de filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("Ingresa el número de columnas de la matriz: ");
        int columnas = entrada.nextInt();
        int[][] matriz = new int[filas][columnas];

        System.out.print("Ingresa la cantidad de bombas: ");
        int cantidadBombas = entrada.nextInt();

        for (int i = 0; i < cantidadBombas; i++) {
            System.out.print("Ingresa la fila de la bomba #" + (i + 1) + ": ");
            int fila = entrada.nextInt();
            System.out.print("Ingresa la columna de la bomba #" + (i + 1) + ": ");
            int columna = entrada.nextInt();

            matriz[fila][columna] = 1;
        }
        System.out.println("Matriz con las bombas:");
        imprimirMatriz(matriz);
        int[][] areaAfectada = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == 1) {
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < filas && l >= 0 && l < columnas && matriz[k][l] == 0) {
                                areaAfectada[k][l] = 2;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Matriz con el área afectada:");
        imprimirMatriz(areaAfectada);

        entrada.close();
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
}