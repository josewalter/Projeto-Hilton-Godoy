
package View;

import DAO.ClassConectaBanco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author: José Walter.
 */
public class FrmPrincipal extends javax.swing.JFrame {
   ClassConectaBanco connprincipal = new ClassConectaBanco();
   FrmPesquisaVendasLoja pesquisavenda = new FrmPesquisaVendasLoja();
   
    public FrmPrincipal(String User) {
        initComponents();
        connprincipal.conexao();
       jLabelUser.setText(User);
       // this.setExtendedState(MAXIMIZED_BOTH);// Este comando deixa a tela principal no monitor inteiro.
    }

    private FrmPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelcontato = new javax.swing.JPanel();
        jLabelUser = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroClienteSalao = new javax.swing.JMenuItem();
        jMenuItemCadastroClienteLoja = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarioLoja = new javax.swing.JMenuItem();
        jMenuItemCadastroFuncionarioSalao = new javax.swing.JMenuItem();
        jMenuItemCadastroUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuVendas = new javax.swing.JMenu();
        jMenuItemControleVendasLoja = new javax.swing.JMenuItem();
        jMenuItemControleVendasSalao = new javax.swing.JMenuItem();
        jMenuItemPesquisarVendasLoja = new javax.swing.JMenuItem();
        jMenuItemPesquisarVendasSalao = new javax.swing.JMenuItem();
        jMenuCadastroProdutos = new javax.swing.JMenu();
        jMenuItemCadastroProdutoSalao = new javax.swing.JMenuItem();
        jMenuItemCadastroProdutosLoja = new javax.swing.JMenuItem();
        jMenuCadastroFornecedores = new javax.swing.JMenu();
        jMenuItemCadastroFornecedoresSalao = new javax.swing.JMenuItem();
        jMenuItemCadastroFornecedoresLoja = new javax.swing.JMenuItem();
        jMenuContasPagar = new javax.swing.JMenu();
        jMenuItemContasPagarSalao = new javax.swing.JMenuItem();
        jMenuItemContasPagarLoja = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAgendamento = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelatorioVendasLoja = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal do Salão Hilton Godoy");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelcontato.setBackground(new java.awt.Color(204, 204, 204));
        jPanelcontato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 51, 51));
        jLabelUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelHora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 51, 51));
        jLabelHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 51, 51));
        jLabelData.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(51, 51, 255));
        jLabelEndereco.setText("JW-X  SISTEMAS E SOFTWARE LTDA Rua Dos Girassóis n=35 Cidade Jardim 2 Americana SP Telefone (19)99996-9973 ");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 51, 51));
        jLabelUsuario.setText("Usuário");
        jLabelUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelcontatoLayout = new javax.swing.GroupLayout(jPanelcontato);
        jPanelcontato.setLayout(jPanelcontatoLayout);
        jPanelcontatoLayout.setHorizontalGroup(
            jPanelcontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelcontatoLayout.createSequentialGroup()
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabelEndereco)
                .addGap(18, 18, 18)
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanelcontatoLayout.setVerticalGroup(
            jPanelcontatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelcontatoLayout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addComponent(jLabelEndereco))
            .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FachadaHiltonGodoy.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jMenuCadastro.setText("Cadastro de Clientes e Funcionários");
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jMenuItemCadastroClienteSalao.setText("Cadastro de Cliente do Salão");
        jMenuItemCadastroClienteSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteSalaoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroClienteSalao);

        jMenuItemCadastroClienteLoja.setText("Cadastro de Cliente da Loja");
        jMenuItemCadastroClienteLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroClienteLojaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroClienteLoja);

        jMenuItemCadastroFuncionarioLoja.setText("Cadastro de Funcionário da Loja");
        jMenuItemCadastroFuncionarioLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionarioLojaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroFuncionarioLoja);

        jMenuItemCadastroFuncionarioSalao.setText("Cadastro de Funcionário do Salão");
        jMenuItemCadastroFuncionarioSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFuncionarioSalaoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroFuncionarioSalao);

        jMenuItemCadastroUsuario.setText("Cadastro de Usuário");
        jMenuItemCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroUsuario);
        jMenuCadastro.add(jSeparator2);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastro);

        jMenuVendas.setText("Vendas");

        jMenuItemControleVendasLoja.setText("Controle de Vendas da Loja");
        jMenuItemControleVendasLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControleVendasLojaActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuItemControleVendasLoja);

        jMenuItemControleVendasSalao.setText("Controle de Vendas do Salão");
        jMenuItemControleVendasSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemControleVendasSalaoActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuItemControleVendasSalao);

        jMenuItemPesquisarVendasLoja.setText("Pesquisar vendas da loja");
        jMenuItemPesquisarVendasLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarVendasLojaActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuItemPesquisarVendasLoja);

        jMenuItemPesquisarVendasSalao.setText("Pesquisar vendas do salão");
        jMenuItemPesquisarVendasSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisarVendasSalaoActionPerformed(evt);
            }
        });
        jMenuVendas.add(jMenuItemPesquisarVendasSalao);

        jMenuBar1.add(jMenuVendas);

        jMenuCadastroProdutos.setText("Cadastro de Produtos");

        jMenuItemCadastroProdutoSalao.setText("Cadastro de Produto do Salão");
        jMenuItemCadastroProdutoSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutoSalaoActionPerformed(evt);
            }
        });
        jMenuCadastroProdutos.add(jMenuItemCadastroProdutoSalao);

        jMenuItemCadastroProdutosLoja.setText("Cadastro de Produtos da Loja");
        jMenuItemCadastroProdutosLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroProdutosLojaActionPerformed(evt);
            }
        });
        jMenuCadastroProdutos.add(jMenuItemCadastroProdutosLoja);

        jMenuBar1.add(jMenuCadastroProdutos);

        jMenuCadastroFornecedores.setText("Cadastro de Fornecedores");

        jMenuItemCadastroFornecedoresSalao.setText("Cadastro de Fornecedores do Salão");
        jMenuItemCadastroFornecedoresSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFornecedoresSalaoActionPerformed(evt);
            }
        });
        jMenuCadastroFornecedores.add(jMenuItemCadastroFornecedoresSalao);

        jMenuItemCadastroFornecedoresLoja.setText("Cadastro de Fornecedores da Loja");
        jMenuItemCadastroFornecedoresLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroFornecedoresLojaActionPerformed(evt);
            }
        });
        jMenuCadastroFornecedores.add(jMenuItemCadastroFornecedoresLoja);

        jMenuBar1.add(jMenuCadastroFornecedores);

        jMenuContasPagar.setText("Contas a Pagar");

        jMenuItemContasPagarSalao.setText("Contas a Pagar do Salão");
        jMenuItemContasPagarSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContasPagarSalaoActionPerformed(evt);
            }
        });
        jMenuContasPagar.add(jMenuItemContasPagarSalao);

        jMenuItemContasPagarLoja.setText("Contas a Pagar da Loja");
        jMenuItemContasPagarLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContasPagarLojaActionPerformed(evt);
            }
        });
        jMenuContasPagar.add(jMenuItemContasPagarLoja);

        jMenuBar1.add(jMenuContasPagar);

        jMenu1.setText("Agendamento de Serviços");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemAgendamento.setText("Agendamento");
        jMenuItemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAgendamento);

        jMenuBar1.add(jMenu1);

        jMenuRelatorio.setText("Relatórios");

        jMenuItemRelatorioVendasLoja.setText("Relatório de Vendas da loja");
        jMenuItemRelatorioVendasLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioVendasLojaActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelatorioVendasLoja);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, Short.MAX_VALUE))
                    .addComponent(jPanelcontato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelcontato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroClienteSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteSalaoActionPerformed
       // Declaração do código para chamar o Form Cadastro de Clientes do Salão:
        
        try {          
            connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
            connprincipal.rs.first();
          if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
            ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
            FrmCadastroClienteSalao salao = new FrmCadastroClienteSalao();
            salao.setVisible(true);
          }else{
             JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }           
    }//GEN-LAST:event_jMenuItemCadastroClienteSalaoActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        
    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jMenuItemCadastroClienteLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroClienteLojaActionPerformed
        // Declaração do código para chamar o Form Cadastro de Clientes da Loja:
        
           try {          
               connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
               connprincipal.rs.first();
            if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
              || connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
               FrmCadastroClienteLoja loja = new FrmCadastroClienteLoja();
               loja.setVisible(true);
            }else{
               JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       } 
           
    }//GEN-LAST:event_jMenuItemCadastroClienteLojaActionPerformed

    private void jMenuItemCadastroFuncionarioLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionarioLojaActionPerformed
       // Declaração do código para chamar o Form Cadastro de Funcionário da Loja:
       
          try {          
               connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
               connprincipal.rs.first();
            if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
               FrmCadastroFuncionarioLoja funcionarioloja = new FrmCadastroFuncionarioLoja();
               funcionarioloja.setVisible(true);
            }else{
               JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }  
          
    }//GEN-LAST:event_jMenuItemCadastroFuncionarioLojaActionPerformed

    private void jMenuItemCadastroFuncionarioSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFuncionarioSalaoActionPerformed
        // Declaração do código para chamar o Form Cadastro de Funcionário do Salão:
        
           try {          
               connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
               connprincipal.rs.first();
            if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
               FrmCadastroFuncionariosSalao funcionariosalao = new FrmCadastroFuncionariosSalao();
               funcionariosalao.setVisible(true);
            }else{
               JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       } 
           
    }//GEN-LAST:event_jMenuItemCadastroFuncionarioSalaoActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
       // Declaração do código para chamar o Form Principal:
         
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Sistema?" );
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadastroProdutoSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutoSalaoActionPerformed
         // Declaração do código para chamar o Form Cadastro de Produto do Salão:
        
            try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
                ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmCadastroProdutosSalao produtosalao = new FrmCadastroProdutosSalao();
                produtosalao.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       } 
            
    }//GEN-LAST:event_jMenuItemCadastroProdutoSalaoActionPerformed

    private void jMenuItemCadastroProdutosLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroProdutosLojaActionPerformed
        // Declaração do código para chamar o Form Cadastro de Produto do Salão:
        
            try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
                ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmCadastroProdutosLoja produtoloja = new FrmCadastroProdutosLoja();
                produtoloja.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       } 
            
    }//GEN-LAST:event_jMenuItemCadastroProdutosLojaActionPerformed

    private void jMenuItemCadastroFornecedoresSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFornecedoresSalaoActionPerformed
        // Declaração do código para chamar o Form Cadastro de Fornecedores do Salão:
        
           try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
                ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmCadastroFornecedoresSalao forsalao = new FrmCadastroFornecedoresSalao();
                forsalao.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       } 
           
    }//GEN-LAST:event_jMenuItemCadastroFornecedoresSalaoActionPerformed

    private void jMenuItemCadastroFornecedoresLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroFornecedoresLojaActionPerformed
        // Declaração do código para chamar o Form Cadastro de Fornecedores da Loja:
        
          try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
                ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmCadastroFornecedoresLoja forloja = new FrmCadastroFornecedoresLoja();
                forloja.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       } 
           
    }//GEN-LAST:event_jMenuItemCadastroFornecedoresLojaActionPerformed

    private void jMenuItemControleVendasLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControleVendasLojaActionPerformed
        // Declaração do código para chamar o Form Controle de Vendas da Loja:
          
           try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
                ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmVendasLoja vendasloja = new FrmVendasLoja();
                vendasloja.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }
           
    }//GEN-LAST:event_jMenuItemControleVendasLojaActionPerformed

    private void jMenuItemControleVendasSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemControleVendasSalaoActionPerformed
        // Declaração do código para chamar o Form Controle de Vendas do Salão:
        
           try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Vendedor(a)")
                ||  connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmVendasSalao vendassalao = new FrmVendasSalao();
                vendassalao.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }
           
    }//GEN-LAST:event_jMenuItemControleVendasSalaoActionPerformed

    private void jMenuItemContasPagarSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContasPagarSalaoActionPerformed
        // Declaração do código para chamar o Form Contas a Pagar do Salão:
        
            try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                 FrmContasPagarSalao contassalao = new FrmContasPagarSalao();
                contassalao.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }            
           
    }//GEN-LAST:event_jMenuItemContasPagarSalaoActionPerformed

    private void jMenuItemContasPagarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContasPagarLojaActionPerformed
        // Declaração do código para chamar o Form Contas a Pagar da Loja:
        
             try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmContasPagarLoja contasloja = new FrmContasPagarLoja();
                contasloja.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }         
           
    }//GEN-LAST:event_jMenuItemContasPagarLojaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendamentoActionPerformed
        // Declaração do código para chamar o Form Agendamento de Serviços:
        
          try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")
                 || connprincipal.rs.getString("Permissao").equals("Vendedor(a)")){
         
                FrmAgendamentoServicoSalao servico = new FrmAgendamentoServicoSalao();
                servico.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }
          
    }//GEN-LAST:event_jMenuItemAgendamentoActionPerformed

    private void jMenuItemCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroUsuarioActionPerformed
        // Declaração do código para chamar o Form Cadastro de Usuário:
        
           try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")){
         
                FrmCadastroUsuario cadusuario = new FrmCadastroUsuario();
                cadusuario.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }
           
    }//GEN-LAST:event_jMenuItemCadastroUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Declaração do código para mostrar data e hora na parte inferior da tela principal:
        
        // Codigo para pegar a data do sistema.
         Date dataSistema = new Date();
         SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         jLabelData.setText(formato.format(dataSistema));
         
         //Codigo para pegar a hora do sistema.
         Timer timer = new Timer(1000, new hora());
         timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        // TODO add your handling code here:
        
           FrmSobre sobre = new FrmSobre();
           sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemPesquisarVendasLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarVendasLojaActionPerformed
        // Declaração do código para pesquisar a venda e imprimir relatório loja:

        try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")
                ||connprincipal.rs.getString("Permissao").equals("Desenvolvedor")){
         
                FrmPesquisaVendasLoja pesquisavenda = new FrmPesquisaVendasLoja();
                pesquisavenda.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }
          
    }//GEN-LAST:event_jMenuItemPesquisarVendasLojaActionPerformed

    private void jMenuItemPesquisarVendasSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisarVendasSalaoActionPerformed
        // Declaração do código para pesquisar a venda e imprimir relatório do Salão:
        
           try {          
                connprincipal.executaSQL("SELECT * FROM tbl_cadastrousuario WHERE Nome_Usuario ='"+ jLabelUser.getText() +"'");
                connprincipal.rs.first();
              if(connprincipal.rs.getString("Permissao").equals("Administrador")|| connprincipal.rs.getString("Permissao").equals("Diretoria")
                 ||connprincipal.rs.getString("Permissao").equals("Desenvolvedor")){
         
                FrmPesquisaVendasSalao pesquisavenda = new FrmPesquisaVendasSalao();
                pesquisavenda.setVisible(true);
              }else{
                 JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
           }
    
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Você não possui permissão para acessar está area!!" );
       }
    }//GEN-LAST:event_jMenuItemPesquisarVendasSalaoActionPerformed

    private void jMenuItemRelatorioVendasLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioVendasLojaActionPerformed
        // Declaração do codigo para chamar o relatório de vendas da loja :
           /*
           try {
              connprincipal.executaSQL("SELECT * FROM tbl_vendasloja "
              + " inner join tbl_cadastroclienteloja tbl_vendasloja.Id_ClienteLoja = tbl_cadastroclienteloja.Id_ClienteLoja"
              + " WHERE Data_Venda = '" + JFormatte + "'");
              JRResultSetDataSource relatResult = new JRResultSetDataSource(connprincipal.rs);
              JasperPrint jpPrint = JasperFillManager.fillReport("C:\\Users\\Pc\\Documents\\NetBeansProjects\\Projetos de Clientes\\ProjtHiltonGodoy\\src\\Relatorios\\RelatorioVendasLoja.jasper", new HashMap(), relatResult);
              JasperViewer jv = new JasperViewer(jpPrint,false);
              jv.setVisible(true);
              jv.toFront();
           } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Erro ao chamar o relatório !\n Erro: " + ex);
       }
        
        */
    }//GEN-LAST:event_jMenuItemRelatorioVendasLojaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuCadastroFornecedores;
    private javax.swing.JMenu jMenuCadastroProdutos;
    private javax.swing.JMenu jMenuContasPagar;
    private javax.swing.JMenuItem jMenuItemAgendamento;
    private javax.swing.JMenuItem jMenuItemCadastroClienteLoja;
    private javax.swing.JMenuItem jMenuItemCadastroClienteSalao;
    private javax.swing.JMenuItem jMenuItemCadastroFornecedoresLoja;
    private javax.swing.JMenuItem jMenuItemCadastroFornecedoresSalao;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarioLoja;
    private javax.swing.JMenuItem jMenuItemCadastroFuncionarioSalao;
    private javax.swing.JMenuItem jMenuItemCadastroProdutoSalao;
    private javax.swing.JMenuItem jMenuItemCadastroProdutosLoja;
    private javax.swing.JMenuItem jMenuItemCadastroUsuario;
    private javax.swing.JMenuItem jMenuItemContasPagarLoja;
    private javax.swing.JMenuItem jMenuItemContasPagarSalao;
    private javax.swing.JMenuItem jMenuItemControleVendasLoja;
    private javax.swing.JMenuItem jMenuItemControleVendasSalao;
    private javax.swing.JMenuItem jMenuItemPesquisarVendasLoja;
    private javax.swing.JMenuItem jMenuItemPesquisarVendasSalao;
    private javax.swing.JMenuItem jMenuItemRelatorioVendasLoja;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JPanel jPanelcontato;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables

class hora implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e){
  Calendar now = Calendar.getInstance();
  jLabelHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
   }
}
}
