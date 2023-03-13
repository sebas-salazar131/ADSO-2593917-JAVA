import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

      Scanner entrada = new Scanner(System.in);

      System.out.print("ingrese una oracion: ");
      String oracion=entrada.nextLine();

      int a=0;
      
      for(int i=0;i<oracion.length();i++){
         System.out.println("las posiciones son "+i+":"+oracion.charAt(i));
         if(oracion.charAt(i)=='a' || oracion.charAt(i)=='e' || oracion.charAt(i)=='i' || oracion.charAt(i)=='o' || oracion.charAt(i)=='u' ){
            a++;
         } else if(oracion.charAt(i)=='A' || oracion.charAt(i)=='E' || oracion.charAt(i)=='I' || oracion.charAt(i)=='O' || oracion.charAt(i)=='U' ){
            a++;
         } 
      }   
      System.out.println("la cantidad de vocales son: "+a);
        


    }
}    
