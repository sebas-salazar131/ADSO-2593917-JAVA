import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        int i=1;
        while(i<=3){
          System.out.println("|------Bienvenido------|");
          System.out.println("|1. Docente            |");
          System.out.println("|2. Estudiante         |");
          System.out.println("|3. salir              |");
          System.out.println("|----------------------|");
          int numero=entrada.nextInt();

          if(numero==1){

         System.out.println("ingrese la cantidad de notas");
         int cantidad=entrada.nextInt();


         int notas=0;
         float acumulador=0;
          while(notas<cantidad){
             System.out.println("nota "+notas);
             float nota_recibida=entrada.nextFloat();
             acumulador=acumulador+nota_recibida;

             notas++;
            }
              float promedio=acumulador/notas;
              System.out.println("este es el promedio "+ promedio );

            }if (numero==2){
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



            } if(numero==3){
             System.out.println("gracias por ingresar al sistema");

          }

         i++;
        }

        




    }
}