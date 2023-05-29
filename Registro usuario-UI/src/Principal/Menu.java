
package Principal;

public class Menu extends javax.swing.JFrame {
    Persona listaPersonas[];
    ListarPersonas lista;
    public Menu() {
        
        this.listaPersonas=new Persona[10];
        initComponents();
        initAlternComponents();
    }

    @SuppressWarnings("unchecked")
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_almacenes.png")));
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentMenu = new javax.swing.JPanel();
        etq_menu = new javax.swing.JLabel();
        contentPrincipal = new javax.swing.JPanel();
        btn_crear_usuario = new javax.swing.JButton();
        btn_modificar_usuario = new javax.swing.JButton();
        btn_eliminar_usuario = new javax.swing.JButton();
        btn_listar_usuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 153, 102));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        contentMenu.setBackground(new java.awt.Color(255, 153, 153));

        etq_menu.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 60)); // NOI18N
        etq_menu.setForeground(new java.awt.Color(255, 51, 51));
        etq_menu.setText("Menu");

        javax.swing.GroupLayout contentMenuLayout = new javax.swing.GroupLayout(contentMenu);
        contentMenu.setLayout(contentMenuLayout);
        contentMenuLayout.setHorizontalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etq_menu)
                .addGap(175, 175, 175))
        );
        contentMenuLayout.setVerticalGroup(
            contentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMenuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(etq_menu)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        contentPrincipal.setBackground(new java.awt.Color(255, 204, 204));

        btn_crear_usuario.setBackground(new java.awt.Color(255, 153, 153));
        btn_crear_usuario.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btn_crear_usuario.setForeground(new java.awt.Color(255, 51, 51));
        btn_crear_usuario.setText("Crear Usuario");
        btn_crear_usuario.setFocusable(false);
        btn_crear_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_usuarioActionPerformed(evt);
            }
        });

        btn_modificar_usuario.setBackground(new java.awt.Color(255, 153, 153));
        btn_modificar_usuario.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btn_modificar_usuario.setForeground(new java.awt.Color(255, 51, 51));
        btn_modificar_usuario.setText("Modificar Usuario");
        btn_modificar_usuario.setFocusable(false);
        btn_modificar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_usuarioActionPerformed(evt);
            }
        });

        btn_eliminar_usuario.setBackground(new java.awt.Color(255, 153, 153));
        btn_eliminar_usuario.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btn_eliminar_usuario.setForeground(new java.awt.Color(255, 51, 51));
        btn_eliminar_usuario.setText("Eliminar Usuario");
        btn_eliminar_usuario.setFocusable(false);
        btn_eliminar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_usuarioActionPerformed(evt);
            }
        });

        btn_listar_usuario.setBackground(new java.awt.Color(255, 153, 153));
        btn_listar_usuario.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        btn_listar_usuario.setForeground(new java.awt.Color(255, 51, 51));
        btn_listar_usuario.setText("Listar Usuarios");
        btn_listar_usuario.setFocusable(false);
        btn_listar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listar_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentPrincipalLayout = new javax.swing.GroupLayout(contentPrincipal);
        contentPrincipal.setLayout(contentPrincipalLayout);
        contentPrincipalLayout.setHorizontalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentPrincipalLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_listar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        contentPrincipalLayout.setVerticalGroup(
            contentPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPrincipalLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_crear_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_listar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crear_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_usuarioActionPerformed
        setVisible(false);
        CrearUsuario ventana=new CrearUsuario(this);
        ventana.setVisible(true);
        
        
    }//GEN-LAST:event_btn_crear_usuarioActionPerformed

    private void btn_listar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listar_usuarioActionPerformed
         ListarPersonas mostrar = new ListarPersonas(this);
         mostrar.mostrar_usuario();
         setVisible(false);
         mostrar.setVisible(true);
        
    }//GEN-LAST:event_btn_listar_usuarioActionPerformed

    private void btn_modificar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_usuarioActionPerformed
         Modificar_usuario modificar= new Modificar_usuario(this);
         setVisible(false);
         modificar.setVisible(true);
    }//GEN-LAST:event_btn_modificar_usuarioActionPerformed

    private void btn_eliminar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_usuarioActionPerformed
        Eliminar elimina = new Eliminar(this);
        setVisible(false);
        elimina.setVisible(true);
    }//GEN-LAST:event_btn_eliminar_usuarioActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear_usuario;
    private javax.swing.JButton btn_eliminar_usuario;
    private javax.swing.JButton btn_listar_usuario;
    private javax.swing.JButton btn_modificar_usuario;
    private javax.swing.JPanel contentMenu;
    private javax.swing.JPanel contentPrincipal;
    private javax.swing.JLabel etq_menu;
    // End of variables declaration//GEN-END:variables
}
