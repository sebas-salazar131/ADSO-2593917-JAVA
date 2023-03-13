import java.util.Scanner;

public class Ejercicio8{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
            

        System.out.println("ingrese un numero ");
        int numero=entrada.nextInt();

        int dig1=numero%10;
        int dig2=(numero/10)%10;
        int dig3=(numero/100)%10;
        int dig4=(numero/1000)%10;
        int dig5=(numero/10000)%10;
        int dig6=(numero/100000)%10;


        if (dig6==9){
        System.out.print("novecientos ");
        }else if (dig6==8){
        System.out.print("ochocientos ");
        }else if (dig6==7){
        System.out.print("setecientos ");
        }else if (dig6==6){
        System.out.print("seiscientos ");
        }else if (dig6==5){
        System.out.print("quinientos ");
        }else if (dig6==4){
        System.out.print("cuatrocientos ");
        }else if (dig6==3){
        System.out.print("trecientos ");
        }else if (dig6==2){
        System.out.print("docientos ");
        }else if (dig6==1){
            if (dig5==0 && dig4==0){
                System.out.print("cien ");
            }else{
                System.out.print("ciento ");
            }
        
        } else if (dig6==0){
            System.out.print("");
        }

       
       if (dig5==9){
        if (dig4==0){
            System.out.print("noventa ");
        }else{
            System.out.print("noventa y");
        }
       }else if (dig5==8){
           if(dig4==0){
               System.out.print("ochenta ");
           }else{
               System.out.print("ochenta y ");
           }
       }else if (dig5==7){
           if(dig4==0){
               System.out.print("setenta ");
           }else{
               System.out.print("setenta y ");
           }
        }else if (dig5==6){
           if(dig4==0){
               System.out.print("sesenta ");
           }else{
               System.out.print("sesenta y ");
           }
        }else if (dig5==5){
           if(dig4==0){
               System.out.print("cincuenta ");
           }else{
               System.out.print("cincuenta y ");
           }
        }else if (dig5==4){
           if(dig4==0){
               System.out.print("setenta ");
           }else{
               System.out.print("setenta y ");
           }
        }else if (dig5==4){
           if(dig4==0){
               System.out.print("cuarenta ");
           }else{
               System.out.print("cuarenta y ");
           }
        }else if (dig5==3){
           if(dig4==0){
               System.out.print("treinta ");
           }else{
               System.out.print("treinta y ");
           }
        }else if (dig5==2){
           if(dig4==0){
               System.out.print("veinte ");
           }else{
               System.out.print("veinti ");
           }
        }else if (dig5==1){
           if(dig4==0){
               System.out.print("diez ");
           }else if(dig4==1){
               System.out.print("once ");
           }else if (dig4==2){
               System.out.print("doce ");
           }else if (dig4==3){
               System.out.print("trece ");
           }else if (dig4==4){
               System.out.print("catorce ");
           }else if (dig4==5){
               System.out.print("quince ");
           }else if (dig4==6){
               System.out.print("dieciseis ");
           }else if (dig1==7){
            System.out.print("diecisiete ");
           }else if (dig1==8){
            System.out.print("dieciocho ");
           }else if (dig1==9){
            System.out.print("diecinueve ");
           }
        }else if (dig5==0){
            System.out.print("");
        }

        if (dig4==9){
            System.out.print("nueve mil ");
        }else if (dig4==8){
            System.out.print("ocho mil ");
        }else if (dig4==7){
            System.out.print("siete mil ");
        }else if (dig4==6){
            System.out.print("seis mil ");
        }else if (dig4==5){
            System.out.print("cinco mil ");
        }else if (dig4==4){
            System.out.print("cuatro mil ");
        }else if (dig4==3){
            System.out.print("tres mil ");
        }else if (dig4==2){
            System.out.print("dos mil ");
        }else if (dig4==1){
            System.out.print("un mil ");
        }else if (dig4==0){
            System.out.print("mil ");
        }

        if (dig3==9){
        System.out.print("novecientos ");
        }else if (dig3==8){
        System.out.print("ochocientos ");
        }else if (dig3==7){
        System.out.print("setecientos ");
        }else if (dig3==6){
        System.out.print("seiscientos ");
        }else if (dig3==5){
        System.out.print("quinientos ");
        }else if (dig3==4){
        System.out.print("cuatrocientos ");
        }else if (dig3==3){
        System.out.print("trecientos ");
        }else if (dig3==2){
        System.out.print("docientos ");
        }else if (dig3==1){
            if (dig4==0 && dig3==0){
                System.out.print("cien ");
            }else{
                System.out.print("ciento ");
            }
        
        } else if (dig3==0){
            System.out.print("");
        } 

        if (dig2==9){
        if (dig1==0){
            System.out.print("noventa ");
        }else{
            System.out.print("noventa y ");
        }
       }else if (dig2==8){
           if(dig1==0){
               System.out.print("ochenta ");
           }else{
               System.out.print("ochenta y ");
           }
       }else if (dig2==7){
           if(dig1==0){
               System.out.print("setenta ");
           }else{
               System.out.print("setenta y ");
           }
        }else if (dig2==6){
           if(dig1==0){
               System.out.print("sesenta ");
           }else{
               System.out.print("sesenta y ");
           }
        }else if (dig2==5){
           if(dig1==0){
               System.out.print("cincuenta ");
           }else{
               System.out.print("cincuenta y ");
           }
        }else if (dig2==4){
           if(dig1==0){
               System.out.print("setenta ");
           }else{
               System.out.print("setenta y ");
           }
        }else if (dig2==4){
           if(dig1==0){
               System.out.print("cuarenta ");
           }else{
               System.out.print("cuarenta y ");
           }
        }else if (dig2==3){
           if(dig1==0){
               System.out.print("treinta ");
           }else{
               System.out.print("treinta y ");
           }
        }else if (dig2==2){
           if(dig1==0){
               System.out.print("veinte ");
           }else{
               System.out.print("veinti ");
           }
        }else if (dig2==1){
           if(dig1==0){
               System.out.print("diez ");
           }else if(dig1==1){
               System.out.print("once ");
           }else if (dig1==2){
               System.out.print("doce ");
           }else if (dig1==3){
               System.out.print("trece ");
           }else if (dig1==4){
               System.out.print("catorce ");
           }else if (dig1==5){
               System.out.print("quince ");
           }else if (dig1==6){
               System.out.print("diecieseis ");
           }else if (dig1==7){
            System.out.print("diecisiete ");
           }else if (dig1==8){
            System.out.print("dieciocho ");
           }else if (dig1==9){
            System.out.print("diecinueve ");
           }
        }else if (dig2==0){
            System.out.print("");
        }else if (dig1==0){
            System.out.print("");
        }
         if(dig1==0){
               System.out.print("");
           }else if(dig1==1){
               System.out.print("uno ");
           }else if (dig1==2){
               System.out.print("dos ");
           }else if (dig1==3){
               System.out.print("tres ");
           }else if (dig1==4){
               System.out.print("cuatro ");
           }else if (dig1==5){
               System.out.print("cinco ");
           }else if (dig1==6){
               System.out.print("seis ");
           }else if (dig1==7){
            System.out.print("siete ");
           }else if (dig1==8){
            System.out.print("ocho ");
           }else if (dig1==9){
            System.out.print("nueve ");
           }

    }        
}