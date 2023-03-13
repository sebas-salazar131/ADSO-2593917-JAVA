import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        for(int i=1;i<5;i++){
            System.out.println("ingrese un sueldo total");
            int sueldo=entrada.nextInt();
            System.out.println("ingrese la cantidad de pagos");
            int cant=entrada.nextInt();

            System.out.println("----------Formas de pago----------");
            System.out.println("    1.Pagos de igual valor");
            System.out.println("    2.primer pago diferente ");
            System.out.println("    3.ultimo pago diferente");
            System.out.println("    4.primer y ultimo pago diferente");
            System.out.println("=> Ingrese forma de pago");
            int pago=entrada.nextInt();

            if(pago==1){
                int division=sueldo/cant;
                for(int j=1;j<=cant;j++){
                    System.out.println("mes 0"+j+":$ "+division);
                }
                
            }else if(pago==2){
                int diferente1=sueldo/3;
                int resto=sueldo-diferente1;
                int division=resto/(cant-1);
                System.out.println("mes 01:$ "+ diferente1);
                for(int k=2;k<=cant;k++){
                    System.out.println("mes 0"+k+":$ "+division);
                }
            }else if(pago==3){
                int diferente1=sueldo/3;
                int resto=sueldo-diferente1;
                int division=resto/(cant-1);
                for(int l=1;l<=cant-1;l++){
                    System.out.println("mes 0"+l+":$ "+division);              
                }
                System.out.println("mes 0"+cant+":$ "+diferente1);

            }else if(pago==4){
                int diferente1=sueldo/4;
                int diferente2=sueldo/4-100000;
                int resto=sueldo-diferente1-diferente2;
                int division=resto/(cant-2);
                System.out.println("mes 01:$ "+diferente1);
                for(int m=2; m<=cant-1;m++){
                    System.out.println("mes 0"+m+":$"+division);
                }
                System.out.println("mes 0"+cant+":$ "+diferente2);
            }
        }

    }
}        