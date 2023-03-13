import java.util.Scanner;

public class Ejercicio06{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese numero N");
        int n=entrada.nextInt();
        System.out.println("ingrese numero M");
        int m=entrada.nextInt();
        
        for(int j=n; j<=m; j++){ 
            int numero=1;
            int resultado=0;
            System.out.println("factorial de " +"("+j+")" );
            for(int i=1; i<=j; i++){
                resultado=numero*i;
                numero=resultado;
                if(i==j){
                    System.out.println(i+"="+resultado);
                }else {
                    System.out.print(i+"x");
                }
            } 
            
        }
    }
}        