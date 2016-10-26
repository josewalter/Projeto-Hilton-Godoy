
package View;

import Controle.ControleCadastroClienteLoja;
import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroClienteLoja;
import Modelo.ModeloTabela;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author: José Walter.
 */
public class FrmCadastroClienteLoja extends javax.swing.JFrame {
     ClassConectaBanco conectar = new  ClassConectaBanco();
     ModeloCadastroClienteLoja mod = new ModeloCadastroClienteLoja();
     
    public FrmCadastroClienteLoja() {
        initComponents();
        conectar.conexao();
        
 
         preencherTabela("SELECT * FROM tbl_cadastroclienteloja ORDER BY Id_ClienteLoja");
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClienteLoja = new javax.swing.JTable();
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
        jLabelIdClienteLoja = new javax.swing.JLabel();
        jTextFieldIdClienteLoja = new javax.swing.JTextField();
        jTextFieldNomeClienteLoja = new javax.swing.JTextField();
        jLabelNomeClienteLoja = new javax.swing.JLabel();
        jFormattedTextFieldDataEntrada = new javax.swing.JFormattedTextField();
        jLabelDataEntrada = new javax.swing.JLabel();
        jFormattedTextFieldDataSaida = new javax.swing.JFormattedTextField();
        jLabelDataSaida = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelCep = new javax.swing.JLabel();
        jLabelTelefoneResidencial = new javax.swing.JLabel();
        jLabelCelularContato = new javax.swing.JLabel();
        jFormattedTextFieldCelularContato = new javax.swing.JFormattedTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldfacebook = new javax.swing.JTextField();
        jLabelFacebook = new javax.swing.JLabel();
        jLabelTwitter = new javax.swing.JLabel();
        jTextFieldTwitter = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jTextFieldCep = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldRg = new javax.swing.JTextField();
        jTextFieldTelefoneResidencial = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadasstro de Clientes da Loja");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Cadastro de Clientes da Loja");

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableClienteLoja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableClienteLoja);

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
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUltimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jLabelIdClienteLoja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIdClienteLoja.setForeground(new java.awt.Color(51, 102, 255));
        jLabelIdClienteLoja.setText("Código do Cliente da Loja");

        jTextFieldIdClienteLoja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldIdClienteLoja.setEnabled(false);

        jTextFieldNomeClienteLoja.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNomeClienteLoja.setEnabled(false);

        jLabelNomeClienteLoja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeClienteLoja.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNomeClienteLoja.setText("Nome do Cliente da Loja");

        jFormattedTextFieldDataEntrada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDataEntrada.setEnabled(false);

        jLabelDataEntrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataEntrada.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataEntrada.setText("Data de Entrada");

        jFormattedTextFieldDataSaida.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDataSaida.setEnabled(false);

        jLabelDataSaida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataSaida.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataSaida.setText("Data da Saída");

        jTextFieldEndereco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldEndereco.setEnabled(false);

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(51, 102, 255));
        jLabelEndereco.setText("Endereço");

        jTextFieldCidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCidade.setEnabled(false);

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCidade.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCidade.setText("Cidade");

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstado.setForeground(new java.awt.Color(51, 102, 255));
        jLabelEstado.setText("Estado");

        jLabelCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCep.setText("CEP");

        jLabelTelefoneResidencial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefoneResidencial.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTelefoneResidencial.setText("Telefone Residêncial");

        jLabelCelularContato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelularContato.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCelularContato.setText("Celular de Contato");

        jFormattedTextFieldCelularContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCelularContato.setEnabled(false);

        jLabelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCpf.setText("CPF");

        jLabelRg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRg.setForeground(new java.awt.Color(51, 102, 255));
        jLabelRg.setText("RG");

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldEmail.setEnabled(false);

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(51, 102, 255));
        jLabelEmail.setText("E mail");

        jTextFieldfacebook.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldfacebook.setEnabled(false);

        jLabelFacebook.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFacebook.setForeground(new java.awt.Color(51, 102, 255));
        jLabelFacebook.setText("Facebook");

        jLabelTwitter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTwitter.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTwitter.setText("Twitter");

        jTextFieldTwitter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldTwitter.setEnabled(false);

        jComboBoxEstado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Item", "Acre \tAC \t ", "Alagoas \tAL \t ", "Amapá \tAP \t ", "Amazonas \tAM \t ", "Bahia \tBA \t ", "Ceará \tCE \t ", "Distrito Federal \tDF \t ", "Espírito Santo \tES \t ", "Goiás \tGO \t ", "Maranhão \tMA \t ", "Mato Grosso \tMT \t ", "Mato Grosso do Sul \tMS \t ", "Minas Gerais \tMG \t ", "Pará \tPA \t ", "Paraíba \tPB \t ", "Paraná \tPR \t ", "Pernambuco \tPE \t ", "Piauí \tPI \t ", "Rio de Janeiro \tRJ \t ", "Rio Grande do Norte \tRN \t ", "Rio Grande do Sul \tRS \t ", "Rondônia \tRO \t ", "Roraima \tRR \t ", "Santa Catarina \tSC \t ", "São Paulo \tSP \t ", "Sergipe \tSE \t ", "Tocantins \tTO" }));

        jTextFieldCep.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCep.setEnabled(false);

        jTextFieldCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCpf.setEnabled(false);

        jTextFieldRg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldRg.setEnabled(false);

        jTextFieldTelefoneResidencial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldTelefoneResidencial.setEnabled(false);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 928, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldIdClienteLoja)
                                    .addComponent(jLabelIdClienteLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeClienteLoja)
                                    .addComponent(jTextFieldNomeClienteLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataEntrada)
                                    .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataSaida)
                                    .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabelEndereco)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldEndereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEstado)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFacebook)
                                    .addComponent(jTextFieldfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTwitter)
                                    .addComponent(jTextFieldTwitter)))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCep))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelCpf)
                                .addGap(94, 94, 94)
                                .addComponent(jLabelRg)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefoneResidencial)
                            .addComponent(jTextFieldTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCelularContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldCelularContato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail))))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelIdClienteLoja)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldIdClienteLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNomeClienteLoja)
                                .addComponent(jLabelDataEntrada))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNomeClienteLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jFormattedTextFieldDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDataSaida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCelularContato)
                            .addComponent(jLabelTelefoneResidencial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldCelularContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabelRg))
                        .addGap(24, 24, 24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFacebook)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelTwitter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(961, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Form Mapa de Controle de Não Conformidade:

        jTextFieldNomeClienteLoja.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jComboBoxEstado.setSelectedItem("Selecione um Item");
        jTextFieldCep.setText("");
        jTextFieldCpf.setText("");
        jTextFieldRg.setText("");
        jTextFieldTelefoneResidencial.setText("");
        jFormattedTextFieldCelularContato.setText("");
        jTextFieldEmail.setText("");
        jTextFieldfacebook.setText("");
        jTextFieldTwitter.setText("");

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
           jButtonCancelar.setEnabled(true);
           jButtonEditar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonSalvar.setEnabled(true);

            jTextFieldNomeClienteLoja.setEnabled(true);
            jTextFieldNomeClienteLoja.requestFocus();
            jFormattedTextFieldDataEntrada.setEnabled(true);
            jFormattedTextFieldDataSaida.setEnabled(true);
            jTextFieldEndereco.setEnabled(true);
            jTextFieldCidade.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jTextFieldCep.setEnabled(true);
            jTextFieldCpf.setEnabled(true);
            jTextFieldRg.setEnabled(true);
            jTextFieldTelefoneResidencial.setEnabled(true); 
            jFormattedTextFieldCelularContato.setEnabled(true);
            jTextFieldEmail.setEnabled(true); 
            jTextFieldfacebook.setEnabled(true);
            jTextFieldTwitter.setEnabled(true);

             jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Form Mapa de Controle de Não Conformidade:

        mod.setNomeClienteLoja(jTextFieldNomeClienteLoja.getText());
        mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
        mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado((String) jComboBoxEstado.getSelectedItem());
        mod.setCep(jTextFieldCep.getText());
        mod.setCpf(jTextFieldCpf.getText());
        mod.setRg(jTextFieldRg.getText());
        mod.setTelefoneResidencial(jTextFieldTelefoneResidencial.getText());
        mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
        mod.setEmail(jTextFieldEmail.getText());
        mod.setFacebook(jTextFieldfacebook.getText());
        mod.setTwitter(jTextFieldTwitter.getText());

        ControleCadastroClienteLoja cliente = new ControleCadastroClienteLoja();
        cliente.SalvarDados(mod);
        preencherTabela("SELECT * FROM tbl_cadastroclienteloja  ORDER BY Id_ClienteLoja");

        jTextFieldNomeClienteLoja.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jComboBoxEstado.setSelectedItem("Selecione um Item");
        jTextFieldCep.setText("");
        jTextFieldCpf.setText("");
        jTextFieldRg.setText("");
        jTextFieldTelefoneResidencial.setText("");
        jFormattedTextFieldCelularContato.setText("");
        jTextFieldEmail.setText("");
        jTextFieldfacebook.setText("");
        jTextFieldTwitter.setText("");

        jTextFieldNomeClienteLoja.setEnabled(!true);
        jFormattedTextFieldDataEntrada.setEnabled(!true);
        jFormattedTextFieldDataSaida.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jTextFieldCidade.setEnabled(!true);
        jComboBoxEstado.setEnabled(!true);
        jTextFieldCep.setEnabled(!true);
        jTextFieldCpf.setEnabled(!true);
        jTextFieldRg.setEnabled(!true);
        jTextFieldTelefoneResidencial.setEnabled(!true);
        jFormattedTextFieldCelularContato.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jTextFieldfacebook.setEnabled(!true);
        jTextFieldTwitter.setEnabled(!true);

        // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Declaração do botão editar do Form Cadastro de Usuário:

        mod.setNomeClienteLoja(jTextFieldNomeClienteLoja.getText());
        mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
        mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado((String) jComboBoxEstado.getSelectedItem());
        mod.setCep(jTextFieldCep.getText());
        mod.setCpf(jTextFieldCpf.getText());
        mod.setRg(jTextFieldRg.getText());
        mod.setTelefoneResidencial(jTextFieldTelefoneResidencial.getText());
        mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
        mod.setEmail(jTextFieldEmail.getText());
        mod.setFacebook(jTextFieldfacebook.getText());
        mod.setTwitter(jTextFieldTwitter.getText());
        mod.setIdClienteLoja(Integer.parseInt(jTextFieldIdClienteLoja.getText()));

        ControleCadastroClienteLoja  cliente = new ControleCadastroClienteLoja();
        cliente.EditarDados(mod);

        preencherTabela("SELECT * FROM tbl_cadastroclienteloja  ORDER BY Id_ClienteLoja");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Form Cadastro de Usuário:

        jTextFieldNomeClienteLoja.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jComboBoxEstado.setSelectedItem("Selecione um Item");
        jTextFieldCep.setText("");
        jTextFieldCpf.setText("");
        jTextFieldRg.setText("");
        jTextFieldTelefoneResidencial.setText("");
        jFormattedTextFieldCelularContato.setText("");
        jTextFieldEmail.setText("");
        jTextFieldfacebook.setText("");
        jTextFieldTwitter.setText("");

        jTextFieldNomeClienteLoja.setEnabled(!true);
        jFormattedTextFieldDataEntrada.setEnabled(!true);
        jFormattedTextFieldDataSaida.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jTextFieldCidade.setEnabled(!true);
        jComboBoxEstado.setEnabled(!true);
        jTextFieldCep.setEnabled(!true);
        jTextFieldCpf.setEnabled(!true);
        jTextFieldRg.setEnabled(!true);
        jTextFieldTelefoneResidencial.setEnabled(!true);
        jFormattedTextFieldCelularContato.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jTextFieldfacebook.setEnabled(!true);
        jTextFieldTwitter.setEnabled(!true);

        // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Declaração do botão excluir do Form Cadastro de Usuário:

        mod.setIdClienteLoja(Integer.parseInt(jTextFieldIdClienteLoja.getText()));
        mod.setNomeClienteLoja(jTextFieldNomeClienteLoja.getText());
        mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
        mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado((String) jComboBoxEstado.getSelectedItem());
        mod.setCep(jTextFieldCep.getText());
        mod.setCpf(jTextFieldCpf.getText());
        mod.setRg(jTextFieldRg.getText());
        mod.setTelefoneResidencial(jTextFieldTelefoneResidencial.getText());
        mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
        mod.setEmail(jTextFieldEmail.getText());
        mod.setFacebook(jTextFieldfacebook.getText());
        mod.setTwitter(jTextFieldTwitter.getText());

        ControleCadastroClienteLoja  cliente = new ControleCadastroClienteLoja();
        cliente.ExcluirDados(mod);

       preencherTabela("SELECT * FROM tbl_cadastroclienteloja  ORDER BY Id_ClienteLoja");

        jTextFieldNomeClienteLoja.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jComboBoxEstado.setSelectedItem("Selecione um Item");
        jTextFieldCep.setText("");
        jTextFieldCpf.setText("");
        jTextFieldRg.setText("");
        jTextFieldTelefoneResidencial.setText("");
        jFormattedTextFieldCelularContato.setText("");
        jTextFieldEmail.setText("");
        jTextFieldfacebook.setText("");
        jTextFieldTwitter.setText("");

        jTextFieldNomeClienteLoja.setEnabled(!true);
        jFormattedTextFieldDataEntrada.setEnabled(!true);
        jFormattedTextFieldDataSaida.setEnabled(!true);
        jTextFieldEndereco.setEnabled(!true);
        jTextFieldCidade.setEnabled(!true);
        jComboBoxEstado.setEnabled(!true);
        jTextFieldCep.setEnabled(!true);
        jTextFieldCpf.setEnabled(!true);
        jTextFieldRg.setEnabled(!true);
        jTextFieldTelefoneResidencial.setEnabled(!true);
        jFormattedTextFieldCelularContato.setEnabled(!true);
        jTextFieldEmail.setEnabled(!true);
        jTextFieldfacebook.setEnabled(!true);
        jTextFieldTwitter.setEnabled(!true);

        // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Form Cadastro de Usuário:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Cadastro de Cliente da Loja?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(false);

        jTextFieldNomeClienteLoja.setEnabled(true);
        jTextFieldNomeClienteLoja.requestFocus();
        jFormattedTextFieldDataEntrada.setEnabled(true);
        jFormattedTextFieldDataSaida.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldTelefoneResidencial.setEnabled(true); 
        jFormattedTextFieldCelularContato.setEnabled(true);
        jTextFieldEmail.setEnabled(true); 
        jTextFieldfacebook.setEnabled(true);
        jTextFieldTwitter.setEnabled(true);

        try {
            conectar.executaSQL("SELECT * FROM tbl_cadastroclienteloja ORDER BY Id_ClienteLoja");
            conectar.rs.first();

            jTextFieldIdClienteLoja.setText(String.valueOf(conectar.rs.getInt("Id_ClienteLoja")));
            jTextFieldNomeClienteLoja.setText(conectar.rs.getString("Nome_Cliente"));
            jFormattedTextFieldDataEntrada.setText(conectar.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(conectar.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(conectar.rs.getString("Endereco"));
            jTextFieldCidade.setText(conectar.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(conectar.rs.getString("Estado"));
            jTextFieldCep.setText(conectar.rs.getString("Cep"));
            jTextFieldCpf.setText(conectar.rs.getString("Cpf"));
            jTextFieldRg.setText(conectar.rs.getString("Rg"));
            jTextFieldTelefoneResidencial.setText(conectar.rs.getString("Telefone_Residencial"));
            jFormattedTextFieldCelularContato.setText(conectar.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(conectar.rs.getString("Email"));
            jTextFieldfacebook.setText(conectar.rs.getString("Facebook"));
            jTextFieldTwitter.setText(conectar.rs.getString("Twitter"));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o primeiro registro! \n Erro: " + ex);
        }

    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(false);

        jTextFieldNomeClienteLoja.setEnabled(true);
        jTextFieldNomeClienteLoja.requestFocus();
        jFormattedTextFieldDataEntrada.setEnabled(true);
        jFormattedTextFieldDataSaida.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldTelefoneResidencial.setEnabled(true); 
        jFormattedTextFieldCelularContato.setEnabled(true);
        jTextFieldEmail.setEnabled(true); 
        jTextFieldfacebook.setEnabled(true);
        jTextFieldTwitter.setEnabled(true);

        try {
            //  connclientesalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao ORDER BY Id_ClienteSalao");
            conectar.rs.next();

            jTextFieldIdClienteLoja.setText(String.valueOf(conectar.rs.getInt("Id_ClienteLoja")));
            jTextFieldNomeClienteLoja.setText(conectar.rs.getString("Nome_Cliente"));
            jFormattedTextFieldDataEntrada.setText(conectar.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(conectar.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(conectar.rs.getString("Endereco"));
            jTextFieldCidade.setText(conectar.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(conectar.rs.getString("Estado"));
            jTextFieldCep.setText(conectar.rs.getString("Cep"));
            jTextFieldCpf.setText(conectar.rs.getString("Cpf"));
            jTextFieldRg.setText(conectar.rs.getString("Rg"));
            jTextFieldTelefoneResidencial.setText(conectar.rs.getString("Telefone_Residencial"));
            jFormattedTextFieldCelularContato.setText(conectar.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(conectar.rs.getString("Email"));
            jTextFieldfacebook.setText(conectar.rs.getString("Facebook"));
            jTextFieldTwitter.setText(conectar.rs.getString("Twitter"));

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

        jTextFieldNomeClienteLoja.setEnabled(true);
        jTextFieldNomeClienteLoja.requestFocus();
        jFormattedTextFieldDataEntrada.setEnabled(true);
        jFormattedTextFieldDataSaida.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldTelefoneResidencial.setEnabled(true); 
        jFormattedTextFieldCelularContato.setEnabled(true);
        jTextFieldEmail.setEnabled(true); 
        jTextFieldfacebook.setEnabled(true);
        jTextFieldTwitter.setEnabled(true);

        try {
            //  connclientesalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao ORDER BY Id_ClienteSalao");
            conectar.rs.previous();

            jTextFieldIdClienteLoja.setText(String.valueOf(conectar.rs.getInt("Id_ClienteLoja")));
            jTextFieldNomeClienteLoja.setText(conectar.rs.getString("Nome_Cliente"));
            jFormattedTextFieldDataEntrada.setText(conectar.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(conectar.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(conectar.rs.getString("Endereco"));
            jTextFieldCidade.setText(conectar.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(conectar.rs.getString("Estado"));
            jTextFieldCep.setText(conectar.rs.getString("Cep"));
            jTextFieldCpf.setText(conectar.rs.getString("Cpf"));
            jTextFieldRg.setText(conectar.rs.getString("Rg"));
            jTextFieldTelefoneResidencial.setText(conectar.rs.getString("Telefone_Residencial"));
            jFormattedTextFieldCelularContato.setText(conectar.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(conectar.rs.getString("Email"));
            jTextFieldfacebook.setText(conectar.rs.getString("Facebook"));
            jTextFieldTwitter.setText(conectar.rs.getString("Twitter"));

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

        jTextFieldNomeClienteLoja.setEnabled(true);
        jTextFieldNomeClienteLoja.requestFocus();
        jFormattedTextFieldDataEntrada.setEnabled(true);
        jFormattedTextFieldDataSaida.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldCidade.setEnabled(true);
        jComboBoxEstado.setEnabled(true);
        jTextFieldCep.setEnabled(true);
        jTextFieldCpf.setEnabled(true);
        jTextFieldRg.setEnabled(true);
        jTextFieldTelefoneResidencial.setEnabled(true); 
        jFormattedTextFieldCelularContato.setEnabled(true);
        jTextFieldEmail.setEnabled(true); 
        jTextFieldfacebook.setEnabled(true);
        jTextFieldTwitter.setEnabled(true);

        try {
            conectar.executaSQL("SELECT * FROM tbl_cadastroclienteloja ORDER BY Id_ClienteLoja");
            conectar.rs.last();

            jTextFieldIdClienteLoja.setText(String.valueOf(conectar.rs.getInt("Id_ClienteLoja")));
            jTextFieldNomeClienteLoja.setText(conectar.rs.getString("Nome_Cliente"));
            jFormattedTextFieldDataEntrada.setText(conectar.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(conectar.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(conectar.rs.getString("Endereco"));
            jTextFieldCidade.setText(conectar.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(conectar.rs.getString("Estado"));
            jTextFieldCep.setText(conectar.rs.getString("Cep"));
            jTextFieldCpf.setText(conectar.rs.getString("Cpf"));
            jTextFieldRg.setText(conectar.rs.getString("Rg"));
            jTextFieldTelefoneResidencial.setText(conectar.rs.getString("Telefone_Residencial"));
            jFormattedTextFieldCelularContato.setText(conectar.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(conectar.rs.getString("Email"));
            jTextFieldfacebook.setText(conectar.rs.getString("Facebook"));
            jTextFieldTwitter.setText(conectar.rs.getString("Twitter"));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o último registro! \n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Id_ClienteLoja", "Nome_Cliente", "Data_Entrada", "Data_Saida",
          "Endereco", "Cidade", "Estado", "Cep", "Cpf", "Rg", "Telefone_Residencial", "Celular_Contato",
          "Email", "Facebook", "Twitter" };
                     
             try {
                 conectar.executaSQL(SQL);
                 conectar.rs.first();
                  do{
                    dados.add(new Object[]{conectar.rs.getInt("Id_ClienteLoja"),
                    conectar.rs.getString("Nome_Cliente"), conectar.rs.getString("Data_Entrada"), 
                    conectar.rs.getString("Data_Saida"),conectar.rs.getString("Endereco"),
                    conectar.rs.getString("Cidade"), conectar.rs.getString("Estado"), 
                    conectar.rs.getString("Cep"), conectar.rs.getString("Cpf"), 
                    conectar.rs.getString("Rg"), conectar.rs.getString("Telefone_Residencial"),
                    conectar.rs.getString("Celular_Contato"), conectar.rs.getString("Email"),
                    conectar.rs.getString("Facebook"), conectar.rs.getString("Twitter")});
                 }while(conectar.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableClienteLoja.setModel(modelo);
               jTableClienteLoja.getColumnModel().getColumn(0).setPreferredWidth(130);
               jTableClienteLoja.getColumnModel().getColumn(0).setResizable(false);
               jTableClienteLoja.getColumnModel().getColumn(1).setPreferredWidth(180);
               jTableClienteLoja.getColumnModel().getColumn(1).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(2).setPreferredWidth(100);
               jTableClienteLoja.getColumnModel().getColumn(2).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(3).setPreferredWidth(130);
               jTableClienteLoja.getColumnModel().getColumn(3).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(4).setPreferredWidth(180);
               jTableClienteLoja.getColumnModel().getColumn(4).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(5).setPreferredWidth(100);
               jTableClienteLoja.getColumnModel().getColumn(5).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(6).setPreferredWidth(100);
               jTableClienteLoja.getColumnModel().getColumn(6).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(7).setPreferredWidth(120);
               jTableClienteLoja.getColumnModel().getColumn(7).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(8).setPreferredWidth(120);
               jTableClienteLoja.getColumnModel().getColumn(8).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(9).setPreferredWidth(120);
               jTableClienteLoja.getColumnModel().getColumn(9).setResizable(false);
               jTableClienteLoja.getColumnModel().getColumn(10).setPreferredWidth(100);
               jTableClienteLoja.getColumnModel().getColumn(10).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(11).setPreferredWidth(100);
               jTableClienteLoja.getColumnModel().getColumn(11).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(12).setPreferredWidth(200);
               jTableClienteLoja.getColumnModel().getColumn(12).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(13).setPreferredWidth(200);
               jTableClienteLoja.getColumnModel().getColumn(13).setResizable(false); 
               jTableClienteLoja.getColumnModel().getColumn(14).setPreferredWidth(200);
               jTableClienteLoja.getColumnModel().getColumn(14).setResizable(false);
               jTableClienteLoja.getTableHeader().setReorderingAllowed(false);
               jTableClienteLoja.setAutoResizeMode( jTableClienteLoja.AUTO_RESIZE_OFF);
               jTableClienteLoja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
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
            java.util.logging.Logger.getLogger(FrmCadastroClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClienteLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCadastroClienteLoja().setVisible(true);
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
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelularContato;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCelularContato;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataEntrada;
    private javax.swing.JLabel jLabelDataSaida;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFacebook;
    private javax.swing.JLabel jLabelIdClienteLoja;
    private javax.swing.JLabel jLabelNomeClienteLoja;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTelefoneResidencial;
    private javax.swing.JLabel jLabelTwitter;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClienteLoja;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdClienteLoja;
    private javax.swing.JTextField jTextFieldNomeClienteLoja;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldTelefoneResidencial;
    private javax.swing.JTextField jTextFieldTwitter;
    private javax.swing.JTextField jTextFieldfacebook;
    // End of variables declaration//GEN-END:variables
}
