package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloContasPagarSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleContasPagarSalao {
    ClassConectaBanco connconta = new ClassConectaBanco();
    ModeloContasPagarSalao mod = new ModeloContasPagarSalao();
     
//-------------------------------------------------------------------------------------------------------------------------    
    
    public void SalvarContasSalao(ModeloContasPagarSalao mod){
       
      connconta.conexao();
        try {
            PreparedStatement pst = connconta.conn.prepareStatement("INSERT INTO tbl_contasapagarsalao ("
            + " Plano_Conta, Forma_Pagamento, Banco, Nome_Fornecedor, Numero_Documento, Data_Emissao, Data_Vencimento,"
            + " Valor_Total, Juros, Multa) VALUES (?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getPlanoConta());
            pst.setString(2, mod.getFormaPagamento());
            pst.setString(3, mod.getBanco());
            pst.setString(4, mod.getFornecedor());
            pst.setString(5, mod.getNumeroDocumento());
            pst.setString(6, mod.getDataEmissao());
            pst.setString(7, mod.getDataVencimento());
            pst.setString(8, mod.getValorTotal());
            pst.setString(9, mod.getValorJuros());
            pst.setString(10, mod.getValorMulta());
            pst.execute();
            JOptionPane.showMessageDialog(null, "A conta foi inserido com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir a conta!!\nErro" +ex);
        }
      connconta.desconecta();
    }

//-------------------------------------------------------------------------------------------------------------------------    
    
    public void EditarContasSalao(ModeloContasPagarSalao mod){
       
      connconta.conexao();
        try {
            PreparedStatement pst = connconta.conn.prepareStatement("UPDATE tbl_contasapagarsalao "
            + " SET Plano_Conta =?, Forma_Pagamento =?, Banco =?, Nome_Fornecedor =?, Numero_Documento =?,"
            + " Data_Emissao =?, Data_Vencimento =?, Valor_Total =?, Juros =?, Multa =?"
            + " WHERE Id_ContasSalao =?");
            pst.setString(1, mod.getPlanoConta());
            pst.setString(2, mod.getFormaPagamento());
            pst.setString(3, mod.getBanco());
            pst.setString(4, mod.getFornecedor());
            pst.setString(5, mod.getNumeroDocumento());
            pst.setString(6, mod.getDataEmissao());
            pst.setString(7, mod.getDataVencimento());
            pst.setString(8, mod.getValorTotal());
            pst.setString(9, mod.getValorJuros());
            pst.setString(10, mod.getValorMulta());
            pst.setInt(11, mod.getCodigoConta());
            pst.execute();
            JOptionPane.showMessageDialog(null, "A conta foi alterada com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a conta!!\nErro" +ex);
        }
      connconta.desconecta();
    }
    
//-------------------------------------------------------------------------------------------------------- 
  // Declaração do código pra excluir o registro do Formulário de Cadastro de Usuário.
   public void ExcluirContasSalao(ModeloContasPagarSalao mod){
      connconta.conexao();
        try {
            PreparedStatement pst = connconta.conn.prepareStatement("DELETE FROM tbl_contasapagarsalao WHERE Id_ContasSalao =?");
            pst.setInt(1, mod.getCodigoConta());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao excluir o usuário!!\nErro" + ex);
        }       
      connconta.desconecta();   
   }    
 
//-------------------------------------------------------------------------------------------------------------------------   
       
}
