import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.Border;
import java.awt.Font;
import java.util.Random;

public class Triki extends JFrame{
    JLabel tablero [][];
    char tablero_signos [][];
    int turno;
    JLabel ganador;
    int primera;
    public Triki(){
        initComponent();
    }

    public void initComponent(){
        Toolkit sistema=Toolkit.getDefaultToolkit();
        Dimension tamanio= sistema.getScreenSize();

        setTitle("Triki");
        setSize(300, 400) ;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridBagLayout());
        // contenedor.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 10));
        GridBagConstraints layout = new GridBagConstraints();


        tablero_signos=new char [3][3];
        tablero=new JLabel[3][3];

        for(int i=0; i<tablero.length;i++){
            for(int j=0; j<tablero.length;j++){
                tablero[i][j]=new JLabel("-");
                tablero[i][j].setFont(new Font("Arial", Font.BOLD, 20));
                tablero[i][j].setHorizontalAlignment(JLabel.CENTER);
                Border bordeCompleto = BorderFactory.createLineBorder(Color.RED, 0);
                Border bordeSuperior = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN); // Crea una línea superior
                Border bordeCompuesto = BorderFactory.createCompoundBorder(bordeCompleto, bordeSuperior); // Crea un borde compuesto
                tablero[i][j].setBorder(bordeCompuesto);
                layout.gridy=i;
                layout.gridx=j;
                layout.gridheight=1;
                layout.gridwidth=1;
                layout.weighty=1;
                layout.weightx=1;
                layout.fill=GridBagConstraints.BOTH;
                contenedor.add(tablero[i][j],layout);
            }
        }

        ganador= new JLabel();
        layout.gridy=4;
        layout.gridx=1;
        layout.gridheight=3;
        layout.gridwidth=2;
        layout.weighty=1;
        layout.weightx=2;
        layout.fill=GridBagConstraints.BOTH;
        contenedor.add(ganador,layout);

        MouseListener listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel label = (JLabel) e.getSource();


                 for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {


                        if(turno==0 && label.getText()=="-"){
                            label.setText("X");
                            turno=1;
                            verificar_ganador();
                        }else if(turno==1 && label.getText()=="-"){
                            label.setText("O");
                            turno=0;
                            verificar_ganador();
                        }


                    }
                }


                if(turno==1){
                    maquina();
                    turno=0;
                    verificar_ganador();
                }

            }
        };
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j].addMouseListener(listener);
            }
        } 

        

       
        

        add( contenedor );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

    }

    public void verificar_ganador(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero_signos[i][j]=tablero[i][j].getText().charAt(0);
            }
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero_signos[0][0]=='X' && tablero_signos[0][1]=='X' && tablero_signos[0][2]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[1][0]=='X' && tablero_signos[1][1]=='X' && tablero_signos[1][2]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[2][0]=='X' && tablero_signos[2][1]=='X' && tablero_signos[2][2]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[0][0]=='X' && tablero_signos[1][0]=='X' && tablero_signos[2][0]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[0][1]=='X' && tablero_signos[1][1]=='X' && tablero_signos[2][1]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[0][2]=='X' && tablero_signos[1][2]=='X' && tablero_signos[2][2]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[0][0]=='X' && tablero_signos[1][1]=='X' && tablero_signos[2][2]=='X'){
                    ganador.setText("Ganador jugador ");
                }else if(tablero_signos[0][2]=='X' && tablero_signos[1][1]=='X' && tablero_signos[2][0]=='X'){
                    ganador.setText("Ganador jugador ");
                }  

                if(tablero_signos[0][0]=='O' && tablero_signos[0][1]=='O' && tablero_signos[0][2]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[1][0]=='O' && tablero_signos[1][1]=='O' && tablero_signos[1][2]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[2][0]=='O' && tablero_signos[2][1]=='O' && tablero_signos[2][2]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][0]=='O' && tablero_signos[2][0]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[0][1]=='O' && tablero_signos[1][1]=='O' && tablero_signos[2][1]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][2]=='O' && tablero_signos[2][2]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][1]=='O' && tablero_signos[2][2]=='O'){
                    ganador.setText("Ganador Maquina");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][1]=='O' && tablero_signos[2][0]=='O'){
                    ganador.setText("Ganador Maquina");
                }
            }
        }
    }

    public void maquina(){
        if(primera==0){
            Random rand = new Random();
            int fila=rand.nextInt(3);
            int columna=rand.nextInt(3);
            while(tablero_signos[fila][columna]!='-'){
                fila=rand.nextInt(3);
                columna=rand.nextInt(3);
            }
            tablero[fila][columna].setText("O");
            primera=1;
        }
        
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                //DEFENSA
                    //HORIZONTAL
                if(tablero_signos[0][0]=='X' && tablero_signos[0][1]=='X' && tablero_signos[0][2]=='-'){
                    tablero[0][2].setText("O");
                }else if(tablero_signos[0][0]=='X' && tablero_signos[0][1]=='-' && tablero_signos[0][2]=='X'){
                    tablero[0][1].setText("O");
                }else if(tablero_signos[0][0]=='-' && tablero_signos[0][1]=='X' && tablero_signos[0][2]=='X'){
                    tablero[0][0].setText("O");

                }else if(tablero_signos[1][0]=='X' && tablero_signos[1][1]=='X' && tablero_signos[1][2]=='-'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[1][0]=='X' && tablero_signos[1][1]=='-' && tablero_signos[1][2]=='X'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[1][0]=='-' && tablero_signos[1][1]=='X' && tablero_signos[1][2]=='X'){
                    tablero[1][0].setText("O");

                }else if(tablero_signos[2][0]=='X' && tablero_signos[2][1]=='X' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[1][0]=='X' && tablero_signos[2][1]=='-' && tablero_signos[2][2]=='X'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[1][0]=='-' && tablero_signos[2][1]=='X' && tablero_signos[2][2]=='X'){
                    tablero[2][0].setText("O");
                    
                    //VERTICAL
                }else if(tablero_signos[0][0]=='X' && tablero_signos[1][0]=='X' && tablero_signos[2][0]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[0][0]=='X' && tablero_signos[1][0]=='-' && tablero_signos[2][0]=='X'){
                    tablero[1][0].setText("O");
                }else if(tablero_signos[0][0]=='-' && tablero_signos[1][0]=='X' && tablero_signos[2][0]=='X'){
                    tablero[0][0].setText("O");
                     
                }else if(tablero_signos[0][1]=='X' && tablero_signos[1][1]=='X' && tablero_signos[2][1]=='-'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[0][1]=='X' && tablero_signos[1][1]=='-' && tablero_signos[2][1]=='X'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][1]=='-' && tablero_signos[1][1]=='X' && tablero_signos[2][1]=='X'){
                    tablero[0][1].setText("O");
                     
                }else if(tablero_signos[0][2]=='X' && tablero_signos[1][2]=='X' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[0][2]=='X' && tablero_signos[1][2]=='-' && tablero_signos[2][2]=='X'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[0][2]=='-' && tablero_signos[1][2]=='X' && tablero_signos[2][2]=='X'){
                    tablero[0][2].setText("O");
                     
                    //DIAGONALES
                }else if(tablero_signos[0][0]=='X' && tablero_signos[1][1]=='X' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[0][0]=='X' && tablero_signos[1][1]=='-' && tablero_signos[2][2]=='X'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][0]=='-' && tablero_signos[1][1]=='X' && tablero_signos[2][2]=='X'){
                    tablero[0][0].setText("O");

                }else if(tablero_signos[0][2]=='X' && tablero_signos[1][1]=='X' && tablero_signos[2][0]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[0][2]=='X' && tablero_signos[1][1]=='-' && tablero_signos[2][0]=='X'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][2]=='-' && tablero_signos[1][1]=='X' && tablero_signos[2][0]=='X'){
                    tablero[0][2].setText("O");

                    //ATAQUE
                    //HORIZONTAL
                }else if(tablero_signos[0][0]=='O' && tablero_signos[0][1]=='O' && tablero_signos[0][2]=='-'){
                    tablero[0][2].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[0][1]=='-' && tablero_signos[0][2]=='O'){
                    tablero[0][1].setText("O");
                }else if(tablero_signos[0][0]=='-' && tablero_signos[0][1]=='O' && tablero_signos[0][2]=='O'){
                    tablero[0][0].setText("O");

                }else if(tablero_signos[1][0]=='O' && tablero_signos[1][1]=='O' && tablero_signos[1][2]=='-'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[1][0]=='O' && tablero_signos[1][1]=='-' && tablero_signos[1][2]=='O'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[1][0]=='-' && tablero_signos[1][1]=='O' && tablero_signos[1][2]=='O'){
                    tablero[1][0].setText("O");

                }else if(tablero_signos[2][0]=='O' && tablero_signos[2][1]=='O' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[1][0]=='O' && tablero_signos[2][1]=='-' && tablero_signos[2][2]=='O'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[1][0]=='-' && tablero_signos[2][1]=='O' && tablero_signos[2][2]=='O'){
                    tablero[2][0].setText("O");
                    
                    //VERTICAL
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][0]=='O' && tablero_signos[2][0]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][0]=='-' && tablero_signos[2][0]=='O'){
                    tablero[1][0].setText("O");
                }else if(tablero_signos[0][0]=='-' && tablero_signos[1][0]=='O' && tablero_signos[2][0]=='O'){
                    tablero[0][0].setText("O");
                     
                }else if(tablero_signos[0][1]=='O' && tablero_signos[1][1]=='O' && tablero_signos[2][1]=='-'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[0][1]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][1]=='O'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][1]=='-' && tablero_signos[1][1]=='O' && tablero_signos[2][1]=='O'){
                    tablero[0][1].setText("O");
                     
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][2]=='O' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][2]=='-' && tablero_signos[2][2]=='O'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[0][2]=='-' && tablero_signos[1][2]=='O' && tablero_signos[2][2]=='O'){
                    tablero[0][2].setText("O");
                     
                    //DIAGONALES
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][1]=='O' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][2]=='O'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][0]=='-' && tablero_signos[1][1]=='O' && tablero_signos[2][2]=='O'){
                    tablero[0][0].setText("O");

                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][1]=='O' && tablero_signos[2][0]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][0]=='O'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][2]=='-' && tablero_signos[1][1]=='O' && tablero_signos[2][0]=='O'){
                    tablero[0][2].setText("O");

                    //JUGADAS ESTRATEGICAS MAQUINA
                    //0.0
                }else if(tablero_signos[0][0]=='O' && tablero_signos[0][1]=='-' && tablero_signos[0][2]=='-'){
                    tablero[0][1].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[0][1]=='-' && tablero_signos[0][2]=='-'){
                    tablero[0][2].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[2][2]=='-' && tablero_signos[1][1]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][1]=='-' && tablero_signos[0][2]=='-'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][2]=='-'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][0]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");

                    //0.1
                }else if(tablero_signos[0][1]=='O' && tablero_signos[0][0]=='-' && tablero_signos[0][2]=='-'){
                    tablero[0][0].setText("O");
                }else if(tablero_signos[0][1]=='O' && tablero_signos[0][0]=='-' && tablero_signos[0][2]=='-'){
                    tablero[0][2].setText("O");
                }else if(tablero_signos[0][1]=='O' && tablero_signos[2][1]=='-' && tablero_signos[1][1]=='-'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[0][1]=='O' && tablero_signos[2][1]=='-' && tablero_signos[1][1]=='-'){
                    tablero[1][1].setText("O");

                    //0.2
                }else if(tablero_signos[0][2]=='O' && tablero_signos[0][1]=='-' && tablero_signos[0][0]=='-'){
                    tablero[0][1].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[0][1]=='-' && tablero_signos[0][0]=='-'){
                    tablero[0][0].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[2][2]=='-' && tablero_signos[1][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[2][2]=='-' && tablero_signos[1][2]=='-'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][0]=='-'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[0][2]=='O' && tablero_signos[1][1]=='-' && tablero_signos[2][0]=='-'){
                    tablero[2][0].setText("O");

                    //1.0
                }else if(tablero_signos[1][0]=='O' && tablero_signos[0][0]=='-' && tablero_signos[2][0]=='-'){
                    tablero[0][0].setText("O");
                }else if(tablero_signos[1][0]=='O' && tablero_signos[0][0]=='-' && tablero_signos[2][0]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[1][0]=='O' && tablero_signos[1][2]=='-' && tablero_signos[1][1]=='-'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[1][0]=='O' && tablero_signos[1][2]=='-' && tablero_signos[1][1]=='-'){
                    tablero[1][1].setText("O");

                    //1.1

                }else if(tablero_signos[1][1]=='O' && tablero_signos[0][0]=='-' && tablero_signos[2][2]=='-'){
                    tablero[0][0].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[0][0]=='-' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[0][2]=='-' && tablero_signos[1][0]=='-'){
                    tablero[0][2].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[0][2]=='-' && tablero_signos[1][0]=='-'){
                    tablero[1][0].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[0][1]=='-' && tablero_signos[2][1]=='-'){
                    tablero[0][1].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[0][1]=='-' && tablero_signos[2][1]=='-'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[1][0]=='-' && tablero_signos[1][2]=='-'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[1][1]=='O' && tablero_signos[1][0]=='-' && tablero_signos[1][2]=='-'){
                    tablero[1][0].setText("O");

                    //1.2
                }else if(tablero_signos[1][2]=='O' && tablero_signos[0][2]=='-' && tablero_signos[2][2]=='-'){
                    tablero[0][2].setText("O");
                }else if(tablero_signos[1][2]=='O' && tablero_signos[0][2]=='-' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[1][2]=='O' && tablero_signos[1][1]=='-' && tablero_signos[1][0]=='-'){
                    tablero[1][0].setText("O");
                }else if(tablero_signos[1][2]=='O' && tablero_signos[1][1]=='-' && tablero_signos[1][0]=='-'){
                    tablero[1][1].setText("O");

                    //2.0
                }else if(tablero_signos[2][0]=='O' && tablero_signos[0][0]=='-' && tablero_signos[1][0]=='-'){
                    tablero[1][0].setText("O");
                }else if(tablero_signos[2][0]=='O' && tablero_signos[0][0]=='-' && tablero_signos[1][0]=='-'){
                    tablero[0][0].setText("O");
                }else if(tablero_signos[2][0]=='O' && tablero_signos[2][2]=='-' && tablero_signos[2][1]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[2][0]=='O' && tablero_signos[2][2]=='-' && tablero_signos[2][1]=='-'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[2][0]=='O' && tablero_signos[0][2]=='-' && tablero_signos[1][1]=='-'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[2][0]=='O' && tablero_signos[0][2]=='-' && tablero_signos[1][1]=='-'){
                    tablero[0][2].setText("O");

                    //2.1
                }else if(tablero_signos[2][1]=='O' && tablero_signos[2][0]=='-' && tablero_signos[2][2]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[2][1]=='O' && tablero_signos[2][0]=='-' && tablero_signos[2][2]=='-'){
                    tablero[2][2].setText("O");
                }else if(tablero_signos[2][1]=='O' && tablero_signos[1][1]=='-' && tablero_signos[0][1]=='-'){
                    tablero[0][1].setText("O");
                }else if(tablero_signos[2][1]=='O' && tablero_signos[1][1]=='-' && tablero_signos[0][1]=='-'){
                    tablero[1][1].setText("O");

                    //2.2
                }else if(tablero_signos[2][2]=='O' && tablero_signos[0][0]=='-' && tablero_signos[1][1]=='-'){
                    tablero[1][1].setText("O");
                }else if(tablero_signos[2][2]=='O' && tablero_signos[0][0]=='-' && tablero_signos[1][1]=='-'){
                    tablero[0][0].setText("O");
                }else if(tablero_signos[2][2]=='O' && tablero_signos[2][0]=='-' && tablero_signos[2][1]=='-'){
                    tablero[2][0].setText("O");
                }else if(tablero_signos[2][2]=='O' && tablero_signos[2][0]=='-' && tablero_signos[2][1]=='-'){
                    tablero[2][1].setText("O");
                }else if(tablero_signos[2][2]=='O' && tablero_signos[0][2]=='-' && tablero_signos[1][2]=='-'){
                    tablero[1][2].setText("O");
                }else if(tablero_signos[2][2]=='O' && tablero_signos[0][2]=='-' && tablero_signos[1][2]=='-'){
                    tablero[0][2].setText("O");
                }        

                
                
            }
        }
    }

    
}