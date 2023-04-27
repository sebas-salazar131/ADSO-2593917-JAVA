import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Quiz extends JFrame {
    public int cont;
    public int guardar_cedulas[];
    public String guardar_nombres[];
    public String guardar_direccion[];
    public boolean encontrar;
    

    
    public Quiz(){
        this.cont=0;
        this.guardar_cedulas= new int [20];
        this.guardar_nombres=new String[20];
        this.guardar_direccion=new String[20];
        this.encontrar=true;
        
        initComponent();
    }

    public void initComponent(){
        Toolkit sistema = Toolkit.getDefaultToolkit();
        Dimension tamanio = sistema.getScreenSize();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(tamanio.width/2, tamanio.height);
        setTitle("Calculadora");

        //contenedor padre
        JPanel contenedor = new JPanel();
        contenedor.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        contenedor.setLayout(new GridLayout(9,1));

        //contenedores hijos

        JPanel hijo1= new JPanel();
        hijo1.setLayout(new GridLayout(1,1));
        JLabel datos = new JLabel("Datos Cliente: ");
        hijo1.add(datos);
       
        JPanel hijo2= new JPanel();
        hijo2.setLayout(new GridLayout(1,3));
        // hijo2.setBorder(BorderFactory.createEmptyBorder(40,0,40,0));
        JLabel cedula= new JLabel("Cedula: ");
        JTextField campo_cedula = new JTextField();
        JButton btn1 = new JButton("Buscar");
        hijo2.add(cedula);
        hijo2.add(campo_cedula);
        hijo2.add(btn1);


        JPanel hijo3= new JPanel();
        hijo3.setLayout(new GridLayout(2,2));
        JLabel nombres= new JLabel("Nombres: ");
        JTextArea direccion= new JTextArea();
   
        JLabel campo_nombres= new JLabel("Direccion: ");
        JTextArea campo_direccion= new JTextArea();
        direccion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        campo_direccion.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        hijo3.add(nombres);
        hijo3.add(direccion);
        hijo3.add(campo_nombres);
        hijo3.add(campo_direccion);


        JPanel hijo4= new JPanel();
        hijo4.setLayout(new GridLayout(1,1));
        JLabel vendedor = new JLabel("Datos Vendedor: ");
        hijo4.add(vendedor);

        JPanel hijo5= new JPanel();
        hijo5.setLayout(new GridLayout(1,3));
        JLabel cedula_vendedor = new JLabel("Cedula: ");
        JTextField campo_cedula_vendedor= new JTextField();
        JButton btn2 = new JButton("Buscar: ");
        hijo5.add(cedula_vendedor);
        hijo5.add(campo_cedula_vendedor);
        hijo5.add(btn2);

        JPanel hijo6= new JPanel();
        hijo6.setLayout(new GridLayout(1,2));
        JLabel nombres_vendedor= new JLabel("Nombre: ");
        JTextArea campo_nombres_vendedor=new JTextArea();
        campo_nombres_vendedor.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        hijo6.add(nombres_vendedor);
        hijo6.add(campo_nombres_vendedor);

        JPanel hijo7= new JPanel();
        hijo7.setLayout(new GridLayout(1,1));
        JLabel productos =new JLabel("Productos: ");
        hijo7.add(productos);

        JPanel hijo8= new JPanel();
        hijo8.setLayout(new GridLayout(3,4));
        JLabel ide= new JLabel("ID");
        JLabel nombre_producto=new JLabel("Nombre");
        JLabel cant= new JLabel("Cant");
        JLabel nada= new JLabel(" ");
        JTextField campo_ide=new JTextField();
        JTextField campo_nombre_producto=new JTextField();
        JTextField campo_cant=new JTextField();
        JButton btn_agregar = new JButton("Agregar");
        JLabel resul_ide = new JLabel("---");
        JLabel resul_nombre = new JLabel("---");
        JLabel resul_cant = new JLabel("---");
        JLabel resultado_productos = new JLabel("---");

        hijo8.add(ide);
        hijo8.add(nombre_producto);
        hijo8.add(cant);
        hijo8.add(nada);
        hijo8.add(campo_ide);
        hijo8.add(campo_nombre_producto);
        hijo8.add(campo_cant);
        hijo8.add(btn_agregar);
        hijo8.add(resul_ide);
        hijo8.add(resul_nombre);
        hijo8.add(resul_cant);
        hijo8.add(resultado_productos);
        

        JPanel hijo9= new JPanel();
        hijo9.setLayout(new GridLayout(1,4));
        JLabel nada1= new JLabel("  ");
        JLabel nada2= new JLabel("  ");
        JLabel total= new JLabel("Total");
        JLabel campo_total= new JLabel("---");
        hijo9.add(nada1);
        hijo9.add(nada2);
        hijo9.add(total);
        hijo9.add(campo_total);


        ActionListener evento_buscar = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String campo1=campo_cedula.getText();
                int cedulas = Integer.parseInt(campo1);

                if(cedulas==1017144827){
                    String nombres_buscar="Juan Sebastian";
                    String direccion_buscar="MZ 1 CASA 17";
                    direccion.setText(nombres_buscar);
                    campo_direccion.setText(direccion_buscar);

                }else{
                    
                    for(int i=0; i<guardar_cedulas.length;i++){
                        if(cedulas==guardar_cedulas[i]){
                            direccion.setText(guardar_nombres[i]);
                            campo_direccion.setText(guardar_direccion[i]);
                        }else{
                            encontrar=false;
                        }
                        
                    }

                   if(encontrar==false){
                        for(int i=0; i<guardar_cedulas.length;i++){
                            if(guardar_nombres[i]==null){
                                guardar_cedulas[i]=cedulas;
                                guardar_nombres[i]=direccion.getText();
                                guardar_direccion[i]=campo_direccion.getText();
                                break;
                            }
                        }    
                   }
                   encontrar=true;
                    
                }
            }
        };
             
        btn1.addActionListener(evento_buscar);
        // btn2.addActionListener(evento_buscar2);

        contenedor.add(hijo1);
        contenedor.add(hijo2);
        contenedor.add(hijo3);
        contenedor.add(hijo4);
        contenedor.add(hijo5);
        contenedor.add(hijo6);
        contenedor.add(hijo7);
        contenedor.add(hijo8);
        contenedor.add(hijo9);

        add(contenedor);
        revalidate();
        pack();

    }
} 