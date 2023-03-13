import java.util.Scanner;

public class Ejercicio7{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);

        System.out.println("ingrese un numero");
        int numero1=entrada.nextInt();
        System.out.println("ingrese un numero");
        int numero2=entrada.nextInt();
        System.out.println("ingrese un numero");
        int numero3=entrada.nextInt();

        int cont1=1;
        int cont2=1;
        int cont3=1;
        for(int i=0; i<9999; i++ ){
            cont1=(numero1*cont1)/numero1;
            cont2=(numero2*cont2)/numero2;
            cont3=(numero3*cont3)/numero3;
        }
        if (cont1==cont2 && cont1==cont3 && cont2==cont3){
                System.out.println("el MCM es: " + cont1);
            }


    }
}        