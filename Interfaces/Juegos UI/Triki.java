import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.Border;
import java.awt.Font;

public class Triki extends JFrame{
    JLabel tablero_logico [][];
    char tablero_signos [][];
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
        tablero_logico=new JLabel[3][3];

        for(int i=0; i<tablero_logico.length;i++){
            for(int j=0; j<tablero_logico.length;j++){
                tablero_logico[i][j]=new JLabel("-");
                tablero_logico[i][j].setFont(new Font("Arial", Font.BOLD, 20));
                tablero_logico[i][j].setHorizontalAlignment(JLabel.CENTER);
                Border bordeCompleto = BorderFactory.createLineBorder(Color.RED, 0);
                Border bordeSuperior = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN); // Crea una línea superior
                Border bordeCompuesto = BorderFactory.createCompoundBorder(bordeCompleto, bordeSuperior); // Crea un borde compuesto
                tablero_logico[i][j].setBorder(bordeCompuesto);
                layout.gridy=i;
                layout.gridx=j;
                layout.gridheight=1;
                layout.gridwidth=1;
                layout.weighty=1;
                layout.weightx=1;
                layout.fill=GridBagConstraints.BOTH;
                contenedor.add(tablero_logico[i][j],layout);
            }
        }

        

        add( contenedor );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();

    }
}