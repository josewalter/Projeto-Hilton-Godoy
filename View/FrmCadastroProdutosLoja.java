
package View;

import Controle.ControleCadastroProdutosLoja;
import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroProdutoLoja;
import Modelo.ModeloTabela;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author: José Walter.
 */
public class FrmCadastroProdutosLoja extends javax.swing.JFrame {
   ClassConectaBanco connloja = new ClassConectaBanco();
   ClassConectaBanco connpesquisa = new ClassConectaBanco();
   ModeloCadastroProdutoLoja mod = new ModeloCadastroProdutoLoja();
   ControleCadastroProdutosLoja contrl = new ControleCadastroProdutosLoja();
  
    public FrmCadastroProdutosLoja() {
        initComponents();
        connloja.conexao();
        preencherCombo();
        preencherTabela("SELECT * FROM tbl_cadastroprodutosloja "); 
        
        //-------------------------------------------------------------------------------------------------------
        
               try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataPedido.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmCadastroProdutosLoja.class.getName()).log(Level.SEVERE, null, ex);
          }
         
//-------------------------------------------------------------------------------------------------------               
               
             try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataEntrega.setFormatterFactory(new DefaultFormatterFactory(form));
            } catch (ParseException ex) {
              Logger.getLogger(FrmCadastroProdutosLoja.class.getName()).log(Level.SEVERE, null, ex);
           }
         
