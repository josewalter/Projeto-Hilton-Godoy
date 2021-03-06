
package View;

import Controle.ControleCadastroClienteSalao;
import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroClienteSalao;
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
public class FrmCadastroClienteSalao extends javax.swing.JFrame {
   ClassConectaBanco connclientesalao = new ClassConectaBanco();
   ModeloCadastroClienteSalao mod = new ModeloCadastroClienteSalao();
   
    public FrmCadastroClienteSalao() {
        initComponents();
        connclientesalao.conexao();
  
//==============================================================================================================        
        
         try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataEntrada.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(Level.SEVERE, null, ex);
          }
         
//==============================================================================================================         
         
             try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataSaida.setFormatterFactory(new DefaultFormatterFactory(form));
            } catch (ParseException ex) {
              Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(Level.SEVERE, null, ex);
           }
                    
//==============================================================================================================             
             
     try {
          MaskFormatter form = new MaskFormatter("(##)####-####");
          jFormattedTextFieldTelefoneResidencial.setFormatterFactory(new DefaultFormatterFactory(form));
     } catch (ParseException ex) {
          Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(Level.SEVERE, null, ex);
     }
        
//==============================================================================================================     
     
try {
     MaskFormatter form = new MaskFormatter("(##)#####-####");
     jFormattedTextFieldCelularContato.setFormatterFactory(new DefaultFormatterFactory(form));
} catch (ParseException ex) {
     Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(Level.SEVERE, null, ex);
} 

//==============================================================================================================

  preencherTabela("SELECT * FROM tbl_cadastroclientesalao  ORDER BY Id_ClienteSalao");
    }

