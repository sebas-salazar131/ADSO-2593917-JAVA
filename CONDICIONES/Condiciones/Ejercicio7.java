import java.util.Scanner;

public class Ejercicio7{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("ingrese un numero ");
        long numero=entrada.nextLong();

        
        
        if (numero<100 || numero<0){
        System.out.println("moneda $"+ numero);
        }else if (numero>999 && numero<10000 || numero>-999 && numero<-10000){
        long total=numero/1000;
        long resultado=total%10;
        long total1=numero/100;
        long resultado1=total1%10;
        long total2=numero/10;
        long resultado2=total2%10;
        long total3=numero%10;

        System.out.println("moneda $"+ resultado + "." + resultado1 + resultado2 + total3 );
        }else if (numero>9999 && numero<100000 || numero>-9999 && numero<-100000){
        long total=numero/10000;
        long resultado=total%10;
        long total1=numero/1000;
        long resultado1=total1%10;
        long total2=numero/100;
        long resultado2=total2%10;
        long total3=numero/10;
        long resultado3=total3%10;
        long total4=numero%10;
        System.out.println("moneda: $ "+ resultado + resultado1 + "." + resultado2 + resultado3 + total4);

        }else if (numero>99999 && numero<1000000 || numero>-99999 && numero<-1000000){
            long total=numero/100000;
            long resultado=total%10;
            long total1=numero/10000;
            long resultado1=total%10;
            long total2=numero/1000;
            long resultado2=total1%10;
            long total3=numero/100;
            long resultado3=total2%10;
            long total4=numero/10;
            long resultado4=total3%10;
            long total5=numero%10;
            System.out.println("moneda: $"+ resultado+resultado1+resultado2+"."+resultado3+resultado4+total5);

        }else if (numero>999999 && numero<10000000 || numero>-999999 && numero<-10000000){
            long total=numero/1000000;
            long resultado=total%10;
            long total1=numero/100000;
            long resultado1=total1%10;
            long total2=numero/10000;
            long resultado2=total2%10;
            long total3=numero/1000;
            long resultado3=total3%10;
            long total4=numero/100;
            long resultado4=total4%10;
            long total5=numero/10;
            long resultado5=total5%10;
            long total6=numero%10;
            System.out.println("moneda: $"+resultado +"."+ resultado1+resultado2+resultado3+"."+resultado4+resultado5+total6);


        }else if (numero>9999999 && numero<100000000 || numero>-9999999 && numero<-100000000){
            long total=numero/10000000;
            long resultado=total%10;
            long total1=numero/1000000;
            long resultado1=total1%10;
            long total2=numero/100000;
            long resultado2=total2%10;
            long total3=numero/10000;
            long resultado3=total3%10;
            long total4=numero/1000;
            long resultado4=total4%10;
            long total5=numero/100;
            long resultado5=total5%10;
            long total6=numero/10;
            long resultado6=total6%10;
            long total7=numero%10;
            System.out.println("moneda: $"+resultado+resultado1 +"."+ resultado2+resultado3+resultado4+"."+resultado5+resultado6+total7);


        }else if  (numero>99999999 && numero<1000000000 || numero>-99999999 && numero<-1000000000){
            long total=numero/100000000;
            long resultado=total%10;
            long total1=numero/10000000;
            long resultado1=total1%10;
            long total2=numero/1000000;
            long resultado2=total2%10;
            long total3=numero/100000;
            long resultado3=total3%10;
            long total4=numero/10000;
            long resultado4=total4%10;
            long total5=numero/1000;
            long resultado5=total5%10;
            long total6=numero/100;
            long resultado6=total6%10;
            long total7=numero/10;
            long resultado7=total7%10;
            long total8=numero%10;
            System.out.println("moneda: $"+resultado+resultado1+resultado2 +"."+ resultado3+resultado4+resultado5+"."+resultado6+resultado7+total8);



        }else if (numero>999999999 || numero>-999999999 ){
            long total=numero/1000000000;
            long resultado=total%10;
            long total1=numero/100000000;
            long resultado1=total1%10;
            long total2=numero/10000000;
            long resultado2=total2%10;
            long total3=numero/1000000;
            long resultado3=total3%10;
            long total4=numero/100000;
            long resultado4=total4%10;
            long total5=numero/10000;
            long resultado5=total5%10;
            long total6=numero/1000;
            long resultado6=total6%10;
            long total7=numero/100;
            long resultado7=total7%10;
            long total8=numero/10;
            long resultado8=total8%10;
            long total9=numero%10;
            System.out.println("moneda: $"+resultado+"."+resultado1+resultado2+resultado3 +"."+ resultado4+resultado5+resultado6+"."+resultado7+resultado8+total9);
            


        }
            
        
    }
}


        