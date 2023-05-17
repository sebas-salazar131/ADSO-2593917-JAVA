
package Principal;

public class ListarPersonas extends javax.swing.JFrame {

    Menu vent_menu;
    public ListarPersonas(Menu vent_menu) {
        this.vent_menu= vent_menu;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        eqt_titu_lista = new javax.swing.JPanel();
        etq_titu = new javax.swing.JLabel();
        panel_usuarios = new javax.swing.JPanel();
        mostrar_usuarios = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(137, 137, 137))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eqt_titu_lista.setBackground(new java.awt.Color(255, 204, 204));

        etq_titu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        etq_titu.setForeground(new java.awt.Color(255, 0, 0));
        etq_titu.setText("LISTA USUARIOS");

        javax.swing.GroupLayout eqt_titu_listaLayout = new javax.swing.GroupLayout(eqt_titu_lista);
        eqt_titu_lista.setLayout(eqt_titu_listaLayout);
        eqt_titu_listaLayout.setHorizontalGroup(
            eqt_titu_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eqt_titu_listaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_titu, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        eqt_titu_listaLayout.setVerticalGroup(
            eqt_titu_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eqt_titu_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etq_titu)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panel_usuarios.setBackground(new java.awt.Color(255, 204, 255));

        mostrar_usuarios.setEditable(false);
        mostrar_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        mostrar_usuarios.setColumns(20);
        mostrar_usuarios.setRows(5);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 204));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_usuariosLayout = new javax.swing.GroupLayout(panel_usuarios);
        panel_usuarios.setLayout(panel_usuariosLayout);
        panel_usuariosLayout.setHorizontalGroup(
            panel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_usuariosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(mostrar_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panel_usuariosLayout.setVerticalGroup(
            panel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuariosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mostrar_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eqt_titu_lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eqt_titu_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.vent_menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    public void mostrar_usuario(){
       
        for(int i=0; i<this.vent_menu.listaPersonas.length; i++){
            
            if(this.vent_menu.listaPersonas[i]!=null){
                String cedula=this.vent_menu.listaPersonas[i].getCedula();
                String nombre=this.vent_menu.listaPersonas[i].getNombres();
                String apellido=this.vent_menu.listaPersonas[i].getApellidos();
                String direccion=this.vent_menu.listaPersonas[i].getDireccion();
                String telefono=this.vent_menu.listaPersonas[i].getTelefonos();
                String email=this.vent_menu.listaPersonas[i].getEmail();
                String texto="#"+i+"   "+cedula+"  -  "+nombre+"  -  "+apellido+"  -  "+direccion+"  -  "+telefono+"  -  "+email+"\n";
                mostrar_usuarios.append(texto);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel eqt_titu_lista;
    private javax.swing.JLabel etq_titu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea mostrar_usuarios;
    private javax.swing.JPanel panel_usuarios;
    // End of variables declaration//GEN-END:variables
}
