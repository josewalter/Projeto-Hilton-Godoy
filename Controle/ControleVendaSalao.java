
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloVendaSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleVendaSalao {
    ClassConectaBanco connvendasalao = new ClassConectaBanco();
    ModeloVendaSalao mod = new ModeloVendaSalao();
    int codProduto;  
    int codCliente;
    
    
    //------------------------------------------------------------------------------------------------------------------
    
    public void AdicionaItem(ModeloVendaSalao mod){
        
        AchaProduto(mod.getNomeProdutoSalao());
        connvendasalao.conexao();
          try {
            PreparedStatement pst = connvendasalao.conn.prepareStatement("INSERT INTO tbl_itens_vendaprodutossalao "
            + "(Id_VendaSalao, Id_ProdutoSalao, Quantidade) VALUES (?,?,?) ");
            pst.setInt(1, mod.getIdvenda());
            pst.setInt(2, codProduto);
            pst.setInt(3, mod.getQuantidadeItemSalao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso !!");
          //Baixa no estoque.
            int quantidade = 0, result = 0;
              try {
                  connvendasalao.executaSQL("SELECT * FROM tbl_cadastroprodutosalao WHERE Nome_Produto='"+ mod.getNomeProdutoSalao()+"'");
                  connvendasalao.rs.first();
                  quantidade = connvendasalao.rs.getInt("Quantidade");
                  result = quantidade - mod.getQuantidadeItemSalao();
                  pst = connvendasalao.conn.prepareStatement("UPDATE tbl_cadastroprodutosalao SET Quantidade = ? WHERE Nome_Produto = ?");
                  pst.setInt(1, result);
                  pst.setString(2, mod.getNomeProdutoSalao());
                  pst.execute();
                  JOptionPane.showMessageDialog(null, "Baixa do produto realizada com sucesso !!");
              } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao realizar a baixa do  produto!!\nErro" + ex);
              }
              connvendasalao.desconecta();
          } catch (SQLException ex) {
              connvendasalao.desconecta();      
              JOptionPane.showMessageDialog(null, "Erro ao adicionar o  produto!!\nErro" + ex);
        }
    }
    
    //------------------------------------------------------------------------------------------------------------------
    
     public void AchaProduto(String nome){
         connvendasalao.conexao();
        try {
            connvendasalao.executaSQL("SELECT * FROM tbl_cadastroprodutosalao WHERE Nome_Produto ='" + nome +"'");
            connvendasalao.rs.first();
            codProduto = connvendasalao.rs.getInt("Id_ProdutoSalao");
            connvendasalao.desconecta();
        } catch (Exception ex) {
            connvendasalao.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao achar o produto !!\nErro" + ex);
        }
     }     
//-----------------------------------------------------------------------------------------------------------------

   public void FechaVenda(ModeloVendaSalao mod){
       
       AchaCliente(mod.getNomeClienteSalao());
       connvendasalao.conexao();
        try {
            PreparedStatement pst = connvendasalao.conn.prepareStatement("UPDATE tbl_vendassalao SET "
            + "Data_Venda = ?, Valor_Venda = ?, Id_ClienteSalao = ? WHERE Id_VendaSalao = ?");
            pst.setString(1, mod.getDataVenda());
            pst.setFloat(2, mod.getValorVenda());
            pst.setInt(3, codCliente);
            pst.setInt(4, mod.getIdvenda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a venda!\nErro:" + ex);
        }
        
       connvendasalao.desconecta();
   }

//-----------------------------------------------------------------------------------------------------------------
   
   public void AchaCliente(String nome){
       
       connvendasalao.conexao();
        
        try {
            connvendasalao.executaSQL("SELECT * FROM tbl_cadastroclientesalao WHERE Nome_Cliente = '" + nome + "'");
            connvendasalao.rs.first();
            codCliente = connvendasalao.rs.getInt("Id_ClienteSalao");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao achar o cliente!\nErro:" + ex);
        }       
       connvendasalao.desconecta();
   
   }   
 }
