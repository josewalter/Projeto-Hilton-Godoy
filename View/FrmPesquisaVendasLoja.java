
package View;

import DAO.ClassConectaBanco;
import Modelo.ModeloTabela;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author: José Walter.
 */
public class FrmPesquisaVendasLoja extends javax.swing.JFrame {
    ClassConectaBanco connpesquisar = new ClassConectaBanco();
    
    public FrmPesquisaVendasLoja() {
        initComponents();
        connpesquisar.conexao();
        
 //-------------------------------------------------------------------------------------------------------
        
        try {
           MaskFormatter form = new MaskFormatter("##/##/####");
           jFormattedTextFieldData.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmPesquisaVendasLoja.class.getName()).log(Level.SEVERE, null, ex);
          }
   
//-------------------------------------------------------------------------------------------------------
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelDigiteData = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendasRealizadas = new javax.swing.JTable();
        jLabelVendasRealizadas = new javax.swing.JLabel();
        jLabelDetalhesVendas = new javax.swing.JLabel();
        jPanelTableDetalhesVenda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDetalhesVendas = new javax.swing.JTable();
        jButtonCancelarVenda = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonRelatorioVendasRealizadas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Vendas");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDigiteData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDigiteData.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDigiteData.setText("Digite uma data");

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.jpg"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTableVendasRealizadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableVendasRealizadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVendasRealizadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVendasRealizadas);

        jLabelVendasRealizadas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVendasRealizadas.setForeground(new java.awt.Color(51, 102, 255));
        jLabelVendasRealizadas.setText("Vendas Realizadas");

        jLabelDetalhesVendas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDetalhesVendas.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDetalhesVendas.setText("Detalhes da Venda");

        jPanelTableDetalhesVenda.setBackground(new java.awt.Color(153, 255, 255));
        jPanelTableDetalhesVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDetalhesVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableDetalhesVendas);

        javax.swing.GroupLayout jPanelTableDetalhesVendaLayout = new javax.swing.GroupLayout(jPanelTableDetalhesVenda);
        jPanelTableDetalhesVenda.setLayout(jPanelTableDetalhesVendaLayout);
        jPanelTableDetalhesVendaLayout.setHorizontalGroup(
            jPanelTableDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableDetalhesVendaLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanelTableDetalhesVendaLayout.setVerticalGroup(
            jPanelTableDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTableDetalhesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_Site_5750_Knob_Cancel.png"))); // NOI18N
        jButtonCancelarVenda.setToolTipText("Cancelar a Venda");
        jButtonCancelarVenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
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

        jButtonRelatorioVendasRealizadas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRelatorioVendasRealizadas.setForeground(new java.awt.Color(255, 51, 51));
        jButtonRelatorioVendasRealizadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatório.png"))); // NOI18N
        jButtonRelatorioVendasRealizadas.setToolTipText("Primeiro Relatório");
        jButtonRelatorioVendasRealizadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRelatorioVendasRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioVendasRealizadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanelTableDetalhesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelDigiteData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRelatorioVendasRealizadas))
                            .addComponent(jLabelVendasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDetalhesVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDigiteData)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRelatorioVendasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelVendasRealizadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabelDetalhesVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTableDetalhesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Pesquisa de Vendas da Loja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(680, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // Declaração do código para realizar a pesquisa de produtos vendidos:
        
           preencherTabelaVendasRealizadasLoja("SELECT * FROM tbl_vendasloja inner join tbl_cadastroclienteloja"
           + " ON tbl_vendasloja.Id_ClienteLoja = tbl_cadastroclienteloja.Id_ClienteLoja "
           + " WHERE Data_Venda = '" + jFormattedTextFieldData.getText() + "'");     
        
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTableVendasRealizadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVendasRealizadasMouseClicked
        // Declaração do código para lançar os produtos vendidos na tabela Detalhes da venda:
           int cod;
            cod = (int) jTableVendasRealizadas.getValueAt(jTableVendasRealizadas.getSelectedRow(),0);
             
           preencherTabelaDetalhesVendaLoja("SELECT * FROM tbl_vendasloja INNER JOIN tbl_itens_vendaprodutosloja "
           + " ON tbl_vendasloja.Id_VendaLoja = tbl_itens_vendaprodutosloja.Id_VendaLoja "
           + " INNER JOIN tbl_cadastroprodutosloja ON tbl_itens_vendaprodutosloja.Id_ProdutoLoja = "
           + " tbl_cadastroprodutosloja.Id_ProdutoLoja WHERE tbl_vendasloja.Id_VendaLoja =" + cod );   
    }//GEN-LAST:event_jTableVendasRealizadasMouseClicked

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        // Declaração do código para cancelar uma venda do Formulário Pesquisa da Venda:

        dispose();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Formulário Pesquisa da Venda:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do formulário Pesquisa da Venda?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonRelatorioVendasRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioVendasRealizadasActionPerformed
        // Declaração do codigo para chamar o relatório de vendas da loja :
        
           try {
              connpesquisar.executaSQL("SELECT tbl_vendasloja.`Id_VendaLoja` AS tbl_vendasloja_Id_VendaLoja, "
              + " tbl_vendasloja.`Data_Venda` AS tbl_vendasloja_Data_Venda, tbl_vendasloja.`Valor_Venda` AS tbl_vendasloja_Valor_Venda, "
              + " tbl_cadastroclienteloja.`Nome_Cliente` AS tbl_cadastroclienteloja_Nome_Cliente,"
              + " tbl_cadastroclienteloja.`Id_ClienteLoja` AS tbl_cadastroclienteloja_Id_ClienteLoja "
              + " FROM `tbl_vendasloja` tbl_vendasloja INNER JOIN `tbl_cadastroclienteloja` tbl_cadastroclienteloja "
              + " ON tbl_vendasloja.`Id_ClienteLoja` = tbl_cadastroclienteloja.`Id_ClienteLoja` "
              + " WHERE Data_Venda ='" + jFormattedTextFieldData.getText() + "'");
              JRResultSetDataSource relatResult = new JRResultSetDataSource(connpesquisar.rs);
              JasperPrint jpPrint = JasperFillManager.fillReport("C:\\Users\\Pc\\Documents\\NetBeansProjects\\Projetos de Clientes\\ProjtHiltonGodoy\\src\\Relatorios\\RelatorioVendasLoja.jasper", new HashMap(), relatResult);
              JasperViewer jv = new JasperViewer(jpPrint,false);
              jv.setVisible(true);
              jv.toFront();
           } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Erro ao chamar o relatório !\n Erro: " + ex);
       }
    }//GEN-LAST:event_jButtonRelatorioVendasRealizadasActionPerformed

