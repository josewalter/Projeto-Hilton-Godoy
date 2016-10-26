package View;

import Controle.ControleVendaSalao;
import DAO.ClassConectaBanco;
import Modelo.ModeloTabela;
import Modelo.ModeloVendaSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author: José Walter.
 */

public class FrmVendasSalao extends javax.swing.JFrame {
   ClassConectaBanco connvendasalao = new ClassConectaBanco(); 
   ModeloVendaSalao mod = new ModeloVendaSalao();
   ControleVendaSalao contrl = new ControleVendaSalao();
   
    int flag = 1;
    int codVenda;
    float Preco_Produto, Total = 0;
    
    public FrmVendasSalao() {
        initComponents();
        //Declaração do código para realização da venda.
        
        /*
        Não estou precisando desse código pois a hora está sendo trazida do sistema.
            try {
              MaskFormatter form = new MaskFormatter("##/##/####");
              jFormattedTextFieldDataVenda.setFormatterFactory(new DefaultFormatterFactory(form));
           } catch (ParseException ex) {
              Logger.getLogger(FrmVendasLoja.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
         // Pega data do sistema.
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date hoje = new Date();
            jFormattedTextFieldDataVenda.setText(df.format(hoje));
    }

//-------------------------------------------------------------------------------------------------------
//Declaração do código para preencher a tabela com os dados pesquisados do Cliente.    
    
   public void preencherTabelaClienteSalao(String sql){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Código", "Nome do Cliente" };
                     
             try {
                 connvendasalao.conexao();
                 connvendasalao.executaSQL(sql);
                 connvendasalao.rs.first();
                  do{
                    dados.add(new Object[]{connvendasalao.rs.getInt("Id_ClienteSalao"),
                    connvendasalao.rs.getString("Nome_Cliente") });
                 }while(connvendasalao.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTablePesquisa.setModel(modelo);
               jTablePesquisa.getColumnModel().getColumn(0).setPreferredWidth(220);
               jTablePesquisa.getColumnModel().getColumn(0).setResizable(false);
               jTablePesquisa.getColumnModel().getColumn(1).setPreferredWidth(500);
               jTablePesquisa.getColumnModel().getColumn(1).setResizable(false); 
               jTablePesquisa.getTableHeader().setReorderingAllowed(false);
               jTablePesquisa.setAutoResizeMode( jTablePesquisa.AUTO_RESIZE_OFF);
               jTablePesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
        } 
   
//-------------------------------------------------------------------------------------------------------   
//Declaração do código para preencher a tabela com os dados pesquisados do Produto.     
    public void preencherTabelaProdutoSalao(String sql){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] { "Código", "Nome do Produto", "Quantidade" };
                     
             try {
                 connvendasalao.executaSQL(sql);
                  connvendasalao.rs.first();
                  do{
                    dados.add(new Object[]{ connvendasalao.rs.getInt("Id_ProdutoSalao"),
                     connvendasalao.rs.getString("Nome_Produto"),  connvendasalao.rs.getString("Quantidade")});
                 }while( connvendasalao.rs.next());   
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTablePesquisa.setModel(modelo);
               jTablePesquisa.getColumnModel().getColumn(0).setPreferredWidth(220);
               jTablePesquisa.getColumnModel().getColumn(0).setResizable(false);
               jTablePesquisa.getColumnModel().getColumn(1).setPreferredWidth(350);
               jTablePesquisa.getColumnModel().getColumn(1).setResizable(false); 
               jTablePesquisa.getColumnModel().getColumn(2).setPreferredWidth(220);
               jTablePesquisa.getColumnModel().getColumn(2).setResizable(false); 
               jTablePesquisa.getTableHeader().setReorderingAllowed(false);
               jTablePesquisa.setAutoResizeMode( jTablePesquisa.AUTO_RESIZE_OFF);
               jTablePesquisa.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                  
        } 
    
//-------------------------------------------------------------------------------------------------------   
//Declaração do código para preencher a tabela com os dados pesquisados do Produto.     
    public void preencherTabelaItensSalao(String sql){
   
         ArrayList dados = new ArrayList();
    
          String [] Colunas = new String [] {  "Descricao", "Quantidade", "Valor Total" };
                     connvendasalao.conexao();
             try {
                 connvendasalao.executaSQL(sql);
                 connvendasalao.rs.first();
                  do{
                    float valorProduto = connvendasalao.rs.getFloat("Preco_Venda");
                    int   qtVendida    = connvendasalao.rs.getInt("Quantidade");
                      
                    dados.add(new Object[]{connvendasalao.rs.getString("Nome_Produto"),
                    connvendasalao.rs.getInt("Quantidade"), valorProduto*qtVendida});
                 }while(connvendasalao.rs.next()); 
                  connvendasalao.desconecta();
             } catch (Exception ex) {
                 connvendasalao.desconecta();
                 JOptionPane.showMessageDialog(null, "Erro ao preencher o ArrayList!\n Erro: " + ex);
             }
             
                ModeloTabela modelo = new ModeloTabela(dados, Colunas);
               jTableItensVenda.setModel(modelo);
               jTableItensVenda.getColumnModel().getColumn(0).setPreferredWidth(400);
               jTableItensVenda.getColumnModel().getColumn(0).setResizable(false);
               jTableItensVenda.getColumnModel().getColumn(1).setPreferredWidth(100);
               jTableItensVenda.getColumnModel().getColumn(1).setResizable(false); 
               jTableItensVenda.getColumnModel().getColumn(2).setPreferredWidth(220);
               jTableItensVenda.getColumnModel().getColumn(2).setResizable(false); 
               jTableItensVenda.getTableHeader().setReorderingAllowed(false);
               jTableItensVenda.setAutoResizeMode( jTablePesquisa.AUTO_RESIZE_OFF);
               jTableItensVenda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             //  SomaProduto();
                  
        }
    
//----------------------------------------------------------------------------------------------------------------------------------------------------     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisa = new javax.swing.JTable();
        jTextFieldNomeClienteSalao = new javax.swing.JTextField();
        jLabelNomeClienteSalao = new javax.swing.JLabel();
        jFormattedTextFieldDataVenda = new javax.swing.JFormattedTextField();
        jLabelDataVenda = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabelProduto = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableItensVenda = new javax.swing.JTable();
        jButtonPesquisarCliente = new javax.swing.JButton();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jTextFieldValorItem = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelValoritem = new javax.swing.JLabel();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jLabelTabelaPesquisa = new javax.swing.JLabel();
        jLabelItensVenda = new javax.swing.JLabel();
        jButtonFinalizarVenda = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();
        jButtonAddItem = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Vendas do Salão");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Apresentação da tela de Vendas do Salão");

        jPanelPrincipal.setBackground(new java.awt.Color(240, 230, 42));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTablePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePesquisa);

        jTextFieldNomeClienteSalao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNomeClienteSalao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNomeClienteSalao.setForeground(new java.awt.Color(51, 102, 255));
        jLabelNomeClienteSalao.setText("Nome do Cliente do Salão");

        jFormattedTextFieldDataVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jFormattedTextFieldDataVenda.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jFormattedTextFieldDataVenda.setEnabled(false);
        jFormattedTextFieldDataVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldDataVendaFocusGained(evt);
            }
        });

        jLabelDataVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDataVenda.setForeground(new java.awt.Color(51, 102, 255));
        jLabelDataVenda.setText("Data da Venda");

        jTextFieldNomeProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelProduto.setForeground(new java.awt.Color(51, 102, 255));
        jLabelProduto.setText("Produto do Produto");

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQuantidade.setForeground(new java.awt.Color(51, 102, 255));
        jLabelQuantidade.setText("Quantidade");

        jTableItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableItensVenda);

        jButtonPesquisarCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisarCliente.setForeground(new java.awt.Color(255, 51, 51));
        jButtonPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.jpg"))); // NOI18N
        jButtonPesquisarCliente.setText("Pesquisar");
        jButtonPesquisarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarClienteActionPerformed(evt);
            }
        });

        jButtonPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonPesquisarProduto.setForeground(new java.awt.Color(255, 51, 51));
        jButtonPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.jpg"))); // NOI18N
        jButtonPesquisarProduto.setText("Pesquisar");
        jButtonPesquisarProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });

        jTextFieldValorItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldQuantidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldQuantidadeFocusGained(evt);
            }
        });

        jLabelValoritem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValoritem.setForeground(new java.awt.Color(51, 102, 255));
        jLabelValoritem.setText("Valor p/ Item");

        jLabelValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValorTotal.setForeground(new java.awt.Color(51, 102, 255));
        jLabelValorTotal.setText("Valor Total");

        jTextFieldValorTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldValorTotal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldValorTotal.setEnabled(false);

        jLabelTabelaPesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTabelaPesquisa.setForeground(new java.awt.Color(51, 102, 255));
        jLabelTabelaPesquisa.setText("Tabela de Pesquisa");

        jLabelItensVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelItensVenda.setForeground(new java.awt.Color(51, 102, 255));
        jLabelItensVenda.setText("Itens da Venda:");

        jButtonFinalizarVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonFinalizarVenda.setForeground(new java.awt.Color(255, 51, 51));
        jButtonFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Caixa registradora2.gif"))); // NOI18N
        jButtonFinalizarVenda.setToolTipText("Finalizar a Venda");
        jButtonFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVendaActionPerformed(evt);
            }
        });

        jButtonCancelarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_Site_5750_Knob_Cancel.png"))); // NOI18N
        jButtonCancelarVenda.setToolTipText("Cancelar a Venda");
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        jButtonAddItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAddItem.setForeground(new java.awt.Color(255, 51, 51));
        jButtonAddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botoes_5122_paper_48.png"))); // NOI18N
        jButtonAddItem.setText("ADD Item");
        jButtonAddItem.setToolTipText("Adicionar Item");
        jButtonAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddItemActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButtonFinalizarVenda)
                .addGap(44, 44, 44)
                .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jTextFieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelItensVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTabelaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValoritem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataVenda)
                                    .addComponent(jFormattedTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jTextFieldNomeClienteSalao, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarCliente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelNomeClienteSalao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisarProduto))
                            .addComponent(jLabelProduto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeClienteSalao)
                    .addComponent(jLabelProduto))
                .addGap(11, 11, 11)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNomeClienteSalao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValoritem)
                            .addComponent(jLabelDataVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabelQuantidade)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jFormattedTextFieldDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jButtonAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jLabelTabelaPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelItensVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValorTotal))
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonCancelarVenda)
                        .addComponent(jButtonFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarClienteActionPerformed
        //Declaração do código do botão para realizar a pesquisa do Cliente.  
        
          flag = 1;
          preencherTabelaClienteSalao("SELECT * FROM tbl_cadastroclientesalao WHERE Nome_Cliente like '%" + jTextFieldNomeClienteSalao.getText() + "%'");
    }//GEN-LAST:event_jButtonPesquisarClienteActionPerformed

//-----------------------------------------------------------------------------------------------------------------------------------------------------    
    
    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // Declaração do  Código do botão fechar do Form Cadastro de Produtos da Loja:
        dispose();
        JOptionPane.showMessageDialog(null, "Deseja realmente sair Da Venda de Produto do Salão?");
    }//GEN-LAST:event_jButtonFecharActionPerformed

//-----------------------------------------------------------------------------------------------------------------------------------------------------    
    
    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        //Declaração do código do botão para realizar a pesquisa do Produto.
        
        connvendasalao.conexao();
       try {
           PreparedStatement pst = connvendasalao.conn.prepareStatement("INSERT INTO tbl_vendassalao (Valor_Venda)values(?)");
           pst.setFloat(1, 0);
           pst.execute();
            try {
                connvendasalao.executaSQL("SELECT * FROM tbl_vendassalao");
                connvendasalao.rs.last();
                codVenda = connvendasalao.rs.getInt("Id_VendaSalao"); //Metodo para inserir uma ou mais vendas
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar a tbl_vendassalao " + ex );
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao inserir um valor de venda " + ex );
       }
        
//-----------------------------------------------------------------------------------------------------------------------------------------------------
         flag = 2;
         preencherTabelaProdutoSalao("SELECT * FROM tbl_cadastroprodutosalao WHERE Nome_Produto like '%" + jTextFieldNomeProduto.getText() + "%'");
    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jTablePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisaMouseClicked
        // TODO add your handling code here:
        
          if (flag ==1){
             String Nome_Cliente = "" + jTablePesquisa.getValueAt(jTablePesquisa.getSelectedRow(), 1);
             jTextFieldNomeClienteSalao.setText(Nome_Cliente);
          }
          else {
              connvendasalao.conexao();
              try {
                  String Nome_Produto = "" + jTablePesquisa.getValueAt(jTablePesquisa.getSelectedRow(), 1);
                  connvendasalao.executaSQL("SELECT * FROM tbl_cadastroprodutosalao WHERE Nome_Produto='" + Nome_Produto + "'");
                  connvendasalao.rs.first();
                  Preco_Produto = connvendasalao.rs.getFloat("Preco_Venda");
                  jTextFieldNomeProduto.setText(Nome_Produto);
                  jTextFieldValorItem.setText(String.valueOf(Preco_Produto));
                  jTextFieldQuantidade.setText("1");
                  
                  connvendasalao.desconecta();
              } catch (Exception ex) {
                 JOptionPane.showMessageDialog(rootPane, "Erro ao pesquisar preço?");
            }              
        }
    }//GEN-LAST:event_jTablePesquisaMouseClicked

    private void jTextFieldQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeFocusGained
        // Declaração do código para fazer o calculo da quantidade de itens vendidos:
        
           float valorTotal;
           valorTotal= Float.parseFloat(jTextFieldValorItem.getText())*Integer.parseInt(jTextFieldQuantidade.getText());
           jTextFieldValorTotal.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_jTextFieldQuantidadeFocusGained

    private void jFormattedTextFieldDataVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataVendaFocusGained
       // Declaração do código para fazer o calculo da quantidade de itens vendidos: 
       //E para ter certeza que ele vai realmente fazer o calculo colocamos o código tb na data da venda.
        
        float valorTotal;
        valorTotal= Float.parseFloat(jTextFieldValorItem.getText())*Integer.parseInt(jTextFieldQuantidade.getText());
        jTextFieldValorTotal.setText(String.valueOf(Total));
    }//GEN-LAST:event_jFormattedTextFieldDataVendaFocusGained

    private void jButtonAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddItemActionPerformed
        // Declaração do código para adicionar itens a lista :
          
           int IdVenda ;
           int quant = 0;
         try {   
            connvendasalao.conexao();
       
           connvendasalao.executaSQL("SELECT * FROM tbl_cadastroprodutosalao WHERE Nome_Produto='"+ jTextFieldNomeProduto.getText()+"'");
           connvendasalao.rs.first();
           quant =connvendasalao.rs.getInt("Quantidade");
         if(quant >= Integer.parseInt(jTextFieldQuantidade.getText())){ 
           // int result = quant - Integer.parseInt(jTextFieldQuantidade.getText());
            mod.setNomeProdutoSalao(jTextFieldNomeProduto.getText());
            mod.setQuantidadeItemSalao(Integer.parseInt(jTextFieldQuantidade.getText()));
            mod.setIdvenda(codVenda);
            contrl.AdicionaItem(mod);
            
            preencherTabelaItensSalao("SELECT * FROM tbl_cadastroprodutosalao "
            + " INNER JOIN tbl_itens_vendaprodutossalao " 
            + " ON tbl_cadastroprodutosalao.Id_ProdutoSalao = tbl_itens_vendaprodutossalao.Id_ProdutoSalao "
            + " INNER JOIN tbl_vendassalao ON tbl_vendassalao.Id_VendaSalao = tbl_itens_vendaprodutossalao.Id_VendaSalao " 
            + " WHERE  tbl_vendassalao.Id_VendaSalao =" + codVenda );
            Total = Total + Float.parseFloat(jTextFieldValorItem.getText())* Integer.parseInt(jTextFieldQuantidade.getText());
            jTextFieldValorTotal.setText(String.valueOf(Total));
           }
            else{
              JOptionPane.showMessageDialog(rootPane, "A quantidade desejada não está disponível no estoque!!"); 
           }
         } catch (Exception ex) {
              JOptionPane.showMessageDialog(rootPane, "Erro ao pesquisar a quantidade!/nERRO"+ex);
       }         
    }//GEN-LAST:event_jButtonAddItemActionPerformed

    private void jButtonFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarVendaActionPerformed
        // Declaração do código para finalização da venda:
        
           mod.setIdvenda(codVenda);
           mod.setNomeClienteSalao(jTextFieldNomeClienteSalao.getText());
           mod.setDataVenda(jFormattedTextFieldDataVenda.getText());
           mod.setValorVenda(Float.parseFloat(jTextFieldValorTotal.getText()));
           contrl.FechaVenda(mod);
           dispose();
    }//GEN-LAST:event_jButtonFinalizarVendaActionPerformed

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        // Declaração do código para cancelar uma venda do Formulário Vendas da Loja:
        
           dispose();
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

//------------------------------------------------------------------------------------------------------------------------------------------------    
    /* Declaração do código para somar valor do produto ou produtos na venda realizada 
    /  E depois fazer a chamada desse método dentro do método preencher tabela Itens Vendas para ele fazer a soma
    /  do valor dos dados.
    */
     public void SomaProduto(){
        connvendasalao.conexao();
       try {
          connvendasalao.executaSQL( "SELECT * FROM tbl_itens_vendaprodutossalao INNER JOIN tbl_cadastroprodutosalao ON"
           + " tbl_itens_vendaprodutossalao.Id_ProdutoSalao = tbl_cadastroprodutosalao.Id_ProdutoSalao"
           + " WHERE Id_VendaSalao =" + codVenda );
           connvendasalao.rs.first();
           while(connvendasalao.rs.next()){
               Total = Total+ connvendasalao.rs.getFloat("Preco_Venda")*connvendasalao.rs.getInt("Quantidade");
           
           }
           jTextFieldValorTotal.setText(String.valueOf(Total));
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(rootPane, "Erro na soma total dos valores!!");
       }
       connvendasalao.desconecta();
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
            java.util.logging.Logger.getLogger(FrmVendasSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendasSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendasSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendasSalao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmVendasSalao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddItem;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonFinalizarVenda;
    private javax.swing.JButton jButtonPesquisarCliente;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDataVenda;
    private javax.swing.JLabel jLabelItensVenda;
    private javax.swing.JLabel jLabelNomeClienteSalao;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelTabelaPesquisa;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JLabel jLabelValoritem;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableItensVenda;
    private javax.swing.JTable jTablePesquisa;
    private javax.swing.JTextField jTextFieldNomeClienteSalao;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorItem;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables
}
