import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;


public class Factura extends JFrame{

	// Atributos
	// private Persona listaClientes [];
	// private Persona listaVendedores [];
	// private JLabel etq_datos_cliente;
	// private JLabel etq_cedula_cliente;
	// private JLabel etq_nombres_cliente;
	// private JLabel etq_direccion_cliente;
	// private JLabel etq_datos_vendedor;
	// private JLabel etq_vendedor_cliente;
	// private JLabel etq_nombres_vendedor;
	// private JLabel etq_datos_productos;
	// private JLabel etq_id_producto;
	// private JLabel etq_nombre_producto;
	// private JLabel etq_cant_producto;
	// private JLabel etq_btn_producto;
	// private JLabel etq_resultado;
	// private JLabel etq_total;
	// private JTextField input_cedula_cliente;
	// private JTextField input_nombres_cliente;
	// private JTextField input_direccion_cliente;
	// private JTextField input_cedula_vendedor;
	// private JTextField input_nombres_vendedor;
	// private JTextField input_id_producto;
	// private JTextField input_nombre_producto;
	// private JTextField input_cant_producto;
	// private JButton btn_buscar_cliente;
	// private JButton btn_buscar_vendedor;
	// private JButton btn_add_producto;

	// Metodos
	public Factura(){
		// this.listaClientes = listaClientes;
		// this.listaVendedores = listaVendedores;

		initComponent();
	}

