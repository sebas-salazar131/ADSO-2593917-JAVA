import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese una oracion: ");
        String oracion=entrada.nextLine();

        int posicion=0;
        for(int i=0; i<oracion.length();i++){
            posicion=(int)oracion.charAt(i);

            if(posicion>=65 && posicion<=90){
                char nuevo=(char)(posicion+32);
                System.out.print(nuevo);
            }else if (posicion>=90 && posicion<=122){
                char nuevo =(char)(posicion-32);
                System.out.print(nuevo);
            }


        }
        
        
        
    }
}        