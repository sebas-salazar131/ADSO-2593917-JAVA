
package Principal;


public class Eliminar extends javax.swing.JFrame {
    Menu vent_menu;
    public Eliminar(Menu vent_menu) {
        this.vent_menu=vent_menu;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panel_titu = new javax.swing.JPanel();
        etq_titu = new javax.swing.JLabel();
        input_cedula_eliminar = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        mostrar_eliminar = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        panel_titu.setBackground(new java.awt.Color(255, 204, 153));

        etq_titu.setFont(new java.awt.Font("Segoe UI Emoji", 1, 28)); // NOI18N
        etq_titu.setForeground(new java.awt.Color(255, 0, 0));
        etq_titu.setText("INGRESE CEDULA PARA ELIMINAR");

        btn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_tituLayout = new javax.swing.GroupLayout(panel_titu);
        panel_titu.setLayout(panel_tituLayout);
        panel_tituLayout.setHorizontalGroup(
            panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituLayout.createSequentialGroup()
                .addGroup(panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tituLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(input_cedula_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_tituLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(etq_titu)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        panel_tituLayout.setVerticalGroup(
            panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_titu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_cedula_eliminar)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btn_volver.setBackground(new java.awt.Color(255, 102, 102));
        btn_volver.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        mostrar_eliminar.setColumns(20);
        mostrar_eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mostrar_eliminar.setRows(5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(mostrar_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrar_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_titu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int pos=0;
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        
        for(int i=0; i<this.vent_menu.listaPersonas.length; i++){
            if(this.vent_menu.listaPersonas[i]!=null){
             String cedula = this.vent_menu.listaPersonas[i].getCedula();
             String cedula_eliminar=input_cedula_eliminar.getText();
                if( cedula_eliminar.equals(cedula)){
                    pos=i;
                    for(int j=pos; j<this.vent_menu.listaPersonas.length-1; j++){
                        this.vent_menu.listaPersonas[j]=this.vent_menu.listaPersonas[j+1];
                        mostrar_eliminar.setText("El Usuario se ha eliminado");
                    }
                }else{
                    mostrar_eliminar.setText("Ingrese correctamente la cedula");
                }
            }
                
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.vent_menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel etq_titu;
    private javax.swing.JTextField input_cedula_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea mostrar_eliminar;
    private javax.swing.JPanel panel_titu;
    // End of variables declaration//GEN-END:variables
}
