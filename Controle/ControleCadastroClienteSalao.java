
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroClienteSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroClienteSalao {
    ClassConectaBanco conncliente = new  ClassConectaBanco();
    
//=======================================================================================================================    
   // Código do botão Salvar usando modelo MVC.
    
    public void SalvarDados(ModeloCadastroClienteSalao mod){
       
        conncliente.conexao();
        try {
            PreparedStatement pst = conncliente.conn.prepareStatement("INSERT INTO tbl_cadastroclientesalao ("
            + " Nome_Cliente, Data_Entrada, Data_Saida, Endereco, Cidade, Estado, Cep, Cpf, Rg, Telefone_Residencial,"
            + " Celular_Contato, Email, Facebook, Twitter) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNomeClienteSalao());
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
        conncliente.desconecta();
    
    }
//================================================================================================    
    // Código do botão Editar usando modelo MVC.
    
    public void EditarDados(ModeloCadastroClienteSalao mod){
     
        conncliente.conexao();
        try {
            PreparedStatement pst = conncliente.conn.prepareStatement("UPDATE tbl_cadastroclientesalao "
            + " SET Nome_Cliente =?, Data_Entrada =?, Data_Saida =?, Endereco =?, Cidade =?, Estado =?, "
            + " Cep =?, Cpf =?, Rg =?, Telefone_Residencial =?, Celular_Contato =?, Email =?, Facebook =?, "
            + " Twitter =? WHERE Id_ClienteSalao =?");
            pst.setString(1, mod.getNomeClienteSalao());
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
            pst.setInt(15, mod.getIdClienteSalao());
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao alterar o registro !\n Erro: " + ex);
        }
        conncliente.desconecta(); 
    
    }
    
//=================================================================================================    
    // Código do botão Excluir usando modelo MVC.
    
    public void ExcluirDados(ModeloCadastroClienteSalao mod){
      conncliente.conexao();
      try {
               
               PreparedStatement pst = conncliente.conn.prepareStatement("DELETE FROM tbl_cadastroclientesalao WHERE Id_ClienteSalao =?");
               pst.setInt(1, mod.getIdClienteSalao());
               pst.execute();  
               
               JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!!" );
          } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Erro ao excluir o registro!\nERRO:" + ex);
           }
       conncliente.desconecta();
    }
    
}
