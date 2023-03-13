import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese la altura para hacer la piramide: ");
        int altura=entrada.nextInt();

        
        for(int i=0;i<=altura;i++){
            int total=(altura*2)-1;

            for(int i=1;i<=altura;i++){
                System.out.print("X");
            }
            System.out.println("");

             
        }    
    }
}            