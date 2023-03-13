import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese su nombre: ");
        String nombre=entrada.nextLine();

        String pos="";
    
        for(int i=nombre.length()-1;i>=0;i--){
            pos+=nombre.charAt(i);
        }
        System.out.print(pos);
     
    }
}        