//-------------------------------------------------------------------------------------------------------
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelIdCodigoProduto = new javax.swing.JLabel();
        jLabelServicosFeitos = new javax.swing.JLabel();
        jFormattedTextFieldDataPedido = new javax.swing.JFormattedTextField();
        jLabelDataPedido = new javax.swing.JLabel();
        jTextFieldPrecoVenda = new javax.swing.JTextField();
        jLabelPrecoVenda = new javax.swing.JLabel();
        jPanelButton = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldIdProduto = new javax.swing.JTextField();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabelDataPedido1 = new javax.swing.JLabel();
        jFormattedTextFieldDataEntrega = new javax.swing.JFormattedTextField();
        jTextFieldDescricaoProduto = new javax.swing.JTextField();
        jLabelDescricaoProduto = new javax.swing.JLabel();
        jTextFieldPrecoCusto = new javax.swing.JTextField();
        jLabelPrecoCusto = new javax.swing.JLabel();
        jTextFieldCodigoBarra = new javax.swing.JTextField();
        jLabelCodigoBarra = new javax.swing.JLabel();
        jComboBoxNomeFornecedor = new javax.swing.JComboBox();
        jLabelNomeFornecedor = new javax.swing.JLabel();
        jButtonCadastroFornecedor = new javax.swing.JButton();
        jPanelTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoja = new javax.swing.JTable();
        jLabelIdCodigoProduto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos do Salão");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelIdCodigoProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIdCodigoProduto.setForeground(new java.awt.Color(51, 102, 255));
        jLabelIdCodigoProduto.setText("Código do Produto");

        jLabelServicosFeitos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelServicosFeitos.setForeground(new java.awt.Color(51, 102, 255));
        jLabelServicosFeitos.setText("Nome do Produto");

        jFormattedTextFieldDataPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDataPedido.setEnabled(false);

        jLabelDataPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataPedido.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataPedido.setText("Data do Pedido");

        jTextFieldPrecoVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldPrecoVenda.setEnabled(false);

        jLabelPrecoVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPrecoVenda.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPrecoVenda.setText("Preço de Venda");

        jPanelButton.setBackground(new java.awt.Color(51, 102, 255));
        jPanelButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 0, 51));
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.jpg"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setToolTipText("Seta o último registro");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelButtonLayout = new javax.swing.GroupLayout(jPanelButton);
        jPanelButton.setLayout(jPanelButtonLayout);
        jPanelButtonLayout.setHorizontalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonLayout.setVerticalGroup(
            jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPesquisar))
                .addGap(27, 27, 27))
        );

        jTextFieldQuantidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldQuantidade.setEnabled(false);

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQuantidade.setForeground(new java.awt.Color(51, 102, 255));
        jLabelQuantidade.setText("Quantidade");

        jTextFieldIdProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldIdProduto.setEnabled(false);

        jTextFieldNomeProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNomeProduto.setEnabled(false);
        jTextFieldNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeProdutoActionPerformed(evt);
            }
        });

        jLabelDataPedido1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataPedido1.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataPedido1.setText("Data da Entrega");

        jFormattedTextFieldDataEntrega.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDataEntrega.setEnabled(false);

        jTextFieldDescricaoProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldDescricaoProduto.setEnabled(false);

        jLabelDescricaoProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDescricaoProduto.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDescricaoProduto.setText("Descrição do Produto");

        jTextFieldPrecoCusto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldPrecoCusto.setEnabled(false);

        jLabelPrecoCusto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPrecoCusto.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPrecoCusto.setText("Preço de Custo");

        jTextFieldCodigoBarra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCodigoBarra.setEnabled(false);

        jLabelCodigoBarra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigoBarra.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCodigoBarra.setText("Código de Barra");

        jComboBoxNomeFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxNomeFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNomeFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeFornecedor.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNomeFornecedor.setText("Nome do Fornecedor");

        jButtonCadastroFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCadastroFornecedor.setForeground(new java.awt.Color(255, 51, 0));
        jButtonCadastroFornecedor.setText("Cadastro de Fornecedor");
        jButtonCadastroFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroFornecedorActionPerformed(evt);
            }
        });

        jPanelTabela.setBackground(new java.awt.Color(102, 255, 255));
        jPanelTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTableLoja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableLoja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLojaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLoja);

        javax.swing.GroupLayout jPanelTabelaLayout = new javax.swing.GroupLayout(jPanelTabela);
        jPanelTabela.setLayout(jPanelTabelaLayout);
        jPanelTabelaLayout.setHorizontalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanelTabelaLayout.setVerticalGroup(
            jPanelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jComboBoxNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabelQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))
                                    .addComponent(jTextFieldQuantidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldIdProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelIdCodigoProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabelServicosFeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(282, 282, 282))
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDataPedido))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataPedido1)
                                    .addComponent(jFormattedTextFieldDataEntrega))))
                        .addGap(89, 89, 89))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdCodigoProduto)
                            .addComponent(jLabelServicosFeitos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDataPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDataPedido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelPrecoVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDescricaoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelPrecoCusto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFornecedor)
                    .addComponent(jLabelCodigoBarra))
                .addGap(13, 13, 13)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCodigoBarra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCadastroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelIdCodigoProduto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIdCodigoProduto1.setForeground(new java.awt.Color(51, 102, 255));
        jLabelIdCodigoProduto1.setText("Tela de apresentação do Cadastro de Produtos da Loja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(jLabelIdCodigoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIdCodigoProduto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(901, 571));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Form Mapa de Controle de Não Conformidade:
              
          jTextFieldNomeProduto.setEnabled(true);
          jTextFieldNomeProduto.requestFocus();
          jFormattedTextFieldDataPedido.setEnabled(true);
          jFormattedTextFieldDataEntrega.setEnabled(true);
          jTextFieldQuantidade.setEnabled(true);
          jTextFieldDescricaoProduto.setEnabled(true);
          jTextFieldPrecoCusto.setEnabled(true);
          jTextFieldPrecoVenda.setEnabled(true);
          jTextFieldCodigoBarra.setEnabled(true);
          jComboBoxNomeFornecedor.setEnabled(true);

            jTextFieldNomeProduto.setText("");
            jTextFieldNomeProduto.requestFocus();
            jFormattedTextFieldDataPedido.setText("");
            jFormattedTextFieldDataEntrega.setText("");
            jTextFieldQuantidade.setText("");
            jTextFieldDescricaoProduto.setText("");
            jTextFieldPrecoCusto.setText("");
            jTextFieldPrecoVenda.setText("");
            jTextFieldCodigoBarra.setText("");
            jComboBoxNomeFornecedor.setSelectedItem("");
        
            // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
               jButtonNovo.setEnabled(false);
               jButtonSalvar.setEnabled(true);
               jButtonEditar.setEnabled(false);
               jButtonCancelar.setEnabled(true);
               jButtonExcluir.setEnabled(false);
           
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Formulário de Cadastro de Produtos do Salão :
          
           mod.setNomeProduto(jTextFieldNomeProduto.getText());
           mod.setDataPedido(jFormattedTextFieldDataPedido.getText());
           mod.setDataEntrega(jFormattedTextFieldDataEntrega.getText());
           mod.setQuantidade(jTextFieldQuantidade.getText());
           mod.setDescricaoProduto(jTextFieldDescricaoProduto.getText());
           mod.setPrecoCusto(jTextFieldPrecoCusto.getText());
           mod.setPrecoVenda(jTextFieldPrecoVenda.getText());
           mod.setCodigoBarra(jTextFieldCodigoBarra.getText());
           mod.setNomeFornecedor((String) jComboBoxNomeFornecedor.getSelectedItem());           

            contrl.InserirProdutoLoja(mod);
           //preencherTabela("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento");

            jTextFieldNomeProduto.setText("");
            jFormattedTextFieldDataPedido.setText("");
            jFormattedTextFieldDataEntrega.setText("");
            jTextFieldQuantidade.setText("");
            jTextFieldDescricaoProduto.setText("");
            jTextFieldPrecoCusto.setText("");
            jTextFieldPrecoVenda.setText("");
            jTextFieldCodigoBarra.setText("");
            jComboBoxNomeFornecedor.setSelectedItem("");
        
             jTextFieldNomeProduto.setEnabled(!true);
             jFormattedTextFieldDataPedido.setEnabled(!true);
             jFormattedTextFieldDataEntrega.setEnabled(!true);
             jTextFieldQuantidade.setEnabled(!true);
             jTextFieldDescricaoProduto.setEnabled(!true);
             jTextFieldPrecoCusto.setEnabled(!true);
             jTextFieldPrecoVenda.setEnabled(!true);
             jTextFieldCodigoBarra.setEnabled(!true);
             jComboBoxNomeFornecedor.setEnabled(!true);

            // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
               jButtonCancelar.setEnabled(false);
               jButtonEditar.setEnabled(false);
               jButtonExcluir.setEnabled(false);
               jButtonSalvar.setEnabled(true);
               jButtonNovo.setEnabled(true);
               
                preencherTabela("SELECT * FROM tbl_cadastroprodutosloja "); 
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Declaração do botão editar do Form Cadastro de Produtos do Salão:

           mod.setNomeProduto(jTextFieldNomeProduto.getText());
           mod.setDataPedido(jFormattedTextFieldDataPedido.getText());
           mod.setDataEntrega(jFormattedTextFieldDataEntrega.getText());
           mod.setQuantidade(jTextFieldQuantidade.getText());
           mod.setDescricaoProduto(jTextFieldDescricaoProduto.getText());
           mod.setPrecoCusto(jTextFieldPrecoCusto.getText());
           mod.setPrecoVenda(jTextFieldPrecoVenda.getText());
           mod.setCodigoBarra(jTextFieldCodigoBarra.getText());
           mod.setNomeFornecedor((String) jComboBoxNomeFornecedor.getSelectedItem()); 
           mod.setCodigoProdutoLoja(Integer.parseInt(jTextFieldIdProduto.getText()));

           contrl.EditarProdutoLoja(mod);
            
            jTextFieldNomeProduto.setText("");
            jTextFieldNomeProduto.requestFocus();
            jFormattedTextFieldDataPedido.setText("");
            jFormattedTextFieldDataEntrega.setText("");
            jTextFieldQuantidade.setText("");
            jTextFieldDescricaoProduto.setText("");
            jTextFieldPrecoCusto.setText("");
            jTextFieldPrecoVenda.setText("");
            jTextFieldCodigoBarra.setText("");
            jComboBoxNomeFornecedor.setSelectedItem("");
        
             jTextFieldNomeProduto.setEnabled(!true);
             jFormattedTextFieldDataPedido.setEnabled(!true);
             jFormattedTextFieldDataEntrega.setEnabled(!true);
             jTextFieldQuantidade.setEnabled(!true);
             jTextFieldDescricaoProduto.setEnabled(!true);
             jTextFieldPrecoCusto.setEnabled(!true);
             jTextFieldPrecoVenda.setEnabled(!true);
             jTextFieldCodigoBarra.setEnabled(!true);
             jComboBoxNomeFornecedor.setEnabled(!true);

            // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
               jButtonCancelar.setEnabled(false);
               jButtonEditar.setEnabled(false);
               jButtonExcluir.setEnabled(false);
               jButtonSalvar.setEnabled(true);
               jButtonNovo.setEnabled(true);
               
                 preencherTabela("SELECT * FROM tbl_cadastroprodutosloja "); 

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Form Cadastro de Produtos do Salão:

        jTextFieldNomeProduto.setText("");
        jFormattedTextFieldDataPedido.setText("");
        jFormattedTextFieldDataEntrega.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldPrecoCusto.setText("");
        jTextFieldPrecoVenda.setText("");
        jTextFieldCodigoBarra.setText("");
        jComboBoxNomeFornecedor.setSelectedItem("");
        
          jTextFieldNomeProduto.setEnabled(!true);
          jFormattedTextFieldDataPedido.setEnabled(!true);
          jFormattedTextFieldDataEntrega.setEnabled(!true);
          jTextFieldQuantidade.setEnabled(!true);
          jTextFieldDescricaoProduto.setEnabled(!true);
          jTextFieldPrecoCusto.setEnabled(!true);
          jTextFieldPrecoVenda.setEnabled(!true);
          jTextFieldCodigoBarra.setEnabled(!true);
          jComboBoxNomeFornecedor.setEnabled(!true);

          // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonSalvar.setEnabled(true);
            jButtonNovo.setEnabled(true);
             
              preencherTabela("SELECT * FROM tbl_cadastroprodutosloja "); 
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Declaração do botão excluir do Formulário Cadastro de Produtos do Salão:

           mod.setCodigoProdutoLoja(Integer.parseInt(jTextFieldIdProduto.getText()));
           mod.setNomeProduto(jTextFieldNomeProduto.getText());
           mod.setDataPedido(jFormattedTextFieldDataPedido.getText());
           mod.setDataEntrega(jFormattedTextFieldDataEntrega.getText());
           mod.setQuantidade(jTextFieldQuantidade.getText());
           mod.setDescricaoProduto(jTextFieldDescricaoProduto.getText());
           mod.setPrecoCusto(jTextFieldPrecoCusto.getText());
           mod.setPrecoVenda(jTextFieldPrecoVenda.getText());
           mod.setCodigoBarra(jTextFieldCodigoBarra.getText());
           mod.setNomeFornecedor((String) jComboBoxNomeFornecedor.getSelectedItem());
           
           contrl.ExcluirProdutoLoja(mod);

           // preencherTabela("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento");

             jTextFieldNomeProduto.setText("");
             jTextFieldNomeProduto.requestFocus();
             jFormattedTextFieldDataPedido.setText("");
             jFormattedTextFieldDataEntrega.setText("");
             jTextFieldQuantidade.setText("");
             jTextFieldDescricaoProduto.setText("");
             jTextFieldPrecoCusto.setText("");
             jTextFieldPrecoVenda.setText("");
             jTextFieldCodigoBarra.setText("");
             jComboBoxNomeFornecedor.setSelectedItem("");
        
              jTextFieldNomeProduto.setEnabled(!true);
              jFormattedTextFieldDataPedido.setEnabled(!true);
              jFormattedTextFieldDataEntrega.setEnabled(!true);
              jTextFieldQuantidade.setEnabled(!true);
              jTextFieldDescricaoProduto.setEnabled(!true);
              jTextFieldPrecoCusto.setEnabled(!true);
              jTextFieldPrecoVenda.setEnabled(!true);
              jTextFieldCodigoBarra.setEnabled(!true);
              jComboBoxNomeFornecedor.setEnabled(!true);

             // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                jButtonCancelar.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonSalvar.setEnabled(true);
                jButtonNovo.setEnabled(true);
                
                preencherTabela("SELECT * FROM tbl_cadastroprodutosloja "); 
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Form Cadastro de Produtos do Salão:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Cadastro de Produtos da Loja?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Formulario de Cadastro de Produtos do Salão:

           mod.setPesquisar(jTextFieldPesquisar.getText());
           ModeloCadastroProdutoLoja modelo = contrl.BuscaProduto(mod);
            
             jTextFieldIdProduto.setText(String.valueOf(modelo.getCodigoProdutoLoja()));
             jTextFieldPesquisar.requestFocus();
             jTextFieldNomeProduto.setText(modelo.getNomeProduto());
             jFormattedTextFieldDataPedido.setText(modelo.getDataPedido());
             jFormattedTextFieldDataEntrega.setText(modelo.getDataEntrega());
             jTextFieldQuantidade.setText(String.valueOf(modelo.getQuantidade()));
             jTextFieldDescricaoProduto.setText(modelo.getDescricaoProduto());
             jTextFieldPrecoCusto.setText(String.valueOf(modelo.getPrecoCusto()));
             jTextFieldPrecoVenda.setText(String.valueOf(modelo.getPrecoVenda()));
             jTextFieldCodigoBarra.setText(modelo.getCodigoBarra());
             jComboBoxNomeFornecedor.setSelectedItem(modelo.getNomeFornecedor());
                               
              jTextFieldNomeProduto.setEnabled(true);
               jTextFieldNomeProduto.requestFocus();
               jFormattedTextFieldDataPedido.setEnabled(true);
               jFormattedTextFieldDataEntrega.setEnabled(true);
               jTextFieldQuantidade.setEnabled(true);
               jTextFieldDescricaoProduto.setEnabled(true);
               jTextFieldPrecoCusto.setEnabled(true);
               jTextFieldPrecoVenda.setEnabled(true);
               jTextFieldCodigoBarra.setEnabled(true);
               jComboBoxNomeFornecedor.setEnabled(true);
            
              // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
                 jButtonCancelar.setEnabled(true);
                 jButtonEditar.setEnabled(true);
                 jButtonExcluir.setEnabled(true);
                 jButtonSalvar.setEnabled(false);
                 jButtonNovo.setEnabled(false);
                 
                  preencherTabela("SELECT * FROM tbl_cadastroprodutosloja WHERE Nome_Produto like '%" + jTextFieldPesquisar.getText() + "%'");  
             
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroFornecedorActionPerformed
        // Código de acesso ao Form Cadastro de Fornecedores da  Loja de dentro do formulário de Produtos da Loja:

        FrmCadastroFornecedoresLoja cadfor = new FrmCadastroFornecedoresLoja();
        cadfor.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroFornecedorActionPerformed

    private void jTableLojaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLojaMouseClicked
        // Declaração do código de evento do mouse para escolher um dos dados da tabela :
        
           String nomeProduto = ""+ jTableLoja.getValueAt(jTableLoja.getSelectedRow(), 0);
           connloja.conexao();
       try {
           connloja.executaSQL("SELECT * FROM tbl_cadastroprodutosloja WHERE Nome_Produto ='" + nomeProduto + "'");
           connloja.rs.first();
           jTextFieldIdProduto.setText(String.valueOf(connloja.rs.getInt("Id_ProdutoLoja")));
           jTextFieldNomeProduto.setText(connloja.rs.getString("Nome_Produto"));
           jFormattedTextFieldDataPedido.setText(connloja.rs.getString("Data_Pedido"));
           jFormattedTextFieldDataEntrega.setText(connloja.rs.getString("Data_Entrega"));
           jTextFieldQuantidade.setText(connloja.rs.getString("Quantidade"));
           jTextFieldDescricaoProduto.setText(connloja.rs.getString("Descricao_Produto"));
           jTextFieldPrecoCusto.setText(connloja.rs.getString("Preco_Custo"));
           jTextFieldPrecoVenda.setText(connloja.rs.getString("Preco_Venda"));
           jTextFieldCodigoBarra.setText(connloja.rs.getString("Codigo_Barra"));
              
              connpesquisa.executaSQL("SELECT * FROM tbl_cadastroprodutosloja WHERE Id_FornecedorLoja ="+connloja.rs.getInt("Id_FornecedorLoja"));
              connpesquisa.rs.first();
              jComboBoxNomeFornecedor.setSelectedItem(connpesquisa.rs.getString("Nome_Fornecedor"));
              connpesquisa.desconecta();
              connloja.desconecta();
                             
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar os dados !\nErro:" + ex);
           
       }
           
    }//GEN-LAST:event_jTableLojaMouseClicked

    private void jTextFieldNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeProdutoActionPerformed

