import java.util.Scanner;

public class Ejercicio03{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese numero N: ");
        int numero=entrada.nextInt();
        int i=0;
        
        while(i<numero){
            int aleatorio=(int)(Math.random()*999);
            int nuevo=0;
            int n=1;
            while(n<=aleatorio){
                if(aleatorio%n==0){
                 nuevo++;
                }
                n++;
            }
            if(nuevo==2){
                System.out.println("numero primo generado "+ aleatorio);
            }  
            i++;
        }
    }
}        