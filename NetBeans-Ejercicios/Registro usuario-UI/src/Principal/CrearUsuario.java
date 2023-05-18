
package Principal;
import java.awt.Color;
import javax.swing.*;

public class CrearUsuario extends javax.swing.JFrame {
    Menu ventanaMenu;
    public CrearUsuario(Menu ventanaMenu) {
        this.ventanaMenu= ventanaMenu;
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        input_cedula = new javax.swing.JTextField();
        etq_nombre = new javax.swing.JLabel();
        input_apellidos = new javax.swing.JTextField();
        etq_cedula = new javax.swing.JLabel();
        etq_telefono = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        etq_email = new javax.swing.JLabel();
        input_direccion = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        input_telefono = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        etq_apellidos = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("CREAR USUARIO");

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        input_cedula.setBackground(new java.awt.Color(255, 204, 204));

        etq_nombre.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(255, 255, 255));
        etq_nombre.setText("Nombre:");

        input_apellidos.setBackground(new java.awt.Color(255, 204, 204));

        etq_cedula.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(255, 255, 255));
        etq_cedula.setText("Cedula:");

        etq_telefono.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_telefono.setForeground(new java.awt.Color(255, 255, 255));
        etq_telefono.setText("Telefono:");

        input_email.setBackground(new java.awt.Color(255, 204, 204));

        etq_direccion.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(255, 255, 255));
        etq_direccion.setText("Direccion:");

        etq_email.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_email.setForeground(new java.awt.Color(255, 255, 255));
        etq_email.setText("Email:");

        input_direccion.setBackground(new java.awt.Color(255, 204, 204));

        input_nombre.setBackground(new java.awt.Color(255, 204, 204));
        input_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nombreActionPerformed(evt);
            }
        });

        input_telefono.setBackground(new java.awt.Color(255, 204, 204));

        btn_cancelar.setBackground(new java.awt.Color(255, 204, 204));
        btn_cancelar.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 51, 51));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        etq_apellidos.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        etq_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        etq_apellidos.setText("Apellidos:");

        btn_registrar.setBackground(new java.awt.Color(255, 204, 204));
        btn_registrar.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 51, 51));
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
                .addGap(83, 83, 83)
                .addComponent(btn_cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registrar)
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etq_nombre)
                    .addComponent(etq_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_apellidos)
                    .addComponent(etq_telefono)
                    .addComponent(etq_direccion)
                    .addComponent(etq_email))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_email)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_nombre)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellidos)
                    .addComponent(input_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_telefono)
                    .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etq_direccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_email)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nombreActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        this.ventanaMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String cedula = input_cedula.getText();
        String nombres = input_nombre.getText();
        String apellidos = input_apellidos.getText();
        String direccion = input_direccion.getText();
        String telefono = input_telefono.getText();
        String email = input_email.getText();
        
        Persona personas= new Persona(cedula, nombres, apellidos, direccion, telefono, email);
        
        for(int i=0; i<this.ventanaMenu.listaPersonas.length; i++){
            if(!cedula.equals("") && !nombres.equals("") && !apellidos.equals("") && !direccion.equals("") && !telefono.equals("") && !email.equals("")){
                if(this.ventanaMenu.listaPersonas[i]==null){
                    this.ventanaMenu.listaPersonas[i]=personas;
                    dispose();
                    ventanaMenu.setVisible(true);
                    break;
                }
            }
            if(cedula.equals("") ){    
                input_cedula.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2)); 
                btn_registrar.setEnabled(false);
                btn_registrar.setEnabled(true);
                break;                
            }else if(nombres.equals("")){
                input_nombre.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                 btn_registrar.setEnabled(true);
                 break;
            }else if(apellidos.equals("")){
                input_apellidos.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                 btn_registrar.setEnabled(true);
                 break;
            }else if(telefono.equals("")){
                input_telefono.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                 btn_registrar.setEnabled(true);
                 break;
            }else if(direccion.equals("")){
                input_direccion.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                 btn_registrar.setEnabled(true);
                 break;
            }else if(email.equals("")){
                input_email.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
                btn_registrar.setEnabled(false);
                 btn_registrar.setEnabled(true);
                 break;
            }
            
            
        }
        
        
    }//GEN-LAST:event_btn_registrarActionPerformed


    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel etq_apellidos;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_email;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_telefono;
    private javax.swing.JTextField input_apellidos;
    private javax.swing.JTextField input_cedula;
    private javax.swing.JTextField input_direccion;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}