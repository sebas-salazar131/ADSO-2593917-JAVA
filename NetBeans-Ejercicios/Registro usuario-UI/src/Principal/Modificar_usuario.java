
package Principal;


public class Modificar_usuario extends javax.swing.JFrame {
    int pos; 
    Menu vent_menu;
    public Modificar_usuario(Menu vent_menu) {
        this.pos=0;
        this.vent_menu=vent_menu;
        initComponents();
        initAlternComponents();
    }
     public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
        btn_modificar.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_titu = new javax.swing.JPanel();
        etq_titu = new javax.swing.JLabel();
        input_cedula_modificar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        panel_encontrar = new javax.swing.JPanel();
        mostrar_resultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        etq_cedula = new javax.swing.JLabel();
        etq_nombre = new javax.swing.JLabel();
        input_cedula = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        etq_apellido = new javax.swing.JLabel();
        input_apellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        input_telefono = new javax.swing.JTextField();
        etq_direccion = new javax.swing.JLabel();
        input_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar");
        setBackground(new java.awt.Color(255, 204, 204));

        panel_titu.setBackground(new java.awt.Color(255, 204, 204));

        etq_titu.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        etq_titu.setForeground(new java.awt.Color(0, 0, 0));
        etq_titu.setText("INGRESE CEDULA PARA MODIFICAR");

        input_cedula_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_cedula_modificarActionPerformed(evt);
            }
        });

        btn_buscar.setBackground(new java.awt.Color(255, 102, 102));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_tituLayout = new javax.swing.GroupLayout(panel_titu);
        panel_titu.setLayout(panel_tituLayout);
        panel_tituLayout.setHorizontalGroup(
            panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituLayout.createSequentialGroup()
                .addGroup(panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tituLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(input_cedula_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_tituLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(etq_titu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tituLayout.setVerticalGroup(
            panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titu)
                .addGap(18, 18, 18)
                .addGroup(panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_cedula_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panel_encontrar.setBackground(new java.awt.Color(255, 153, 153));

        mostrar_resultado.setColumns(20);
        mostrar_resultado.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        mostrar_resultado.setRows(5);

        javax.swing.GroupLayout panel_encontrarLayout = new javax.swing.GroupLayout(panel_encontrar);
        panel_encontrar.setLayout(panel_encontrarLayout);
        panel_encontrarLayout.setHorizontalGroup(
            panel_encontrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_encontrarLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(mostrar_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_encontrarLayout.setVerticalGroup(
            panel_encontrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_encontrarLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(mostrar_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        etq_cedula.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        etq_cedula.setForeground(new java.awt.Color(0, 0, 0));
        etq_cedula.setText("Cedula");

        etq_nombre.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        etq_nombre.setForeground(new java.awt.Color(0, 0, 0));
        etq_nombre.setText("Nombre");

        etq_apellido.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        etq_apellido.setForeground(new java.awt.Color(0, 0, 0));
        etq_apellido.setText("Apellido");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Telefono");

        etq_direccion.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        etq_direccion.setForeground(new java.awt.Color(0, 0, 0));
        etq_direccion.setText("Direccion");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(etq_apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(86, 86, 86))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(input_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(input_cedula))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(etq_cedula)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etq_nombre)
                        .addGap(90, 90, 90))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(etq_direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(110, 110, 110))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_cedula)
                    .addComponent(etq_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_apellido)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(input_apellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etq_direccion)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_email, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(input_direccion))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        btn_volver.setBackground(new java.awt.Color(255, 102, 102));
        btn_volver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(0, 0, 0));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_modificar.setBackground(new java.awt.Color(255, 102, 102));
        btn_modificar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(0, 0, 0));
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_encontrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_titu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_encontrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_cedula_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_cedula_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_cedula_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        this.Buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private boolean Buscar(){
        for(int i=0; i<this.vent_menu.listaPersonas.length; i++){         
            if(this.vent_menu.listaPersonas[i]!=null){        
             String cedula = this.vent_menu.listaPersonas[i].getCedula();
             String cedula_modificar=input_cedula_modificar.getText();
                if( cedula_modificar.equals(cedula)){
                    this.pos=i;
                    mostrar_resultado.setText("Cedula Encontrada");
                    input_cedula.setEnabled(true);
                    input_nombre.setEnabled(true);
                    input_apellido.setEnabled(true);
                    input_telefono.setEnabled(true);
                    input_direccion.setEnabled(true);
                    input_email.setEnabled(true);
                    btn_modificar.setEnabled(true);     
                    return true;
                }else{
                    mostrar_resultado.setText("Cedula NO Encontrada");
                    input_cedula.setEnabled(false);
                    input_nombre.setEnabled(false);
                    input_apellido.setEnabled(false);
                    input_telefono.setEnabled(false);
                    input_direccion.setEnabled(false);
                    input_email.setEnabled(false);
                    btn_modificar.setEnabled(false);
                   
                }
            }   
        }
        
        return false;
    }
    
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
     
        String cedulaa=input_cedula.getText();
        String nombre=input_nombre.getText();
        String apellido=input_apellido.getText();
        String telefono=input_telefono.getText();
        String direccion=input_direccion.getText();
        String email=input_email.getText();
        if(cedulaa.equals("") && nombre.equals("") && apellido.equals("") && direccion.equals("") && telefono.equals("") && email.equals("")){    
           btn_modificar.setEnabled(false);
        }else{
            this.vent_menu.listaPersonas[this.pos].setCedula(cedulaa);
            this.vent_menu.listaPersonas[this.pos].setNombres(nombre);
            this.vent_menu.listaPersonas[this.pos].setApellidos(apellido);
            this.vent_menu.listaPersonas[this.pos].setTelefonos(telefono);
            this.vent_menu.listaPersonas[this.pos].setDireccion(direccion);
            this.vent_menu.listaPersonas[this.pos].setEmail(email);
            mostrar_resultado.setText("Cambios Guardados"); 
        }
       
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.vent_menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel etq_apellido;
    private javax.swing.JLabel etq_cedula;
    private javax.swing.JLabel etq_direccion;
    private javax.swing.JLabel etq_nombre;
    private javax.swing.JLabel etq_titu;
    private javax.swing.JTextField input_apellido;
    private javax.swing.JTextField input_cedula;
    private javax.swing.JTextField input_cedula_modificar;
    private javax.swing.JTextField input_direccion;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea mostrar_resultado;
    private javax.swing.JPanel panel_encontrar;
    private javax.swing.JPanel panel_titu;
    // End of variables declaration//GEN-END:variables
}
