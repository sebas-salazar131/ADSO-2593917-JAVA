import java.util.Scanner;

public class Cuarto{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese tamano del arreglo");
        int numero=entrada.nextInt();
        String nombre=entrada.nextLine();

        int arreglo []=new int [numero];
        String nombres []=new String[arreglo.length];
        for(int i=0;i<arreglo.length;i++){
            System.out.println("ingrese su nombre");
            nombres[i]=entrada.nextLine();

        }
        for(int a=0;a<arreglo.length;a++){
            for(int j=0;j<arreglo.length-1;j++){
                if(nombres[a].charAt(nombres[j+1])){
                    String aux;
                    aux=nombres[j];
                    nombres[j]=nombres[j+1];
                    nombres[j+1]=aux;
                }
            }
        }          
        for(int z=0;z<arreglo.length;z++){
            System.out.println("["+nombres[z]+"]");
        }

    }
}        