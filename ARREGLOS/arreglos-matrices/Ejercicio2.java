import java.util.Scanner;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[]args){

        Scanner entrada=new  Scanner(System.in);

        //definiendo mapa
        int [][] matriz={
                            {1,1,1,1,1,1,1},
                            {1,0,0,0,1,0,3},
                            {1,0,1,0,1,0,1},
                            {1,0,1,0,1,0,1},
                            {2,0,1,0,0,0,1},
                            {1,1,1,1,1,1,1}
                        };
                      
       
        //ciclo juego   
        boolean jugando=true;
        int pos_f= 4;
        int pos_c= 0;
        while(jugando){
            //imprimir laberinto  
            try { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); } catch (Exception e) {}
           for(int i=0;i<matriz.length;i++){
                for(int j=0;j<matriz[i].length;j++){
                    System.out.print(matriz[i][j]);
                
                }
               System.out.println(" ");
           } 
           //imprimiendo el menu
           System.out.print("1. arriba, 2. abajo, 3. derecha, 4. izquierda: "); 
           int opcion =entrada.nextInt();
           //arriba
           if(opcion==1){
               if(matriz[pos_f-1][pos_c]==0){
                   matriz[pos_f-1][pos_c]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f= pos_f-1;
                   pos_c= pos_c;
               }else if(matriz[pos_f-1][pos_c]==3){
                   jugando=false;
               }
           }
           //abajo
           if(opcion==2){
               if(matriz[pos_f+1][pos_c]==0){
                   matriz[pos_f+1][pos_c]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f= pos_f+1;
                   pos_c= pos_c;
               }else if(matriz[pos_f+1][pos_c]==3){
                   jugando=false;
               }            
           }
           //derecha
           if(opcion==3){
               if(matriz[pos_f][pos_c+1]==0){
                   matriz[pos_f][pos_c+1]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f= pos_f;
                   pos_c= pos_c+1;
               }else if(matriz[pos_f][pos_c+1]==3){
                   jugando=false;
               }   
           }
           //izquierda
           if(opcion==4){
               if(matriz[pos_f][pos_c-1]==0){
                   matriz[pos_f][pos_c-1]=2;
                   matriz[pos_f][pos_c]=0;
                   pos_f= pos_f;
                   pos_c= pos_c-1;
               }else if(matriz[pos_f][pos_c-1]==3){
                   jugando=false;
               }   
           }
           //Movimiento invalido
           if(opcion<1 || opcion>4){
            System.out.println("MOVIMIENTO INVALIDO");
           }
        }   
        System.out.println("GAME OVER - LEVEL COMPLETE");
               

        
        
    }
}        