//------------------------------------------------------------------------------------------------------------------------
    // Código para preencher o combo Fornecedores.
    public void preencherCombo(){
        
      try {
          connloja.conexao();
          connloja.executaSQL("SELECT * FROM tbl_cadastrofornecedoresloja ORDER BY Id_FornecedorLoja");
          connloja.rs.first();
          jComboBoxNomeFornecedor.removeAllItems();
        do{
          jComboBoxNomeFornecedor.addItem(connloja.rs.getString("Nome_Fornecedor"));
          }while(connloja.rs.next());
          connloja.desconecta();
       } catch (Exception ex) {
          JOptionPane.showMessageDialog(rootPane, "Erro ao preencher Combo! \n Erro: " + ex);
          connloja.desconecta();
      }
    }
//--------------------------------------------------------------------------------------------------------    
 public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Nome do Produto", "Quantidade", "Preço do Produto"  };
              connloja.conexao();
             try {
                 connloja.executaSQL(SQL);
                 connloja.rs.first();
                  do{
                    dados.add(new Object[]{connloja.rs.getString("Nome_Produto"),
                    connloja.rs.getString("Quantidade"), connloja.rs.getString("Preco_Venda")});
                 }while(connloja.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableLoja.setModel(modelo);
               jTableLoja.getColumnModel().getColumn(0).setPreferredWidth(350);
               jTableLoja.getColumnModel().getColumn(0).setResizable(false);
               jTableLoja.getColumnModel().getColumn(1).setPreferredWidth(100);
               jTableLoja.getColumnModel().getColumn(1).setResizable(false); 
               jTableLoja.getColumnModel().getColumn(2).setPreferredWidth(200);
               jTableLoja.getColumnModel().getColumn(2).setResizable(false); 
               jTableLoja.getTableHeader().setReorderingAllowed(false);
               jTableLoja.setAutoResizeMode( jTableLoja.AUTO_RESIZE_OFF);
               jTableLoja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
               connloja.desconecta();
        }    
    
//===========================================================================================================   
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
            java.util.logging.Logger.getLogger(FrmCadastroProdutosLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutosLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutosLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroProdutosLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCadastroProdutosLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroFornecedor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxNomeFornecedor;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrega;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataPedido;
    private javax.swing.JLabel jLabelCodigoBarra;
    private javax.swing.JLabel jLabelDataPedido;
    private javax.swing.JLabel jLabelDataPedido1;
    private javax.swing.JLabel jLabelDescricaoProduto;
    private javax.swing.JLabel jLabelIdCodigoProduto;
    private javax.swing.JLabel jLabelIdCodigoProduto1;
    private javax.swing.JLabel jLabelNomeFornecedor;
    private javax.swing.JLabel jLabelPrecoCusto;
    private javax.swing.JLabel jLabelPrecoVenda;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelServicosFeitos;
    private javax.swing.JPanel jPanelButton;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLoja;
    private javax.swing.JTextField jTextFieldCodigoBarra;
    private javax.swing.JTextField jTextFieldDescricaoProduto;
    private javax.swing.JTextField jTextFieldIdProduto;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldPrecoCusto;
    private javax.swing.JTextField jTextFieldPrecoVenda;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
