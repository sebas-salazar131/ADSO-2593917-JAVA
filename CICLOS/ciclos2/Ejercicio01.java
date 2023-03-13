import java.util.Scanner;

public class Ejercicio01{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese numero aleatorio entre 1 y 6: ");
        int numero=entrada.nextInt();

        int cons=0;
           for(int i=0; i<numero; i++){
            int aleatorio=(int)(Math.random()*10);
            cons=cons*10+aleatorio;
        }
        System.out.println("el numero constriuido: " + cons);
        int multi=cons*2;
        System.out.println("resultado del producto: " + multi);

     

    }
}  