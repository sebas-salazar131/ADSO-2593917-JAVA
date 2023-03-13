import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese la cantidad de materias");
        int cantidad=entrada.nextInt();

        float acum_materias=0;
        float acum_creditos=0;
       
        for(int notas=1;notas<=cantidad;notas++){
            System.out.println("ingrese nota " + notas );
            float materias=entrada.nextFloat();
            System.out.println("ingrese creditos de materia " + notas);
            float creditos=entrada.nextFloat();

            acum_materias=acum_materias+materias;
             acum_creditos=acum_creditos+creditos;

         
         
        }
        float nota_total=acum_materias/cantidad;
         
        
  
        System.out.println("total de creditos " + acum_creditos);
        System.out.println("promedio semestre "+nota_total );
    }
}
   