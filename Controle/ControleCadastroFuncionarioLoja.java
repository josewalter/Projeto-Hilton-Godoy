
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroFuncionarioLoja;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroFuncionarioLoja {
    ClassConectaBanco connfucnionarioLoja = new  ClassConectaBanco();
    ModeloCadastroFuncionarioLoja mod = new ModeloCadastroFuncionarioLoja();
    //=======================================================================================================================    
   // Código do botão Salvar usando modelo MVC.
    
    public void SalvarDados(ModeloCadastroFuncionarioLoja mod){
       
        connfucnionarioLoja.conexao();
        try {
            PreparedStatement pst = connfucnionarioLoja.conn.prepareStatement("INSERT INTO tbl_cadastrofuncionarioloja ("
            + " Nome_Funcionario, Data_Entrada, Data_Saida, Endereco, Cidade, Estado, Cep, Cpf, Rg, Telefone_Residencial,"
            + " Celular_Contato, Email, Facebook, Twitter) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomeFuncionarioLoja());
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
        connfucnionarioLoja.desconecta();
    
    }
//====================================================================================================================    
    
    public void EditarDados(ModeloCadastroFuncionarioLoja mod){
     
        connfucnionarioLoja.conexao();
        try {
            PreparedStatement pst = connfucnionarioLoja.conn.prepareStatement("UPDATE tbl_cadastrofuncionarioloja  "
            + " SET Nome_Funcionario =?, Data_Entrada =?, Data_Saida =?, Endereco =?, Cidade =?, Estado =?, "
            + " Cep =?, Cpf =?, Rg =?, Telefone_Residencial =?, Celular_Contato =?, Email =?, Facebook =?, "
            + " Twitter =? WHERE Id_FuncionarioLoja =?");
            pst.setString(1, mod.getNomeFuncionarioLoja());
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
            pst.setInt(15, mod.getIdFuncionarioLoja());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao alterar o registro !\n Erro: " + ex);
        }
        connfucnionarioLoja.desconecta(); 
    
    }
    
//=========================================================================================================================================================    
    
    public void ExcluirDados(ModeloCadastroFuncionarioLoja mod){
      connfucnionarioLoja.conexao();
      try {
               
               PreparedStatement pst = connfucnionarioLoja.conn.prepareStatement("DELETE FROM tbl_cadastrofuncionarioloja WHERE Id_FuncionarioLoja =?");
               pst.setInt(1, mod.getIdFuncionarioLoja());
               pst.execute();  
               
               JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!!" );
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir o registro!\n ERRO:" + ex);
           }
       connfucnionarioLoja.desconecta();
    }
    
}
