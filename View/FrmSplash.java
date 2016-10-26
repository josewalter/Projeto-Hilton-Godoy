
package View;

import DAO.ClassConectaBanco;
import static java.lang.Thread.sleep;
/**
 *
 * @author: José Walter:
 */
public class FrmSplash extends javax.swing.JFrame {
    ClassConectaBanco connsplashgodoy = new ClassConectaBanco();
    
    public FrmSplash() {
        initComponents();
        connsplashgodoy.conexao();
        
            // Código para carregamento do ProgressBar.   
        new Thread(){
            @Override
            public void run(){
            for(int i = 0; i<101; i++){
             try{
                sleep(60);
                jProgressBar1.setValue(i);
                
                if(jProgressBar1.getValue()<=40){
                   jLabelInformacao.setText("Configurações do Sistema");
                   jLabelInformacao.setText("Carregando banco de dados");
                }else if(jProgressBar1.getValue()<=70){
                    jLabelInformacao.setText("Carregando Tabelas");
                    jLabelInformacao.setText("Carregando Sistemas");
             }                  
               
                                     
             }catch(InterruptedException ex){
             
              }
            }
            dispose();
           // FrmPrincipal principal = new FrmPrincipal();
            //principal.setVisible(true);
            FrmLoginHilton hilton = new FrmLoginHilton();
            hilton.setVisible(true);
          }
         
        
        }.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelInformacao = new javax.swing.JLabel();
        jLabelTituloSuperior = new javax.swing.JLabel();
        jLabelTituloInferior = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelImagemSuperior = new javax.swing.JLabel();
        jLabelImagemInferior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 223, 830, 13));
        jPanel1.add(jLabelInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 207, 13));

        jLabelTituloSuperior.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTituloSuperior.setForeground(new java.awt.Color(255, 0, 51));
        jLabelTituloSuperior.setText("JW-X SISTEMAS E SOFTWARE LTDA");
        jPanel1.add(jLabelTituloSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 2, -1, -1));

        jLabelTituloInferior.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelTituloInferior.setForeground(new java.awt.Color(255, 0, 51));
        jLabelTituloInferior.setText("JW-X SISTEMAS E SOFTWARE LTDA");
        jPanel1.add(jLabelTituloInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 33));

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(51, 51, 255));
        jLabelEndereco.setText("JW-X  SISTEMAS E SOFTWARE LTDA Rua Dos Girassóis n=35 Cidade Jardim 2 Americana SP Telefone (19)99996-9973 ");
        jPanel1.add(jLabelEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, -1, -1));

        jLabelImagemSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/246_rgb Imagen_logotelasplash.jpg"))); // NOI18N
        jLabelImagemSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabelImagemSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 2, -1, -1));

        jLabelImagemInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/246_rgb Imagen_logotelasplash.jpg"))); // NOI18N
        jLabelImagemInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabelImagemInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmSplash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelImagemInferior;
    private javax.swing.JLabel jLabelImagemSuperior;
    private javax.swing.JLabel jLabelInformacao;
    private javax.swing.JLabel jLabelTituloInferior;
    private javax.swing.JLabel jLabelTituloSuperior;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
