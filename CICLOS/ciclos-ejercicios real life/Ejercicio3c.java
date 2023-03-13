import java.util.Scanner;

public class Ejercicio3c{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el valor total a financiar");
        int valor_financiar=entrada.nextInt();
         
        System.out.print("ingrese la tasa de interes %");
        int tasa=entrada.nextInt();

        System.out.println("ingrese la cantidad de cuotas");
        int cant=entrada.nextInt();

        int resultado=0;
        int interes=0;

        for(int i=1; i<=cant; i++){
            System.out.println("cuanto vale esta cuota");
            int valor=entrada.nextInt();

            int total=valor*tasa;
            int valor_interes=total/100;
            interes+=valor_interes;
            int valor_cuota=valor+valor_interes;
            resultado+=valor_cuota;
            
            System.out.println("este es el valor del interes individualmente "+valor_interes);
            System.out.println("este es el valor de la cuota "+valor_cuota);
        }
        int deuda_total=interes+valor_financiar;

        int division=interes/cant;
        int abonocapital=division+interes;

        System.out.println("el valor del interes es del: "+interes);
        System.out.println("el valor del total de las cuotas es: "+resultado);
        System.out.println("el abono a capital "+abonocapital); 
        System.out.println("la deuda total es: "+deuda_total); 
    }
}            