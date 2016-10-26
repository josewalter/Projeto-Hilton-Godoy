package View;

import Controle.ControleContasPagarSalao;
import DAO.ClassConectaBanco;
import Modelo.ModeloContasPagarSalao;
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
public class FrmContasPagarSalao extends javax.swing.JFrame {
    ClassConectaBanco conncontas = new ClassConectaBanco();
    ModeloContasPagarSalao mod = new ModeloContasPagarSalao();
    ControleContasPagarSalao contrl = new ControleContasPagarSalao();
    
    public FrmContasPagarSalao() {
        initComponents();
        conncontas.conexao();
        preencherComboFornecedorSalao();
        preencherTabela("SELECT * FROM tbl_contasapagarsalao  ORDER BY Id_ContasSalao");
        
//-------------------------------------------------------------------------------------------------------
        
         try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataEmissao.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmContasPagarSalao.class.getName()).log(Level.SEVERE, null, ex);
          }
         
//------------------------------------------------------------------------------------------------------- 

         try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataVencimento.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmContasPagarSalao.class.getName()).log(Level.SEVERE, null, ex);
          }
         
//-------------------------------------------------------------------------------------------------------    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jTextFieldCodigoConta = new javax.swing.JTextField();
        jLabelCodigoConta = new javax.swing.JLabel();
        jLabelPlanoConta = new javax.swing.JLabel();
        jComboBoxPlanoConta = new javax.swing.JComboBox<>();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jLabelFormaPagamento = new javax.swing.JLabel();
        jComboBoxBanco = new javax.swing.JComboBox<>();
        jLabelBanco = new javax.swing.JLabel();
        jLabelFornecedor = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox<>();
        jTextFieldNumeroDocumento = new javax.swing.JTextField();
        jLabelNumeroDocumento = new javax.swing.JLabel();
        jFormattedTextFieldDataEmissao = new javax.swing.JFormattedTextField();
        jLabelDataEmissao = new javax.swing.JLabel();
        jFormattedTextFieldDataVencimento = new javax.swing.JFormattedTextField();
        jLabelDataVencimento = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextFieldValorJuros = new javax.swing.JTextField();
        jLabelValorJuros = new javax.swing.JLabel();
        jTextFieldValorMulta = new javax.swing.JTextField();
        jLabelValorMulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContas = new javax.swing.JTable();
        jPanelButon = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Contas a Pagar do Salão");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldCodigoConta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCodigoConta.setEnabled(false);

        jLabelCodigoConta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigoConta.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCodigoConta.setText("Código da conta");

        jLabelPlanoConta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPlanoConta.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPlanoConta.setText("Plano conta");

        jComboBoxPlanoConta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxPlanoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um Item", "De 15 em 15 dias", "Mensalmente", "Á vista" }));
        jComboBoxPlanoConta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxPlanoConta.setEnabled(false);

        jComboBoxFormaPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um Item:", "Dinheiro", "Cartão de Crédito", "Cheque", "Crtão de Débito" }));
        jComboBoxFormaPagamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxFormaPagamento.setEnabled(false);

        jLabelFormaPagamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFormaPagamento.setForeground(new java.awt.Color(51, 102, 255));
        jLabelFormaPagamento.setText("Forma de pagamento");

        jComboBoxBanco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um Item:", "Banco do Brasil", "Caixa Econômica Federal", "Itaú", "Santander", "Bradesco", " " }));
        jComboBoxBanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxBanco.setEnabled(false);

        jLabelBanco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBanco.setForeground(new java.awt.Color(51, 102, 255));
        jLabelBanco.setText("Banco");

        jLabelFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFornecedor.setForeground(new java.awt.Color(51, 102, 255));
        jLabelFornecedor.setText("Fornecedor");

        jComboBoxFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxFornecedor.setEnabled(false);

        jTextFieldNumeroDocumento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNumeroDocumento.setEnabled(false);

        jLabelNumeroDocumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNumeroDocumento.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNumeroDocumento.setText("Número documento");

        jFormattedTextFieldDataEmissao.setEnabled(false);

        jLabelDataEmissao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataEmissao.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataEmissao.setText("Data de emissão");

        jFormattedTextFieldDataVencimento.setEnabled(false);

        jLabelDataVencimento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataVencimento.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataVencimento.setText("Data de vencimento");

        jTextFieldValorTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldValorTotal.setEnabled(false);

        jLabelValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(51, 102, 255));
        jLabelValorTotal.setText("Valor total");

        jTextFieldValorJuros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldValorJuros.setEnabled(false);

        jLabelValorJuros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorJuros.setForeground(new java.awt.Color(51, 102, 255));
        jLabelValorJuros.setText("Valor juros");

        jTextFieldValorMulta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldValorMulta.setEnabled(false);

        jLabelValorMulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorMulta.setForeground(new java.awt.Color(51, 102, 255));
        jLabelValorMulta.setText("Valor multa");

        jTableContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableContas);

        jPanelButon.setBackground(new java.awt.Color(51, 102, 255));
        jPanelButon.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanelButonLayout = new javax.swing.GroupLayout(jPanelButon);
        jPanelButon.setLayout(jPanelButonLayout);
        jPanelButonLayout.setHorizontalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelButonLayout.setVerticalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUltimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldCodigoConta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigoConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPlanoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPlanoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(157, 157, 157)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelValorJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldValorJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(160, 160, 160)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelValorMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldValorMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNumeroDocumento)
                                .addComponent(jLabelNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelDataEmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelDataVencimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPlanoConta)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCodigoConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCodigoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPlanoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelBanco)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jComboBoxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelFormaPagamento))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jComboBoxBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelNumeroDocumento)
                                    .addComponent(jLabelDataEmissao))
                                .addGap(4, 4, 4)
                                .addComponent(jFormattedTextFieldDataEmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelDataVencimento)
                                .addGap(4, 4, 4)
                                .addComponent(jFormattedTextFieldDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorTotal)
                    .addComponent(jLabelValorMulta)
                    .addComponent(jLabelValorJuros)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Contas a pagar do Salão");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Formulário Contas a Pagar:

          jComboBoxPlanoConta.setSelectedItem("");
          jComboBoxFormaPagamento.setSelectedItem("");
          jComboBoxBanco.setSelectedItem("");
          jComboBoxFornecedor.setSelectedItem("");
          jTextFieldNumeroDocumento.setText("");
          jFormattedTextFieldDataEmissao.setText("");
          jFormattedTextFieldDataVencimento.setText("");
          jTextFieldValorTotal.setText("");
          jTextFieldValorJuros.setText("");
          jTextFieldValorMulta.setText("");

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
           jButtonCancelar.setEnabled(true);
           jButtonEditar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonSalvar.setEnabled(true);

            jComboBoxPlanoConta.setEnabled(true);
            jComboBoxPlanoConta.requestFocus();
            jComboBoxFormaPagamento.setEnabled(true);
            jComboBoxBanco.setEnabled(true);
            jComboBoxFornecedor.setEnabled(true);
            jTextFieldNumeroDocumento.setEnabled(true);
            jFormattedTextFieldDataEmissao.setEnabled(true);
            jFormattedTextFieldDataVencimento.setEnabled(true);
            jTextFieldValorTotal.setEnabled(true);
            jTextFieldValorJuros.setEnabled(true);
            jTextFieldValorMulta.setEnabled(true);

              jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Formulário Contas a Pagar:

          mod.setPlanoConta((String) jComboBoxPlanoConta.getSelectedItem());
          mod.setFormaPagamento((String) jComboBoxFormaPagamento.getSelectedItem());
          mod.setBanco((String) jComboBoxBanco.getSelectedItem());
          mod.setFornecedor((String) jComboBoxFornecedor.getSelectedItem());
          mod.setNumeroDocumento(jTextFieldNumeroDocumento.getText());
          mod.setDataEmissao(jFormattedTextFieldDataEmissao.getText());
          mod.setDataVencimento(jFormattedTextFieldDataVencimento.getText());
          mod.setValorTotal(jTextFieldValorTotal.getText());
          mod.setValorJuros(jTextFieldValorJuros.getText());
          mod.setValorMulta(jTextFieldValorMulta.getText());
          
          contrl.SalvarContasSalao(mod);
          preencherTabela("SELECT * FROM tbl_contasapagarsalao  ORDER BY Id_ContasSalao");
          
           jComboBoxPlanoConta.setSelectedItem("");
           jComboBoxFormaPagamento.setSelectedItem("");
           jComboBoxBanco.setSelectedItem("");
           jComboBoxFornecedor.setSelectedItem("");
           jTextFieldNumeroDocumento.setText("");
           jFormattedTextFieldDataEmissao.setText("");
           jFormattedTextFieldDataVencimento.setText("");
           jTextFieldValorTotal.setText("");
           jTextFieldValorJuros.setText("");
           jTextFieldValorMulta.setText("");

             jComboBoxPlanoConta.setEnabled(!true);
             jComboBoxFormaPagamento.setEnabled(!true);
             jComboBoxBanco.setEnabled(!true);
             jComboBoxFornecedor.setEnabled(!true);
             jTextFieldNumeroDocumento.setEnabled(!true);
             jFormattedTextFieldDataEmissao.setEnabled(!true);
             jFormattedTextFieldDataVencimento.setEnabled(!true);
             jTextFieldValorTotal.setEnabled(!true);
             jTextFieldValorJuros.setEnabled(!true);
             jTextFieldValorMulta.setEnabled(!true);

             // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                jButtonCancelar.setEnabled(false);
                jButtonEditar.setEnabled(false);
                jButtonExcluir.setEnabled(false);
                jButtonSalvar.setEnabled(true);
                jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Declaração do botão editar do Formulario de Contas a pagar:

           mod.setPlanoConta((String) jComboBoxPlanoConta.getSelectedItem());
           mod.setFormaPagamento((String) jComboBoxFormaPagamento.getSelectedItem());
           mod.setBanco((String) jComboBoxBanco.getSelectedItem());
           mod.setFornecedor((String) jComboBoxFornecedor.getSelectedItem());
           mod.setNumeroDocumento(jTextFieldNumeroDocumento.getText());
           mod.setDataEmissao(jFormattedTextFieldDataEmissao.getText());
           mod.setDataVencimento(jFormattedTextFieldDataVencimento.getText());
           mod.setValorTotal(jTextFieldValorTotal.getText());
           mod.setValorJuros(jTextFieldValorJuros.getText());
           mod.setValorMulta(jTextFieldValorMulta.getText()); 
           mod.setCodigoConta(Integer.parseInt(jTextFieldCodigoConta.getText()));
           
            contrl.EditarContasSalao(mod);
            preencherTabela("SELECT * FROM tbl_contasapagarsalao  ORDER BY Id_ContasSalao");
            
             jComboBoxPlanoConta.setSelectedItem("");
             jComboBoxFormaPagamento.setSelectedItem("");
             jComboBoxBanco.setSelectedItem("");
             jComboBoxFornecedor.setSelectedItem("");
             jTextFieldNumeroDocumento.setText("");
             jFormattedTextFieldDataEmissao.setText("");
             jFormattedTextFieldDataVencimento.setText("");
             jTextFieldValorTotal.setText("");
             jTextFieldValorJuros.setText("");
             jTextFieldValorMulta.setText("");

               jComboBoxPlanoConta.setEnabled(true);
               jComboBoxPlanoConta.requestFocus();
               jComboBoxFormaPagamento.setEnabled(true);
               jComboBoxBanco.setEnabled(true);
               jComboBoxFornecedor.setEnabled(true);
               jTextFieldNumeroDocumento.setEnabled(true);
               jFormattedTextFieldDataEmissao.setEnabled(true);
               jFormattedTextFieldDataVencimento.setEnabled(true);
               jTextFieldValorTotal.setEnabled(true);
               jTextFieldValorJuros.setEnabled(true);
               jTextFieldValorMulta.setEnabled(true);
               
               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(true);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonSalvar.setEnabled(true);
                  jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Formulario de Contas a Pagar:

           jComboBoxPlanoConta.setSelectedItem("");
           jComboBoxFormaPagamento.setSelectedItem("");
           jComboBoxBanco.setSelectedItem("");
           jComboBoxFornecedor.setSelectedItem("");
           jTextFieldNumeroDocumento.setText("");
           jFormattedTextFieldDataEmissao.setText("");
           jFormattedTextFieldDataVencimento.setText("");
           jTextFieldValorTotal.setText("");
           jTextFieldValorJuros.setText("");
           jTextFieldValorMulta.setText("");

             jComboBoxPlanoConta.setEnabled(!true);
             jComboBoxFormaPagamento.setEnabled(!true);
             jComboBoxBanco.setEnabled(!true);
             jComboBoxFornecedor.setEnabled(!true);
             jTextFieldNumeroDocumento.setEnabled(!true);
             jFormattedTextFieldDataEmissao.setEnabled(!true);
             jFormattedTextFieldDataVencimento.setEnabled(!true);
             jTextFieldValorTotal.setEnabled(!true);
             jTextFieldValorJuros.setEnabled(!true);
             jTextFieldValorMulta.setEnabled(!true);

             // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
               jButtonCancelar.setEnabled(false);
               jButtonEditar.setEnabled(false);
               jButtonExcluir.setEnabled(false);
               jButtonSalvar.setEnabled(true);
               jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Declaração do botão excluir do Formulario de Contas a Pagar:

           mod.setCodigoConta(Integer.parseInt(jTextFieldCodigoConta.getText()));
           mod.setPlanoConta((String) jComboBoxPlanoConta.getSelectedItem());
           mod.setFormaPagamento((String) jComboBoxFormaPagamento.getSelectedItem());
           mod.setBanco((String) jComboBoxBanco.getSelectedItem());
           mod.setFornecedor((String) jComboBoxFornecedor.getSelectedItem());
           mod.setNumeroDocumento(jTextFieldNumeroDocumento.getText());
           mod.setDataEmissao(jFormattedTextFieldDataEmissao.getText());
           mod.setDataVencimento(jFormattedTextFieldDataVencimento.getText());
           mod.setValorTotal(jTextFieldValorTotal.getText());
           mod.setValorJuros(jTextFieldValorJuros.getText());
           mod.setValorMulta(jTextFieldValorMulta.getText()); 
   
            contrl.ExcluirContasSalao(mod);
            preencherTabela("SELECT * FROM tbl_contasapagarsalao  ORDER BY Id_ContasSalao");
            
             jComboBoxPlanoConta.setSelectedItem("");
             jComboBoxFormaPagamento.setSelectedItem("");
             jComboBoxBanco.setSelectedItem("");
             jComboBoxFornecedor.setSelectedItem("");
             jTextFieldNumeroDocumento.setText("");
             jFormattedTextFieldDataEmissao.setText("");
             jFormattedTextFieldDataVencimento.setText("");
             jTextFieldValorTotal.setText("");
             jTextFieldValorJuros.setText("");
             jTextFieldValorMulta.setText("");

               jComboBoxPlanoConta.setEnabled(!true);
               jComboBoxFormaPagamento.setEnabled(!true);
               jComboBoxBanco.setEnabled(!true);
               jComboBoxFornecedor.setEnabled(!true);
               jTextFieldNumeroDocumento.setEnabled(!true);
               jFormattedTextFieldDataEmissao.setEnabled(!true);
               jFormattedTextFieldDataVencimento.setEnabled(!true);
               jTextFieldValorTotal.setEnabled(!true);
               jTextFieldValorJuros.setEnabled(!true);
               jTextFieldValorMulta.setEnabled(!true);
           
              // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                 jButtonCancelar.setEnabled(false);
                 jButtonEditar.setEnabled(false);
                 jButtonExcluir.setEnabled(false);
                 jButtonSalvar.setEnabled(true);
                 jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Formulario de Contas a Pagar:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Formulário Contas a Pagar?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Formulario de Contas a Pagar:
        
           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
               jComboBoxPlanoConta.setEnabled(true);
               jComboBoxPlanoConta.requestFocus();
               jComboBoxFormaPagamento.setEnabled(true);
               jComboBoxBanco.setEnabled(true);
               jComboBoxFornecedor.setEnabled(true);
               jTextFieldNumeroDocumento.setEnabled(true);
               jFormattedTextFieldDataEmissao.setEnabled(true);
               jFormattedTextFieldDataVencimento.setEnabled(true);
               jTextFieldValorTotal.setEnabled(true);
               jTextFieldValorJuros.setEnabled(true);
               jTextFieldValorMulta.setEnabled(true);
               
              try {            
                 conncontas.executaSQL("SELECT * FROM tbl_contasapagarsalao ORDER BY Id_ContasSalao");
                 conncontas.rs.first();
                 jTextFieldCodigoConta.setText(String.valueOf(conncontas.rs.getInt("Id_ContasSalao")));
                 jComboBoxPlanoConta.setSelectedItem(conncontas.rs.getString("Plano_Conta"));
                 jComboBoxFormaPagamento.setSelectedItem(conncontas.rs.getString("Forma_Pagamento"));
                 jComboBoxBanco.setSelectedItem(conncontas.rs.getString("Banco"));
                 jComboBoxFornecedor.setSelectedItem(conncontas.rs.getString("Nome_Fornecedor"));
                 jTextFieldNumeroDocumento.setText(conncontas.rs.getString("Numero_Documento"));
                 jFormattedTextFieldDataEmissao.setText(conncontas.rs.getString("Data_Emissao"));
                 jFormattedTextFieldDataVencimento.setText(conncontas.rs.getString("Data_Vencimento"));
                 jTextFieldValorTotal.setText(conncontas.rs.getString("Valor_Total"));
                 jTextFieldValorJuros.setText(conncontas.rs.getString("Juros"));
                 jTextFieldValorMulta.setText(conncontas.rs.getString("Multa"));
               } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o primeiro registro! \n Erro: " + ex);
        }       
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // Declaração do botão proximo referente ao botão editar do Formulario de Contas a pagar:

            // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
               jComboBoxPlanoConta.setEnabled(true);
               jComboBoxPlanoConta.requestFocus();
               jComboBoxFormaPagamento.setEnabled(true);
               jComboBoxBanco.setEnabled(true);
               jComboBoxFornecedor.setEnabled(true);
               jTextFieldNumeroDocumento.setEnabled(true);
               jFormattedTextFieldDataEmissao.setEnabled(true);
               jFormattedTextFieldDataVencimento.setEnabled(true);
               jTextFieldValorTotal.setEnabled(true);
               jTextFieldValorJuros.setEnabled(true);
               jTextFieldValorMulta.setEnabled(true);
               
              try {            
              //   conncontas.executaSQL("SELECT * FROM tbl_contasapagarsalao ORDER BY Id_ContasSalao");
                 conncontas.rs.next();
                 jTextFieldCodigoConta.setText(String.valueOf(conncontas.rs.getInt("Id_ContasSalao")));
                 jComboBoxPlanoConta.setSelectedItem(conncontas.rs.getString("Plano_Conta"));
                 jComboBoxFormaPagamento.setSelectedItem(conncontas.rs.getString("Forma_Pagamento"));
                 jComboBoxBanco.setSelectedItem(conncontas.rs.getString("Banco"));
                 jComboBoxFornecedor.setSelectedItem(conncontas.rs.getString("Nome_Fornecedor"));
                 jTextFieldNumeroDocumento.setText(conncontas.rs.getString("Numero_Documento"));
                 jFormattedTextFieldDataEmissao.setText(conncontas.rs.getString("Data_Emissao"));
                 jFormattedTextFieldDataVencimento.setText(conncontas.rs.getString("Data_Vencimento"));
                 jTextFieldValorTotal.setText(conncontas.rs.getString("Valor_Total"));
                 jTextFieldValorJuros.setText(conncontas.rs.getString("Juros"));
                 jTextFieldValorMulta.setText(conncontas.rs.getString("Multa"));
               } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o próximo registro! \n Erro: " + ex);
        } 
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
               jComboBoxPlanoConta.setEnabled(true);
               jComboBoxPlanoConta.requestFocus();
               jComboBoxFormaPagamento.setEnabled(true);
               jComboBoxBanco.setEnabled(true);
               jComboBoxFornecedor.setEnabled(true);
               jTextFieldNumeroDocumento.setEnabled(true);
               jFormattedTextFieldDataEmissao.setEnabled(true);
               jFormattedTextFieldDataVencimento.setEnabled(true);
               jTextFieldValorTotal.setEnabled(true);
               jTextFieldValorJuros.setEnabled(true);
               jTextFieldValorMulta.setEnabled(true);
               
              try {            
                // conncontas.executaSQL("SELECT * FROM tbl_contasapagarsalao ORDER BY Id_ContasSalao");
                 conncontas.rs.previous();
                 jTextFieldCodigoConta.setText(String.valueOf(conncontas.rs.getInt("Id_ContasSalao")));
                 jComboBoxPlanoConta.setSelectedItem(conncontas.rs.getString("Plano_Conta"));
                 jComboBoxFormaPagamento.setSelectedItem(conncontas.rs.getString("Forma_Pagamento"));
                 jComboBoxBanco.setSelectedItem(conncontas.rs.getString("Banco"));
                 jComboBoxFornecedor.setSelectedItem(conncontas.rs.getString("Nome_Fornecedor"));
                 jTextFieldNumeroDocumento.setText(conncontas.rs.getString("Numero_Documento"));
                 jFormattedTextFieldDataEmissao.setText(conncontas.rs.getString("Data_Emissao"));
                 jFormattedTextFieldDataVencimento.setText(conncontas.rs.getString("Data_Vencimento"));
                 jTextFieldValorTotal.setText(conncontas.rs.getString("Valor_Total"));
                 jTextFieldValorJuros.setText(conncontas.rs.getString("Juros"));
                 jTextFieldValorMulta.setText(conncontas.rs.getString("Multa"));
               } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o registro anterior! \n Erro: " + ex);
        } 
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
               jComboBoxPlanoConta.setEnabled(true);
               jComboBoxPlanoConta.requestFocus();
               jComboBoxFormaPagamento.setEnabled(true);
               jComboBoxBanco.setEnabled(true);
               jComboBoxFornecedor.setEnabled(true);
               jTextFieldNumeroDocumento.setEnabled(true);
               jFormattedTextFieldDataEmissao.setEnabled(true);
               jFormattedTextFieldDataVencimento.setEnabled(true);
               jTextFieldValorTotal.setEnabled(true);
               jTextFieldValorJuros.setEnabled(true);
               jTextFieldValorMulta.setEnabled(true);
               
              try {            
                 conncontas.executaSQL("SELECT * FROM tbl_contasapagarsalao ORDER BY Id_ContasSalao");
                 conncontas.rs.last();
                 jTextFieldCodigoConta.setText(String.valueOf(conncontas.rs.getInt("Id_ContasSalao")));
                 jComboBoxPlanoConta.setSelectedItem(conncontas.rs.getString("Plano_Conta"));
                 jComboBoxFormaPagamento.setSelectedItem(conncontas.rs.getString("Forma_Pagamento"));
                 jComboBoxBanco.setSelectedItem(conncontas.rs.getString("Banco"));
                 jComboBoxFornecedor.setSelectedItem(conncontas.rs.getString("Nome_Fornecedor"));
                 jTextFieldNumeroDocumento.setText(conncontas.rs.getString("Numero_Documento"));
                 jFormattedTextFieldDataEmissao.setText(conncontas.rs.getString("Data_Emissao"));
                 jFormattedTextFieldDataVencimento.setText(conncontas.rs.getString("Data_Vencimento"));
                 jTextFieldValorTotal.setText(conncontas.rs.getString("Valor_Total"));
                 jTextFieldValorJuros.setText(conncontas.rs.getString("Juros"));
                 jTextFieldValorMulta.setText(conncontas.rs.getString("Multa"));
               } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o último registro! \n Erro: " + ex);
        } 
    }//GEN-LAST:event_jButtonUltimoActionPerformed

