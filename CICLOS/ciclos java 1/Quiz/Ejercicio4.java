import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese el area inicia de la bacteria en cm2: ");
        int inicial=entrada.nextInt();

        System.out.print("ingrese el area total del metal a consumir: ");
        int consumir=entrada.nextInt(); 

        int acum1=0;
        int acum2=0;

        for (int i=1;i<=3;i++){
            
            int aumentar=inicial*300/(100);
            acum1+=inicial*300/(100);

            int porce=(aumentar*30)/(100);
            int reducir=aumentar-porce;
            acum2+=reducir;

            if(i%2==0){
                System.out.println("Dia "+ i);
                System.out.println("creciendo: "+acum1);
                System.out.println("decremento: "+acum2);
            }
            if(i%2==1){
                System.out.println("Dia "+ i);
                System.out.println("creciendo: "+acum1);
                System.out.println("decremento: "+acum2);
            }
            


        }




      
    }
}        