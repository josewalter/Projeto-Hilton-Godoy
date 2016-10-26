
package View;

import Controle.ControleCadastroFornecedoresSalao;
import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroFornecedoresSalao;
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
public class FrmCadastroFornecedoresSalao extends javax.swing.JFrame {
    ClassConectaBanco connfornecedores = new ClassConectaBanco();
    ModeloCadastroFornecedoresSalao mod = new ModeloCadastroFornecedoresSalao();
    ControleCadastroFornecedoresSalao contrl = new ControleCadastroFornecedoresSalao();
    
    public FrmCadastroFornecedoresSalao() {
        initComponents();
        connfornecedores.conexao();
        
//-------------------------------------------------------------------------------------------------------------        
        
         try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataEntrada.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(Level.SEVERE, null, ex);
          }
         
//-------------------------------------------------------------------------------------------------------------         
         
             try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataSaida.setFormatterFactory(new DefaultFormatterFactory(form));
            } catch (ParseException ex) {
              Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(Level.SEVERE, null, ex);
           }
                      
 //-------------------------------------------------------------------------------------------------------------            
             
     try {
          MaskFormatter form = new MaskFormatter("(##)####-####");
          jFormattedTextFieldTelefoneComercial.setFormatterFactory(new DefaultFormatterFactory(form));
     } catch (ParseException ex) {
          Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(Level.SEVERE, null, ex);
     }
        
//--------------------------------------------------------------------------------------------------------------     
     
try {
     MaskFormatter form = new MaskFormatter("(##)#####-####");
     jFormattedTextFieldCelularContato.setFormatterFactory(new DefaultFormatterFactory(form));
} catch (ParseException ex) {
     Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(Level.SEVERE, null, ex);
}
      
