
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroFuncionarioSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroFuncionarioSalao {
  ClassConectaBanco connfuncionariosalao = new ClassConectaBanco();
  ModeloCadastroFuncionarioSalao mod = new ModeloCadastroFuncionarioSalao();
  
   //=======================================================================================================================    
   // Código do botão Salvar usando modelo MVC.
    
    public void SalvarDados(ModeloCadastroFuncionarioSalao mod){
       
        connfuncionariosalao.conexao();
        try {
            PreparedStatement pst = connfuncionariosalao.conn.prepareStatement("INSERT INTO tbl_cadastrofuncionariosalao ("
            + " Nome_Funcionario, Data_Entrada, Data_Saida, Endereco, Cidade, Estado, Cep, Cpf, Rg, Telefone_Residencial,"
            + " Celular_Contato, Email, Facebook, Twitter) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomeFuncionarioSalao());
            pst.setString(2, mod.getDataEntrada());
            pst.setString(3, mod.getDataSaida());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEstado());
            pst.setString(7, mod.getCep());
            pst.setString(8, mod.getCpf());
            pst.setString(9, mod.getRg());
            pst.setString(10, mod.getTelefoneResidencial());
            pst.setString(11, mod.getCelularContato());
            pst.setString(12, mod.getEmail());
            pst.setString(13, mod.getFacebook());
            pst.setString(14, mod.getTwitter());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar o registro !\n Erro: " + ex);
        }
        connfuncionariosalao.desconecta();
    
    }
//=====================================================================================================================    
    
    public void EditarDados(ModeloCadastroFuncionarioSalao mod){
     
        connfuncionariosalao.conexao();
        try {
            PreparedStatement pst = connfuncionariosalao.conn.prepareStatement("UPDATE tbl_cadastrofuncionariosalao  "
            + " SET Nome_Funcionario =?, Data_Entrada =?, Data_Saida =?, Endereco =?, Cidade =?, Estado =?, "
            + " Cep =?, Cpf =?, Rg =?, Telefone_Residencial =?, Celular_Contato =?, Email =?, Facebook =?, "
            + " Twitter =? WHERE Id_FuncionarioSalao =?");
            pst.setString(1, mod.getNomeFuncionarioSalao());
            pst.setString(2, mod.getDataEntrada());
            pst.setString(3, mod.getDataSaida());
            pst.setString(4, mod.getEndereco());
            pst.setString(5, mod.getCidade());
            pst.setString(6, mod.getEstado());
            pst.setString(7, mod.getCep());
            pst.setString(8, mod.getCpf());
            pst.setString(9, mod.getRg());
            pst.setString(10, mod.getTelefoneResidencial());
            pst.setString(11, mod.getCelularContato());
            pst.setString(12, mod.getEmail());
            pst.setString(13, mod.getFacebook());
            pst.setString(14, mod.getTwitter());
            pst.setInt(15, mod.getIdFuncionarioSalao());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao alterar o registro !\n Erro: " + ex);
        }
        connfuncionariosalao.desconecta(); 
    
    }
    
//=====================================================================================================================    
    
    public void ExcluirDados(ModeloCadastroFuncionarioSalao mod){
      connfuncionariosalao.conexao();
      try {
               
               PreparedStatement pst = connfuncionariosalao.conn.prepareStatement("DELETE FROM tbl_cadastrofuncionariosalao WHERE Id_FuncionarioSalao =?");
               pst.setInt(1, mod.getIdFuncionarioSalao());
               pst.execute();  
               
               JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!!" );
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir o registro!\n ERRO:" + ex);
           }
       connfuncionariosalao.desconecta();
    }
}