//==============================================================================================================    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClienteSalao = new javax.swing.JTable();
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
        jLabelIdClienteSalao = new javax.swing.JLabel();
        jTextFieldIdClienteSalao = new javax.swing.JTextField();
        jTextFieldNomeClienteSalao = new javax.swing.JTextField();
        jLabelNomeClienteSalao = new javax.swing.JLabel();
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
        jFormattedTextFieldTelefoneResidencial = new javax.swing.JFormattedTextField();
        jLabelCelularContato = new javax.swing.JLabel();
        jFormattedTextFieldCelularContato = new javax.swing.JFormattedTextField();
        jLabelCpf = new javax.swing.JLabel();
        jFormattedTextFieldRg = new javax.swing.JFormattedTextField();
        jLabelRg = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldfacebook = new javax.swing.JTextField();
        jLabelFacebook = new javax.swing.JLabel();
        jLabelTwitter = new javax.swing.JLabel();
        jTextFieldTwitter = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente do Salão");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableClienteSalao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableClienteSalao);

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

        jLabelIdClienteSalao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIdClienteSalao.setForeground(new java.awt.Color(51, 102, 255));
        jLabelIdClienteSalao.setText("Código do Cliente do Salão");

        jTextFieldIdClienteSalao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldIdClienteSalao.setEnabled(false);

        jTextFieldNomeClienteSalao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNomeClienteSalao.setEnabled(false);

        jLabelNomeClienteSalao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeClienteSalao.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNomeClienteSalao.setText("Nome do Cliente do Salão");

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

        jFormattedTextFieldTelefoneResidencial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldTelefoneResidencial.setEnabled(false);

        jLabelCelularContato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelularContato.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCelularContato.setText("Celular de Contato");

        jFormattedTextFieldCelularContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCelularContato.setEnabled(false);

        jLabelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCpf.setText("CPF");

        jFormattedTextFieldRg.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldRg.setEnabled(false);

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

        jFormattedTextFieldCpf.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCpf.setEnabled(false);

        jFormattedTextFieldCep.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCep.setEnabled(false);

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
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFacebook))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTwitter)
                                    .addComponent(jTextFieldTwitter)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldIdClienteSalao)
                                    .addComponent(jLabelIdClienteSalao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNomeClienteSalao, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNomeClienteSalao))
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
                                    .addComponent(jLabelEstado)))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCep)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCpf)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRg)
                            .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTelefoneResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCelularContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldCelularContato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelIdClienteSalao)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldIdClienteSalao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNomeClienteSalao)
                                .addComponent(jLabelDataEntrada))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNomeClienteSalao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCpf)
                        .addGap(24, 24, 24))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelRg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelTelefoneResidencial)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelCelularContato)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldCelularContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelFacebook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldfacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelTwitter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Cadastro de Clientes do Salão");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Form Mapa de Controle de Não Conformidade:

           jTextFieldNomeClienteSalao.setText("");
           jFormattedTextFieldDataEntrada.setText("");
           jFormattedTextFieldDataSaida.setText("");
           jTextFieldEndereco.setText("");
           jTextFieldCidade.setText("");
           jComboBoxEstado.setSelectedItem("Selecione um Item");
           jFormattedTextFieldCep.setText("");
           jFormattedTextFieldCpf.setText("");
           jFormattedTextFieldRg.setText("");
           jFormattedTextFieldTelefoneResidencial.setText("");
           jFormattedTextFieldCelularContato.setText("");
           jTextFieldEmail.setText("");
           jTextFieldfacebook.setText("");
           jTextFieldTwitter.setText("");
        
           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(false);
              jButtonExcluir.setEnabled(false);
              jButtonSalvar.setEnabled(true);
              
                jTextFieldNomeClienteSalao.setEnabled(true);
                jTextFieldNomeClienteSalao.requestFocus();
                jFormattedTextFieldDataEntrada.setEnabled(true);
                jFormattedTextFieldDataSaida.setEnabled(true);
                jTextFieldEndereco.setEnabled(true);
                jTextFieldCidade.setEnabled(true);
                jComboBoxEstado.setEnabled(true);
                jFormattedTextFieldCep.setEnabled(true);
                jFormattedTextFieldCpf.setEnabled(true);
                jFormattedTextFieldRg.setEnabled(true);
                jFormattedTextFieldTelefoneResidencial.setEnabled(true);
                jFormattedTextFieldCelularContato.setEnabled(true);
                jTextFieldEmail.setEnabled(true);
                jTextFieldfacebook.setEnabled(true);
                jTextFieldTwitter.setEnabled(true);

                 jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Form Mapa de Controle de Não Conformidade:

           
           mod.setNomeClienteSalao(jTextFieldNomeClienteSalao.getText());
           mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
           mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
           mod.setEndereco(jTextFieldEndereco.getText());
           mod.setCidade(jTextFieldCidade.getText());
           mod.setEstado((String) jComboBoxEstado.getSelectedItem());
           mod.setCep(jFormattedTextFieldCep.getText());
           mod.setCpf(jFormattedTextFieldCpf.getText());
           mod.setRg(jFormattedTextFieldRg.getText());
           mod.setTelefoneResidencial(jFormattedTextFieldTelefoneResidencial.getText());
           mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
           mod.setEmail(jTextFieldEmail.getText());
           mod.setFacebook(jTextFieldfacebook.getText());
           mod.setTwitter(jTextFieldTwitter.getText());
                     
          ControleCadastroClienteSalao  cliente = new ControleCadastroClienteSalao();
          cliente.SalvarDados(mod);
           preencherTabela("SELECT * FROM tbl_cadastroclientesalao  ORDER BY Id_ClienteSalao");
          
            jTextFieldNomeClienteSalao.setText("");
            jFormattedTextFieldDataEntrada.setText("");
            jFormattedTextFieldDataSaida.setText("");
            jTextFieldEndereco.setText("");
            jTextFieldCidade.setText("");
            jComboBoxEstado.setSelectedItem("Selecione um Item");
            jFormattedTextFieldCep.setText("");
            jFormattedTextFieldCpf.setText("");
            jFormattedTextFieldRg.setText("");
            jFormattedTextFieldTelefoneResidencial.setText("");
            jFormattedTextFieldCelularContato.setText("");
            jTextFieldEmail.setText("");
            jTextFieldfacebook.setText("");
            jTextFieldTwitter.setText("");
                      
              jTextFieldNomeClienteSalao.setEnabled(!true);
              jFormattedTextFieldDataEntrada.setEnabled(!true);
              jFormattedTextFieldDataSaida.setEnabled(!true);
              jTextFieldEndereco.setEnabled(!true);
              jTextFieldCidade.setEnabled(!true);
              jComboBoxEstado.setEnabled(!true);
              jFormattedTextFieldCep.setEnabled(!true);
              jFormattedTextFieldCpf.setEnabled(!true);
              jFormattedTextFieldRg.setEnabled(!true);
              jFormattedTextFieldTelefoneResidencial.setEnabled(!true);
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

          
           mod.setNomeClienteSalao(jTextFieldNomeClienteSalao.getText());
           mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
           mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
           mod.setEndereco(jTextFieldEndereco.getText());
           mod.setCidade(jTextFieldCidade.getText());
           mod.setEstado((String) jComboBoxEstado.getSelectedItem());
           mod.setCep(jFormattedTextFieldCep.getText());
           mod.setCpf(jFormattedTextFieldCpf.getText());
           mod.setRg(jFormattedTextFieldRg.getText());
           mod.setTelefoneResidencial(jFormattedTextFieldTelefoneResidencial.getText());
           mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
           mod.setEmail(jTextFieldEmail.getText());
           mod.setFacebook(jTextFieldfacebook.getText());
           mod.setTwitter(jTextFieldTwitter.getText());
           mod.setIdClienteSalao(Integer.parseInt(jTextFieldIdClienteSalao.getText()));
                     
          ControleCadastroClienteSalao  cliente = new ControleCadastroClienteSalao();
          cliente.EditarDados(mod);
          
          preencherTabela("SELECT * FROM tbl_cadastroclientesalao  ORDER BY Id_ClienteSalao");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Form Cadastro de Usuário:
        
           jTextFieldNomeClienteSalao.setText("");
           jFormattedTextFieldDataEntrada.setText("");
           jFormattedTextFieldDataSaida.setText("");
           jTextFieldEndereco.setText("");
           jTextFieldCidade.setText("");
           jComboBoxEstado.setSelectedItem("Selecione um Item");
           jFormattedTextFieldCep.setText("");
           jFormattedTextFieldCpf.setText("");
           jFormattedTextFieldRg.setText("");
           jFormattedTextFieldTelefoneResidencial.setText("");
           jFormattedTextFieldCelularContato.setText("");
           jTextFieldEmail.setText("");
           jTextFieldfacebook.setText("");
           jTextFieldTwitter.setText("");
        
                jTextFieldNomeClienteSalao.setEnabled(!true);
                jFormattedTextFieldDataEntrada.setEnabled(!true);
                jFormattedTextFieldDataSaida.setEnabled(!true);
                jTextFieldEndereco.setEnabled(!true);
                jTextFieldCidade.setEnabled(!true);
                jComboBoxEstado.setEnabled(!true);
                jFormattedTextFieldCep.setEnabled(!true);
                jFormattedTextFieldCpf.setEnabled(!true);
                jFormattedTextFieldRg.setEnabled(!true);
                jFormattedTextFieldTelefoneResidencial.setEnabled(!true);
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
        
           mod.setIdClienteSalao(Integer.parseInt(jTextFieldIdClienteSalao.getText()));
           mod.setNomeClienteSalao(jTextFieldNomeClienteSalao.getText());
           mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
           mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
           mod.setEndereco(jTextFieldEndereco.getText());
           mod.setCidade(jTextFieldCidade.getText());
           mod.setEstado((String) jComboBoxEstado.getSelectedItem());
           mod.setCep(jFormattedTextFieldCep.getText());
           mod.setCpf(jFormattedTextFieldCpf.getText());
           mod.setRg(jFormattedTextFieldRg.getText());
           mod.setTelefoneResidencial(jFormattedTextFieldTelefoneResidencial.getText());
           mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
           mod.setEmail(jTextFieldEmail.getText());
           mod.setFacebook(jTextFieldfacebook.getText());
           mod.setTwitter(jTextFieldTwitter.getText());
                     
            ControleCadastroClienteSalao  cliente = new ControleCadastroClienteSalao();
            cliente.ExcluirDados(mod);
            
             preencherTabela("SELECT * FROM tbl_cadastroclientesalao  ORDER BY Id_ClienteSalao");

             jTextFieldNomeClienteSalao.setText("");
             jFormattedTextFieldDataEntrada.setText("");
             jFormattedTextFieldDataSaida.setText("");
             jTextFieldEndereco.setText("");
             jTextFieldCidade.setText("");
             jComboBoxEstado.setSelectedItem("Selecione um Item");
             jFormattedTextFieldCep.setText("");
             jFormattedTextFieldCpf.setText("");
             jFormattedTextFieldRg.setText("");
             jFormattedTextFieldTelefoneResidencial.setText("");
             jFormattedTextFieldCelularContato.setText("");
             jTextFieldEmail.setText("");
             jTextFieldfacebook.setText("");
             jTextFieldTwitter.setText("");
        
                jTextFieldNomeClienteSalao.setEnabled(!true);
                jFormattedTextFieldDataEntrada.setEnabled(!true);
                jFormattedTextFieldDataSaida.setEnabled(!true);
                jTextFieldEndereco.setEnabled(!true);
                jTextFieldCidade.setEnabled(!true);
                jComboBoxEstado.setEnabled(!true);
                jFormattedTextFieldCep.setEnabled(!true);
                jFormattedTextFieldCpf.setEnabled(!true);
                jFormattedTextFieldRg.setEnabled(!true);
                jFormattedTextFieldTelefoneResidencial.setEnabled(!true);
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
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Cadastro de Cliente do Salão?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
       // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Usuário:
        
         // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
            jButtonCancelar.setEnabled(true);
            jButtonEditar.setEnabled(true);
            jButtonExcluir.setEnabled(true);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(false);
            
             jTextFieldNomeClienteSalao.setEnabled(true);
             jTextFieldNomeClienteSalao.requestFocus();
             jFormattedTextFieldDataEntrada.setEnabled(true);
             jFormattedTextFieldDataSaida.setEnabled(true);
             jTextFieldEndereco.setEnabled(true);
             jTextFieldCidade.setEnabled(true);
             jComboBoxEstado.setEnabled(true);
             jFormattedTextFieldCep.setEnabled(true);
             jFormattedTextFieldCpf.setEnabled(true);
             jFormattedTextFieldRg.setEnabled(true);
             jFormattedTextFieldTelefoneResidencial.setEnabled(true);
             jFormattedTextFieldCelularContato.setEnabled(true);
             jTextFieldEmail.setEnabled(true);
             jTextFieldfacebook.setEnabled(true);
             jTextFieldTwitter.setEnabled(true);
                
              try {          
                  connclientesalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao ORDER BY Id_ClienteSalao");
                  connclientesalao.rs.first();
           
                  jTextFieldIdClienteSalao.setText(String.valueOf(connclientesalao.rs.getInt("Id_ClienteSalao")));
                  jTextFieldNomeClienteSalao.setText(connclientesalao.rs.getString("Nome_Cliente"));
                  jFormattedTextFieldDataEntrada.setText(connclientesalao.rs.getString("Data_Entrada"));
                  jFormattedTextFieldDataSaida.setText(connclientesalao.rs.getString("Data_Saida"));
                  jTextFieldEndereco.setText(connclientesalao.rs.getString("Endereco"));
                  jTextFieldCidade.setText(connclientesalao.rs.getString("Cidade"));
                  jComboBoxEstado.setSelectedItem(connclientesalao.rs.getString("Estado"));
                  jFormattedTextFieldCep.setText(connclientesalao.rs.getString("Cep"));
                  jFormattedTextFieldCpf.setText(connclientesalao.rs.getString("Cpf"));
                  jFormattedTextFieldRg.setText(connclientesalao.rs.getString("Rg"));
                  jFormattedTextFieldTelefoneResidencial.setText(connclientesalao.rs.getString("Telefone_Residencial"));
                  jFormattedTextFieldCelularContato.setText(connclientesalao.rs.getString("Celular_Contato"));
                  jTextFieldEmail.setText(connclientesalao.rs.getString("Email"));
                  jTextFieldfacebook.setText(connclientesalao.rs.getString("Facebook"));
                  jTextFieldTwitter.setText(connclientesalao.rs.getString("Twitter"));     
        
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
            
             jTextFieldNomeClienteSalao.setEnabled(true);
             jTextFieldNomeClienteSalao.requestFocus();
             jFormattedTextFieldDataEntrada.setEnabled(true);
             jFormattedTextFieldDataSaida.setEnabled(true);
             jTextFieldEndereco.setEnabled(true);
             jTextFieldCidade.setEnabled(true);
             jComboBoxEstado.setEnabled(true);
             jFormattedTextFieldCep.setEnabled(true);
             jFormattedTextFieldCpf.setEnabled(true);
             jFormattedTextFieldRg.setEnabled(true);
             jFormattedTextFieldTelefoneResidencial.setEnabled(true);
             jFormattedTextFieldCelularContato.setEnabled(true);
             jTextFieldEmail.setEnabled(true);
             jTextFieldfacebook.setEnabled(true);
             jTextFieldTwitter.setEnabled(true);
                
              try {          
                //  connclientesalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao ORDER BY Id_ClienteSalao");
                  connclientesalao.rs.next();
           
                  jTextFieldIdClienteSalao.setText(String.valueOf(connclientesalao.rs.getInt("Id_ClienteSalao")));
                  jTextFieldNomeClienteSalao.setText(connclientesalao.rs.getString("Nome_Cliente"));
                  jFormattedTextFieldDataEntrada.setText(connclientesalao.rs.getString("Data_Entrada"));
                  jFormattedTextFieldDataSaida.setText(connclientesalao.rs.getString("Data_Saida"));
                  jTextFieldEndereco.setText(connclientesalao.rs.getString("Endereco"));
                  jTextFieldCidade.setText(connclientesalao.rs.getString("Cidade"));
                  jComboBoxEstado.setSelectedItem(connclientesalao.rs.getString("Estado"));
                  jFormattedTextFieldCep.setText(connclientesalao.rs.getString("Cep"));
                  jFormattedTextFieldCpf.setText(connclientesalao.rs.getString("Cpf"));
                  jFormattedTextFieldRg.setText(connclientesalao.rs.getString("Rg"));
                  jFormattedTextFieldTelefoneResidencial.setText(connclientesalao.rs.getString("Telefone_Residencial"));
                  jFormattedTextFieldCelularContato.setText(connclientesalao.rs.getString("Celular_Contato"));
                  jTextFieldEmail.setText(connclientesalao.rs.getString("Email"));
                  jTextFieldfacebook.setText(connclientesalao.rs.getString("Facebook"));
                  jTextFieldTwitter.setText(connclientesalao.rs.getString("Twitter"));     
        
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
            
             jTextFieldNomeClienteSalao.setEnabled(true);
             jTextFieldNomeClienteSalao.requestFocus();
             jFormattedTextFieldDataEntrada.setEnabled(true);
             jFormattedTextFieldDataSaida.setEnabled(true);
             jTextFieldEndereco.setEnabled(true);
             jTextFieldCidade.setEnabled(true);
             jComboBoxEstado.setEnabled(true);
             jFormattedTextFieldCep.setEnabled(true);
             jFormattedTextFieldCpf.setEnabled(true);
             jFormattedTextFieldRg.setEnabled(true);
             jFormattedTextFieldTelefoneResidencial.setEnabled(true);
             jFormattedTextFieldCelularContato.setEnabled(true);
             jTextFieldEmail.setEnabled(true);
             jTextFieldfacebook.setEnabled(true);
             jTextFieldTwitter.setEnabled(true);
                
              try {          
                //  connclientesalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao ORDER BY Id_ClienteSalao");
                  connclientesalao.rs.previous();
           
                  jTextFieldIdClienteSalao.setText(String.valueOf(connclientesalao.rs.getInt("Id_ClienteSalao")));
                  jTextFieldNomeClienteSalao.setText(connclientesalao.rs.getString("Nome_Cliente"));
                  jFormattedTextFieldDataEntrada.setText(connclientesalao.rs.getString("Data_Entrada"));
                  jFormattedTextFieldDataSaida.setText(connclientesalao.rs.getString("Data_Saida"));
                  jTextFieldEndereco.setText(connclientesalao.rs.getString("Endereco"));
                  jTextFieldCidade.setText(connclientesalao.rs.getString("Cidade"));
                  jComboBoxEstado.setSelectedItem(connclientesalao.rs.getString("Estado"));
                  jFormattedTextFieldCep.setText(connclientesalao.rs.getString("Cep"));
                  jFormattedTextFieldCpf.setText(connclientesalao.rs.getString("Cpf"));
                  jFormattedTextFieldRg.setText(connclientesalao.rs.getString("Rg"));
                  jFormattedTextFieldTelefoneResidencial.setText(connclientesalao.rs.getString("Telefone_Residencial"));
                  jFormattedTextFieldCelularContato.setText(connclientesalao.rs.getString("Celular_Contato"));
                  jTextFieldEmail.setText(connclientesalao.rs.getString("Email"));
                  jTextFieldfacebook.setText(connclientesalao.rs.getString("Facebook"));
                  jTextFieldTwitter.setText(connclientesalao.rs.getString("Twitter"));     
        
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
            
             jTextFieldNomeClienteSalao.setEnabled(true);
             jTextFieldNomeClienteSalao.requestFocus();
             jFormattedTextFieldDataEntrada.setEnabled(true);
             jFormattedTextFieldDataSaida.setEnabled(true);
             jTextFieldEndereco.setEnabled(true);
             jTextFieldCidade.setEnabled(true);
             jComboBoxEstado.setEnabled(true);
             jFormattedTextFieldCep.setEnabled(true);
             jFormattedTextFieldCpf.setEnabled(true);
             jFormattedTextFieldRg.setEnabled(true);
             jFormattedTextFieldTelefoneResidencial.setEnabled(true);
             jFormattedTextFieldCelularContato.setEnabled(true);
             jTextFieldEmail.setEnabled(true);
             jTextFieldfacebook.setEnabled(true);
             jTextFieldTwitter.setEnabled(true);
                
              try {          
                  connclientesalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao ORDER BY Id_ClienteSalao");
                  connclientesalao.rs.last();
           
                  jTextFieldIdClienteSalao.setText(String.valueOf(connclientesalao.rs.getInt("Id_ClienteSalao")));
                  jTextFieldNomeClienteSalao.setText(connclientesalao.rs.getString("Nome_Cliente"));
                  jFormattedTextFieldDataEntrada.setText(connclientesalao.rs.getString("Data_Entrada"));
                  jFormattedTextFieldDataSaida.setText(connclientesalao.rs.getString("Data_Saida"));
                  jTextFieldEndereco.setText(connclientesalao.rs.getString("Endereco"));
                  jTextFieldCidade.setText(connclientesalao.rs.getString("Cidade"));
                  jComboBoxEstado.setSelectedItem(connclientesalao.rs.getString("Estado"));
                  jFormattedTextFieldCep.setText(connclientesalao.rs.getString("Cep"));
                  jFormattedTextFieldCpf.setText(connclientesalao.rs.getString("Cpf"));
                  jFormattedTextFieldRg.setText(connclientesalao.rs.getString("Rg"));
                  jFormattedTextFieldTelefoneResidencial.setText(connclientesalao.rs.getString("Telefone_Residencial"));
                  jFormattedTextFieldCelularContato.setText(connclientesalao.rs.getString("Celular_Contato"));
                  jTextFieldEmail.setText(connclientesalao.rs.getString("Email"));
                  jTextFieldfacebook.setText(connclientesalao.rs.getString("Facebook"));
                  jTextFieldTwitter.setText(connclientesalao.rs.getString("Twitter"));     
        
               } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao setar o último registro! \n Erro: " + ex);
             }

    }//GEN-LAST:event_jButtonUltimoActionPerformed

    public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Id_ClienteSalao", "Nome_Cliente", "Data_Entrada", "Data_Saida",
          "Endereco", "Cidade", "Estado", "Cep", "Cpf", "Rg", "Telefone_Residencial", "Celular_Contato",
          "Email", "Facebook", "Twitter" };
                     
             try {
                 connclientesalao.executaSQL(SQL);
                 connclientesalao.rs.first();
                  do{
                    dados.add(new Object[]{connclientesalao.rs.getInt("Id_ClienteSalao"),
                    connclientesalao.rs.getString("Nome_Cliente"), connclientesalao.rs.getString("Data_Entrada"), 
                    connclientesalao.rs.getString("Data_Saida"),connclientesalao.rs.getString("Endereco"),
                    connclientesalao.rs.getString("Cidade"), connclientesalao.rs.getString("Estado"), 
                    connclientesalao.rs.getString("Cep"), connclientesalao.rs.getString("Cpf"), 
                    connclientesalao.rs.getString("Rg"), connclientesalao.rs.getString("Telefone_Residencial"),
                    connclientesalao.rs.getString("Celular_Contato"), connclientesalao.rs.getString("Email"),
                    connclientesalao.rs.getString("Facebook"), connclientesalao.rs.getString("Twitter")});
                 }while(connclientesalao.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableClienteSalao.setModel(modelo);
               jTableClienteSalao.getColumnModel().getColumn(0).setPreferredWidth(130);
               jTableClienteSalao.getColumnModel().getColumn(0).setResizable(false);
               jTableClienteSalao.getColumnModel().getColumn(1).setPreferredWidth(180);
               jTableClienteSalao.getColumnModel().getColumn(1).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(2).setPreferredWidth(100);
               jTableClienteSalao.getColumnModel().getColumn(2).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(3).setPreferredWidth(130);
               jTableClienteSalao.getColumnModel().getColumn(3).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(4).setPreferredWidth(180);
               jTableClienteSalao.getColumnModel().getColumn(4).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(5).setPreferredWidth(100);
               jTableClienteSalao.getColumnModel().getColumn(5).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(6).setPreferredWidth(100);
               jTableClienteSalao.getColumnModel().getColumn(6).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(7).setPreferredWidth(120);
               jTableClienteSalao.getColumnModel().getColumn(7).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(8).setPreferredWidth(120);
               jTableClienteSalao.getColumnModel().getColumn(8).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(9).setPreferredWidth(120);
               jTableClienteSalao.getColumnModel().getColumn(9).setResizable(false);
               jTableClienteSalao.getColumnModel().getColumn(10).setPreferredWidth(100);
               jTableClienteSalao.getColumnModel().getColumn(10).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(11).setPreferredWidth(100);
               jTableClienteSalao.getColumnModel().getColumn(11).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(12).setPreferredWidth(200);
               jTableClienteSalao.getColumnModel().getColumn(12).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(13).setPreferredWidth(200);
               jTableClienteSalao.getColumnModel().getColumn(13).setResizable(false); 
               jTableClienteSalao.getColumnModel().getColumn(14).setPreferredWidth(200);
               jTableClienteSalao.getColumnModel().getColumn(14).setResizable(false);
               jTableClienteSalao.getTableHeader().setReorderingAllowed(false);
               jTableClienteSalao.setAutoResizeMode( jTableClienteSalao.AUTO_RESIZE_OFF);
               jTableClienteSalao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
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
            java.util.logging.Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroClienteSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCadastroClienteSalao().setVisible(true);
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
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataSaida;
    private javax.swing.JFormattedTextField jFormattedTextFieldRg;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneResidencial;
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
    private javax.swing.JLabel jLabelIdClienteSalao;
    private javax.swing.JLabel jLabelNomeClienteSalao;
    private javax.swing.JLabel jLabelRg;
    private javax.swing.JLabel jLabelTelefoneResidencial;
    private javax.swing.JLabel jLabelTwitter;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClienteSalao;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdClienteSalao;
    private javax.swing.JTextField jTextFieldNomeClienteSalao;
    private javax.swing.JTextField jTextFieldTwitter;
    private javax.swing.JTextField jTextFieldfacebook;
    // End of variables declaration//GEN-END:variables
}
