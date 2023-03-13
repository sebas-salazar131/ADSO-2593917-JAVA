import java.util.Scanner;

public class Sexto{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int meses[]=new int [12];
        int opcion=0;
        int pago=0;
        int especifico=0;
        int mes=0;
        do{
            System.out.println("1: registrar pago mensual - año 2019");
            System.out.println("2: ver pago todos los meses");
            System.out.println("3: ver pago mes especifico.");
            System.out.println("4: salir");
            opcion=entrada.nextInt();

            if(opcion==1){
                System.out.println("1. enero, 2. febrero, 3. marzo, 4. abril, 5. mayo, 6.abril, 7.junio");
                System.out.println("8. agosto, 9. septiembre, 10. octubre, 11. noviembre, 12. diciembre");
                System.out.println("ingrese el meses que desea registrar");
                mes=entrada.nextInt();
            
                for(int i=0;i<meses.length;i++){
                    if (mes==i){
                        System.out.print("ingrese pago: ");
                        pago =entrada.nextInt();
                        meses[i]=pago;
                    }
                }
            }else if (opcion==2){
                for(int j=0;j<meses.length;j++){
                    System.out.println("mes: "+j+" :"+meses[j]);
                }
            }else if(opcion==3){
                System.out.println("ingrese el mes que desea ver");
                especifico=entrada.nextInt();
                for(int z=0;z<meses.length;z++){
                    if (especifico==z){
                        System.out.println("este es el mes especifico: "+meses[z]);
                    }
                }
            }


        }while(opcion<4);
       
    }
}        