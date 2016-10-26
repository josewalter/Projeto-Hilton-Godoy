
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroProdutoLoja;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroProdutosLoja {
    ClassConectaBanco connloja = new ClassConectaBanco();
    ModeloCadastroProdutoLoja mod = new ModeloCadastroProdutoLoja();
    ClassConectaBanco connfornecedor = new ClassConectaBanco();
    int    codFornecedor;
    String NomeFornecedor;
    
//-------------------------------------------------------------------------------------------------------------------------    
    
    public void InserirProdutoLoja(ModeloCadastroProdutoLoja mod){
        BuscaCodigo(mod.getNomeFornecedor());
        connloja.conexao();
        try {
            PreparedStatement pst = connloja.conn.prepareStatement("INSERT INTO tbl_cadastroprodutosloja ("
            + "Nome_Produto, Data_Pedido, Data_Entrega, Quantidade, Descricao_Produto, Preco_Custo, Preco_Venda,"
            + "Codigo_Barra, Id_FornecedorLoja) VALUES (?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomeProduto());
            pst.setString(2, mod.getDataPedido());
            pst.setString(3, mod.getDataEntrega());
            pst.setString(4, mod.getQuantidade());
            pst.setString(5, mod.getDescricaoProduto());
            pst.setString(6, mod.getPrecoCusto());
            pst.setString(7, mod.getPrecoVenda());
            pst.setString(8, mod.getCodigoBarra());
            pst.setInt(9, codFornecedor);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao inserir o produto!!\nErro" +ex);
        }
        connloja.desconecta();
    }
 
//------------------------------------------------------------------------------------------------------------------------- 

public void EditarProdutoLoja(ModeloCadastroProdutoLoja mod){
   BuscaCodigo(mod.getNomeFornecedor());
    connloja.conexao();
     
        try {
            PreparedStatement pst = connloja.conn.prepareStatement("UPDATE tbl_cadastroprodutosloja SET "
            + " Nome_Produto =?, Data_Pedido =?, Data_Entrega =?, Quantidade =?, Descricao_Produto =?,"
            + " Preco_Custo =?, Preco_Venda =?, Codigo_Barra =?, Id_FornecedorLoja =? WHERE Id_ProdutoLoja =?");
            pst.setString(1, mod.getNomeProduto());
            pst.setString(2, mod.getDataPedido());
            pst.setString(3, mod.getDataEntrega());
            pst.setString(4, mod.getQuantidade());
            pst.setString(5, mod.getDescricaoProduto());
            pst.setString(6, mod.getPrecoCusto());
            pst.setString(7, mod.getPrecoVenda());
            pst.setString(8, mod.getCodigoBarra());
            pst.setInt(9, codFornecedor);
            pst.setInt(10, mod.getCodigoProdutoLoja());
            pst.execute();  
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterr o produto!!\nErro" +ex);
        }
connloja.desconecta();

}  

//--------------------------------------------------------------------------------------------------------------------------------
      public void ExcluirProdutoLoja(ModeloCadastroProdutoLoja mod){
          connloja.conexao();
          
        try {
            PreparedStatement pst = connloja.conn.prepareStatement("DELETE FROM tbl_cadastroprodutosloja WHERE Id_ProdutoLoja =? ");
            pst.setInt(1, mod.getCodigoProdutoLoja());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao excluir o produto!!\nErro" +ex);
        }         
          connloja.desconecta();                
      }      
 
//------------------------------------------------------------------------------------------------------------------------- 

    public void BuscaCodigo(String nome){
       connloja.conexao();
        try {
            
            connloja.executaSQL("SELECT * FROM tbl_cadastrofornecedoresloja WHERE Nome_Fornecedor ='" + nome + "'");
            connloja.rs.next();
            codFornecedor = connloja.rs.getInt("Id_FornecedorLoja");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o fornecedor!!\nErro" +ex);
        }
       connloja.desconecta();    
    }
    
//--------------------------------------------------------------------------------------------------------------------------------

   public ModeloCadastroProdutoLoja BuscaProduto(ModeloCadastroProdutoLoja mod){
      connloja.conexao();
        try {
            connloja.executaSQL("SELECT * FROM tbl_cadastroprodutosloja WHERE Nome_Produto like  '%" + mod.getPesquisar() +"%'");
            connloja.rs.first();
            BuscaNomeFornecedor(connloja.rs.getInt("Id_FornecedorLoja"));
            mod.setCodigoProdutoLoja(connloja.rs.getInt("Id_ProdutoLoja"));
            mod.setNomeProduto(connloja.rs.getString("Nome_Produto"));
            mod.setDataPedido(connloja.rs.getString("Data_Pedido"));
            mod.setDataEntrega(connloja.rs.getString("Data_Entrega"));
            mod.setQuantidade(connloja.rs.getString( "Quantidade"));
            mod.setDescricaoProduto(connloja.rs.getString("Descricao_Produto"));
            mod.setPrecoCusto(connloja.rs.getString("Preco_Custo"));
            mod.setPrecoVenda(connloja.rs.getString("Preco_Venda"));
            mod.setCodigoBarra(connloja.rs.getString("Codigo_Barra"));
            mod.setNomeFornecedor(NomeFornecedor);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto!!\nErro" +ex);
        }
      connloja.desconecta();
      return mod;
   
   }    
    
//--------------------------------------------------------------------------------------------------------------------------------
      public void BuscaNomeFornecedor(int cod){
          connfornecedor.conexao();
        try {
            connfornecedor.executaSQL("SELECT * FROM tbl_cadastrofornecedoresloja WHERE Id_FornecedorLoja ='" + cod + "'");
            connfornecedor.rs.first();
            NomeFornecedor = connfornecedor.rs.getString("Nome_Fornecedor");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o código do fornecedor!!\nErro" +ex);
        }
          connfornecedor.desconecta(); 
     }
}
