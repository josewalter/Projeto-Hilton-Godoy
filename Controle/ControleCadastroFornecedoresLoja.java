
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroFornecedoresLoja;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroFornecedoresLoja {
    ClassConectaBanco connloja = new ClassConectaBanco();
    
 //=======================================================================================================================    
   // Código do botão Salvar usando modelo MVC.
    
    public void SalvarDados(ModeloCadastroFornecedoresLoja mod){
       
        connloja.conexao();
        try {
            PreparedStatement pst = connloja.conn.prepareStatement("INSERT INTO tbl_cadastrofornecedoresloja ("
            + " Nome_Fornecedor, Data_Entrada, Data_Saida, Endereco, Cidade, Estado, Cep, Cnpj, Telefone_Comercial,"
            + " Celular_Contato, Email, Facebook, Twitter) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomeFornecedor());
            pst.setString(2, mod.getDataEntrada());
            pst.setString(3, mod.getDataSaida());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEstado());
            pst.setString(7, mod.getCep());
            pst.setString(8, mod.getCnpj());
            pst.setString(9, mod.getTelefoneComercial());
            pst.setString(10, mod.getCelularContato());
            pst.setString(11, mod.getEmail());
            pst.setString(12, mod.getFacebook());
            pst.setString(13, mod.getTwitter());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar o registro !\n Erro: " + ex);
        }
        connloja.desconecta();
    
    }    
    
//================================================================================================================ 
    
    // Código do botão Editar usando modelo MVC.
    
    public void EditarDados(ModeloCadastroFornecedoresLoja mod){
       
        connloja.conexao();
        try {
            PreparedStatement pst = connloja.conn.prepareStatement("UPDATE tbl_cadastrofornecedoresloja "
            + " SET Nome_Fornecedor =?, Data_Entrada =?, Data_Saida =?, Endereco =?, Cidade =?, Estado =?,"
            + " Cep =?, Cnpj =?, Telefone_Comercial =?, Celular_Contato =?, Email =?, Facebook =?, Twitter =?"
            + " WHERE Id_FornecedorLoja =?");
            pst.setString(1, mod.getNomeFornecedor());
            pst.setString(2, mod.getDataEntrada());
            pst.setString(3, mod.getDataSaida());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEstado());
            pst.setString(7, mod.getCep());
            pst.setString(8, mod.getCnpj());
            pst.setString(9, mod.getTelefoneComercial());
            pst.setString(10, mod.getCelularContato());
            pst.setString(11, mod.getEmail());
            pst.setString(12, mod.getFacebook());
            pst.setString(13, mod.getTwitter());
            pst.setInt(14, mod.getCodigoFornecedor());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao alterar o registro !\n Erro: " + ex);
        }
        connloja.desconecta();
    
    }    
  
//=================================================================================================    
    // Código do botão Excluir usando modelo MVC.
    public void ExcluirDados(ModeloCadastroFornecedoresLoja mod){
        
      connloja.conexao();
      try {
           PreparedStatement pst = connloja.conn.prepareStatement("DELETE FROM tbl_cadastrofornecedoresloja WHERE Id_FornecedorLoja =?");
           pst.setInt(1, mod.getCodigoFornecedor());
           pst.execute();  
           JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!!" );
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir o registro!\nERRO:" + ex);
           }
       connloja.desconecta();
    }    
    
}