	public void initComponent(){

		Toolkit sistema = Toolkit.getDefaultToolkit();
		Dimension tamanio = sistema.getScreenSize();

		setTitle("FACTURA");
		setSize( ((int) (tamanio.width*0.4)) , ((int) (tamanio.height*0.9)) );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);
        setVisible(true);
		
		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(20, 20, 20, 10) );
		GridBagConstraints restriccion = new GridBagConstraints();

		JLabel etq_datos_cliente = new JLabel("DATOS CLIENTE:");
		etq_datos_cliente.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_cliente.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_cliente, restriccion );

		JLabel etq_cedula_cliente = new JLabel("CEDULA:");
		restriccion.gridy = 1;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cedula_cliente, restriccion );

		JTextField input_cedula_cliente= new JTextField();
		input_cedula_cliente.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy=1;
		restriccion.gridx=1;
		restriccion.gridheight=1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 2;
		restriccion.weightx = 80;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula_cliente, restriccion );

		JButton btn_buscar_cliente = new JButton("BUSCAR");
		restriccion.gridy = 1;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar_cliente, restriccion );

		JLabel label_nombres=new JLabel("Nombres");
		restriccion.gridy = 2;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(label_nombres, restriccion);

		JTextField campo_cedula_nombre=new JTextField();
		campo_cedula_nombre.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy=2;
		restriccion.gridx=1;
		restriccion.gridheight=1;
		restriccion.gridwidth=3;
		restriccion.weightx=2;
		restriccion.weighty=10;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(campo_cedula_nombre, restriccion);

		JLabel label_direccion=new JLabel("Direccion:");
		restriccion.gridy = 3;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(label_direccion, restriccion);

		JTextField campo_direccion_clientes=new JTextField();
		campo_direccion_clientes.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy=3;
		restriccion.gridx=1;
		restriccion.gridheight=1;
		restriccion.gridwidth=3;
		restriccion.weightx=2;
		restriccion.weighty=10;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(campo_direccion_clientes, restriccion);

		JLabel etq_datos_vendedor = new JLabel("DATOS VENDEDOR:");
		etq_datos_vendedor.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_datos_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 4;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_datos_vendedor, restriccion );

		JLabel etq_cedula_vendedor = new JLabel("CEDULA:");
		restriccion.gridy = 5;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cedula_vendedor, restriccion );

		JTextField input_cedula_vendedor= new JTextField();
		input_cedula_vendedor.setBorder( BorderFactory.createEmptyBorder(0, 10, 0, 10) );
		restriccion.gridy=5;
		restriccion.gridx=1;
		restriccion.gridheight=1;
		restriccion.gridwidth = 2;
		restriccion.weighty = 2;
		restriccion.weightx = 20;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cedula_vendedor, restriccion );

		JButton btn_buscar_vendedor = new JButton("BUSCAR");
		restriccion.gridy = 5;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_buscar_vendedor, restriccion );

		JLabel label_nombres_vendedor=new JLabel("Vendedor:");
		restriccion.gridy = 6;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(label_nombres_vendedor, restriccion);

		JTextField campo_nombres_vendedor=new JTextField();
		campo_nombres_vendedor.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy=6;
		restriccion.gridx=1;
		restriccion.gridheight=1;
		restriccion.gridwidth=3;
		restriccion.weightx=2;
		restriccion.weighty=10;
		restriccion.insets = new Insets(10, 10, 10, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add(campo_nombres_vendedor, restriccion);

		JLabel label_productos = new JLabel("PRODUCTOS:");
		label_productos.setFont( new Font("Arial", Font.BOLD, 20) );
		label_productos.setBorder( BorderFactory.createEmptyBorder(0, 0, 10, 0) );
		restriccion.gridy = 7;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( label_productos, restriccion );

		JLabel etq_id_producto = new JLabel("ID");
		etq_id_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_id_producto, restriccion );

		JLabel etq_nombre_producto = new JLabel("NOMBRE");
		etq_nombre_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_nombre_producto, restriccion );

		JLabel etq_cant_producto = new JLabel("CANT.");
		etq_cant_producto.setHorizontalAlignment( JLabel.CENTER );
		restriccion.gridy = 8;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_cant_producto, restriccion );

		JTextField input_id_producto = new JTextField();
		restriccion.gridy = 9;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_id_producto, restriccion );

		JTextField input_nombre_producto = new JTextField();
		restriccion.gridy = 9;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 70;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_nombre_producto, restriccion );

		JTextField input_cant_producto = new JTextField();
		restriccion.gridy = 9;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 0, 0, 0);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( input_cant_producto, restriccion );

		JButton btn_add_producto = new JButton("ADD");
		restriccion.gridy = 9;
		restriccion.gridx = 3;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 2;
		restriccion.weightx = 10;
		restriccion.insets = new Insets(0, 10, 0, 10);
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( btn_add_producto, restriccion );

		JLabel etq_resultado = new JLabel(" ---- ");
		etq_resultado.setHorizontalAlignment( JLabel.RIGHT );
		etq_resultado.setVerticalAlignment( JLabel.TOP );
		etq_resultado.setFont( new Font("Arial", Font.BOLD, 10) );
		etq_resultado.setOpaque(true);
		etq_resultado.setBackground( Color.white );
		etq_resultado.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
		restriccion.gridy = 10;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 89;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		restriccion.insets = new Insets(10, 0, 0, 10);
		contPrincipal.add( etq_resultado, restriccion );

		JLabel etq_total = new JLabel("Total: $ 0");
		etq_total.setHorizontalAlignment( JLabel.RIGHT );
		etq_total.setFont( new Font("Arial", Font.BOLD, 20) );
		etq_total.setOpaque(true);
		etq_total.setBackground( Color.white );
		etq_total.setBorder( BorderFactory.createEmptyBorder(5, 10, 5, 10) );
		restriccion.gridy = 11;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 4;
		restriccion.weighty = 2;
		restriccion.weightx = 100;
		restriccion.fill = GridBagConstraints.BOTH;
		restriccion.insets = new Insets(0, 0, 0, 10);
		contPrincipal.add( etq_total, restriccion );

		// this.input_nombres_cliente.setEnabled(false);
		// this.input_direccion_cliente.setEnabled(false);
		// deshabilitarInput(this.input_nombres_cliente);
		// deshabilitarInput(this.input_direccion_cliente);

		add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint();
    }
}        