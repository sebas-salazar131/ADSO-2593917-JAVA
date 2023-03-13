import java.util.Scanner;

public class Ejercicio6{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese un numero de 6 dijitos");
        int numero=entrada.nextInt();

        System.out.println("Menu: ");
        System.out.println("1.primer digito, 2.segundo digito, 3.tercer digito ");
        System.out.println("4.cuarto digito, 5.quinto digito, 6.sexto digito ");
        int digito=entrada.nextInt();

        if (numero>99999 && numero<1000000){
          if(digito==1){
              int total= numero%10;
              System.out.println("este es el primer digito " + total);
          }else if (digito==2){
              int total=numero/10;
              int resultado=total%10;
              System.out.println("este es el segundo digito " + resultado);
          }else if (digito==3){
              int total=numero/100;
              int resultado=total%10;
              System.out.println("este es el tercer digito " + resultado);
          }else if (digito==4){
              int total=numero/1000;
              int resultado=total%10;
              System.out.println("este es el cuarto digito " + resultado);
          }else if (digito==5){
              int total=numero/10000;
              int resultado=total%10;
              System.out.println("este es el quinto digito " + resultado);
          }else if (digito==6){
              int total=numero/100000;
              int resultado=total%10;
              System.out.println("este es el sexto digito " + resultado);
          }
        }else
        System.out.println("escriba un numero correcto");




    }
}