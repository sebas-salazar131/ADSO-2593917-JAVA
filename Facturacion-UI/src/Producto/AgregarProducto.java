
package Producto;
import java.awt.Color;
import javax.swing.*;
import facturacion.Inicio;
import facturacion.Alert;

public class AgregarProducto extends javax.swing.JFrame {

    Inicio menu;
    public AgregarProducto(Inicio menu) {
        this.menu=menu;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        input_id = new javax.swing.JTextField();
        etq_nombre = new javax.swing.JLabel();
        input_precio = new javax.swing.JTextField();
        etq_cedula = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        input_nombre = new javax.swing.JTextField();
        input_cantidad = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        etq_apellidos = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREAR PRODUCTO");

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        input_id.setBackground(new java.awt.Color(0, 0, 0));
        input_id.setForeground(new java.awt.Color(255, 255, 255));

        etq_nombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombre:");

        input_precio.setBackground(new java.awt.Color(0, 0, 0));
        input_precio.setForeground(new java.awt.Color(255, 255, 255));

        etq_cedula.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("ID");

        etq_telefono.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Cantidad");

        input_nombre.setBackground(new java.awt.Color(0, 0, 0));
        input_nombre.setForeground(new java.awt.Color(255, 255, 255));
        input_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreActionPerformed(evt);
            }
        });

        input_cantidad.setBackground(new java.awt.Color(0, 0, 0));
        input_cantidad.setForeground(new java.awt.Color(255, 255, 255));

        btn_cancelar.setBackground(new java.awt.Color(0, 0, 0));
        btn_cancelar.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        etq_apellidos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        etq_apellidos.setText("Precio:");

        btn_registrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_registrar.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etq_nombre)
                                    .addComponent(etq_apellidos)
                                    .addComponent(etq_telefono))
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(etq_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_registrar)
                        .addGap(83, 83, 83))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombre)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(input_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(input_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String id = input_id.getText();
        String nombres = input_nombre.getText();
        int precio= Integer.parseInt(input_precio.getText());
        int cantidad= Integer.parseInt(input_cantidad.getText());
        

        Producto producto= new Producto(id, nombres, precio, cantidad);

        for(int i=0; i<this.menu.listaProducto.length; i++){
            if(!id.equals("") && !nombres.equals("") && precio!=0 && cantidad!=0 ){
                if(this.menu.listaProducto[i]==null){
                    this.menu.listaProducto[i]=producto;
                    dispose();
                    menu.setVisible(true);
                    break;
                }
            }
            if(id.equals("") ){
                input_id.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                btn_registrar.setEnabled(true);
                Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
                break;
            }else if(nombres.equals("")){
                input_nombre.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                btn_registrar.setEnabled(true);
                Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
                break;
            }else if(precio==0){
                input_precio.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                btn_registrar.setEnabled(true);
                Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
                break;
            }else if(cantidad==0){
                input_cantidad.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                btn_registrar.setEnabled(true);
                Alert alerta = new Alert("Datos Inválidos", "Todos los campos son obligatorios.", "error");
                break;
            }

        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JTextField input_cantidad;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
