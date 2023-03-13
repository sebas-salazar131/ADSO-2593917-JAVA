import java.util.Scanner;

public class Ejercicio05{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

       System.out.println("ingrese numero N");
       int n=entrada.nextInt();
       int factorial=0;
       int cont=1;

       for(int i=1; i<n+1; i++){ 
          factorial=cont*i;
          cont=factorial;

          System.out.print(i +" x " );
        }
        System.out.print(" = "+ cont);
    }
    
}        