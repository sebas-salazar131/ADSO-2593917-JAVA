import java.util.Scanner;

public class Ejericicio2{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingresar el numero entero");
        int n=entrada.nextInt();


        int [] numero = new int[n];

        int i=0;
        while(i<n){
            int aleatorio=(int)(Math.random()*1000);
            int acumulador=0;
            int a=1;
            while(a<=aleatorio){
                if (aleatorio%a==0){
                   acumulador++;
                }
                a++;
            }
            if (acumulador==2){
                boolean correcto=true;
                for(int j=0;j<n;j++){
                    if(numero[j]==aleatorio){
                       correcto=false;
                    }
                }
                if (correcto){
                    numero[i]=aleatorio;
                    i++;
                    System.out.print("p:"+aleatorio+", ");
                
                }
            }
            
        }
        
                
         
        
        
        
    }
}        