import java.util.Scanner;

public class Ejercicio04{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese numero polindromo");
        int poli=entrada.nextInt();

        int dig1=poli%10;
        int dig2=(poli/10)%10;
        int dig3=(poli/100)%10;
        int dig4=(poli/1000)%10;
        int dig5=(poli/10000)%10;
        int dig6=(poli/100000)%10;
        
        for(int i=0; i<1; i++){
            if(dig1==dig6 && dig2==dig5 && dig3==dig4){
               System.out.println("Este numero es polindromo");
            }else if(dig1==dig5 && dig2==dig4){
               System.out.println("Este numero es polindromo");
            }else if (dig1==dig4 && dig2==dig3){
               System.out.println("Este numero es polindromo");
            }else if (dig1==dig3){
            System.out.println("Este numero es polindromo");
            }else if (dig1==dig2){
            }

           if (dig1!=dig6 || dig2!=dig5 || dig3!=dig4){
            System.out.println("Este numero no es polindromo");
        }
        }
    }
}        