import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
          
        int acum=0; 
        System.out.println("ingresar la cantidad total financiada");
        int financiada=entrada.nextInt();

        System.out.println("ingresar la cantidad de cuotas pagadas");
        int pagadas=entrada.nextInt();

        System.out.println("ingresar el valor de cada cuota");
        int valor_cuota=entrada.nextInt();

        int total = valor_cuota*pagadas;
        int restante = total-financiada;
        float resultado = (float)restante/(float)financiada;
        float porcentaje = (float)resultado*100;
        System.out.println("Este es el total del interes pagado: "+porcentaje+"%");
        
        
    }
}        