public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Código da Conta", "Plano da Conta", "Forma de Pagamento",
          "Banco", "Nome do Fornecedor", "Número do Documento", "Data de Emissão", "Data do Vencimento",
          "Valor Total", "Juros", "Multa"};
                     
             try {
                 conncontas.executaSQL(SQL);
                 conncontas.rs.first();
                  do{
                    dados.add(new Object[]{conncontas.rs.getInt("Id_ContasSalao"),
                    conncontas.rs.getString("Plano_Conta"), conncontas.rs.getString("Forma_Pagamento"), 
                    conncontas.rs.getString("Banco"),conncontas.rs.getString("Nome_Fornecedor"),
                    conncontas.rs.getString("Numero_Documento"), conncontas.rs.getString("Data_Emissao"), 
                    conncontas.rs.getString("Data_Vencimento"), conncontas.rs.getString("Valor_Total"), 
                    conncontas.rs.getString("Juros"), conncontas.rs.getString("Multa")});
                 }while(conncontas.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableContas.setModel(modelo);
               jTableContas.getColumnModel().getColumn(0).setPreferredWidth(100);
               jTableContas.getColumnModel().getColumn(0).setResizable(false);
               jTableContas.getColumnModel().getColumn(1).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(1).setResizable(false); 
               jTableContas.getColumnModel().getColumn(2).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(2).setResizable(false); 
               jTableContas.getColumnModel().getColumn(3).setPreferredWidth(130);
               jTableContas.getColumnModel().getColumn(3).setResizable(false); 
               jTableContas.getColumnModel().getColumn(4).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(4).setResizable(false); 
               jTableContas.getColumnModel().getColumn(5).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(5).setResizable(false); 
               jTableContas.getColumnModel().getColumn(6).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(6).setResizable(false); 
               jTableContas.getColumnModel().getColumn(7).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(7).setResizable(false); 
               jTableContas.getColumnModel().getColumn(8).setPreferredWidth(120);
               jTableContas.getColumnModel().getColumn(8).setResizable(false); 
               jTableContas.getColumnModel().getColumn(9).setPreferredWidth(100);
               jTableContas.getColumnModel().getColumn(9).setResizable(false);
               jTableContas.getColumnModel().getColumn(10).setPreferredWidth(100);
               jTableContas.getColumnModel().getColumn(10).setResizable(false); 
               jTableContas.getTableHeader().setReorderingAllowed(false);
               jTableContas.setAutoResizeMode( jTableContas.AUTO_RESIZE_OFF);
               jTableContas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
        }    
   
//===========================================================================================================
    
    // Código para preencher o Combo Nome do Fornecedor .
    
    public void preencherComboFornecedorSalao(){
      
        conncontas.conexao();
        try {
            conncontas.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao ORDER BY Id_FornecedorSalao");
            conncontas.rs.first();
            jComboBoxFornecedor.removeAllItems();
          do{
            jComboBoxFornecedor.addItem(conncontas.rs.getString("Nome_Fornecedor"));
          }while(conncontas.rs.next());
         //  connacompanhamento.desconecta();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Erro ao preencher combo !\n Erro: " + ex); 
           // connacompanhamento.desconecta();
        }
        
      }     
     
//============================================================================================================    
    
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
            java.util.logging.Logger.getLogger(FrmContasPagarSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContasPagarSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContasPagarSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContasPagarSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmContasPagarSalao().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxBanco;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JComboBox<String> jComboBoxFornecedor;
    private javax.swing.JComboBox<String> jComboBoxPlanoConta;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEmissao;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataVencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBanco;
    private javax.swing.JLabel jLabelCodigoConta;
    private javax.swing.JLabel jLabelDataEmissao;
    private javax.swing.JLabel jLabelDataVencimento;
    private javax.swing.JLabel jLabelFormaPagamento;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelNumeroDocumento;
    private javax.swing.JLabel jLabelPlanoConta;
    private javax.swing.JLabel jLabelValorJuros;
    private javax.swing.JLabel jLabelValorMulta;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContas;
    private javax.swing.JTextField jTextFieldCodigoConta;
    private javax.swing.JTextField jTextFieldNumeroDocumento;
    private javax.swing.JTextField jTextFieldValorJuros;
    private javax.swing.JTextField jTextFieldValorMulta;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
