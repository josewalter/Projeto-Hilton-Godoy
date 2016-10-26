
package View;

import Controle.ControleAgendamentoServico;
import DAO.ClassConectaBanco;
import Modelo.ModeloAgendamentoServico;
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
 * @author:José Walter.
 */
public class FrmAgendamentoServico extends javax.swing.JFrame {
    ClassConectaBanco connagendamento = new ClassConectaBanco();
    ModeloAgendamentoServico mod = new ModeloAgendamentoServico();
    ControleAgendamentoServico contrl = new ControleAgendamentoServico();
   
    public FrmAgendamentoServico() {
        initComponents();
        connagendamento.conexao();
        preencherComboClienteSalao(); 
        preencherTabela("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento");
        
//-------------------------------------------------------------------------------------------------------
        
               try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataServico.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmAgendamentoServico.class.getName()).log(Level.SEVERE, null, ex);
          } 
               
//-------------------------------------------------------------------------------------------------------
        
               try {
              MaskFormatter form = new MaskFormatter("##:##:##");
              jFormattedTextFieldHorarioInicio.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmAgendamentoServico.class.getName()).log(Level.SEVERE, null, ex);
          }

//-------------------------------------------------------------------------------------------------------
        
               try {
              MaskFormatter form = new MaskFormatter("##:##:##");
              jFormattedTextFieldHorarioTermino.setFormatterFactory(new DefaultFormatterFactory(form));
         } catch (ParseException ex) {
              Logger.getLogger(FrmAgendamentoServico.class.getName()).log(Level.SEVERE, null, ex);
          }               
    }

 
