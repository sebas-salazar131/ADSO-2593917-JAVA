import java.util.Scanner;

public class Ejercicio02{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        int i=1;
        while(i<2){
            int dia=(int)(Math.random()*31);
            int mes=(int)(Math.random()*12);
            int ano=(int)(Math.random()*3000);
            System.out.println("la fecha construida es "+dia+"/"+mes+"/"+ano );
          i++;  

        }
        


    }
}        