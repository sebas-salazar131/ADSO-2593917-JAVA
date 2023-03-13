import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el nombre");
        String nombre=entrada.nextLine();
        String palabra_secreta="caballo";
        System.out.println("---1. INICIAR JUEG0---");
        System.out.println("---2. SALIR---");
        int opcion=entrada.nextInt();

        String guion="_";
        if(opcion==1){

            for(int i=0;i<7;i++){
                System.out.print(guion" ");
            }
        }
    }
}        