//-------------------------------------------------------------------------------------------------------   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAtendimento = new javax.swing.JTable();
        jLabelIdCodigoAgendamento = new javax.swing.JLabel();
        jTextFieldIdAgendamento = new javax.swing.JTextField();
        jTextFieldServicosRealizados = new javax.swing.JTextField();
        jLabelServicosFeitos = new javax.swing.JLabel();
        jFormattedTextFieldDataServico = new javax.swing.JFormattedTextField();
        jLabelDataServico = new javax.swing.JLabel();
        jFormattedTextFieldHorarioInicio = new javax.swing.JFormattedTextField();
        jLabelDataEntrega = new javax.swing.JLabel();
        jLabelDescricaoServicos = new javax.swing.JLabel();
        jTextFieldValorServico = new javax.swing.JTextField();
        jLabelValorServico = new javax.swing.JLabel();
        jFormattedTextFieldHorarioTermino = new javax.swing.JFormattedTextField();
        jLabelHorarioTermino = new javax.swing.JLabel();
        jLabelTabelaDados = new javax.swing.JLabel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescricaoServicos = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaProdutosEmpresa = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaPrudtosCliente = new javax.swing.JTextArea();
        jLabelProdutosEmpresa = new javax.swing.JLabel();
        jLabelProdutosCliente = new javax.swing.JLabel();
        jTextFieldDiaSemana = new javax.swing.JTextField();
        jLabelDiaSemana = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabelServicosFeitos1 = new javax.swing.JLabel();
        jButtonCadastroCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Agendamento de Serviços");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Agendamento de Serviços a serem realizados no Salão");

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableAtendimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAtendimento);

        jLabelIdCodigoAgendamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIdCodigoAgendamento.setForeground(new java.awt.Color(51, 102, 255));
        jLabelIdCodigoAgendamento.setText("Código do Agendamento");

        jTextFieldIdAgendamento.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldIdAgendamento.setEnabled(false);

        jTextFieldServicosRealizados.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldServicosRealizados.setEnabled(false);

        jLabelServicosFeitos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelServicosFeitos.setForeground(new java.awt.Color(51, 102, 255));
        jLabelServicosFeitos.setText("Serviços a serem realizados");

        jFormattedTextFieldDataServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDataServico.setEnabled(false);

        jLabelDataServico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataServico.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataServico.setText("Data do Serviço ");

        jFormattedTextFieldHorarioInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldHorarioInicio.setEnabled(false);

        jLabelDataEntrega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataEntrega.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataEntrega.setText("Horário de Inicio");

        jLabelDescricaoServicos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDescricaoServicos.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDescricaoServicos.setText("Descrição dos serviços a serem realizados ");

        jTextFieldValorServico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldValorServico.setEnabled(false);

        jLabelValorServico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorServico.setForeground(new java.awt.Color(51, 102, 255));
        jLabelValorServico.setText("Valor do Serviço");

        jFormattedTextFieldHorarioTermino.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldHorarioTermino.setEnabled(false);

        jLabelHorarioTermino.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelHorarioTermino.setForeground(new java.awt.Color(51, 102, 255));
        jLabelHorarioTermino.setText("Horário de Término");

        jLabelTabelaDados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTabelaDados.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTabelaDados.setText("Tabela de Dados");

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
                .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButonLayout.setVerticalGroup(
            jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelButonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPrimeiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonProximo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUltimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jTextAreaDescricaoServicos.setColumns(20);
        jTextAreaDescricaoServicos.setRows(5);
        jTextAreaDescricaoServicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jTextAreaDescricaoServicos);

        jTextAreaProdutosEmpresa.setColumns(20);
        jTextAreaProdutosEmpresa.setRows(5);
        jTextAreaProdutosEmpresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(jTextAreaProdutosEmpresa);

        jTextAreaPrudtosCliente.setColumns(20);
        jTextAreaPrudtosCliente.setRows(5);
        jTextAreaPrudtosCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(jTextAreaPrudtosCliente);

        jLabelProdutosEmpresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelProdutosEmpresa.setForeground(new java.awt.Color(51, 102, 255));
        jLabelProdutosEmpresa.setText("Produtos da empresa");

        jLabelProdutosCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelProdutosCliente.setForeground(new java.awt.Color(51, 102, 255));
        jLabelProdutosCliente.setText("Produtos do Cliente");

        jTextFieldDiaSemana.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldDiaSemana.setEnabled(false);

        jLabelDiaSemana.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDiaSemana.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDiaSemana.setText("Dia da Semana");

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelServicosFeitos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelServicosFeitos1.setForeground(new java.awt.Color(51, 102, 255));
        jLabelServicosFeitos1.setText("Cadastro de Cliente");

        jButtonCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCadastroCliente.setForeground(new java.awt.Color(255, 0, 51));
        jButtonCadastroCliente.setText("Cadastro Cliente");
        jButtonCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelIdCodigoAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelServicosFeitos1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServicosFeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldServicosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldDiaSemana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDataServico, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataServico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelDataEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addComponent(jFormattedTextFieldHorarioInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHorarioTermino)
                            .addComponent(jFormattedTextFieldHorarioTermino, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabelDescricaoServicos)
                                .addGap(76, 76, 76)
                                .addComponent(jLabelProdutosEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelProdutosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabelTabelaDados)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdCodigoAgendamento)
                            .addComponent(jLabelServicosFeitos)
                            .addComponent(jLabelServicosFeitos1)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldServicosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDiaSemana)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDataEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldHorarioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelValorServico)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldValorServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabelHorarioTermino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFormattedTextFieldHorarioTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDataServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextFieldDataServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoServicos)
                    .addComponent(jLabelProdutosEmpresa)
                    .addComponent(jLabelProdutosCliente))
                .addGap(11, 11, 11)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelTabelaDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelButon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // Declaração do botão novo do Form Mapa de Controle de Não Conformidade:

           jComboBoxCliente.setSelectedItem("Selececione um Item");
           jTextFieldServicosRealizados.setText("");
           jTextFieldServicosRealizados.requestFocus();
           jTextFieldDiaSemana.setText("");
           jFormattedTextFieldDataServico.setText("");
           jFormattedTextFieldHorarioInicio.setText("");
           jFormattedTextFieldHorarioTermino.setText("");
           jTextFieldValorServico.setText("");
           jTextAreaDescricaoServicos.setText("");
           jTextAreaProdutosEmpresa.setText("");
           jTextAreaPrudtosCliente.setText("");

           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(false);
              jButtonExcluir.setEnabled(false);
              jButtonSalvar.setEnabled(true);

                jComboBoxCliente.setEnabled(true);
                jTextFieldServicosRealizados.setEnabled(true);
                jTextFieldServicosRealizados.requestFocus();
                jTextFieldDiaSemana.setEnabled(true);
                jFormattedTextFieldDataServico.setEnabled(true);
                jFormattedTextFieldHorarioInicio.setEnabled(true);
                jFormattedTextFieldHorarioTermino.setEnabled(true);
                jTextFieldValorServico.setEnabled(true);
                jTextAreaDescricaoServicos.setEnabled(true);
                jTextAreaProdutosEmpresa.setEnabled(true);
                jTextAreaPrudtosCliente.setEnabled(true);

                  jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // Declaração do botão salvar do Form Mapa de Controle de Não Conformidade:

           mod.setNome_Cliente((String) jComboBoxCliente.getSelectedItem());
           mod.setServicos_Feitos(jTextFieldServicosRealizados.getText());
           mod.setDias_Semana(jTextFieldDiaSemana.getText());
           mod.setData_Servico(jFormattedTextFieldDataServico.getText());
           mod.setHorario_Inicio(jFormattedTextFieldHorarioInicio.getText());
           mod.setHorario_Termino(jFormattedTextFieldHorarioTermino.getText());
           mod.setValor_Servico(jTextFieldValorServico.getText());
           mod.setDescricao_Servicos(jTextAreaDescricaoServicos.getText());
           mod.setProduto_Empresa(jTextAreaProdutosEmpresa.getText());
           mod.setProduto_Cliente(jTextAreaPrudtosCliente.getText());
           
           contrl.SalvarAgendamento(mod);
           preencherTabela("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento");
           
            jComboBoxCliente.setSelectedItem("Selecione um Item");
            jTextFieldServicosRealizados.setText("");
            jTextFieldDiaSemana.setText("");
            jFormattedTextFieldDataServico.setText("");
            jFormattedTextFieldHorarioInicio.setText("");
            jFormattedTextFieldHorarioTermino.setText("");
            jTextFieldValorServico.setText("");
            jTextAreaDescricaoServicos.setText("");
            jTextAreaProdutosEmpresa.setText("");
            jTextAreaPrudtosCliente.setText("");

                jComboBoxCliente.setEnabled(!true);
                jTextFieldServicosRealizados.setEnabled(!true);
                jTextFieldDiaSemana.setEnabled(!true);
                jFormattedTextFieldDataServico.setEnabled(!true);
                jFormattedTextFieldHorarioInicio.setEnabled(!true);
                jFormattedTextFieldHorarioTermino.setEnabled(!true);
                jTextFieldValorServico.setEnabled(!true);
                jTextAreaDescricaoServicos.setEnabled(!true);
                jTextAreaProdutosEmpresa.setEnabled(!true);
                jTextAreaPrudtosCliente.setEnabled(!true);

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonSalvar.setEnabled(true);
                  jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // Declaração do botão editar do Form Cadastro de Agendamento:
        
           mod.setNome_Cliente((String) jComboBoxCliente.getSelectedItem());
           mod.setServicos_Feitos(jTextFieldServicosRealizados.getText());
           mod.setDias_Semana(jTextFieldDiaSemana.getText());
           mod.setData_Servico(jFormattedTextFieldDataServico.getText());
           mod.setHorario_Inicio(jFormattedTextFieldHorarioInicio.getText());
           mod.setHorario_Termino(jFormattedTextFieldHorarioTermino.getText());
           mod.setValor_Servico(jTextFieldValorServico.getText());
           mod.setDescricao_Servicos(jTextAreaDescricaoServicos.getText());
           mod.setProduto_Empresa(jTextAreaProdutosEmpresa.getText());
           mod.setProduto_Cliente(jTextAreaPrudtosCliente.getText());
           mod.setId_Agendamento(Integer.parseInt(jTextFieldIdAgendamento.getText()));
           
           contrl.EditarAgendamento(mod);
          preencherTabela("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento");           
       
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // Declaração do botão cancelar do Form Cadastro de Agendamento:

            jComboBoxCliente.setSelectedItem("Selecione um Item");
            jTextFieldServicosRealizados.setText("");
            jTextFieldDiaSemana.setText("");
            jFormattedTextFieldDataServico.setText("");
            jFormattedTextFieldHorarioInicio.setText("");
            jFormattedTextFieldHorarioTermino.setText("");
            jTextFieldValorServico.setText("");
            jTextAreaDescricaoServicos.setText("");
            jTextAreaProdutosEmpresa.setText("");
            jTextAreaPrudtosCliente.setText("");

                jComboBoxCliente.setEnabled(!true);
                jTextFieldServicosRealizados.setEnabled(!true);
                jTextFieldDiaSemana.setEnabled(!true);
                jFormattedTextFieldDataServico.setEnabled(!true);
                jFormattedTextFieldHorarioInicio.setEnabled(!true);
                jFormattedTextFieldHorarioTermino.setEnabled(!true);
                jTextFieldValorServico.setEnabled(!true);
                jTextAreaDescricaoServicos.setEnabled(!true);
                jTextAreaProdutosEmpresa.setEnabled(!true);
                jTextAreaPrudtosCliente.setEnabled(!true);

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonSalvar.setEnabled(true);
                  jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Declaração do botão excluir do Form Cadastro de Agendamento:

           mod.setId_Agendamento(Integer.parseInt(jTextFieldIdAgendamento.getText()));
           mod.setNome_Cliente((String) jComboBoxCliente.getSelectedItem());
           mod.setServicos_Feitos(jTextFieldServicosRealizados.getText());
           mod.setDias_Semana(jTextFieldDiaSemana.getText());
           mod.setData_Servico(jFormattedTextFieldDataServico.getText());
           mod.setHorario_Inicio(jFormattedTextFieldHorarioInicio.getText());
           mod.setHorario_Termino(jFormattedTextFieldHorarioTermino.getText());
           mod.setValor_Servico(jTextFieldValorServico.getText());
           mod.setDescricao_Servicos(jTextAreaDescricaoServicos.getText());
           mod.setProduto_Empresa(jTextAreaProdutosEmpresa.getText());
           mod.setProduto_Cliente(jTextAreaPrudtosCliente.getText());
           contrl.ExcluirAgendamento(mod);
          
           preencherTabela("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento");

            jComboBoxCliente.setSelectedItem("Selecione um Item");
            jTextFieldServicosRealizados.setText("");
            jTextFieldDiaSemana.setText("");
            jFormattedTextFieldDataServico.setText("");
            jFormattedTextFieldHorarioInicio.setText("");
            jFormattedTextFieldHorarioTermino.setText("");
            jTextFieldValorServico.setText("");
            jTextAreaDescricaoServicos.setText("");
            jTextAreaProdutosEmpresa.setText("");
            jTextAreaPrudtosCliente.setText("");

                jComboBoxCliente.setEnabled(!true);
                jTextFieldServicosRealizados.setEnabled(!true);
                jTextFieldDiaSemana.setEnabled(!true);
                jFormattedTextFieldDataServico.setEnabled(!true);
                jFormattedTextFieldHorarioInicio.setEnabled(!true);
                jFormattedTextFieldHorarioTermino.setEnabled(!true);
                jTextFieldValorServico.setEnabled(!true);
                jTextAreaDescricaoServicos.setEnabled(!true);
                jTextAreaProdutosEmpresa.setEnabled(!true);
                jTextAreaPrudtosCliente.setEnabled(!true);           

               // Declaração do código para Habiitar e desabilitar os botões após cricar em cancelar:
                  jButtonCancelar.setEnabled(false);
                  jButtonEditar.setEnabled(false);
                  jButtonExcluir.setEnabled(false);
                  jButtonSalvar.setEnabled(true);
                  jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Form Cadastro de Agendamento:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair do Agendamento de Serviços?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Frm Agendamento de Serviçoss:
        
           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
                jComboBoxCliente.setEnabled(true);
                jTextFieldServicosRealizados.setEnabled(true);
                jTextFieldDiaSemana.setEnabled(true);
                jFormattedTextFieldDataServico.setEnabled(true);
                jFormattedTextFieldHorarioInicio.setEnabled(true);
                jFormattedTextFieldHorarioTermino.setEnabled(true);
                jTextFieldValorServico.setEnabled(true);
                jTextAreaDescricaoServicos.setEnabled(true);
                jTextAreaProdutosEmpresa.setEnabled(true);
                jTextAreaPrudtosCliente.setEnabled(true);
        
                 try {           

                     connagendamento.executaSQL("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento ");
                     connagendamento.rs.first();
        
                    jTextFieldIdAgendamento.setText(String.valueOf(connagendamento.rs.getInt("Id_Agendamento")));
                    jComboBoxCliente.setSelectedItem(connagendamento.rs.getString("Nome_Cliente"));
                    jTextFieldServicosRealizados.setText(connagendamento.rs.getString("Servicos_Serem_Realizados"));
                    jTextFieldDiaSemana.setText(connagendamento.rs.getString("Dia_Semana"));
                    jFormattedTextFieldDataServico.setText(connagendamento.rs.getString("Data_Servico"));
                    jFormattedTextFieldHorarioInicio.setText(connagendamento.rs.getString("Horario_Inicio"));
                    jFormattedTextFieldHorarioTermino.setText(connagendamento.rs.getString("Horario_Termino"));
                    jTextFieldValorServico.setText(connagendamento.rs.getString("Valor_Servico"));
                    jTextAreaDescricaoServicos.setText(connagendamento.rs.getString("Descricao_Servicos"));
                    jTextAreaProdutosEmpresa.setText(connagendamento.rs.getString("Produtos_Empresa"));
                    jTextAreaPrudtosCliente.setText(connagendamento.rs.getString("Produtos_Cliente"));
                 } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o primeiro registro! \n Erro: " + ex);
           }
                     
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Agendamento de Serviços:

        // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
                jComboBoxCliente.setEnabled(true);
                jTextFieldServicosRealizados.setEnabled(true);
                jTextFieldDiaSemana.setEnabled(true);
                jFormattedTextFieldDataServico.setEnabled(true);
                jFormattedTextFieldHorarioInicio.setEnabled(true);
                jFormattedTextFieldHorarioTermino.setEnabled(true);
                jTextFieldValorServico.setEnabled(true);
                jTextAreaDescricaoServicos.setEnabled(true);
                jTextAreaProdutosEmpresa.setEnabled(true);
                jTextAreaPrudtosCliente.setEnabled(true);
        
                 try {           

                    // connagendamento.executaSQL("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento ");
                     connagendamento.rs.next();
        
                    jTextFieldIdAgendamento.setText(String.valueOf(connagendamento.rs.getInt("Id_Agendamento")));
                    jComboBoxCliente.setSelectedItem(connagendamento.rs.getString("Nome_Cliente"));
                    jTextFieldServicosRealizados.setText(connagendamento.rs.getString("Servicos_Serem_Realizados"));
                    jTextFieldDiaSemana.setText(connagendamento.rs.getString("Dia_Semana"));
                    jFormattedTextFieldDataServico.setText(connagendamento.rs.getString("Data_Servico"));
                    jFormattedTextFieldHorarioInicio.setText(connagendamento.rs.getString("Horario_Inicio"));
                    jFormattedTextFieldHorarioTermino.setText(connagendamento.rs.getString("Horario_Termino"));
                    jTextFieldValorServico.setText(connagendamento.rs.getString("Valor_Servico"));
                    jTextAreaDescricaoServicos.setText(connagendamento.rs.getString("Descricao_Servicos"));
                    jTextAreaProdutosEmpresa.setText(connagendamento.rs.getString("Produtos_Empresa"));
                    jTextAreaPrudtosCliente.setText(connagendamento.rs.getString("Produtos_Cliente"));
                 } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o proximo registro! \n Erro: " + ex);
           }

      
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Agendamento de Serviços:

           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
                jComboBoxCliente.setEnabled(true);
                jTextFieldServicosRealizados.setEnabled(true);
                jTextFieldDiaSemana.setEnabled(true);
                jFormattedTextFieldDataServico.setEnabled(true);
                jFormattedTextFieldHorarioInicio.setEnabled(true);
                jFormattedTextFieldHorarioTermino.setEnabled(true);
                jTextFieldValorServico.setEnabled(true);
                jTextAreaDescricaoServicos.setEnabled(true);
                jTextAreaProdutosEmpresa.setEnabled(true);
                jTextAreaPrudtosCliente.setEnabled(true);
        
                 try {           

                    // connagendamento.executaSQL("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento ");
                     connagendamento.rs.previous();
        
                    jTextFieldIdAgendamento.setText(String.valueOf(connagendamento.rs.getInt("Id_Agendamento")));
                    jComboBoxCliente.setSelectedItem(connagendamento.rs.getString("Nome_Cliente"));
                    jTextFieldServicosRealizados.setText(connagendamento.rs.getString("Servicos_Serem_Realizados"));
                    jTextFieldDiaSemana.setText(connagendamento.rs.getString("Dia_Semana"));
                    jFormattedTextFieldDataServico.setText(connagendamento.rs.getString("Data_Servico"));
                    jFormattedTextFieldHorarioInicio.setText(connagendamento.rs.getString("Horario_Inicio"));
                    jFormattedTextFieldHorarioTermino.setText(connagendamento.rs.getString("Horario_Termino"));
                    jTextFieldValorServico.setText(connagendamento.rs.getString("Valor_Servico"));
                    jTextAreaDescricaoServicos.setText(connagendamento.rs.getString("Descricao_Servicos"));
                    jTextAreaProdutosEmpresa.setText(connagendamento.rs.getString("Produtos_Empresa"));
                    jTextAreaPrudtosCliente.setText(connagendamento.rs.getString("Produtos_Cliente"));
                 } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o registro anterior! \n Erro: " + ex);
           }
        
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // Declaração do botão primeiro referente ao botão editar do Form Agendamento de Serviços:

           // Declaração do código para Habiitar e desabilitar os botões após cricar em novo:
              jButtonCancelar.setEnabled(true);
              jButtonEditar.setEnabled(true);
              jButtonExcluir.setEnabled(true);
              jButtonSalvar.setEnabled(false);
              jButtonNovo.setEnabled(false);
              
                jComboBoxCliente.setEnabled(true);
                jTextFieldServicosRealizados.setEnabled(true);
                jTextFieldDiaSemana.setEnabled(true);
                jFormattedTextFieldDataServico.setEnabled(true);
                jFormattedTextFieldHorarioInicio.setEnabled(true);
                jFormattedTextFieldHorarioTermino.setEnabled(true);
                jTextFieldValorServico.setEnabled(true);
                jTextAreaDescricaoServicos.setEnabled(true);
                jTextAreaProdutosEmpresa.setEnabled(true);
                jTextAreaPrudtosCliente.setEnabled(true);
        
                 try {           

                     connagendamento.executaSQL("SELECT * FROM tbl_agendamentoservico ORDER BY Id_Agendamento ");
                     connagendamento.rs.last();
        
                    jTextFieldIdAgendamento.setText(String.valueOf(connagendamento.rs.getInt("Id_Agendamento")));
                    jComboBoxCliente.setSelectedItem(connagendamento.rs.getString("Nome_Cliente"));
                    jTextFieldServicosRealizados.setText(connagendamento.rs.getString("Servicos_Serem_Realizados"));
                    jTextFieldDiaSemana.setText(connagendamento.rs.getString("Dia_Semana"));
                    jFormattedTextFieldDataServico.setText(connagendamento.rs.getString("Data_Servico"));
                    jFormattedTextFieldHorarioInicio.setText(connagendamento.rs.getString("Horario_Inicio"));
                    jFormattedTextFieldHorarioTermino.setText(connagendamento.rs.getString("Horario_Termino"));
                    jTextFieldValorServico.setText(connagendamento.rs.getString("Valor_Servico"));
                    jTextAreaDescricaoServicos.setText(connagendamento.rs.getString("Descricao_Servicos"));
                    jTextAreaProdutosEmpresa.setText(connagendamento.rs.getString("Produtos_Empresa"));
                    jTextAreaPrudtosCliente.setText(connagendamento.rs.getString("Produtos_Cliente"));
                 } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao setar o último registro! \n Erro: " + ex);
           }
       
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroClienteActionPerformed
        // Declaração do código para chamar o formulário de Agendamento de Serviços.
        
           FrmCadastroClienteSalao clientesalao = new FrmCadastroClienteSalao();
           clientesalao.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroClienteActionPerformed

