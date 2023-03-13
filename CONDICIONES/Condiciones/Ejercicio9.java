import java.util.Scanner;

public class Ejercicio9{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
         System.out.println("ingrese un numero para pasarselo a texto");
        int numero=entrada.nextInt();
    
        int dig1=numero%10;
        int dig2=(numero/10)%10;
        int dig3=(numero/100)%10;
        int dig4=(numero/1000)%10;
        int dig5=(numero/10000)%10;
        int dig6=(numero/100000)%10;
        int dig7=(numero/1000000)%10;
        int dig8=(numero/10000000)%10;

    

       if(dig8==3 && dig7==0){
           System.out.print("treinta");
       }else if(dig8==3 && dig7==1){
       System.out.print("treinta y ");
        }
        if (dig8==2){
            if (dig7==0){
             System.out.print("veinte de ");
             }else{
             System.out.print("veinti ");
            }  
        }if (dig8==0){
             System.out.print("");
        }
        if (dig8==1 && dig7==9){
           System.out.print("diecinueve de "); 
        }else if  (dig8==1 && dig7==8){
            System.out.print("dieciocho de "); 
        }else if  (dig8==1 && dig7==7){
            System.out.print("diecisiete de "); 
        }else if  (dig8==1 && dig7==6){
            System.out.print("dieciseis de "); 
        }else if  (dig8==1 && dig7==5){
            System.out.print("quince de "); 
        }else if  (dig8==1 && dig7==4){
            System.out.print("catorce de "); 
        }else if  (dig8==1 && dig7==3){
            System.out.print("trece de "); 
        }else if  (dig8==1 && dig7==2){
            System.out.print("doce de "); 
        }else if  (dig8==1 && dig7==1){
            System.out.print("once de "); 
        } else if  (dig8==1 && dig7==0){
            System.out.print("diez de "); 
        }

        if (dig8==0 && dig7==9){
        System.out.print("nueve de "); 
        }else if (dig8==0 && dig7==8){
            System.out.print("ocho de "); 
        }else if (dig8==0 && dig7==7){
            System.out.print("siete de "); 
        }else if (dig8==0 && dig7==6){
            System.out.print("seis de "); 
        }else if (dig8==0 && dig7==5){
            System.out.print("cinco de "); 
        }else if (dig8==0 && dig7==4){
            System.out.print("cuatro de "); 
        }else if (dig8==0 && dig7==3){
            System.out.print("tres de "); 
        }else if (dig8==0 && dig7==2){
            System.out.print("dos de "); 
        }else if (dig8==0 && dig7==1){
            System.out.print("uno de "); 
        }

        if (dig6==1 && dig5==2){
            System.out.print("diciembre de ");
        }else if (dig6==1 && dig5==1){
            System.out.print("noviembre de ");
        }else if (dig6==1 && dig5==0){
            System.out.print("octubre de ");
        }else if (dig6==0 && dig5==9){
            System.out.print("septiembre de ");
        }else if (dig6==0 && dig5==8){
            System.out.print("agosto de ");
        }else if (dig6==0 && dig5==7){
            System.out.print("julio de ");
        }else if (dig6==0 && dig5==6){
            System.out.print("junio de ");
        }else if (dig6==0 && dig5==5){
            System.out.print("mayo de ");
        }else if (dig6==0 && dig5==4){
            System.out.print("abril de ");
        }else if (dig6==0 && dig5==3){
            System.out.print("marzo de ");
        }else if (dig6==0 && dig5==2){
            System.out.print("febrero de ");
        }else if (dig6==0 && dig5==1){
            System.out.print("enero de ");
        }

       if  (dig4==2){
            System.out.print("dos mil ");
        }else if (dig4==1){
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
               System.out.print("setenta y");
           }
        }else if (dig2==6){
           if(dig1==0){
               System.out.print("sesenta");
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
               System.out.print("uno");
           }else if (dig1==2){
               System.out.print("dos");
           }else if (dig1==3){
               System.out.print("tres");
           }else if (dig1==4){
               System.out.print("cuatro");
           }else if (dig1==5){
               System.out.print("cinco");
           }else if (dig1==6){
               System.out.print("seis");
           }else if (dig1==7){
            System.out.print("siete");
           }else if (dig1==8){
            System.out.print("ocho");
           }else if (dig1==9){
            System.out.print("nueve");
           }














    
        
    }
}        