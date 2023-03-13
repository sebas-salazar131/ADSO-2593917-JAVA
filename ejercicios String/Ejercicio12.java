import java.util.Scanner;

public class Quinto{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int numero=entrada.nextInt();
        String nombre=entrada.nextLine();
        String geneo=entrada.nextLine();

        int arreglo []=new int[numero];
        String nombres []=new String[arreglo.length];
        String genero []=new String[arreglo.length];

        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingrese su nombre");
            nombres[i]=entrada.nextLine();
            System.out.println("ingrese su genero");
            genero[i]=entrada.nextLine();
        }
        for(int j=0;j<arreglo.length;j++){
            System.out.println("-"+nombres[j]+" => "+genero[j]);
            

        }
    }
}        