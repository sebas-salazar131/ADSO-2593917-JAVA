
package facturacion;

import Clientes.AgregarCliente;
import Clientes.ListarCliente;
import Clientes.ModificarCliente;
import Clientes.EliminarCliente;
import Clientes.Cliente;
import Vendedor.Vendedor;
import Producto.Producto;
import Vendedor.AgregarVendedor;
import Vendedor.ListarVendedor;
import Vendedor.ModificarVendedor;
import Vendedor.EliminarVendedor;
import Producto.AgregarProducto;
import Producto.MostrarProductos;


public class Inicio extends javax.swing.JFrame {
   
    public Cliente listaClientes[];
    public Vendedor listaVendedores[];
    public Producto listaProducto[];
    public Inicio() {
        this.listaClientes=new Cliente[10];
        this.listaVendedores=new Vendedor[10];
        this.listaProducto=new Producto[10];
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_cliente = new javax.swing.JPanel();
        btn_agregarCliente = new javax.swing.JButton();
        btn_listarCliente = new javax.swing.JButton();
        btn_modificarCliente = new javax.swing.JButton();
        btn_eliminarCliente = new javax.swing.JButton();
        eqt_titu_cliente = new javax.swing.JLabel();
        panel_vendedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        panel_producto = new javax.swing.JPanel();
        btn_agregarProducto = new javax.swing.JButton();
        btn_mostrarProducto = new javax.swing.JButton();
        etq_titu_factura = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        etq_titu_vendedor1 = new javax.swing.JLabel();
        etq_titu_vendedor = new javax.swing.JLabel();
        eqt_titu_cliente1 = new javax.swing.JLabel();
        mostrar_total = new javax.swing.JTextArea();
        panel_factura = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        input_cantidad = new javax.swing.JTextField();
        input_precio = new javax.swing.JTextField();
        btn_comprar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrar_factura = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        panel_cliente.setBackground(new java.awt.Color(102, 0, 102));

        btn_agregarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregarCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btn_agregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarCliente.setText("Agregar Cliente");
        btn_agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarClienteActionPerformed(evt);
            }
        });

        btn_listarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btn_listarCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btn_listarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_listarCliente.setText("Listar Cliente");
        btn_listarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarClienteActionPerformed(evt);
            }
        });

        btn_modificarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btn_modificarCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btn_modificarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificarCliente.setText("Modificar Cliente");
        btn_modificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarClienteActionPerformed(evt);
            }
        });

        btn_eliminarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btn_eliminarCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btn_eliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarCliente.setText("Eliminar Cliente");
        btn_eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_clienteLayout = new javax.swing.GroupLayout(panel_cliente);
        panel_cliente.setLayout(panel_clienteLayout);
        panel_clienteLayout.setHorizontalGroup(
            panel_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_listarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        panel_clienteLayout.setVerticalGroup(
            panel_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clienteLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btn_agregarCliente)
                .addGap(29, 29, 29)
                .addComponent(btn_listarCliente)
                .addGap(33, 33, 33)
                .addComponent(btn_modificarCliente)
                .addGap(28, 28, 28)
                .addComponent(btn_eliminarCliente)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        eqt_titu_cliente.setBackground(new java.awt.Color(255, 255, 255));
        eqt_titu_cliente.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        eqt_titu_cliente.setForeground(new java.awt.Color(255, 255, 255));
        eqt_titu_cliente.setText("Cliente");

        panel_vendedor.setBackground(new java.awt.Color(102, 0, 102));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar Vendedor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Listar Vendedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Modificar Vendedor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar vendedor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_vendedorLayout = new javax.swing.GroupLayout(panel_vendedor);
        panel_vendedor.setLayout(panel_vendedorLayout);
        panel_vendedorLayout.setHorizontalGroup(
            panel_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vendedorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_vendedorLayout.setVerticalGroup(
            panel_vendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vendedorLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_producto.setBackground(new java.awt.Color(102, 0, 102));

        btn_agregarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btn_agregarProducto.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btn_agregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregarProducto.setText("Agregar Producto");
        btn_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarProductoActionPerformed(evt);
            }
        });

        btn_mostrarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btn_mostrarProducto.setFont(new java.awt.Font("Segoe UI Black", 1, 13)); // NOI18N
        btn_mostrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btn_mostrarProducto.setText("Mostrar Productos");
        btn_mostrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_productoLayout = new javax.swing.GroupLayout(panel_producto);
        panel_producto.setLayout(panel_productoLayout);
        panel_productoLayout.setHorizontalGroup(
            panel_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_productoLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panel_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_agregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mostrarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        panel_productoLayout.setVerticalGroup(
            panel_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btn_agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_mostrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etq_titu_factura.setBackground(new java.awt.Color(255, 255, 255));
        etq_titu_factura.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etq_titu_factura.setForeground(new java.awt.Color(255, 255, 255));
        etq_titu_factura.setText("Producto");

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        etq_titu_vendedor1.setBackground(new java.awt.Color(255, 255, 255));
        etq_titu_vendedor1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etq_titu_vendedor1.setForeground(new java.awt.Color(255, 255, 255));
        etq_titu_vendedor1.setText("Vendedor");

        etq_titu_vendedor.setBackground(new java.awt.Color(255, 255, 255));
        etq_titu_vendedor.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        etq_titu_vendedor.setForeground(new java.awt.Color(255, 255, 255));
        etq_titu_vendedor.setText("Factura");

        eqt_titu_cliente1.setBackground(new java.awt.Color(255, 255, 255));
        eqt_titu_cliente1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        eqt_titu_cliente1.setForeground(new java.awt.Color(255, 255, 255));
        eqt_titu_cliente1.setText("Total");

        mostrar_total.setColumns(20);
        mostrar_total.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        mostrar_total.setRows(5);

        panel_factura.setBackground(new java.awt.Color(102, 0, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Producto");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        input_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_idActionPerformed(evt);
            }
        });

        input_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_cantidadActionPerformed(evt);
            }
        });

        btn_comprar.setBackground(new java.awt.Color(0, 0, 0));
        btn_comprar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btn_comprar.setForeground(new java.awt.Color(255, 255, 255));
        btn_comprar.setText("Comprar");
        btn_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_facturaLayout = new javax.swing.GroupLayout(panel_factura);
        panel_factura.setLayout(panel_facturaLayout);
        panel_facturaLayout.setHorizontalGroup(
            panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facturaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_id))
                .addGap(33, 33, 33)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addComponent(input_cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(panel_facturaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_facturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_comprar)
                .addGap(169, 169, 169))
        );
        panel_facturaLayout.setVerticalGroup(
            panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_facturaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_facturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_comprar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        mostrar_factura.setColumns(20);
        mostrar_factura.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        mostrar_factura.setRows(5);
        jScrollPane2.setViewportView(mostrar_factura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(eqt_titu_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_titu_vendedor1)
                .addGap(180, 180, 180)
                .addComponent(etq_titu_factura)
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(etq_titu_vendedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(eqt_titu_cliente1)
                        .addGap(24, 24, 24)
                        .addComponent(mostrar_total, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(panel_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(panel_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(panel_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(panel_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_titu_factura)
                    .addComponent(eqt_titu_cliente)
                    .addComponent(etq_titu_vendedor1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_titu_vendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eqt_titu_cliente1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(mostrar_total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarClienteActionPerformed
        setVisible(false);
        AgregarCliente ventana = new AgregarCliente(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_agregarClienteActionPerformed

    private void btn_modificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarClienteActionPerformed
        setVisible(false);
        ModificarCliente ventana = new ModificarCliente(this);
         ventana.setVisible(true);
    }//GEN-LAST:event_btn_modificarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        AgregarVendedor ventana = new AgregarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         setVisible(false);
        EliminarVendedor ventana = new EliminarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_listarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarClienteActionPerformed
        setVisible(false);
        ListarCliente ventana = new ListarCliente(this);
        ventana.mostrar_usuario();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_listarClienteActionPerformed

    private void btn_eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarClienteActionPerformed
        setVisible(false);
        EliminarCliente ventana = new EliminarCliente(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_eliminarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        ListarVendedor ventana = new ListarVendedor(this);
        ventana.mostrar_vendedor();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        ModificarVendedor ventana = new ModificarVendedor(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarProductoActionPerformed
        setVisible(false);
        AgregarProducto ventana = new AgregarProducto(this);
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_agregarProductoActionPerformed

    private void btn_mostrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarProductoActionPerformed
        setVisible(false);
        MostrarProductos ventana = new MostrarProductos(this);
        ventana.mostrar_producto();
        ventana.setVisible(true);
    }//GEN-LAST:event_btn_mostrarProductoActionPerformed

    private void input_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cantidadActionPerformed

    private void btn_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprarActionPerformed
        mostrarLaFactura();
    }//GEN-LAST:event_btn_comprarActionPerformed
   int totalP=0;
   int totalC=0;
    private void mostrarLaFactura(){
        String id= input_id.getText();
        int cantidad= Integer.parseInt(input_cantidad.getText());
        int precio= Integer.parseInt(input_precio.getText());
        
        for(int i=0; i<this.listaProducto.length; i++){  
            String otro_id=this.listaProducto[i].getId();
            int precio_guardado=this.listaProducto[i].getPrecio();
            int cantidad_guardada=this.listaProducto[i].getCantidad();
            if(this.listaProducto[i]!=null){
                if(id.equals(otro_id) && precio==precio_guardado){
                    String texto="#"+i+"        "+id+"  -  "+cantidad+"  -  "+precio+"\n";
                    mostrar_factura.append(texto);
                    totalP+=precio;
                    totalC+=cantidad;
                   
                }
            }else if(this.listaProducto[i]==null){
                if(!id.equals(otro_id) && precio!=precio_guardado){
                    mostrar_factura.setText("El producto que ingreso no existe");
                }    
            }
        }
        int total=totalP*totalC;
        String mostrar= String.valueOf(total);
        mostrar_total.setText(mostrar);
    }
    private void input_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCliente;
    private javax.swing.JButton btn_agregarProducto;
    private javax.swing.JButton btn_comprar;
    private javax.swing.JButton btn_eliminarCliente;
    private javax.swing.JButton btn_listarCliente;
    private javax.swing.JButton btn_modificarCliente;
    private javax.swing.JButton btn_mostrarProducto;
    private javax.swing.JLabel eqt_titu_cliente;
    private javax.swing.JLabel eqt_titu_cliente1;
    private javax.swing.JLabel etq_titu_factura;
    private javax.swing.JLabel etq_titu_vendedor;
    private javax.swing.JLabel etq_titu_vendedor1;
    private javax.swing.JTextField input_cantidad;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_precio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mostrar_factura;
    private javax.swing.JTextArea mostrar_total;
    private javax.swing.JPanel panel_cliente;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JPanel panel_producto;
    private javax.swing.JPanel panel_vendedor;
    // End of variables declaration//GEN-END:variables
}
