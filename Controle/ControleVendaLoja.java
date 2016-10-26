
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloVendaLoja;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleVendaLoja {
    ClassConectaBanco connvendaloja = new ClassConectaBanco();
    
    int codProduto;  
    int codCliente;
    
    
    //------------------------------------------------------------------------------------------------------------------
    
    public void AdicionaItem(ModeloVendaLoja mod){
        
        AchaProduto(mod.getNomeProdutoLoja());
        connvendaloja.conexao();
          try {
            PreparedStatement pst = connvendaloja.conn.prepareStatement("INSERT INTO tbl_itens_vendaprodutosloja "
            + "(Id_VendaLoja, Id_ProdutoLoja, Quantidade) VALUES (?,?,?) ");
            pst.setInt(1, mod.getIdvenda());
            pst.setInt(2, codProduto);
            pst.setInt(3, mod.getQuantidadeItemLoja());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso !!");
          //Baixa no estoque.
            int quantidade = 0, result = 0;
              try {
                  connvendaloja.executaSQL("SELECT * FROM tbl_cadastroprodutosloja WHERE Nome_Produto='"+ mod.getNomeProdutoLoja()+"'");
                  connvendaloja.rs.first();
                  quantidade = connvendaloja.rs.getInt("Quantidade");
                  result = quantidade - mod.getQuantidadeItemLoja();
                  pst = connvendaloja.conn.prepareStatement("UPDATE tbl_cadastroprodutosloja SET Quantidade = ? WHERE Nome_Produto = ?");
                  pst.setInt(1, result);
                  pst.setString(2, mod.getNomeProdutoLoja());
                  pst.execute();
                  JOptionPane.showMessageDialog(null, "Baixa do produto realizada com sucesso !!");
              } catch (Exception ex) {
                  JOptionPane.showMessageDialog(null, "Erro ao realizar a baixa do  produto!!\nErro" + ex);
              }
              connvendaloja.desconecta();
          } catch (SQLException ex) {
              connvendaloja.desconecta();      
              JOptionPane.showMessageDialog(null, "Erro ao adicionar o  produto!!\nErro" + ex);
        }
    }
    
    //------------------------------------------------------------------------------------------------------------------
    
     public void AchaProduto(String nome){
         connvendaloja.conexao();
        try {
            connvendaloja.executaSQL("SELECT * FROM tbl_cadastroprodutosloja WHERE Nome_Produto ='" + nome +"'");
            connvendaloja.rs.first();
            codProduto = connvendaloja.rs.getInt("Id_ProdutoLoja");
            connvendaloja.desconecta();
        } catch (Exception ex) {
            connvendaloja.desconecta();
            JOptionPane.showMessageDialog(null, "Erro ao achar o produto !!\nErro" + ex);
        }
     }     
//-----------------------------------------------------------------------------------------------------------------

   public void FechaVenda(ModeloVendaLoja mod){
       
       AchaCliente(mod.getNomeClienteLoja());
       connvendaloja.conexao();
        try {
            PreparedStatement pst = connvendaloja.conn.prepareStatement("UPDATE tbl_vendasloja SET "
            + "Data_Venda = ?, Valor_Venda = ?, Id_ClienteLoja = ? WHERE Id_VendaLoja = ?");
            pst.setString(1, mod.getDataVenda());
            pst.setFloat(2, mod.getValorVenda());
            pst.setInt(3, codCliente);
            pst.setInt(4, mod.getIdvenda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso !!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a venda!\nErro:" + ex);
        }
        
       connvendaloja.desconecta();
   }

//-----------------------------------------------------------------------------------------------------------------
   
   public void AchaCliente(String nome){
       
       connvendaloja.conexao();
        
        try {
            connvendaloja.executaSQL("SELECT * FROM tbl_cadastroclienteloja WHERE Nome_Cliente = '" + nome + "'");
            connvendaloja.rs.first();
            codCliente = connvendaloja.rs.getInt("Id_ClienteLoja");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao achar o cliente!\nErro:" + ex);
        }       
       connvendaloja.desconecta();
   
   }   
 }
