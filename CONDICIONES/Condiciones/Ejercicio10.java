import java.util.Scanner;

public class Ejercicio10{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
            

        System.out.println("ingrese nota de matematicas");
        float nota_mate=entrada.nextFloat();

        System.out.println("ingrese nota de espanol");
        float nota_espanol=entrada.nextFloat();

        System.out.println("ingrese nota de ingles");
        float nota_ingles=entrada.nextFloat();

        System.out.println("ingrese nota de naturales");
        float nota_naturales=entrada.nextFloat();

        System.out.println("ingrese nota de deportes");
        float nota_deportes=entrada.nextFloat();

        if (nota_mate>nota_espanol && nota_mate>nota_ingles && nota_mate>nota_naturales && nota_mate>nota_deportes){
            System.out.println("Asignatura con mayor nota: matematicas"); 
        }else if (nota_naturales>nota_espanol && nota_naturales>nota_ingles && nota_naturales>nota_mate && nota_naturales>nota_deportes){
            System.out.println("Asignatura con mayor nota: naturales"); 
        }else if (nota_espanol>nota_mate && nota_espanol>nota_ingles && nota_espanol>nota_naturales && nota_espanol>nota_deportes){
            System.out.println("Asignatura con mayor nota: espanol"); 
        }else if (nota_ingles>nota_espanol && nota_ingles>nota_mate && nota_ingles>nota_naturales && nota_ingles>nota_deportes){
            System.out.println("Asignatura con mayor nota: ingles"); 
        }else if  (nota_deportes>nota_espanol && nota_deportes>nota_ingles && nota_deportes>nota_naturales && nota_deportes>nota_mate){
            System.out.println("Asignatura con mayor nota: deportes"); 
        }

        if (nota_mate<nota_espanol && nota_mate<nota_ingles && nota_mate<nota_naturales && nota_mate<nota_deportes){
            System.out.println("Asignatura con menor nota: matematicas"); 
        }else  if (nota_espanol<nota_mate && nota_espanol<nota_ingles && nota_espanol<nota_naturales && nota_espanol<nota_deportes){
            System.out.println("Asignatura con menor nota: espanol"); 
        }else  if (nota_ingles<nota_espanol && nota_ingles<nota_mate && nota_ingles<nota_naturales && nota_ingles<nota_deportes){
            System.out.println("Asignatura con menor nota: ingles"); 
        }else  if (nota_naturales<nota_espanol && nota_naturales<nota_ingles && nota_naturales<nota_mate && nota_naturales<nota_deportes){
            System.out.println("Asignatura con menor nota: naturales"); 
        }else  if (nota_deportes<nota_espanol && nota_deportes<nota_ingles && nota_deportes<nota_naturales && nota_deportes<nota_mate){
            System.out.println("Asignatura con menor nota: deportes"); 
        }
        
        float promedio=nota_mate+nota_espanol+nota_ingles+nota_naturales+nota_deportes;
        float total_nota=promedio/5;
        System.out.println("el promedio de notas: "+ total_nota );
        if (promedio<15){
            float periodo=15-promedio;
            System.out.println("le falto " + periodo +" para pasar el periodo");
        }else if(promedio>15){
            System.out.println("paso el periodo");
        }







          

    }        
}