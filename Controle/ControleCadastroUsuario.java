
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloCadastroUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleCadastroUsuario {
    ClassConectaBanco connusuario = new ClassConectaBanco();
    ModeloCadastroUsuario mod = new ModeloCadastroUsuario();
    
//--------------------------------------------------------------------------------------------------------    
    // Declaração do código pra salvar o registro do Formulário de Cadastro de Usuário.
    public void SalvarUsuario(ModeloCadastroUsuario mod){
       connusuario.conexao();
        try {
            PreparedStatement pst = connusuario.conn.prepareStatement("INSERT INTO tbl_cadastrousuario ("
            + " Nome_Usuario, Permissao, Login, Senha_Usuario) VALUES (?,?,?,?)");
            pst.setString(1, mod.getNomeUsuario());
            pst.setString(2, mod.getPermissao());
            pst.setString(3, mod.getLogin());
            pst.setString(4, mod.getSenhaUsuario());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir o usuário!!\nErro" + ex);
        }
       connusuario.desconecta();
    
    }
 //-------------------------------------------------------------------------------------------------------- 
  // Declaração do código pra excluir o registro do Formulário de Cadastro de Usuário.
   public void ExcluirUsuario(ModeloCadastroUsuario mod){
      connusuario.conexao();
        try {
            PreparedStatement pst = connusuario.conn.prepareStatement("DELETE FROM tbl_cadastrousuario WHERE Codigo_Usuario =?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao excluir o usuário!!\nErro" + ex);
        }       
      connusuario.desconecta();   
   }
   
 //--------------------------------------------------------------------------------------------------------
   // Declaração do código pra editar do Formulário de Cadastro de Usuário. 
      public void EditarUsuario(ModeloCadastroUsuario mod){
        connusuario.conexao();
        try {
            PreparedStatement pst = connusuario.conn.prepareStatement(" UPDATE tbl_cadastrousuario"
            + " SET Nome_Usuario =?, Permissao =?, Login =?, Senha_Usuario =? WHERE Codigo_Usuario =?");
            pst.setString(1, mod.getNomeUsuario());
            pst.setString(2, mod.getPermissao());
            pst.setString(3, mod.getLogin());
            pst.setString(4, mod.getSenhaUsuario());
            pst.setInt(5, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o usuário!!\nErro" + ex);
        }
        connusuario.desconecta();
      }
      
   
 //--------------------------------------------------------------------------------------------------------   
   // Declaração do código pra editar o registro do Formulário de Cadastro de Usuário.
   public ModeloCadastroUsuario  EditarPrimeiro(){
       connusuario.conexao();
        try {
            connusuario.executaSQL("SELECT * FROM tbl_cadastrousuario");
            connusuario.rs.first();
            mod.setCodigo(connusuario.rs.getInt("Codigo_Usuario"));
            mod.setNomeUsuario(connusuario.rs.getString("Nome_Usuario"));
            mod.setPermissao(connusuario.rs.getString("Login"));
            mod.setSenhaUsuario(connusuario.rs.getString("Senha_Usuario"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o primeiro registro!!\nErro" + ex);
        }
       // connusuario.desconecta();  
        return mod;        
     } 
   
//--------------------------------------------------------------------------------------------------------    
   // Declaração do código do editar para o próximo registro do Formulário de Cadastro de Usuário.
 public ModeloCadastroUsuario  EditarProximo(){
      // connusuario.conexao();
        try {
           // connusuario.executaSQL("SELECT * FROM tbl_cadastrousuario");
            connusuario.rs.next();
            mod.setCodigo(connusuario.rs.getInt("Codigo_Usuario"));
            mod.setNomeUsuario(connusuario.rs.getString("Nome_Usuario"));
            mod.setPermissao(connusuario.rs.getString("Login"));
            mod.setSenhaUsuario(connusuario.rs.getString("Senha_Usuario"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o próximo registro!!\nErro" + ex);
        }
        //connusuario.desconecta();  
        return mod;        
     } 
 
 //-------------------------------------------------------------------------------------------------------- 
    // Declaração do código do editar para o registro anterior do Formulário de Cadastro de Usuário.
  public ModeloCadastroUsuario  EditarAnterior(){
       //connusuario.conexao();
        try {
           // connusuario.executaSQL("SELECT * FROM tbl_cadastrousuario");
            connusuario.rs.previous();
            mod.setCodigo(connusuario.rs.getInt("Codigo_Usuario"));
            mod.setNomeUsuario(connusuario.rs.getString("Nome_Usuario"));
            mod.setPermissao(connusuario.rs.getString("Login"));
            mod.setSenhaUsuario(connusuario.rs.getString("Senha_Usuario"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o registro anterior!!\nErro" + ex);
        }
        //connusuario.desconecta();  
        return mod;        
     }  

 //-------------------------------------------------------------------------------------------------------- 
    // Declaração do código do editar para o último registro do Formulário de Cadastro de Usuário.
  public ModeloCadastroUsuario  EditarUltimo(){
       //connusuario.conexao();
        try {
            connusuario.executaSQL("SELECT * FROM tbl_cadastrousuario");
            connusuario.rs.last();
            mod.setCodigo(connusuario.rs.getInt("Codigo_Usuario"));
            mod.setNomeUsuario(connusuario.rs.getString("Nome_Usuario"));
            mod.setPermissao(connusuario.rs.getString("Login"));
            mod.setSenhaUsuario(connusuario.rs.getString("Senha_Usuario"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao setar o último registro!!\nErro" + ex);
        }
        connusuario.desconecta();  
        return mod;
  }
}
