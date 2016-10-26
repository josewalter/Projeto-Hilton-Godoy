
package View;

 import Controle.ControleCadastroUsuario;
 import DAO.ClassConectaBanco;
 import Modelo.ModeloCadastroUsuario;
import Modelo.ModeloTabela;
import java.util.ArrayList;
 import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author: José Walter.
 */
   public class FrmCadastroUsuario extends javax.swing.JFrame {
      ClassConectaBanco connusuario = new ClassConectaBanco();
      ModeloCadastroUsuario mod = new ModeloCadastroUsuario();
      ControleCadastroUsuario contrl = new ControleCadastroUsuario();
      
      int flag = 1; 
      
     public FrmCadastroUsuario() {
        initComponents();
        connusuario.conexao();
        
        preencherTabela("SELECT * FROM tbl_cadastrousuario ORDER BY Codigo_Usuario");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTelaLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmacaoSenha = new javax.swing.JPasswordField();
        jLabelConfirmacaoSenha = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jLabelPermissao = new javax.swing.JLabel();
        jComboBoxPermissao = new javax.swing.JComboBox();
        jTextFieldLogin = new javax.swing.JTextField();
        jPanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadastroUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setResizable(false);

        jLabelTelaLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelaLogin.setForeground(new java.awt.Color(0, 102, 255));
        jLabelTelaLogin.setText("Apresentação da Tela de Cadastro de Usuário");

        jPanel1.setBackground(new java.awt.Color(240, 230, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelCodigo.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setEnabled(false);

        jTextFieldNomeUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNomeUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNomeUsuario.setEnabled(false);

        jLabelNomeUsuario.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNomeUsuario.setText("Nome do Usuário");

        jLabelLogin.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(51, 102, 255));
        jLabelLogin.setText("Login");

        jLabelSenha.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(51, 102, 255));
        jLabelSenha.setText("Senha");

        jPasswordFieldSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordFieldSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPasswordFieldSenha.setEnabled(false);

        jPasswordFieldConfirmacaoSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPasswordFieldConfirmacaoSenha.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPasswordFieldConfirmacaoSenha.setEnabled(false);

        jLabelConfirmacaoSenha.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabelConfirmacaoSenha.setForeground(new java.awt.Color(51, 102, 255));
        jLabelConfirmacaoSenha.setText("Confirmação de Senha");

        jPanel8.setBackground(new java.awt.Color(51, 102, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNovo.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(255, 0, 51));
        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_5122_paper_48.png"))); // NOI18N
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/informatica_3629_disquete17.JPG"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_5121_paperpencil_48.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_Site_5750_Knob_Cancel.png"))); // NOI18N
        jButtonCancelar.setToolTipText("Cancelar");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 0, 51));
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_Site_5751_Knob_Remove_Red.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonFechar.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jButtonFechar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/BtnFechar.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_5055_arrow_right_48.png"))); // NOI18N
        jButtonPrimeiro.setToolTipText("Seta o primeiro registro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2693_32x32botaopng.png"))); // NOI18N
        jButtonProximo.setToolTipText("Seta o próximo registro");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Button_anterior.jpg"))); // NOI18N
        jButtonAnterior.setToolTipText("Seta o registro anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_5053_arrow_left_48.png"))); // NOI18N
        jButtonUltimo.setToolTipText("Seta o último registro");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonUltimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelPermissao.setFont(new java.awt.Font("Arial Unicode MS", 1, 11)); // NOI18N
        jLabelPermissao.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPermissao.setText("Permissão");

        jComboBoxPermissao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxPermissao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Vendedor(a)", "Desenvolvedor", "Diretoria", "Estoque", " ", " ", " ", " ", " ", " " }));
        jComboBoxPermissao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldLogin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLogin.setEnabled(false);

        jPanelTable.setBackground(new java.awt.Color(102, 255, 255));
        jPanelTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableCadastroUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableCadastroUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableCadastroUsuario);

        javax.swing.GroupLayout jPanelTableLayout = new javax.swing.GroupLayout(jPanelTable);
        jPanelTable.setLayout(jPanelTableLayout);
        jPanelTableLayout.setHorizontalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTableLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanelTableLayout.setVerticalGroup(
            jPanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordFieldConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeUsuario)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPermissao)
                    .addComponent(jComboBoxPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmacaoSenha)
                    .addComponent(jPasswordFieldConfirmacaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabelTelaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelTelaLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Form Cadastro de Usuário:

           jTextFieldCodigo.setText("");
           jTextFieldNomeUsuario.requestFocus();
           jTextFieldNomeUsuario.setText("");
           jComboBoxPermissao.setSelectedItem("");
           jTextFieldLogin.setText("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmacaoSenha.setText("");
           

           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(false);
              jButtonExcluir.setEnabled(false);
              jButtonSalvar.setEnabled(true);
              
               jTextFieldCodigo.setEnabled(true);
               jTextFieldNomeUsuario.requestFocus();
               jTextFieldNomeUsuario.setEnabled(true);
               jComboBoxPermissao.setEnabled(true);
               jTextFieldLogin.setEnabled(true);
               jPasswordFieldSenha.setEnabled(true);
               jPasswordFieldConfirmacaoSenha.setEnabled(true);
               
                jButtonNovo.setEnabled(false);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Form Cadastro de Usuário:

       if(flag == 1){ 
       if (jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmacaoSenha.getText())){
           mod.setNomeUsuario(jTextFieldNomeUsuario.getText());
           mod.setPermissao((String) jComboBoxPermissao.getSelectedItem());
           mod.setLogin(jTextFieldLogin.getText());
           mod.setSenhaUsuario(jPasswordFieldSenha.getText());
           contrl.SalvarUsuario(mod);
           
           preencherTabela("SELECT * FROM tbl_cadastrousuario ORDER BY Codigo_Usuario");
           
           jTextFieldCodigo.setText("");
           jTextFieldNomeUsuario.setText("");
           jTextFieldLogin.setText("");
           jComboBoxPermissao.setSelectedItem("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmacaoSenha.setText("");
        
               jTextFieldCodigo.setEnabled(!true);
               jTextFieldNomeUsuario.setEnabled(!true);
               jTextFieldLogin.setEnabled(!true);
               jPasswordFieldSenha.setEnabled(!true);
               jPasswordFieldConfirmacaoSenha.setEnabled(!true);

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonSalvar.setEnabled(true);
                  jButtonNovo.setEnabled(true);
                   
       }else{
           JOptionPane.showMessageDialog(rootPane, "As senhas não correspondem, tente novamente");
       }
       }else{
        if (jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmacaoSenha.getText())){
          mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
          mod.setNomeUsuario(jTextFieldNomeUsuario.getText());
          mod.setPermissao((String) jComboBoxPermissao.getSelectedItem());
          mod.setLogin(jTextFieldLogin.getText());
          contrl.EditarUsuario(mod);
           jTextFieldCodigo.setText("");
           jTextFieldNomeUsuario.setText("");
           jTextFieldLogin.setText("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmacaoSenha.setText("");
        
               jButtonSalvar.setEnabled(!true);
               
               jTextFieldCodigo.setEnabled(!true);
               jTextFieldNomeUsuario.setEnabled(!true);
               jTextFieldLogin.setEnabled(!true);
               jPasswordFieldSenha.setEnabled(!true);
               jPasswordFieldConfirmacaoSenha.setEnabled(!true);

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonNovo.setEnabled(true); 
                  flag =1;
               }else{
           JOptionPane.showMessageDialog(rootPane, "As senhas não correspondem, tente novamente");
           flag =1;
       }
    }//GEN-LAST:event_jButtonSalvarActionPerformed
 }
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Declaração do botão editar do Form Cadastro de Usuário:
                        
        if (jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmacaoSenha.getText())){
            mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
            mod.setNomeUsuario(jTextFieldNomeUsuario.getText());
            mod.setPermissao((String) jComboBoxPermissao.getSelectedItem());
            mod.setLogin(jTextFieldLogin.getText());
            contrl.EditarUsuario(mod);
            jTextFieldCodigo.setText("");
            jTextFieldNomeUsuario.setText("");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmacaoSenha.setText("");
        
               jButtonSalvar.setEnabled(!true);
               
               jTextFieldCodigo.setEnabled(!true);
               jTextFieldNomeUsuario.setEnabled(!true);
               jTextFieldLogin.setEnabled(!true);
               jPasswordFieldSenha.setEnabled(!true);
               jPasswordFieldConfirmacaoSenha.setEnabled(!true);

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonNovo.setEnabled(true); 
                  flag =1;
               }else{
           JOptionPane.showMessageDialog(rootPane, "As senhas não correspondem, tente novamente");
         
       } 
                                
          preencherTabela("SELECT * FROM tbl_cadastrousuario ORDER BY Codigo_Usuario");
            
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Form Cadastro de Usuário:

           jTextFieldCodigo.setText("");
           jTextFieldNomeUsuario.setText("");
           jTextFieldLogin.setText("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmacaoSenha.setText("");
        
               jTextFieldCodigo.setEnabled(!true);
               jTextFieldNomeUsuario.setEnabled(!true);
               jTextFieldLogin.setEnabled(!true);
               jPasswordFieldSenha.setEnabled(!true);
               jPasswordFieldConfirmacaoSenha.setEnabled(!true);

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonSalvar.setEnabled(true);
                  jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Declaração do botão excluir do Form Cadastro de Usuário:
       
           mod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
           mod.setNomeUsuario(jTextFieldNomeUsuario.getText());
           mod.setPermissao((String) jComboBoxPermissao.getSelectedItem());
           mod.setLogin(jTextFieldLogin.getText());
           contrl.ExcluirUsuario(mod);
           
           preencherTabela("SELECT * FROM tbl_cadastrousuario ORDER BY Codigo_Usuario");
           
           jTextFieldCodigo.setText("");
           jTextFieldLogin.setText("");
           jTextFieldNomeUsuario.setText("");
           jPasswordFieldSenha.setText("");
           jPasswordFieldConfirmacaoSenha.setText("");
        
             jTextFieldCodigo.setEnabled(!true);
             jTextFieldNomeUsuario.setEnabled(!true);
             jTextFieldLogin.setEnabled(!true);
             jPasswordFieldSenha.setEnabled(!true);
             jPasswordFieldConfirmacaoSenha.setEnabled(!true);

            // Declaração do código para Habiitar e desabilitar os botões após excluir um registro:
               jButtonCancelar.setEnabled(false);
               jButtonEditar.setEnabled(false);
               jButtonExcluir.setEnabled(false);
               jButtonSalvar.setEnabled(true);
               jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Form Cadastro de Usuário:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Aplicativo Cadastro de Usuário?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
       // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

           mod = contrl.EditarPrimeiro();
            jTextFieldCodigo.setText(String.valueOf(mod.getCodigo()));
            jTextFieldNomeUsuario.setText(mod.getNomeUsuario());
            jComboBoxPermissao.setSelectedItem(mod.getPermissao());
            jTextFieldLogin.setText(mod.getLogin());
            
               jTextFieldNomeUsuario.requestFocus();
               jTextFieldNomeUsuario.setEnabled(true);
               jComboBoxPermissao.setEnabled(true);
               jTextFieldLogin.setEnabled(true);
               jPasswordFieldSenha.setEnabled(true);
               jPasswordFieldConfirmacaoSenha.setEnabled(true);
            
               // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
                 jButtonCancelar.setEnabled(true);
                 jButtonEditar.setEnabled(true);
                 jButtonExcluir.setEnabled(true);
                 jButtonSalvar.setEnabled(false);
                 jButtonNovo.setEnabled(false);

            
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

            mod = contrl.EditarProximo();
           
            jTextFieldCodigo.setText(String.valueOf(mod.getCodigo()));
            jTextFieldNomeUsuario.setText(mod.getNomeUsuario());
            jComboBoxPermissao.setSelectedItem(mod.getPermissao());
            jTextFieldLogin.setText(mod.getLogin());
            
               jTextFieldNomeUsuario.requestFocus();
               jTextFieldNomeUsuario.setEnabled(true);
               jComboBoxPermissao.setEnabled(true);
               jTextFieldLogin.setEnabled(true);
               jPasswordFieldSenha.setEnabled(true);
               jPasswordFieldConfirmacaoSenha.setEnabled(true);
            
              // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
                 jButtonCancelar.setEnabled(true);
                 jButtonExcluir.setEnabled(true);
                 jButtonSalvar.setEnabled(false);
                 jButtonNovo.setEnabled(false);
              
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

          mod = contrl.EditarAnterior();
           
            jTextFieldCodigo.setText(String.valueOf(mod.getCodigo()));
            jTextFieldNomeUsuario.setText(mod.getNomeUsuario());
            jComboBoxPermissao.setSelectedItem(mod.getPermissao());
            jTextFieldLogin.setText(mod.getLogin());
            
               jTextFieldNomeUsuario.requestFocus();
               jTextFieldNomeUsuario.setEnabled(true);
               jComboBoxPermissao.setEnabled(true);
               jTextFieldLogin.setEnabled(true);
               jPasswordFieldSenha.setEnabled(true);
               jPasswordFieldConfirmacaoSenha.setEnabled(true);
            
              // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
                 jButtonCancelar.setEnabled(true);
                 jButtonEditar.setEnabled(true);
                 jButtonExcluir.setEnabled(true);
                 jButtonSalvar.setEnabled(false);
                 jButtonNovo.setEnabled(false);

        
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
       // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:
            
           mod = contrl.EditarUltimo();
         
           jTextFieldCodigo.setText(String.valueOf(mod.getCodigo()));
            jTextFieldNomeUsuario.setText(mod.getNomeUsuario());
            jComboBoxPermissao.setSelectedItem(mod.getPermissao());
            jTextFieldLogin.setText(mod.getLogin());
            
               jTextFieldNomeUsuario.requestFocus();
               jTextFieldNomeUsuario.setEnabled(true);
               jComboBoxPermissao.setEnabled(true);
               jTextFieldLogin.setEnabled(true);
               jPasswordFieldSenha.setEnabled(true);
               jPasswordFieldConfirmacaoSenha.setEnabled(true);
            
              // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
                 jButtonCancelar.setEnabled(true);
                 jButtonEditar.setEnabled(true);
                 jButtonExcluir.setEnabled(true);
                 jButtonSalvar.setEnabled(false);
                 jButtonNovo.setEnabled(false);
            
    }//GEN-LAST:event_jButtonUltimoActionPerformed
  
     public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Código do Usuário", "Nome do Usuário", "Permissão", "Login" };
                     
             try {
                 connusuario.executaSQL(SQL);
                 connusuario.rs.first();
                  do{
                    dados.add(new Object[]{connusuario.rs.getInt("Codigo_Usuario"),
                    connusuario.rs.getString("Nome_Usuario"), connusuario.rs.getString("Permissao"),
                    connusuario.rs.getString("Login")}); 
                  }while(connusuario.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableCadastroUsuario.setModel(modelo);
               jTableCadastroUsuario.getColumnModel().getColumn(0).setPreferredWidth(130);
               jTableCadastroUsuario.getColumnModel().getColumn(0).setResizable(false);
               jTableCadastroUsuario.getColumnModel().getColumn(1).setPreferredWidth(220);
               jTableCadastroUsuario.getColumnModel().getColumn(1).setResizable(false); 
               jTableCadastroUsuario.getColumnModel().getColumn(2).setPreferredWidth(150);
               jTableCadastroUsuario.getColumnModel().getColumn(2).setResizable(false); 
               jTableCadastroUsuario.getColumnModel().getColumn(3).setPreferredWidth(170);
               jTableCadastroUsuario.getColumnModel().getColumn(3).setResizable(false); 
               jTableCadastroUsuario.getTableHeader().setReorderingAllowed(false);
               jTableCadastroUsuario.setAutoResizeMode( jTableCadastroUsuario.AUTO_RESIZE_OFF);
               jTableCadastroUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
        }
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
            java.util.logging.Logger.getLogger(FrmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox jComboBoxPermissao;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelConfirmacaoSenha;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelPermissao;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelaLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelTable;
    private javax.swing.JPasswordField jPasswordFieldConfirmacaoSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadastroUsuario;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
