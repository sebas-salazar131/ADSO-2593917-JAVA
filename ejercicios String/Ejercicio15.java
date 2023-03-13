import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int numero=entrada.nextInt();

        int arreglo1[]=new int [numero];
        int arreglo2[]=new int [numero];
        int arreglo3[]=new int [numero];

        for(int i=0;i<arreglo1.length;i++){
            System.out.println("ingrese numero del primer arreglo "+i+":");
            int valores1=entrada.nextInt();
            System.out.println("ingrese numero del segundo arreglo "+i+":");
            int valores2=entrada.nextInt();

            arreglo1[i]=valores1;
            arreglo2[i]=valores2;
        }
        int total=arreglo1.length;
        int total1=arreglo2.length;

        int resul=Math.max(total,total1);

        for(int j=0;j<resul;j++){
            int t1=(j*total);
            int t2=(j*total1);

            arreglo3[i]+=t1;
            arreglo3[i]+=t2;
        }
        System.out.println(arreglo3",")
    }
}        