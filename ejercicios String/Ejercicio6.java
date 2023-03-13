import java.util.Scanner;

public class Taller21{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese contrasena: ");
        String contra=entrada.nextLine();

        int cont=0;
        int pos=0;
        for(int i=0;i<contra.length();i++){
            pos=(int)contra.charAt(i);
            if((pos> 47 && pos< 58) && (pos > 64 && pos < 91) && (pos >= 97 && pos <= 122) && (pos>=33 && pos<=47) && (pos!=32)){   
            }else{
                cont++;
            }
            
        }
        if(cont>=1){
            System.out.println("la contrasena es invalida");
        }else{
            System.out.println("la contrasena es valida");
        }
            
        
      
        
    
        // pos=(int)contra.length();
        // if(pos>8){
        //     System.out.println("la contrasena es valida");

        // }else if(pos<8){
        //     System.out.println("la contrasena es invalida");
        // }
            
        
       
    }

    
}     