//===========================================================================================================
    
// Código para preencher o Combo Nome do Funcionário .
    
    public void preencherComboClienteSalao(){
      
        connagendamento.conexao();
        try {
            connagendamento.executaSQL("SELECT * FROM tbl_cadastroClienteSalao ORDER BY Nome_Cliente");
            connagendamento.rs.first();
            jComboBoxCliente.removeAllItems();
          do{
            jComboBoxCliente.addItem(connagendamento.rs.getString("Nome_Cliente"));
          }while(connagendamento.rs.next());
         //  connacompanhamento.desconecta();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Erro ao preencher combo !\n Erro: " + ex); 
           // connacompanhamento.desconecta();
        }
        
      }
    
//------------------------------------------------------------------------------------------------------------------- 
    
     public void preencherTabela(String SQL){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Código do Agendamento", "Nome do Cliente",
          " Serviços a serem realizados", "Dia da Semana", "Data do Serviço", "Horário de Inicio", 
          " Horário de Término", "Valor do _Serviço", "Descrição dos Serviços",
          " Produtos da Empresa", "Produtos do Cliente" };
                     
             try {
                 connagendamento.executaSQL(SQL);
                 connagendamento.rs.first();
                  do{
                    dados.add(new Object[]{connagendamento.rs.getInt("Id_Agendamento"),
                    connagendamento.rs.getString("Nome_Cliente"), connagendamento.rs.getString("Servicos_Serem_Realizados"), 
                    connagendamento.rs.getString("Dia_Semana"),connagendamento.rs.getString("Data_Servico"),
                    connagendamento.rs.getString("Horario_Inicio"), connagendamento.rs.getString("Horario_Termino"), 
                    connagendamento.rs.getString("Valor_Servico"), connagendamento.rs.getString("Descricao_Servicos"), 
                    connagendamento.rs.getString("Produtos_Empresa"), connagendamento.rs.getString("Produtos_Cliente")});
                 }while(connagendamento.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableAtendimento.setModel(modelo);
               jTableAtendimento.getColumnModel().getColumn(0).setPreferredWidth(110);
               jTableAtendimento.getColumnModel().getColumn(0).setResizable(false);
               jTableAtendimento.getColumnModel().getColumn(1).setPreferredWidth(180);
               jTableAtendimento.getColumnModel().getColumn(1).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(2).setPreferredWidth(220);
               jTableAtendimento.getColumnModel().getColumn(2).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(3).setPreferredWidth(100);
               jTableAtendimento.getColumnModel().getColumn(3).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(4).setPreferredWidth(100);
               jTableAtendimento.getColumnModel().getColumn(4).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(5).setPreferredWidth(100);
               jTableAtendimento.getColumnModel().getColumn(5).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(6).setPreferredWidth(150);
               jTableAtendimento.getColumnModel().getColumn(6).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(7).setPreferredWidth(150);
               jTableAtendimento.getColumnModel().getColumn(7).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(8).setPreferredWidth(300);
               jTableAtendimento.getColumnModel().getColumn(8).setResizable(false); 
               jTableAtendimento.getColumnModel().getColumn(9).setPreferredWidth(300);
               jTableAtendimento.getColumnModel().getColumn(9).setResizable(false);
               jTableAtendimento.getColumnModel().getColumn(10).setPreferredWidth(300);
               jTableAtendimento.getColumnModel().getColumn(10).setResizable(false); 
               jTableAtendimento.setAutoResizeMode( jTableAtendimento.AUTO_RESIZE_OFF);
               jTableAtendimento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
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
            java.util.logging.Logger.getLogger(FrmAgendamentoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamentoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamentoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgendamentoServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmAgendamentoServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonCadastroCliente;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataServico;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorarioInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldHorarioTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataEntrega;
    private javax.swing.JLabel jLabelDataServico;
    private javax.swing.JLabel jLabelDescricaoServicos;
    private javax.swing.JLabel jLabelDiaSemana;
    private javax.swing.JLabel jLabelHorarioTermino;
    private javax.swing.JLabel jLabelIdCodigoAgendamento;
    private javax.swing.JLabel jLabelProdutosCliente;
    private javax.swing.JLabel jLabelProdutosEmpresa;
    private javax.swing.JLabel jLabelServicosFeitos;
    private javax.swing.JLabel jLabelServicosFeitos1;
    private javax.swing.JLabel jLabelTabelaDados;
    private javax.swing.JLabel jLabelValorServico;
    private javax.swing.JPanel jPanelButon;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableAtendimento;
    private javax.swing.JTextArea jTextAreaDescricaoServicos;
    private javax.swing.JTextArea jTextAreaProdutosEmpresa;
    private javax.swing.JTextArea jTextAreaPrudtosCliente;
    private javax.swing.JTextField jTextFieldDiaSemana;
    private javax.swing.JTextField jTextFieldIdAgendamento;
    private javax.swing.JTextField jTextFieldServicosRealizados;
    private javax.swing.JTextField jTextFieldValorServico;
    // End of variables declaration//GEN-END:variables
}
