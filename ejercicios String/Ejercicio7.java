import java.util.Scanner;

public class Taller22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = scanner.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = scanner.nextLine();


        String resultado = "";

        int len1 = palabra1.length();
        int len2 = palabra2.length();

        int lenResultado = Math.max(len1, len2);
        for (int i = 0; i < lenResultado; i++) {

            char c1 = palabra1.charAt(i % len1);
            char c2 = palabra2.charAt(i % len2);

            resultado += c1;
            resultado += c2;
        }
        System.out.println("Resultado: " + resultado);
    }
}