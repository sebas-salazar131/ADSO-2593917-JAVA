import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Formato extends JFrame {
    public String valor="";
   
    public Formato(){
        initComponent();
    }
	public void initComponent(){

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();
		
		setSize( tamanio.width/2 , tamanio.height/2 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo( null );
		setTitle( "Formato Moneda");
        setVisible( true );

		JPanel contenedor = new JPanel();
		contenedor.setLayout( new GridLayout(2,1) );
		contenedor.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );

        JPanel minicont = new JPanel();
        minicont.setLayout(new GridLayout(1,3));


        JLabel cantidad= new JLabel("Cantidad: ");
        JLabel signo= new JLabel();
        JLabel total=new JLabel();
        JLabel error=new JLabel();
        JTextField moneda = new JTextField();
		moneda.setColumns(10);
        JButton  btn= new JButton("Ejecutar");

        minicont.add(cantidad);
        minicont.add(moneda);
        minicont.add(btn);
        

        
        // minicont2.add(moneda);

         
                 

        ActionListener evento_validar= new ActionListener(){

            public void actionPerformed(ActionEvent e){
                valor=moneda.getText();
                double convertir= Double.parseDouble(valor);
                String patron= "#,###.##";
                DecimalFormat formato=new DecimalFormat(patron);
                total.setText("$"+formato.format(convertir));

                if(valor== ""){
                    error.setText("---Dato Invalido---");
                }
            }
        };
        btn.addActionListener(evento_validar); 
        contenedor.add(minicont);
        contenedor.add(total);

        add(contenedor);
        revalidate();
        pack(); 
    } 
  
}       