//=============================================================================================================

        preencherComboFuncionarioSalao();
        preencherTabela("SELECT * FROM tbl_cadastrofornecedoressalao  ORDER BY Id_FornecedorSalao");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFornecedorSalao = new javax.swing.JTable();
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
        jLabelIdFornecedor = new javax.swing.JLabel();
        jTextFieldCodigoFornecedor = new javax.swing.JTextField();
        jTextFieldNomeFornecedor = new javax.swing.JTextField();
        jLabelNomeFornecedor = new javax.swing.JLabel();
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
        jLabelTelefoneComercial = new javax.swing.JLabel();
        jFormattedTextFieldTelefoneComercial = new javax.swing.JFormattedTextField();
        jLabelCelularContato = new javax.swing.JLabel();
        jFormattedTextFieldCelularContato = new javax.swing.JFormattedTextField();
        jLabelCnpj = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jLabelFacebook = new javax.swing.JLabel();
        jLabelTwitter = new javax.swing.JLabel();
        jTextFieldTwitter = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox();
        jFormattedTextFieldCnpj = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jComboBoxFuncionarioResponsavel = new javax.swing.JComboBox();
        jLabelFuncionarioResponsavel = new javax.swing.JLabel();
        jButtonCadastroFuncionario = new javax.swing.JButton();
        jTextFieldFacebook = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores do Salão");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Cadastro de Fornecedores do Salão");

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableFornecedorSalao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableFornecedorSalao);

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

        jLabelIdFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIdFornecedor.setForeground(new java.awt.Color(51, 102, 255));
        jLabelIdFornecedor.setText("Código do Fornecedor");

        jTextFieldCodigoFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldCodigoFornecedor.setEnabled(false);

        jTextFieldNomeFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldNomeFornecedor.setEnabled(false);

        jLabelNomeFornecedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeFornecedor.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNomeFornecedor.setText("Nome do Fornecedor");

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

        jLabelTelefoneComercial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefoneComercial.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTelefoneComercial.setText("Telefone Comercial");

        jFormattedTextFieldTelefoneComercial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldTelefoneComercial.setEnabled(false);

        jLabelCelularContato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCelularContato.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCelularContato.setText("Celular de Contato");

        jFormattedTextFieldCelularContato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCelularContato.setEnabled(false);

        jLabelCnpj.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCnpj.setForeground(new java.awt.Color(51, 102, 255));
        jLabelCnpj.setText("Cnpj");

        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldEmail.setEnabled(false);

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(51, 102, 255));
        jLabelEmail.setText("E- mail");

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

        jFormattedTextFieldCnpj.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCnpj.setEnabled(false);

        jFormattedTextFieldCep.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldCep.setEnabled(false);

        jComboBoxFuncionarioResponsavel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxFuncionarioResponsavel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFuncionarioResponsavel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFuncionarioResponsavel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelFuncionarioResponsavel.setForeground(new java.awt.Color(51, 102, 255));
        jLabelFuncionarioResponsavel.setText("Funcionário Responsável");

        jButtonCadastroFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCadastroFuncionario.setForeground(new java.awt.Color(255, 51, 0));
        jButtonCadastroFuncionario.setText("Cadastro de Funcionário");
        jButtonCadastroFuncionario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroFuncionarioActionPerformed(evt);
            }
        });

        jTextFieldFacebook.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldFacebook.setEnabled(false);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEndereco)
                                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelEstado)))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCodigoFornecedor)
                                    .addComponent(jLabelIdFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFornecedor)
                                    .addComponent(jTextFieldNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(jLabelFacebook)
                                        .addGap(190, 190, 190)
                                        .addComponent(jLabelTwitter)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jTextFieldFacebook)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)))
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFuncionarioResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxFuncionarioResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelCep))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCnpj)
                            .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTelefoneComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelCelularContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldCelularContato, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelIdFornecedor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNomeFornecedor)
                                .addComponent(jLabelDataEntrada))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jFormattedTextFieldCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelCnpj)
                        .addGap(24, 24, 24))
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelTelefoneComercial)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldTelefoneComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelCelularContato)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldCelularContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelFacebook)
                            .addGap(18, 18, 18)
                            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabelTwitter))
                    .addComponent(jButtonCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelFuncionarioResponsavel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFuncionarioResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Form Cadastro de Fornecedores do Salão:

        jTextFieldNomeFornecedor.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jComboBoxEstado.setSelectedItem("Selecione um Item");
        jFormattedTextFieldCep.setText("");
        jFormattedTextFieldCnpj.setText("");
        jFormattedTextFieldTelefoneComercial.setText("");
        jFormattedTextFieldCelularContato.setText("");
        jTextFieldEmail.setText("");
        jTextFieldFacebook.setText("");
        jTextFieldTwitter.setText("");
        jComboBoxFuncionarioResponsavel.setSelectedItem("");

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
          jButtonCancelar.setEnabled(true);
          jButtonEditar.setEnabled(false);
          jButtonExcluir.setEnabled(false);
          jButtonSalvar.setEnabled(true);

           jTextFieldNomeFornecedor.setEnabled(true);
           jTextFieldNomeFornecedor.requestFocus();
           jFormattedTextFieldDataEntrada.setEnabled(true);
           jFormattedTextFieldDataSaida.setEnabled(true);
           jTextFieldEndereco.setEnabled(true);
           jTextFieldCidade.setEnabled(true);
           jComboBoxEstado.setEnabled(true);
           jFormattedTextFieldCep.setEnabled(true);
           jFormattedTextFieldCnpj.setEnabled(true);
           jFormattedTextFieldTelefoneComercial.setEnabled(true);
           jFormattedTextFieldCelularContato.setEnabled(true);
           jTextFieldEmail.setEnabled(true);
           jTextFieldFacebook.setEnabled(true);
           jTextFieldTwitter.setEnabled(true);
           jComboBoxFuncionarioResponsavel.setEnabled(true);

            jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Form do Cadastro de Fornecedores do Salão:

           mod.setNomeFornecedor(jTextFieldNomeFornecedor.getText());
           mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
           mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
           mod.setEndereco(jTextFieldEndereco.getText());
           mod.setCidade(jTextFieldCidade.getText());
           mod.setEstado((String) jComboBoxEstado.getSelectedItem());
           mod.setCep(jFormattedTextFieldCep.getText());
           mod.setCnpj(jFormattedTextFieldCnpj.getText());
           mod.setTelefoneComercial(jFormattedTextFieldTelefoneComercial.getText());
           mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
           mod.setEmail(jTextFieldEmail.getText());
           mod.setFacebook(jTextFieldFacebook.getText());
           mod.setTwitter(jTextFieldTwitter.getText());
           mod.setFuncionarioResponsavel((String) jComboBoxFuncionarioResponsavel.getSelectedItem());

           contrl.SalvarDados(mod);
           preencherTabela("SELECT * FROM tbl_cadastrofornecedoressalao  ORDER BY Id_FornecedorSalao");

           jTextFieldNomeFornecedor.setText("");
           jFormattedTextFieldDataEntrada.setText("");
           jFormattedTextFieldDataSaida.setText("");
           jTextFieldEndereco.setText("");
           jTextFieldCidade.setText("");
           jComboBoxEstado.setSelectedItem("Selecione um Item");
           jFormattedTextFieldCep.setText("");
           jFormattedTextFieldCnpj.setText("");
           jFormattedTextFieldTelefoneComercial.setText("");
           jFormattedTextFieldCelularContato.setText("");
           jTextFieldEmail.setText("");
           jTextFieldFacebook.setText("");
           jTextFieldTwitter.setText("");
           jComboBoxFuncionarioResponsavel.setSelectedItem("");

            jTextFieldNomeFornecedor.setEnabled(!true);
            jFormattedTextFieldDataEntrada.setEnabled(!true);
            jFormattedTextFieldDataSaida.setEnabled(!true);
            jTextFieldEndereco.setEnabled(!true);
            jTextFieldCidade.setEnabled(!true);
            jComboBoxEstado.setEnabled(!true);
            jFormattedTextFieldCep.setEnabled(!true);
            jFormattedTextFieldCnpj.setEnabled(!true);
            jFormattedTextFieldTelefoneComercial.setEnabled(!true);
            jFormattedTextFieldCelularContato.setEnabled(!true);
            jTextFieldEmail.setEnabled(!true);
            jTextFieldFacebook.setEnabled(!true);
            jTextFieldTwitter.setEnabled(!true);
            jComboBoxFuncionarioResponsavel.setEnabled(!true);

            // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
               jButtonCancelar.setEnabled(false);
               jButtonEditar.setEnabled(false);
               jButtonExcluir.setEnabled(false);
               jButtonSalvar.setEnabled(true);
               jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Declaração do botão editar do Form Cadastro de Fornecedores do Salão:

        mod.setNomeFornecedor(jTextFieldNomeFornecedor.getText());
        mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
        mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado((String) jComboBoxEstado.getSelectedItem());
        mod.setCep(jFormattedTextFieldCep.getText());
        mod.setCnpj(jFormattedTextFieldCnpj.getText());
        mod.setTelefoneComercial(jFormattedTextFieldTelefoneComercial.getText());
        mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
        mod.setEmail(jTextFieldEmail.getText());
        mod.setFacebook(jTextFieldFacebook.getText());
        mod.setTwitter(jTextFieldTwitter.getText());
        mod.setCodigoFornecedor(Integer.parseInt(jTextFieldCodigoFornecedor.getText()));

        contrl.EditarDados(mod);
        preencherTabela("SELECT * FROM tbl_cadastrofornecedoressalao  ORDER BY Id_FornecedorSalao");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Form Cadastro de Fornecedores do Salao:

        jTextFieldNomeFornecedor.setText("");
        jFormattedTextFieldDataEntrada.setText("");
        jFormattedTextFieldDataSaida.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldCidade.setText("");
        jComboBoxEstado.setSelectedItem("Selecione um Item");
        jFormattedTextFieldCep.setText("");
        jFormattedTextFieldCnpj.setText("");
        jFormattedTextFieldTelefoneComercial.setText("");
        jFormattedTextFieldCelularContato.setText("");
        jTextFieldEmail.setText("");
        jTextFieldFacebook.setText("");
        jTextFieldTwitter.setText("");
        jComboBoxFuncionarioResponsavel.setSelectedItem("");
        
         jTextFieldNomeFornecedor.setEnabled(!true);
         jFormattedTextFieldDataEntrada.setEnabled(!true);
         jFormattedTextFieldDataSaida.setEnabled(!true);
         jTextFieldEndereco.setEnabled(!true);
         jTextFieldCidade.setEnabled(!true);
         jComboBoxEstado.setEnabled(!true);
         jFormattedTextFieldCep.setEnabled(!true);
         jFormattedTextFieldCnpj.setEnabled(!true);
         jFormattedTextFieldTelefoneComercial.setEnabled(!true);
         jFormattedTextFieldCelularContato.setEnabled(!true);
         jTextFieldEmail.setEnabled(!true);
         jTextFieldFacebook.setEnabled(!true);
         jTextFieldTwitter.setEnabled(!true);
         jComboBoxFuncionarioResponsavel.setEnabled(!true);
        
         // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
           jButtonCancelar.setEnabled(false);
           jButtonEditar.setEnabled(false);
           jButtonExcluir.setEnabled(false);
           jButtonSalvar.setEnabled(true);
           jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Declaração do botão excluir do Form Cadastro de Fornecedores de Salão:

        mod.setCodigoFornecedor(Integer.parseInt(jTextFieldCodigoFornecedor.getText()));
        mod.setNomeFornecedor(jTextFieldNomeFornecedor.getText());
        mod.setDataEntrada(jFormattedTextFieldDataEntrada.getText());
        mod.setDataSaida(jFormattedTextFieldDataSaida.getText());
        mod.setEndereco(jTextFieldEndereco.getText());
        mod.setCidade(jTextFieldCidade.getText());
        mod.setEstado((String) jComboBoxEstado.getSelectedItem());
        mod.setCep(jFormattedTextFieldCep.getText());
        mod.setCnpj(jFormattedTextFieldCnpj.getText());
        mod.setTelefoneComercial(jFormattedTextFieldTelefoneComercial.getText());
        mod.setCelularContato(jFormattedTextFieldCelularContato.getText());
        mod.setEmail(jTextFieldEmail.getText());
        mod.setFacebook(jTextFieldFacebook.getText());
        mod.setTwitter(jTextFieldTwitter.getText());
        mod.setFuncionarioResponsavel((String) jComboBoxFuncionarioResponsavel.getSelectedItem());
        
         contrl.ExcluirDados(mod);
         preencherTabela("SELECT * FROM tbl_cadastrofornecedoressalao  ORDER BY Id_FornecedorSalao");

          jTextFieldNomeFornecedor.setText("");
          jFormattedTextFieldDataEntrada.setText("");
          jFormattedTextFieldDataSaida.setText("");
          jTextFieldEndereco.setText("");
          jTextFieldCidade.setText("");
          jComboBoxEstado.setSelectedItem("Selecione um Item");
          jFormattedTextFieldCep.setText("");
          jFormattedTextFieldCnpj.setText("");
          jFormattedTextFieldTelefoneComercial.setText("");
          jFormattedTextFieldCelularContato.setText("");
          jTextFieldEmail.setText("");
          jTextFieldFacebook.setText("");
          jTextFieldTwitter.setText("");
          jComboBoxFuncionarioResponsavel.setSelectedItem("");

           jTextFieldNomeFornecedor.setEnabled(!true);
           jFormattedTextFieldDataEntrada.setEnabled(!true);
           jFormattedTextFieldDataSaida.setEnabled(!true);
           jTextFieldEndereco.setEnabled(!true);
           jTextFieldCidade.setEnabled(!true);
           jComboBoxEstado.setEnabled(!true);
           jFormattedTextFieldCep.setEnabled(!true);
           jFormattedTextFieldCnpj.setEnabled(!true);
           jFormattedTextFieldTelefoneComercial.setEnabled(!true);
           jFormattedTextFieldCelularContato.setEnabled(!true);
           jTextFieldEmail.setEnabled(!true);
           jTextFieldFacebook.setEnabled(!true);
           jTextFieldTwitter.setEnabled(!true);
           jComboBoxFuncionarioResponsavel.setEnabled(!true);
        
          // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
             jButtonCancelar.setEnabled(false);
             jButtonEditar.setEnabled(false);
             jButtonExcluir.setEnabled(false);
             jButtonSalvar.setEnabled(true);
             jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Form Cadastro de Forneceodres do Salão:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Cadastro de Fornecedores do Salão?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Cadastro de Fornecedores do Salão:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
           jButtonCancelar.setEnabled(true);
           jButtonEditar.setEnabled(true);
           jButtonExcluir.setEnabled(true);
           jButtonSalvar.setEnabled(false);
           jButtonNovo.setEnabled(false);

            jTextFieldNomeFornecedor.setEnabled(true);
            jTextFieldNomeFornecedor.requestFocus();
            jFormattedTextFieldDataEntrada.setEnabled(true);
            jFormattedTextFieldDataSaida.setEnabled(true);
            jTextFieldEndereco.setEnabled(true);
            jTextFieldCidade.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jFormattedTextFieldCep.setEnabled(true);
            jFormattedTextFieldCnpj.setEnabled(true);
            jFormattedTextFieldTelefoneComercial.setEnabled(true);
            jFormattedTextFieldCelularContato.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldFacebook.setEnabled(true);
            jTextFieldTwitter.setEnabled(true);
            jComboBoxFuncionarioResponsavel.setEnabled(true);
        
        try {
            connfornecedores.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao ORDER BY Id_FornecedorSalao");
            connfornecedores.rs.first();

            jTextFieldCodigoFornecedor.setText(String.valueOf(connfornecedores.rs.getInt("Id_FornecedorSalao")));
            jTextFieldNomeFornecedor.setText(connfornecedores.rs.getString("Nome_Fornecedor"));
            jFormattedTextFieldDataEntrada.setText(connfornecedores.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(connfornecedores.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(connfornecedores.rs.getString("Endereco"));
            jTextFieldCidade.setText(connfornecedores.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(connfornecedores.rs.getString("Estado"));
            jFormattedTextFieldCep.setText(connfornecedores.rs.getString("Cep"));
            jFormattedTextFieldCnpj.setText(connfornecedores.rs.getString("Cnpj"));
            jFormattedTextFieldTelefoneComercial.setText(connfornecedores.rs.getString("Telefone_Comercial"));
            jFormattedTextFieldCelularContato.setText(connfornecedores.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(connfornecedores.rs.getString("Email"));
            jTextFieldFacebook.setText(connfornecedores.rs.getString("Facebook"));
            jTextFieldTwitter.setText(connfornecedores.rs.getString("Twitter"));
            jComboBoxFuncionarioResponsavel.setSelectedItem(connfornecedores.rs.getString("Funcionario_Responsavel"));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o primeiro registro! \n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
         // Declaração do botão próximo referente ao botão editar do Form Cadastro de Fornecedores do Salão:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
           jButtonCancelar.setEnabled(true);
           jButtonEditar.setEnabled(true);
           jButtonExcluir.setEnabled(true);
           jButtonSalvar.setEnabled(false);
           jButtonNovo.setEnabled(false);

            jTextFieldNomeFornecedor.setEnabled(true);
            jTextFieldNomeFornecedor.requestFocus();
            jFormattedTextFieldDataEntrada.setEnabled(true);
            jFormattedTextFieldDataSaida.setEnabled(true);
            jTextFieldEndereco.setEnabled(true);
            jTextFieldCidade.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jFormattedTextFieldCep.setEnabled(true);
            jFormattedTextFieldCnpj.setEnabled(true);
            jFormattedTextFieldTelefoneComercial.setEnabled(true);
            jFormattedTextFieldCelularContato.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldFacebook.setEnabled(true);
            jTextFieldTwitter.setEnabled(true);
            jComboBoxFuncionarioResponsavel.setEnabled(true);
        
        try {
           // connfornecedores.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao ORDER BY Codigo_Fornecedor");
            connfornecedores.rs.next();

            jTextFieldCodigoFornecedor.setText(String.valueOf(connfornecedores.rs.getInt("Id_FornecedorSalao")));
            jTextFieldNomeFornecedor.setText(connfornecedores.rs.getString("Nome_Fornecedor"));
            jFormattedTextFieldDataEntrada.setText(connfornecedores.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(connfornecedores.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(connfornecedores.rs.getString("Endereco"));
            jTextFieldCidade.setText(connfornecedores.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(connfornecedores.rs.getString("Estado"));
            jFormattedTextFieldCep.setText(connfornecedores.rs.getString("Cep"));
            jFormattedTextFieldCnpj.setText(connfornecedores.rs.getString("Cnpj"));
            jFormattedTextFieldTelefoneComercial.setText(connfornecedores.rs.getString("Telefone_Comercial"));
            jFormattedTextFieldCelularContato.setText(connfornecedores.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(connfornecedores.rs.getString("Email"));
            jTextFieldFacebook.setText(connfornecedores.rs.getString("Facebook"));
            jTextFieldTwitter.setText(connfornecedores.rs.getString("Twitter"));
            jComboBoxFuncionarioResponsavel.setSelectedItem(connfornecedores.rs.getString("Funcionario_Responsavel"));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o próximo registro! \n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
         // Declaração do botão anterior referente ao botão editar do Form Cadastro de Fornecedores do Salão:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
           jButtonCancelar.setEnabled(true);
           jButtonEditar.setEnabled(true);
           jButtonExcluir.setEnabled(true);
           jButtonSalvar.setEnabled(false);
           jButtonNovo.setEnabled(false);

            jTextFieldNomeFornecedor.setEnabled(true);
            jTextFieldNomeFornecedor.requestFocus();
            jFormattedTextFieldDataEntrada.setEnabled(true);
            jFormattedTextFieldDataSaida.setEnabled(true);
            jTextFieldEndereco.setEnabled(true);
            jTextFieldCidade.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jFormattedTextFieldCep.setEnabled(true);
            jFormattedTextFieldCnpj.setEnabled(true);
            jFormattedTextFieldTelefoneComercial.setEnabled(true);
            jFormattedTextFieldCelularContato.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldFacebook.setEnabled(true);
            jTextFieldTwitter.setEnabled(true);
            jComboBoxFuncionarioResponsavel.setEnabled(true);
        
        try {
          //  connfornecedores.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao ORDER BY Codigo_Fornecedor");
            connfornecedores.rs.previous();

            jTextFieldCodigoFornecedor.setText(String.valueOf(connfornecedores.rs.getInt("Id_FornecedorSalao")));
            jTextFieldNomeFornecedor.setText(connfornecedores.rs.getString("Nome_Fornecedor"));
            jFormattedTextFieldDataEntrada.setText(connfornecedores.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(connfornecedores.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(connfornecedores.rs.getString("Endereco"));
            jTextFieldCidade.setText(connfornecedores.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(connfornecedores.rs.getString("Estado"));
            jFormattedTextFieldCep.setText(connfornecedores.rs.getString("Cep"));
            jFormattedTextFieldCnpj.setText(connfornecedores.rs.getString("Cnpj"));
            jFormattedTextFieldTelefoneComercial.setText(connfornecedores.rs.getString("Telefone_Comercial"));
            jFormattedTextFieldCelularContato.setText(connfornecedores.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(connfornecedores.rs.getString("Email"));
            jTextFieldFacebook.setText(connfornecedores.rs.getString("Facebook"));
            jTextFieldTwitter.setText(connfornecedores.rs.getString("Twitter"));
            jComboBoxFuncionarioResponsavel.setSelectedItem(connfornecedores.rs.getString("Funcionario_Responsavel"));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o registro anterior! \n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
         // Declaração do botão último referente ao botão editar do Form Cadastro de Fornecedores do Salão:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
           jButtonCancelar.setEnabled(true);
           jButtonEditar.setEnabled(true);
           jButtonExcluir.setEnabled(true);
           jButtonSalvar.setEnabled(false);
           jButtonNovo.setEnabled(false);

            jTextFieldNomeFornecedor.setEnabled(true);
            jTextFieldNomeFornecedor.requestFocus();
            jFormattedTextFieldDataEntrada.setEnabled(true);
            jFormattedTextFieldDataSaida.setEnabled(true);
            jTextFieldEndereco.setEnabled(true);
            jTextFieldCidade.setEnabled(true);
            jComboBoxEstado.setEnabled(true);
            jFormattedTextFieldCep.setEnabled(true);
            jFormattedTextFieldCnpj.setEnabled(true);
            jFormattedTextFieldTelefoneComercial.setEnabled(true);
            jFormattedTextFieldCelularContato.setEnabled(true);
            jTextFieldEmail.setEnabled(true);
            jTextFieldFacebook.setEnabled(true);
            jTextFieldTwitter.setEnabled(true);
            jComboBoxFuncionarioResponsavel.setEnabled(true);
        
        try {
            connfornecedores.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao ORDER BY Id_FornecedorSalao");
            connfornecedores.rs.last();

            jTextFieldCodigoFornecedor.setText(String.valueOf(connfornecedores.rs.getInt("Id_FornecedorSalao")));
            jTextFieldNomeFornecedor.setText(connfornecedores.rs.getString("Nome_Fornecedor"));
            jFormattedTextFieldDataEntrada.setText(connfornecedores.rs.getString("Data_Entrada"));
            jFormattedTextFieldDataSaida.setText(connfornecedores.rs.getString("Data_Saida"));
            jTextFieldEndereco.setText(connfornecedores.rs.getString("Endereco"));
            jTextFieldCidade.setText(connfornecedores.rs.getString("Cidade"));
            jComboBoxEstado.setSelectedItem(connfornecedores.rs.getString("Estado"));
            jFormattedTextFieldCep.setText(connfornecedores.rs.getString("Cep"));
            jFormattedTextFieldCnpj.setText(connfornecedores.rs.getString("Cnpj"));
            jFormattedTextFieldTelefoneComercial.setText(connfornecedores.rs.getString("Telefone_Comercial"));
            jFormattedTextFieldCelularContato.setText(connfornecedores.rs.getString("Celular_Contato"));
            jTextFieldEmail.setText(connfornecedores.rs.getString("Email"));
            jTextFieldFacebook.setText(connfornecedores.rs.getString("Facebook"));
            jTextFieldTwitter.setText(connfornecedores.rs.getString("Twitter"));
            jComboBoxFuncionarioResponsavel.setSelectedItem(connfornecedores.rs.getString("Funcionario_Responsavel"));
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o último registro! \n Erro: " + ex);
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroFuncionarioActionPerformed
        // Código de acesso ao Form Cadastro de Funcionários do Salão:
        
           FrmCadastroFuncionariosSalao cadfun = new FrmCadastroFuncionariosSalao();
           cadfun.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroFuncionarioActionPerformed

public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Id_FornecedorSalao", "Nome_Fornecedor", "Data_Entrada", "Data_Saida",
          "Endereco", "Cidade", "Estado", "Cep", "Cnpj", "Telefone_Residencial", "Celular_Contato",
          "Email", "Facebook", "Twitter", "Funcionario_Responsavel" };
                     
             try {
                 connfornecedores.executaSQL(SQL);
                 connfornecedores.rs.first();
                  do{
                    dados.add(new Object[]{connfornecedores.rs.getInt("Id_FornecedorSalao"),
                    connfornecedores.rs.getString("Nome_Fornecedor"), connfornecedores.rs.getString("Data_Entrada"), 
                    connfornecedores.rs.getString("Data_Saida"),connfornecedores.rs.getString("Endereco"),
                    connfornecedores.rs.getString("Cidade"), connfornecedores.rs.getString("Estado"), 
                    connfornecedores.rs.getString("Cep"), connfornecedores.rs.getString("Cnpj"), 
                    connfornecedores.rs.getString("Telefone_Comercial"), connfornecedores.rs.getString("Celular_Contato"),
                    connfornecedores.rs.getString("Email"), connfornecedores.rs.getString("Facebook"), 
                    connfornecedores.rs.getString("Twitter"), connfornecedores.rs.getString("Funcionario_Responsavel")});
                 }while(connfornecedores.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableFornecedorSalao.setModel(modelo);
               jTableFornecedorSalao.getColumnModel().getColumn(0).setPreferredWidth(130);
               jTableFornecedorSalao.getColumnModel().getColumn(0).setResizable(false);
               jTableFornecedorSalao.getColumnModel().getColumn(1).setPreferredWidth(180);
               jTableFornecedorSalao.getColumnModel().getColumn(1).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(2).setPreferredWidth(100);
               jTableFornecedorSalao.getColumnModel().getColumn(2).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(3).setPreferredWidth(130);
               jTableFornecedorSalao.getColumnModel().getColumn(3).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(4).setPreferredWidth(180);
               jTableFornecedorSalao.getColumnModel().getColumn(4).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(5).setPreferredWidth(100);
               jTableFornecedorSalao.getColumnModel().getColumn(5).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(6).setPreferredWidth(100);
               jTableFornecedorSalao.getColumnModel().getColumn(6).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(7).setPreferredWidth(120);
               jTableFornecedorSalao.getColumnModel().getColumn(7).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(8).setPreferredWidth(120);
               jTableFornecedorSalao.getColumnModel().getColumn(8).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(9).setPreferredWidth(120);
               jTableFornecedorSalao.getColumnModel().getColumn(9).setResizable(false);
               jTableFornecedorSalao.getColumnModel().getColumn(10).setPreferredWidth(100);
               jTableFornecedorSalao.getColumnModel().getColumn(10).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(11).setPreferredWidth(100);
               jTableFornecedorSalao.getColumnModel().getColumn(11).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(12).setPreferredWidth(200);
               jTableFornecedorSalao.getColumnModel().getColumn(12).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(13).setPreferredWidth(200);
               jTableFornecedorSalao.getColumnModel().getColumn(13).setResizable(false); 
               jTableFornecedorSalao.getColumnModel().getColumn(14).setPreferredWidth(200);
               jTableFornecedorSalao.getColumnModel().getColumn(14).setResizable(false);
               jTableFornecedorSalao.getTableHeader().setReorderingAllowed(false);
               jTableFornecedorSalao.setAutoResizeMode( jTableFornecedorSalao.AUTO_RESIZE_OFF);
               jTableFornecedorSalao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
        }    
    
//===========================================================================================================
    
    // Código para preencher o Combo Nome do Funcionário .
    
    public void preencherComboFuncionarioSalao(){
      
        connfornecedores.conexao();
        try {
            connfornecedores.executaSQL("SELECT * FROM tbl_cadastrofuncionariosalao ORDER BY Nome_Funcionario");
            connfornecedores.rs.first();
            jComboBoxFuncionarioResponsavel.removeAllItems();
          do{
            jComboBoxFuncionarioResponsavel.addItem(connfornecedores.rs.getString("Nome_Funcionario"));
          }while(connfornecedores.rs.next());
         //  connacompanhamento.desconecta();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Erro ao preencher combo !\n Erro: " + ex); 
           // connacompanhamento.desconecta();
        }
        
      }     
     
//============================================================================================================     

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
            java.util.logging.Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFornecedoresSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmCadastroFornecedoresSalao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCadastroFuncionario;
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
    private javax.swing.JComboBox jComboBoxFuncionarioResponsavel;
    private javax.swing.JFormattedTextField jFormattedTextFieldCelularContato;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCnpj;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataSaida;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneComercial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCelularContato;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelDataEntrada;
    private javax.swing.JLabel jLabelDataSaida;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFacebook;
    private javax.swing.JLabel jLabelFuncionarioResponsavel;
    private javax.swing.JLabel jLabelIdFornecedor;
    private javax.swing.JLabel jLabelNomeFornecedor;
    private javax.swing.JLabel jLabelTelefoneComercial;
    private javax.swing.JLabel jLabelTwitter;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFornecedorSalao;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigoFornecedor;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldFacebook;
    private javax.swing.JTextField jTextFieldNomeFornecedor;
    private javax.swing.JTextField jTextFieldTwitter;
    // End of variables declaration//GEN-END:variables
}
