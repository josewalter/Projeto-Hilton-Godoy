
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroProdutosSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroProdutosSalao {
    ClassConectaBanco connsalao = new ClassConectaBanco();
    ModeloCadastroProdutosSalao mod = new ModeloCadastroProdutosSalao();
    ClassConectaBanco connfornecedor = new ClassConectaBanco();
    int    codFornecedor;
    String NomeFornecedor;
    
//-------------------------------------------------------------------------------------------------------------------------    
    
    public void InserirProdutoSalao(ModeloCadastroProdutosSalao mod){
        BuscaCodigo(mod.getNome_Fornecedor());
        connsalao.conexao();
        try {
            PreparedStatement pst = connsalao.conn.prepareStatement("INSERT INTO tbl_cadastroprodutosalao ("
            + "Nome_Produto, Data_Pedido, Data_Entrega, Quantidade, Descricao_Produto, Preco_Custo, Preco_Venda,"
            + "Codigo_Barra, Id_FornecedorSalao) VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome_Produto());
            pst.setString(2, mod.getData_Pedido());
            pst.setString(3, mod.getData_Entrega());
            pst.setString(4, mod.getQuantidade());
            pst.setString(5, mod.getDescricao_Produto());
            pst.setString(6, mod.getPreco_Custo());
            pst.setString(7, mod.getPreco_Venda());
            pst.setString(8, mod.getCodigo_Barra());
            pst.setInt(9, codFornecedor);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir o produto!!\nErro" +ex);
        }
        connsalao.desconecta();
    }
 
//------------------------------------------------------------------------------------------------------------------------- 

public void EditarProdutoSalao(ModeloCadastroProdutosSalao mod){
   BuscaCodigo(mod.getNome_Fornecedor());
    connsalao.conexao();
     
        try {
            PreparedStatement pst = connsalao.conn.prepareStatement("UPDATE tbl_cadastroprodutosalao SET "
            + " Nome_Produto =?, Data_Pedido =?, Data_Entrega =?, Quantidade =?, Descricao_Produto =?,"
            + " Preco_Custo =?, Preco_Venda =?, Codigo_Barra =?, Id_FornecedorSalao =? WHERE Id_ProdutoSalao =?");
            pst.setString(1, mod.getNome_Produto());
            pst.setString(2, mod.getData_Pedido());
            pst.setString(3, mod.getData_Entrega());
            pst.setString(4, mod.getQuantidade());
            pst.setString(5, mod.getDescricao_Produto());
            pst.setString(6, mod.getPreco_Custo());
            pst.setString(7, mod.getPreco_Venda());
            pst.setString(8, mod.getCodigo_Barra());
            pst.setInt(9, codFornecedor);
            pst.setInt(10, mod.getId_ProdutoSalao());
            pst.execute();  
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterr o produto!!\nErro" +ex);
        }
connsalao.desconecta();

}  

//--------------------------------------------------------------------------------------------------------------------------------
      public void ExcluirProdutoSalao(ModeloCadastroProdutosSalao mod){
          connsalao.conexao();
          
        try {
            PreparedStatement pst = connsalao.conn.prepareStatement("DELETE FROM tbl_cadastroprodutosalao WHERE Id_ProdutoSalao =? ");
            pst.setInt(1, mod.getId_ProdutoSalao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao excluir o produto!!\nErro" +ex);
        }         
          connsalao.desconecta();                
      }      
 
//------------------------------------------------------------------------------------------------------------------------- 

    public void BuscaCodigo(String nome){
       connsalao.conexao();
        try {
            
            connsalao.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao WHERE Nome_Fornecedor ='" + nome + "'");
            connsalao.rs.next();
            codFornecedor = connsalao.rs.getInt("Id_FornecedorSalao");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o Código do fornecedor!!\nErro" +ex);
        }
       connsalao.desconecta();    
    }
    
//--------------------------------------------------------------------------------------------------------------------------------

   public ModeloCadastroProdutosSalao BuscaProduto(ModeloCadastroProdutosSalao mod){
      connsalao.conexao();
        try {
            connsalao.executaSQL("SELECT * FROM tbl_cadastroprodutosalao WHERE Nome_Produto like  '%" + mod.getPesquisa() +"%'");
            connsalao.rs.first();
            BuscaNomeFornecedor(connsalao.rs.getInt("Id_FornecedorSalao"));
            mod.setId_ProdutoSalao(connsalao.rs.getInt("Id_ProdutoSalao"));
            mod.setNome_Produto(connsalao.rs.getString("Nome_Produto"));
            mod.setData_Pedido(connsalao.rs.getString("Data_Pedido"));
            mod.setData_Entrega(connsalao.rs.getString("Data_Entrega"));
            mod.setQuantidade(connsalao.rs.getString( "Quantidade"));
            mod.setDescricao_Produto(connsalao.rs.getString("Descricao_Produto"));
            mod.setPreco_Custo(connsalao.rs.getString("Preco_Custo"));
            mod.setPreco_Venda(connsalao.rs.getString("Preco_Venda"));
            mod.setCodigo_Barra(connsalao.rs.getString("Codigo_Barra"));
            mod.setNome_Fornecedor(NomeFornecedor);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto!!\nErro" +ex);
        }
      connsalao.desconecta();
      return mod;
   
   }    
    
//--------------------------------------------------------------------------------------------------------------------------------
      public void BuscaNomeFornecedor(int cod){
          connfornecedor.conexao();
        try {
            connfornecedor.executaSQL("SELECT * FROM tbl_cadastrofornecedoressalao WHERE Id_FornecedorSalao ='" + cod + "'");
            connfornecedor.rs.first();
            NomeFornecedor = connfornecedor.rs.getString("Nome_Fornecedor");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o nome do fornecedor!!\nErro" +ex);
        }
          connfornecedor.desconecta(); 
     }
}
