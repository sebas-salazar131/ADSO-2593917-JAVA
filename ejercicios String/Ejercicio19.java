import java.util.Scanner;

public class Ejercicio19{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del primer arreglo: ");
        int tamano1 = entrada.nextInt();
        System.out.print("Ingresa el tamaño del segundo arreglo: ");
        int tamano2 = entrada.nextInt();

        int[] arreglo1 = new int[tamano1];
        int[] arreglo2 = new int[tamano2];
        System.out.println("Ingresa los valores para llenar el primer arreglo:");
        for (int i = 0; i < tamano1; i++) {
            System.out.print("Valor en posición " + i + ": ");
            arreglo1[i] = entrada.nextInt();
        }
        System.out.println("Ingresa los valores para llenar el segundo arreglo:");
        for (int i = 0; i < tamano2; i++) {
            System.out.print("Valor en posición " + i + ": ");
            arreglo2[i] = entrada.nextInt();
        }

        System.out.println("Primer arreglo:");
        imprimirArreglo(arreglo1);
        System.out.println("Segundo arreglo:");
        imprimirArreglo(arreglo2);

        int[] arregloInterpolado = new int[tamano1 + tamano2];
        int indice1 = 0;
        int indice2 = 0;
        for (int i = 0; i < arregloInterpolado.length; i++) {
            if (i % 2 == 0 && indice1 < tamano1) {
                arregloInterpolado[i] = arreglo1[indice1];
                indice1++;
            } else if (indice2 < tamano2) {
                arregloInterpolado[i] = arreglo2[indice2];
                indice2++;
            }
        }
        System.out.println("Arreglo interpolado:");
        imprimirArreglo(arregloInterpolado);
        entrada.close();
    }
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}