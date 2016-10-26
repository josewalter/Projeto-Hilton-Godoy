package View;

  import DAO.ClassConectaBanco;
  import javax.swing.JOptionPane;

   /**
    *
    * @author: José Walter.
   */
   public class FrmLoginHilton extends javax.swing.JFrame {
      ClassConectaBanco connlogin = new ClassConectaBanco();
    
    
     public FrmLoginHilton() {
        initComponents();
        connlogin.conexao();
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelSenhaUsuario = new javax.swing.JLabel();
        jButtonLogar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldNomeUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(0, 102, 255));
        jLabelNomeUsuario.setText("Nome do Usuário");

        jLabelSenhaUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSenhaUsuario.setForeground(new java.awt.Color(0, 102, 255));
        jLabelSenhaUsuario.setText("Senha do Usuário");

        jButtonLogar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonLogar.setForeground(new java.awt.Color(255, 102, 102));
        jButtonLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Entrar.png"))); // NOI18N
        jButtonLogar.setToolTipText("Logar");
        jButtonLogar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 102, 102));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_5123_cancel_48.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Botão Cancelar");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Molho chave.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonLogar)
                        .addGap(49, 49, 49)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeUsuario))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelNomeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSenhaUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );

        jLabelTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelaLogin.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTelaLogin.setText("Apresentação da Tela de Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabelTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTelaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(364, 247));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
       // Declaracão do código para logar no sistema.  
      // connlogin.conexao();
        try {  
              connlogin.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jTextFieldNomeUsuario.getText() +"'");
              connlogin.rs.first();
            if(connlogin.rs.getString("Senha_Usuario").equals(jPasswordFieldSenha.getText())){
            
                FrmPrincipal principal = new FrmPrincipal(jTextFieldNomeUsuario.getText());
                principal.setVisible(true);
            dispose();
            }            
            else{
                JOptionPane.showMessageDialog(rootPane, "O usuário ou a senha não correspondem!!");
            }
        } catch (Exception ex) {
               JOptionPane.showMessageDialog(rootPane, "O usuário ou a senha não correspondem!!/nErro" + ex);
          }
        //connlogin.desconecta();
    }//GEN-LAST:event_jButtonLogarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declarção do código para cancelar a entrada no sistema:
          
            System.exit(0);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLoginHilton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginHilton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginHilton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginHilton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmLoginHilton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelSenhaUsuario;
    private javax.swing.JLabel jLabelTelaLogin;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
