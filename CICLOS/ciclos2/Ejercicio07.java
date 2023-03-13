import java.util.Scanner;

public class Ejercicio07{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese numero N");
        int n=entrada.nextInt();
        int i=0;
        int j=0;
        int k=0;

        if (n%2==0){
            n++;
        }

        for(i=1;i<=n;i=i+2){

            for(j=n+1; j>=i; j=j-2){
                System.out.print(" ");    
            }
            for(k=0;k<i;k++){
                System.out.print("x");
            }
            System.out.println("");
        }

        for(i=n; i>=1; i=i-2){

            for(j=n+1;j>=i;j=j-2){
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print("x");
            }
            System.out.println("");
        }
        
    } 
}       