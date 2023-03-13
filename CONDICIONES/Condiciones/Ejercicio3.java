import java.util.Scanner;

public class Ejercicio3{
   public static void main (String[]args){
     Scanner entrada = new Scanner(System.in);

      System.out.println("ingrese el valor X");
      int numeroX=entrada.nextInt();
      System.out.println("ingrese el valor Y");
      int numeroY=entrada.nextInt();

      if(numeroX>0 && numeroY>0){
        System.out.println("este es el primer cuadrante");

      } else if(numeroX<0 && numeroY>0){
        System.out.println("este es el segundo cuadrante");

      } else if (numeroX<0 && numeroY<0){ 
        System.out.println("este es el tercer cuadrante"); 

      }  else if (numeroX>0 && numeroY<0){ 
         System.out.println("este es el cuarto cuadrante"); 

      } else if (numeroX==0 && numeroY==0){
        System.out.println("este es el centro de todos los cuadrantes"); 
      }



   }  


}