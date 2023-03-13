import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("elija con numeros cual es el municipio que inicio el recorrido ");
        System.out.println("1. Apia, 2.Balboa, 3. Belen de umbria, 4. dosquebradas, 5. guatica");
        System.out.println("6. la celia, 7. La virginia, 8. marsella, 9. mistrato, 10. Pereira");
        System.out.println("11.pueblo rico, 12. quinchia, 13. santa rosa de cabal, 14. santuario");
        int parada_anterior=entrada.nextInt();

        System.out.println("cuanto vale un litro de gasolina");
        float litros=entrada.nextInt();

        System.out.println("cuantos galones/km gasta");
        float km=entrada.nextFloat();

        System.out.println("cuantas paradas piensa hacer");
        int cant_paradas=entrada.nextInt();

        double apia_apia=5.0;
        double apia_balboa=39.8;
        double apia_belen=39.5;
        double apia_dosque=68.9;
        double apia_guatica=58.7;
        double apia_lacelia=24.1;
        double apia_virginia=34.9;
        double apia_marsella=88.1;
        double apia_mistrato=55.6;
        double apia_pereira=65.7;
        double apia_pueblorico=26.4;
        double apia_quinchia=77.4;
        double apia_santarosa=77.8;
        double apia_santuario=15.3;

        double balboa_apia=39.8;
        double balboa_balboa=5.0;
        double balboa_belen=56.9;
        double balboa_dosque=52.9;
        double balboa_guatica=76.1;
        double balboa_lacelia=13.7;
        double balboa_virginia=18.9;
        double balboa_marsella=72.1;
        double balboa_mistrato=73.0;
        double balboa_pereira=49.7;
        double balboa_pueblorico=64.8;
        double balboa_quinchia=94.8;
        double balboa_santarosa=61.9;
        double balboa_santuario=38.3;

        double belen_apia=39.5;
        double belen_balboa=56.9;
        double belen_belen=5.0;
        double belen_dosque=74.6;
        double belen_guatica=25.1;
        double belen_lacelia=71.9;
        double belen_virginia=40.8;
        double belen_marsella=93.8;
        double belen_mistrato=16.3;
        double belen_pereira=71.4;
        double belen_pueblorico=65.4;
        double belen_quinchia=52.4;
        double belen_santarosa=83.6;
        double belen_santuario=71.4;

        double dosque_apia=67.5;
        double dosque_balboa=51.5;
        double dosque_belen=73.1;
        double dosque_dosque=5.0;
        double dosque_guatica=92.3;
        double dosque_lacelia=66.6;
        double dosque_virginia=32.5;
        double dosque_marsella=34.4;
        double dosque_mistrato=89.3;
        double dosque_pereira=2.4;
        double dosque_pueblorico=92.5;
        double dosque_quinchia=93.9;
        double dosque_santarosa=12.4;
        double dosque_santuario=66.0;

        double guatica_apia=58.7;
        double guatica_balboa=76.1;
        double guatica_belen=25.1;
        double guatica_dosque=93.8;
        double guatica_guatica=5.0;
        double guatica_lacelia=91.1;
        double guatica_virginia=60.0;
        double guatica_marsella=98.5;
        double guatica_mistrato=25.1;
        double guatica_pereira=90.6;
        double guatica_pueblorico=84.8;
        double guatica_quinchia=22.9;
        double guatica_santarosa=85.5;
        double guatica_santuario=73.4;

        double lacelia_apia=24.1;
        double lacelia_balboa=13.1;
        double lacelia_belen=71.9;
        double lacelia_dosque=67.9;
        double lacelia_guatica=91.1;
        double lacelia_lacelia=5.0;
        double lacelia_virginia=33.9;
        double lacelia_marsella=87.2;
        double lacelia_mistrato=88.1;
        double lacelia_pereira=64.7;
        double lacelia_pueblorico=49.1;
        double lacelia_quinchia=110.0;
        double lacelia_santarosa=76.9;
        double lacelia_santuario=22.6;

        double virginia_apia=35.0;
        double virginia_balboa=19.0;
        double virginia_belen=40.8;
        double virginia_dosque=34.0;
        double virginia_guatica=60.0;
        double virginia_lacelia=34.0;
        double virginia_virginia=5.0;
        double virginia_marsella=53.3;
        double virginia_mistrato=56.9;
        double virginia_pereira=30.8;
        double virginia_pueblorico=60.0;
        double virginia_quinchia=78.7;
        double virginia_santarosa=43.0;
        double virginia_santuario=33.5;

        double marsella_apia=88.0;
        double marsella_balboa=72.0;
        double marsella_belen=93.6;
        double marsella_dosque=35.8;
        double marsella_guatica=98.4;
        double marsella_lacelia=87.0;
        double marsella_virginia=53.0;
        double marsella_marsella=5.0;
        double marsella_mistrato=110.0;
        double marsella_pereira=32.9;
        double marsella_pueblorico=113.0;
        double marsella_quinchia=96.6;
        double marsella_santarosa=44.7;
        double marsella_santuario=86.5;

        double mistrato_apia=55.7;
        double mistrato_balboa=73.1;
        double mistrato_belen=16.3;
        double mistrato_dosque=90.8;
        double mistrato_guatica=25.1;
        double mistrato_lacelia=81.1;
        double mistrato_virginia=57.0;
        double mistrato_marsella=110.0;
        double mistrato_mistrato=5.0;
        double mistrato_pereira=87.6;
        double mistrato_pueblorico=81.7;
        double mistrato_quinchia=53.6;
        double mistrato_santarosa=99.8;
        double mistrato_santuario=70.4;

        double pereira_apia=65.7;
        double pereira_balboa=49.8;
        double pereira_belen=71.3;
        double pereira_dosque=2.4;
        double pereira_guatica=90.5;
        double pereira_lacelia=64.8;
        double pereira_virginia=30.7;
        double pereira_marsella=33.0;
        double pereira_mistrato=87.5;
        double pereira_pereira=5.0;
        double pereira_pueblorico=90.7;
        double pereira_quinchia=95.8;
        double pereira_santarosa=14.3;
        double pereira_santuario=64.2;

        double pueblorico_apia=26.2;
        double pueblorico_balboa=64.6;
        double pueblorico_belen=65.5;
        double pueblorico_dosque=93.7;
        double pueblorico_guatica=84.5;
        double pueblorico_lacelia=48.9;
        double pueblorico_virginia=59.7;
        double pueblorico_marsella=113.0;
        double pueblorico_mistrato=81.5;
        double pueblorico_pereira=90.5;
        double pueblorico_pueblorico=5.0;
        double pueblorico_quinchia=103.0;
        double pueblorico_santarosa=103.0;
        double pueblorico_santuario=34.3;

        double quinchia_apia=77.4;
        double quinchia_balboa=94.7;
        double quinchia_belen=52.4;
        double quinchia_dosque=91.9;
        double quinchia_guatica=22.8;
        double quinchia_lacelia=110.0;
        double quinchia_virginia=78.7;
        double quinchia_marsella=96.2;
        double quinchia_mistrato=57.9;
        double quinchia_pereira=93.8;
        double quinchia_pueblorico=103.0;
        double quinchia_quinchia=5.0;
        double quinchia_santarosa=83.2;
        double quinchia_santuario=109.0;

        double santarosa_apia=76.7;
        double santarosa_balboa=60.8;
        double santarosa_belen=82.6;
        double santarosa_dosque=10.3;
        double santarosa_guatica=85.4;
        double santarosa_lacelia=75.8;
        double santarosa_virginia=41.7;
        double santarosa_marsella=43.6;
        double santarosa_mistrato=98.5;
        double santarosa_pereira=12.3;
        double santarosa_pueblorico=102.0;
        double santarosa_quinchia=83.5;
        double santarosa_santarosa=5.0;
        double santarosa_santuario=75.2;

        double santuario_apia=15.3;
        double santuario_balboa=38.3;
        double santuario_belen=71.4;
        double santuario_dosque=67.4;
        double santuario_guatica=73.5;
        double santuario_lacelia=22.6;
        double santuario_virginia=33.4;
        double santuario_marsella=86.6;
        double santuario_mistrato=70.6;
        double santuario_pereira=64.2;
        double santuario_pueblorico=34.5;
        double santuario_quinchia=109.0;
        double santuario_santarosa=76.4;
        double santuario_santuario=5.0;
        
        double acum=0;

        for(int i=1;i<=cant_paradas;i++){
            System.out.println("ingrese las parada "+i);
            System.out.println("elija con numeros cual es el municipio que inicio el recorrido ");
            System.out.println("1. Apia, 2.Balboa, 3. Belen de umbria, 4. dosquebradas, 5. guatica");
            System.out.println("6. la celia, 7. La virginia, 8. marsella, 9. mistrato, 10. Pereira");
            System.out.println("11.pueblo rico, 12. quinchia, 13. santa rosa de cabal, 14. santuario");
            int parada=entrada.nextInt();

            if(parada_anterior==1 && parada==1){
                double total_recorrido=apia_apia;
            }else if(parada_anterior==1 && parada==2){
                double total_recorrido=apia_balboa;
            }else if(parada_anterior==1 && parada==3){
                double total_recorrido=apia_belen;
            }else if(parada_anterior==1 && parada==4){
                double total_recorrido=apia_dosque;
            }else if(parada_anterior==1 && parada==5){
                double total_recorrido=apia_guatica;
            }else if(parada_anterior==1 && parada==6){
                double total_recorrido=apia_lacelia;
            }else if(parada_anterior==1 && parada==7){
                double total_recorrido=apia_virginia;
            }else if(parada_anterior==1 && parada==8){
                double total_recorrido=apia_marsella;
            }else if(parada_anterior==1 && parada==9){
                double total_recorrido=apia_mistrato;
            }else if(parada_anterior==1 && parada==10){
                double total_recorrido=apia_pereira;
            }else if(parada_anterior==1 && parada==11){
                double total_recorrido=apia_pueblorico;
            }else if(parada_anterior==1 && parada==12){
                double total_recorrido=apia_quinchia;
            }else if(parada_anterior==1 && parada==13){
                double total_recorrido=apia_santarosa;
            }else if(parada_anterior==1 && parada==14){
                double total_recorrido=apia_santuario;
            }

             if(parada_anterior==2 && parada==1){
                double total_recorrido=balboa_apia;
            }else if(parada_anterior==2 && parada==2){
                double total_recorrido=balboa_balboa;
            }else if(parada_anterior==2 && parada==3){
                double total_recorrido=balboa_belen;
            }else if(parada_anterior==2 && parada==4){
                double total_recorrido=balboa_dosque;
            }else if(parada_anterior==2 && parada==5){
                double total_recorrido=balboa_guatica;
            }else if(parada_anterior==2 && parada==6){
                double total_recorrido=balboa_lacelia;
            }else if(parada_anterior==2 && parada==7){
                double total_recorrido=balboa_virginia;
            }else if(parada_anterior==2 && parada==8){
                double total_recorrido=balboa_marsella;
            }else if(parada_anterior==2 && parada==9){
                double total_recorrido=balboa_mistrato;
            }else if(parada_anterior==2 && parada==10){
                double total_recorrido=balboa_pereira;
            }else if(parada_anterior==2 && parada==11){
                double total_recorrido=balboa_pueblorico;
            }else if(parada_anterior==2 && parada==12){
                double total_recorrido=balboa_quinchia;
            }else if(parada_anterior==2 && parada==13){
                double total_recorrido=balboa_santarosa;
            }else if(parada_anterior==2 && parada==14){
                double total_recorrido=balboa_santuario;
            }

            if(parada_anterior==3 && parada==1){
                double total_recorrido=belen_apia;
            }else if(parada_anterior==3 && parada==2){
                double total_recorrido=belen_balboa;
            }else if(parada_anterior==3 && parada==3){
                double total_recorrido=belen_belen;
            }else if(parada_anterior==3 && parada==4){
                double total_recorrido=belen_dosque;
            }else if(parada_anterior==3 && parada==5){
                double total_recorrido=belen_guatica;
            }else if(parada_anterior==3 && parada==6){
                double total_recorrido=belen_lacelia;
            }else if(parada_anterior==3 && parada==7){
                double total_recorrido=belen_virginia;
            }else if(parada_anterior==3 && parada==8){
                double total_recorrido=belen_marsella;
            }else if(parada_anterior==3 && parada==9){
                double total_recorrido=belen_mistrato;
            }else if(parada_anterior==3 && parada==10){
                double total_recorrido=belen_pereira;
            }else if(parada_anterior==3 && parada==11){
                double total_recorrido=belen_pueblorico;
            }else if(parada_anterior==3 && parada==12){
                double total_recorrido=belen_quinchia;
            }else if(parada_anterior==3 && parada==13){
                double total_recorrido=belen_santarosa;
            }else if(parada_anterior==3 && parada==14){
                double total_recorrido=belen_santuario;
            }

            if(parada_anterior==4 && parada==1){
                double total_recorrido=dosque_apia;
            }else if(parada_anterior==4 && parada==2){
                double total_recorrido=dosque_balboa;
            }else if(parada_anterior==4 && parada==3){
                double total_recorrido=dosque_belen;
            }else if(parada_anterior==4 && parada==4){
                double total_recorrido=dosque_dosque;
            }else if(parada_anterior==4 && parada==5){
                double total_recorrido=dosque_guatica;
            }else if(parada_anterior==4 && parada==6){
                double total_recorrido=dosque_lacelia;
            }else if(parada_anterior==4 && parada==7){
                double total_recorrido=dosque_virginia;
            }else if(parada_anterior==4 && parada==8){
                double total_recorrido=dosque_marsella;
            }else if(parada_anterior==4 && parada==9){
                double total_recorrido=dosque_mistrato;
            }else if(parada_anterior==4 && parada==10){
                double total_recorrido=dosque_pereira;
            }else if(parada_anterior==4 && parada==11){
                double total_recorrido=dosque_pueblorico;
            }else if(parada_anterior==4 && parada==12){
                double total_recorrido=dosque_quinchia;
            }else if(parada_anterior==4 && parada==13){
                double total_recorrido=dosque_santarosa;
            }else if(parada_anterior==4 && parada==14){
                double total_recorrido=dosque_santuario;
            }

            if(parada_anterior==5 && parada==1){
                double total_recorrido=guatica_apia;
            }else if(parada_anterior==5 && parada==2){
                double total_recorrido=guatica_balboa;
            }else if(parada_anterior==5 && parada==3){
                double total_recorrido=guatica_belen;
            }else if(parada_anterior==5 && parada==4){
                double total_recorrido=guatica_dosque;
            }else if(parada_anterior==5 && parada==5){
                double total_recorrido=guatica_guatica;
            }else if(parada_anterior==5 && parada==6){
                double total_recorrido=guatica_lacelia;
            }else if(parada_anterior==5 && parada==7){
                double total_recorrido=guatica_virginia;
            }else if(parada_anterior==5 && parada==8){
                double total_recorrido=guatica_marsella;
            }else if(parada_anterior==5 && parada==9){
                double total_recorrido=guatica_mistrato;
            }else if(parada_anterior==5 && parada==10){
                double total_recorrido=guatica_pereira;
            }else if(parada_anterior==5 && parada==11){
                double total_recorrido=guatica_pueblorico;
            }else if(parada_anterior==5 && parada==12){
                double total_recorrido=guatica_quinchia;
            }else if(parada_anterior==5 && parada==13){
                double total_recorrido=guatica_santarosa;
            }else if(parada_anterior==5 && parada==14){
                double total_recorrido=guatica_santuario;
            }

            if(parada_anterior==6 && parada==1){
                double total_recorrido=lacelia_apia;
            }else if(parada_anterior==6 && parada==2){
                double total_recorrido=lacelia_balboa;
            }else if(parada_anterior==6 && parada==3){
                double total_recorrido=lacelia_belen;
            }else if(parada_anterior==6 && parada==4){
                double total_recorrido=lacelia_dosque;
            }else if(parada_anterior==6 && parada==5){
                double total_recorrido=lacelia_guatica;
            }else if(parada_anterior==6 && parada==6){
                double total_recorrido=lacelia_lacelia;
            }else if(parada_anterior==6 && parada==7){
                double total_recorrido=lacelia_virginia;
            }else if(parada_anterior==6 && parada==8){
                double total_recorrido=lacelia_marsella;
            }else if(parada_anterior==6 && parada==9){
                double total_recorrido=lacelia_mistrato;
            }else if(parada_anterior==6 && parada==10){
                double total_recorrido=lacelia_pereira;
            }else if(parada_anterior==6 && parada==11){
                double total_recorrido=lacelia_pueblorico;
            }else if(parada_anterior==6 && parada==12){
                double total_recorrido=lacelia_quinchia;
            }else if(parada_anterior==6 && parada==13){
                double total_recorrido=lacelia_santarosa;
            }else if(parada_anterior==6 && parada==14){
                double total_recorrido=lacelia_santuario;
            }

            if(parada_anterior==7 && parada==1){
                double total_recorrido=virginia_apia;
            }else if(parada_anterior==7 && parada==2){
                double total_recorrido=virginia_balboa;
            }else if(parada_anterior==7 && parada==3){
                double total_recorrido=virginia_belen;
            }else if(parada_anterior==7 && parada==4){
                double total_recorrido=virginia_dosque;
            }else if(parada_anterior==7 && parada==5){
                double total_recorrido=virginia_guatica;
            }else if(parada_anterior==7 && parada==6){
                double total_recorrido=virginia_lacelia;
            }else if(parada_anterior==7 && parada==7){
                double total_recorrido=virginia_virginia;
            }else if(parada_anterior==7 && parada==8){
                double total_recorrido=virginia_marsella;
            }else if(parada_anterior==7 && parada==9){
                double total_recorrido=virginia_mistrato;
            }else if(parada_anterior==7 && parada==10){
                double total_recorrido=virginia_pereira;
            }else if(parada_anterior==7 && parada==11){
                double total_recorrido=virginia_pueblorico;
            }else if(parada_anterior==7 && parada==12){
                double total_recorrido=virginia_quinchia;
            }else if(parada_anterior==7 && parada==13){
                double total_recorrido=virginia_santarosa;
            }else if(parada_anterior==7 && parada==14){
                double total_recorrido=virginia_santuario;
            }

            if(parada_anterior==8 && parada==1){
                double total_recorrido=marsella_apia;
            }else if(parada_anterior==8 && parada==2){
                double total_recorrido=marsella_balboa;
            }else if(parada_anterior==8 && parada==3){
                double total_recorrido=marsella_belen;
            }else if(parada_anterior==8 && parada==4){
                double total_recorrido=marsella_dosque;
            }else if(parada_anterior==8 && parada==5){
                double total_recorrido=marsella_guatica;
            }else if(parada_anterior==8 && parada==6){
                double total_recorrido=marsella_lacelia;
            }else if(parada_anterior==8 && parada==7){
                double total_recorrido=marsella_virginia;
            }else if(parada_anterior==8 && parada==8){
                double total_recorrido=marsella_marsella;
            }else if(parada_anterior==8 && parada==9){
                double total_recorrido=marsella_mistrato;
            }else if(parada_anterior==8 && parada==10){
                double total_recorrido=marsella_pereira;
            }else if(parada_anterior==8 && parada==11){
                double total_recorrido=marsella_pueblorico;
            }else if(parada_anterior==8 && parada==12){
                double total_recorrido=marsella_quinchia;
            }else if(parada_anterior==8 && parada==13){
                double total_recorrido=marsella_santarosa;
            }else if(parada_anterior==8 && parada==14){
                double total_recorrido=marsella_santuario;
            }

            if(parada_anterior==9 && parada==1){
                double total_recorrido=mistrato_apia;
            }else if(parada_anterior==9 && parada==2){
                double total_recorrido=mistrato_balboa;
            }else if(parada_anterior==9 && parada==3){
                double total_recorrido=mistrato_belen;
            }else if(parada_anterior==9 && parada==4){
                double total_recorrido=mistrato_dosque;
            }else if(parada_anterior==9 && parada==5){
                double total_recorrido=mistrato_guatica;
            }else if(parada_anterior==9 && parada==6){
                double total_recorrido=mistrato_lacelia;
            }else if(parada_anterior==9 && parada==7){
                double total_recorrido=mistrato_virginia;
            }else if(parada_anterior==9 && parada==8){
                double total_recorrido=mistrato_marsella;
            }else if(parada_anterior==9 && parada==9){
                double total_recorrido=mistrato_mistrato;
            }else if(parada_anterior==9 && parada==10){
                double total_recorrido=mistrato_pereira;
            }else if(parada_anterior==9 && parada==11){
                double total_recorrido=mistrato_pueblorico;
            }else if(parada_anterior==9 && parada==12){
                double total_recorrido=mistrato_quinchia;
            }else if(parada_anterior==9 && parada==13){
                double total_recorrido=mistrato_santarosa;
            }else if(parada_anterior==9 && parada==14){
                double total_recorrido=mistrato_santuario;
            }

            if(parada_anterior==10 && parada==1){
                double total_recorrido=pereira_apia;
            }else if(parada_anterior==10 && parada==2){
                double total_recorrido=pereira_balboa;
            }else if(parada_anterior==10 && parada==3){
                double total_recorrido=pereira_belen;
            }else if(parada_anterior==10 && parada==4){
                double total_recorrido=pereira_dosque;
            }else if(parada_anterior==10 && parada==5){
                double total_recorrido=pereira_guatica;
            }else if(parada_anterior==10 && parada==6){
                double total_recorrido=pereira_lacelia;
            }else if(parada_anterior==10 && parada==7){
                double total_recorrido=pereira_virginia;
            }else if(parada_anterior==10 && parada==8){
                double total_recorrido=pereira_marsella;
            }else if(parada_anterior==10 && parada==9){
                double total_recorrido=pereira_mistrato;
            }else if(parada_anterior==10 && parada==10){
                double total_recorrido=pereira_pereira;
            }else if(parada_anterior==10 && parada==11){
                double total_recorrido=pereira_pueblorico;
            }else if(parada_anterior==10 && parada==12){
                double total_recorrido=pereira_quinchia;
            }else if(parada_anterior==10 && parada==13){
                double total_recorrido=pereira_santarosa;
            }else if(parada_anterior==10 && parada==14){
                double total_recorrido=pereira_santuario;
            }

            if(parada_anterior==11 && parada==1){
                double total_recorrido=pueblorico_apia;
            }else if(parada_anterior==11 && parada==2){
                double total_recorrido=pueblorico_balboa;
            }else if(parada_anterior==11 && parada==3){
                double total_recorrido=pueblorico_belen;
            }else if(parada_anterior==11 && parada==4){
                double total_recorrido=pueblorico_dosque;
            }else if(parada_anterior==11 && parada==5){
                double total_recorrido=pueblorico_guatica;
            }else if(parada_anterior==11 && parada==6){
                double total_recorrido=pueblorico_lacelia;
            }else if(parada_anterior==11 && parada==7){
                double total_recorrido=pueblorico_virginia;
            }else if(parada_anterior==11 && parada==8){
                double total_recorrido=pueblorico_marsella;
            }else if(parada_anterior==11 && parada==9){
                double total_recorrido=pueblorico_mistrato;
            }else if(parada_anterior==11 && parada==10){
                double total_recorrido=pueblorico_pereira;
            }else if(parada_anterior==11 && parada==11){
                double total_recorrido=pueblorico_pueblorico;
            }else if(parada_anterior==11 && parada==12){
                double total_recorrido=pueblorico_quinchia;
            }else if(parada_anterior==11 && parada==13){
                double total_recorrido=pueblorico_santarosa;
            }else if(parada_anterior==11 && parada==14){
                double total_recorrido=pueblorico_santuario;
            }

            if(parada_anterior==12 && parada==1){
                double total_recorrido=quinchia_apia;
            }else if(parada_anterior==12 && parada==2){
                double total_recorrido=quinchia_balboa;
            }else if(parada_anterior==12 && parada==3){
                double total_recorrido=quinchia_belen;
            }else if(parada_anterior==12 && parada==4){
                double total_recorrido=quinchia_dosque;
            }else if(parada_anterior==12 && parada==5){
                double total_recorrido=quinchia_guatica;
            }else if(parada_anterior==12 && parada==6){
                double total_recorrido=quinchia_lacelia;
            }else if(parada_anterior==12 && parada==7){
                double total_recorrido=quinchia_virginia;
            }else if(parada_anterior==12 && parada==8){
                double total_recorrido=quinchia_marsella;
            }else if(parada_anterior==12 && parada==9){
                double total_recorrido=quinchia_mistrato;
            }else if(parada_anterior==12 && parada==10){
                double total_recorrido=quinchia_pereira;
            }else if(parada_anterior==12 && parada==11){
                double total_recorrido=quinchia_pueblorico;
            }else if(parada_anterior==12 && parada==12){
                double total_recorrido=quinchia_quinchia;
            }else if(parada_anterior==12 && parada==13){
                double total_recorrido=quinchia_santarosa;
            }else if(parada_anterior==12 && parada==14){
                double total_recorrido=quinchia_santuario;
            }

            if(parada_anterior==13 && parada==1){
                double total_recorrido=santarosa_apia;
            }else if(parada_anterior==13 && parada==2){
                double total_recorrido=santarosa_balboa;
            }else if(parada_anterior==13 && parada==3){
                double total_recorrido=santarosa_belen;
            }else if(parada_anterior==13 && parada==4){
                double total_recorrido=santarosa_dosque;
            }else if(parada_anterior==13 && parada==5){
                double total_recorrido=santarosa_guatica;
            }else if(parada_anterior==13 && parada==6){
                double total_recorrido=santarosa_lacelia;
            }else if(parada_anterior==13 && parada==7){
                double total_recorrido=santarosa_virginia;
            }else if(parada_anterior==13 && parada==8){
                double total_recorrido=santarosa_marsella;
            }else if(parada_anterior==13 && parada==9){
                double total_recorrido=santarosa_mistrato;
            }else if(parada_anterior==13 && parada==10){
                double total_recorrido=santarosa_pereira;
            }else if(parada_anterior==13 && parada==11){
                double total_recorrido=santarosa_pueblorico;
            }else if(parada_anterior==13 && parada==12){
                double total_recorrido=santarosa_quinchia;
            }else if(parada_anterior==13 && parada==13){
                double total_recorrido=santarosa_santarosa;
            }else if(parada_anterior==13 && parada==14){
                double total_recorrido=santarosa_santuario;
            }

            if(parada_anterior==14 && parada==1){
                double total_recorrido=santuario_apia;
            }else if(parada_anterior==14 && parada==2){
                double total_recorrido=santuario_balboa;
            }else if(parada_anterior==14 && parada==3){
                double total_recorrido=santuario_belen;
            }else if(parada_anterior==14 && parada==4){
                double total_recorrido=santuario_dosque;
            }else if(parada_anterior==14 && parada==5){
                double total_recorrido=santuario_guatica;
            }else if(parada_anterior==14 && parada==6){
                double total_recorrido=santuario_lacelia;
            }else if(parada_anterior==14 && parada==7){
                double total_recorrido=santuario_virginia;
            }else if(parada_anterior==14 && parada==8){
                double total_recorrido=santuario_marsella;
            }else if(parada_anterior==14 && parada==9){
                double total_recorrido=santuario_mistrato;
            }else if(parada_anterior==14 && parada==10){
                double total_recorrido=santuario_pereira;
            }else if(parada_anterior==14 && parada==11){
                double total_recorrido=santuario_pueblorico;
            }else if(parada_anterior==14 && parada==12){
                double total_recorrido=santuario_quinchia;
            }else if(parada_anterior==14 && parada==13){
                double total_recorrido=santuario_santarosa;
            }else if(parada_anterior==14 && parada==14){
                double total_recorrido=santuario_santuario;
            }

          

        }
        double division = (double)total_recorrido/km;
        double total=division*litros;
        System.out.println("ESTE ES EL TOTAL QUE SE GASTA "+total);

        
        

    }
}        
