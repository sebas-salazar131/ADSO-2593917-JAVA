import java.util.Scanner;

public class Ahorcado{
    private String palabra;
    private char letra;
    private String nombre;
    private  char arreglo[];
    private boolean jugando;

    public Ahorcado(){
        
        this.palabra="gamer";
        this.letra=' ';
        this.nombre="";
        this.arreglo=new char [5];
        this.jugando=true;
        this.limpiarTablero();

    }

    public void limpiarTablero(){
        for(int i=0; i<this.arreglo.length;i++){
            this.arreglo[i] = '_';
        }
    }

    public void imprimirTablero(){
        for(int i=0; i<this.arreglo.length;i++){
            System.out.print("["+this.arreglo[i]+"]");
        }
    }

    public void start(){
        Scanner entrada= new Scanner(System.in);
        Scanner entradaint=new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("1. Iniciar        -");
        System.out.println("2. Salir          -");
        System.out.println("-------------------");
        int opcion=entradaint.nextInt();

        do{
            
            if(opcion==1){
                this.imprimirTablero();
                char [] caracteres= palabra.toCharArray();
                System.out.println("ingrese una letra");
                this.letra=entrada.next().char(0);

                
                for(int i=0; i<caracteres.length;i++){
                    if(caracteres[i]==this.letra[i]){
                        this.arreglo[i]=letra[i];
                        imprimirTablero();
                    }
                }
                }
            
        }while(opcion!=2);
        
    }

}    
