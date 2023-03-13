import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){

        Scanner entrada=new  Scanner(System.in);

        System.out.println("ingrese un numero");
        int n=entrada.nextInt();

        int [] arreglo = new int[n];
        int acum=0;

        for(int i=1; i<arreglo.length;i++){
            arreglo[i]=(int)(Math.random()*99);
            if (arreglo[i]% i==0){
                acum+=i+4;
                 
            }
        }
         for(int i=0; i<arreglo.length;i++){
            System.out.print("p:"+arreglo[i]+", ");
        }

    }
}        