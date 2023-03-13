import java.util.Scanner;
public class Prueba2 {
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        
        int cant_poblacioncol = 0;
        int cant_poblacionusa = 35000000;

        System.out.println("la poblacion de col es: " + cant_poblacioncol);
        System.out.println("la poblacion de USA es: " + cant_poblacionusa);

        System.out.print("ingrese poblacion de col ");
        cant_poblacioncol = entrada.nextInt();

        System.out.println("la nueva poblacion de col es: "+cant_poblacioncol );
        
    }
}