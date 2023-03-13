import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese su nombre: ");
        String oracion=entrada.nextLine();

        String pos="";
        String poli="";
    
        for(int i=oracion.length()-1;i>=0;i--){
            pos+=oracion.charAt(i);
        }
        poli+=pos;
        
        if(oracion.equalsIgnoreCase(poli)){
            System.out.println("es polindromo");
        }else{
            System.out.println("no es polindromo");
        }
       
    }
}        