//====================================================================================================    
    
public void preencherTabelaVendasRealizadasLoja(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Código da Venda", "Data da Venda", "Valor da Venda", "Cliente"};
            
             try {
                 connpesquisar.executaSQL(SQL);
                 connpesquisar.rs.first();
                  do{
                    dados.add(new Object[]{connpesquisar.rs.getInt("Id_VendaLoja"),
                    connpesquisar.rs.getString("Data_Venda"), connpesquisar.rs.getString("Valor_Venda"), 
                    connpesquisar.rs.getString("Nome_Cliente")});
                 }while(connpesquisar.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableVendasRealizadas.setModel(modelo);
               jTableVendasRealizadas.getColumnModel().getColumn(0).setPreferredWidth(130);
               jTableVendasRealizadas.getColumnModel().getColumn(0).setResizable(false);
               jTableVendasRealizadas.getColumnModel().getColumn(1).setPreferredWidth(180);
               jTableVendasRealizadas.getColumnModel().getColumn(1).setResizable(false); 
               jTableVendasRealizadas.getColumnModel().getColumn(2).setPreferredWidth(100);
               jTableVendasRealizadas.getColumnModel().getColumn(2).setResizable(false); 
               jTableVendasRealizadas.getColumnModel().getColumn(3).setPreferredWidth(300);
               jTableVendasRealizadas.getColumnModel().getColumn(3).setResizable(false); 
               jTableVendasRealizadas.getTableHeader().setReorderingAllowed(false);
               jTableVendasRealizadas.setAutoResizeMode( jTableVendasRealizadas.AUTO_RESIZE_OFF);
               jTableVendasRealizadas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
               
        }

//====================================================================================================
    public void preencherTabelaDetalhesVendaLoja(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Produtos", "Quantidade" };
               connpesquisar.conexao();
             try {
                 connpesquisar.executaSQL(SQL);
                 connpesquisar.rs.first();
                  do{
                    dados.add(new Object[]{connpesquisar.rs.getString("Nome_Produto"),
                    connpesquisar.rs.getString("Quantidade")});
                 }while(connpesquisar.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableDetalhesVendas.setModel(modelo);
               jTableDetalhesVendas.getColumnModel().getColumn(0).setPreferredWidth(230);
               jTableDetalhesVendas.getColumnModel().getColumn(0).setResizable(false);
               jTableDetalhesVendas.getColumnModel().getColumn(1).setPreferredWidth(180);
               jTableDetalhesVendas.getColumnModel().getColumn(1).setResizable(false);
               jTableDetalhesVendas.getTableHeader().setReorderingAllowed(false);
               jTableDetalhesVendas.setAutoResizeMode( jTableDetalhesVendas.AUTO_RESIZE_OFF);
               jTableDetalhesVendas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
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
            java.util.logging.Logger.getLogger(FrmPesquisaVendasLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaVendasLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaVendasLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisaVendasLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPesquisaVendasLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonRelatorioVendasRealizadas;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDetalhesVendas;
    private javax.swing.JLabel jLabelDigiteData;
    private javax.swing.JLabel jLabelVendasRealizadas;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTableDetalhesVenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDetalhesVendas;
    private javax.swing.JTable jTableVendasRealizadas;
    // End of variables declaration//GEN-END:variables
}
