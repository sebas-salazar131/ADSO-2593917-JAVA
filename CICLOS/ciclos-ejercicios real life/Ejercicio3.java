import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        for(int i=1; i<5; i++){
            System.out.println("ingrese el valor total a financiar");
            int valor_financiar=entrada.nextInt();
         
            System.out.print("ingrese la tasa de interes %");
            int tasa=entrada.nextInt();

            System.out.println("ingrese la cantidad de cuotas");
            int cant=entrada.nextInt();

            int x=valor_financiar*tasa;
            int valor_interes=x/100;

            int deuda_total=valor_interes+valor_financiar;

            int valor_cuota=deuda_total/cant;

            int division=valor_interes/cant;
            int abonocapital=division+valor_interes;

            System.out.println("el valor del interes es del: "+valor_interes);
            System.out.println("el valor de cada cuota es de: "+valor_cuota);
            System.out.println("el abono a capital es de: "+abonocapital);
            System.out.println("la deuda total es de: "+deuda_total);

            
        }

 

    }
}        