
package Clientes;

import facturacion.Inicio;


public class EliminarCliente extends javax.swing.JFrame {

    Inicio vent_menu;
    public EliminarCliente(Inicio vent_menu) {
        this.vent_menu=vent_menu;
        initComponents();
        initAlternComponents();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_titu = new javax.swing.JPanel();
        etq_titu = new javax.swing.JLabel();
        input_cedula_eliminar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_volver = new javax.swing.JButton();
        mostrar_eliminar = new javax.swing.JTextArea();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_titu.setBackground(new java.awt.Color(153, 0, 153));

        etq_titu.setFont(new java.awt.Font("Segoe UI Emoji", 1, 28)); // NOI18N
        etq_titu.setForeground(new java.awt.Color(255, 255, 255));
        etq_titu.setText("INGRESE CEDULA PARA ELIMINAR");

        btn_buscar.setBackground(new java.awt.Color(0, 0, 0));
        btn_buscar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
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
                        .addGap(58, 58, 58)
                        .addComponent(input_cedula_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_tituLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(etq_titu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tituLayout.setVerticalGroup(
            panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etq_titu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_tituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input_cedula_eliminar)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btn_volver.setBackground(new java.awt.Color(153, 0, 153));
        btn_volver.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        mostrar_eliminar.setColumns(20);
        mostrar_eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mostrar_eliminar.setRows(5);

        btn_eliminar.setBackground(new java.awt.Color(153, 0, 153));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

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
                        .addGap(119, 119, 119)
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrar_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_volver, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.vent_menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed
     int pos=0;
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        for(int i=0; i<this.vent_menu.listaClientes.length; i++){
            if(this.vent_menu.listaClientes[i]!=null){
                String cedula = this.vent_menu.listaClientes[i].getCedula();
                String cedula_eliminar=input_cedula_eliminar.getText();
                if( cedula_eliminar.equals(cedula)){
                    pos=i;
                    for(int j=pos; j<this.vent_menu.listaClientes.length-1; j++){
                        this.vent_menu.listaClientes[j]=this.vent_menu.listaClientes[j+1];
                        mostrar_eliminar.setText("Cliente Eliminado");   
                    }
                }
            }

        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      this.Buscar();
    }//GEN-LAST:event_btn_buscarActionPerformed
    private boolean Buscar(){
        for(int i=0; i<this.vent_menu.listaClientes.length; i++){         
            if(this.vent_menu.listaClientes[i]!=null){        
             String cedula = this.vent_menu.listaClientes[i].getCedula();
             String cedula_modificar=input_cedula_eliminar.getText();
                if( cedula_modificar.equals(cedula)){
                    this.pos=i;
                    
                    String cedulaa=this.vent_menu.listaClientes[i].getCedula();
                    String nombre=this.vent_menu.listaClientes[i].getNombres();
                    String apellido=this.vent_menu.listaClientes[i].getApellidos();
                     String texto="#"+i+"        "+cedulaa+"  -  "+nombre+"  -  "+apellido;
                     mostrar_eliminar.setText(texto);
                    return true;
                }else{
                    mostrar_eliminar.setText("Cedula NO Encontrada");   
                }
            }                 
        }
        return false;
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel etq_titu;
    private javax.swing.JTextField input_cedula_eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea mostrar_eliminar;
    private javax.swing.JPanel panel_titu;
    // End of variables declaration//GEN-END:variables
}
