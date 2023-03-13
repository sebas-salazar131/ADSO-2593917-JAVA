import java.util.Scanner;

public class Prueba1{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese la base: ");
        int base = entrada.nextInt();

        System.out.print("ingrese la altura: ");
        int altura = entrada.nextInt();
 
        int area_rectangulo = base * altura;
        System.out.println("area es: " + area_rectangulo);

    }
}