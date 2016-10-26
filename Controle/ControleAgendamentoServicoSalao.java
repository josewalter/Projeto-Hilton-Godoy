
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloAgendamentoServicoSalao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleAgendamentoServicoSalao {
    ClassConectaBanco connagenda = new ClassConectaBanco();
    ModeloAgendamentoServicoSalao mod = new ModeloAgendamentoServicoSalao();
    ClassConectaBanco conncliente = new ClassConectaBanco();
    
    int codCliente;
    String NomeCliente;
//----------------------------------------------------------------------------------------------------------------------    
    
    public void SalvarAgendamento(ModeloAgendamentoServicoSalao mod){
        BuscaCodigo(mod.getNome_Cliente());
        connagenda.conexao();
        try {
            PreparedStatement pst = connagenda.conn.prepareStatement("INSERT INTO tbl_agendamentoservico"
            + " ( Nome_Cliente, Servicos_Serem_Realizados, Dia_Semana, Data_Servico, Horario_Inicio, "
            + " Horario_Termino, Valor_Servico, Descricao_Servicos, Produtos_Empresa, Produtos_Cliente,"
            + " Id_ClienteSalao) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome_Cliente());
            pst.setString(2, mod.getServicos_Feitos());
            pst.setString(3, mod.getDias_Semana());
            pst.setString(4, mod.getData_Servico());
            pst.setString(5, mod.getHorario_Inicio());
            pst.setString(6, mod.getHorario_Termino());
            pst.setString(7, mod.getValor_Servico());
            pst.setString(8, mod.getDescricao_Servicos());
            pst.setString(9, mod.getProduto_Empresa());
            pst.setString(10, mod.getProduto_Cliente());
            pst.setInt(11, codCliente);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar o registro !\n Erro: " + ex);
        }
        connagenda.desconecta();
    }
    
//----------------------------------------------------------------------------------------------------------------------

    public void EditarAgendamento(ModeloAgendamentoServicoSalao mod){
        BuscaCodigo(mod.getNome_Cliente());
      connagenda.conexao();
      
        try {
            PreparedStatement pst = connagenda.conn.prepareStatement("UPDATE tbl_agendamentoservico"
            + " SET Nome_Cliente =?, Servicos_Serem_Realizados = ?, Dia_Semana = ?, Data_Servico = ?, "
            + " Horario_Inicio = ?, Horario_Termino =?, Valor_Servico = ?, Descricao_Servicos = ?, "
            + " Produtos_Empresa = ?, Produtos_Cliente = ?, Id_ClienteSalao =? WHERE Id_Agendamento = ?");
            pst.setString(1, mod.getNome_Cliente());
            pst.setString(2, mod.getServicos_Feitos());
            pst.setString(3, mod.getDias_Semana());
            pst.setString(4, mod.getData_Servico());
            pst.setString(5, mod.getHorario_Inicio());
            pst.setString(6, mod.getHorario_Termino());
            pst.setString(7, mod.getValor_Servico());
            pst.setString(8, mod.getDescricao_Servicos());
            pst.setString(9, mod.getProduto_Empresa());
            pst.setString(10, mod.getProduto_Cliente());
            pst.setInt(11, codCliente);
            pst.setInt(12, mod.getId_Agendamento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o registro !\n Erro: " + ex);
        }
            
      connagenda.desconecta();
    }    
 
//----------------------------------------------------------------------------------------------------------------------    
    
    public void ExcluirAgendamento(ModeloAgendamentoServicoSalao mod){
      connagenda.conexao();
             
        try {
          PreparedStatement pst = connagenda.conn.prepareStatement("DELETE FROM tbl_agendamentoservico WHERE Id_Agendamento =?");
          pst.setInt(1, mod.getId_Agendamento());
          pst.execute();
          JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!!" );
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Erro ao excluir o registro!\n ERRO:" + ex);
        }
       connagenda.desconecta();
    
    }
    
//------------------------------------------------------------------------------------------------------------------------- 

    public void BuscaCodigo(String nome){
       connagenda.conexao();
        try {
            
            connagenda.executaSQL("SELECT * FROM tbl_cadastroclientesalao WHERE Nome_Cliente ='" + nome + "'");
            connagenda.rs.first();
            codCliente = connagenda.rs.getInt("Id_ClienteSalao");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o Código do  Cliente do Salão!!\nErro" +ex);
        }
       connagenda.desconecta();    
    }
    
//--------------------------------------------------------------------------------------------------------------------------------

  public ModeloAgendamentoServicoSalao BuscaData(ModeloAgendamentoServicoSalao mod){
      connagenda.conexao();
        try {
            connagenda.executaSQL("SELECT * FROM tbl_agendamentoservico WHERE Data_Servico like  '%" + mod.getPesquisar() +"%'");
            connagenda.rs.first();
            BuscaNomeCliente(conncliente.rs.getInt("Id_ClienteSalao"));
            mod.setId_Agendamento(connagenda.rs.getInt("Id_Agendamento"));
            mod.setServicos_Feitos(connagenda.rs.getString("Nome_Cliente"));
            mod.setServicos_Feitos(connagenda.rs.getString("Servicos_Serem_Realizados"));
            mod.setDias_Semana(connagenda.rs.getString("Dia_Semana"));
            mod.setData_Servico(connagenda.rs.getString("Data_Servico"));
            mod.setHorario_Inicio(connagenda.rs.getString("Horario_Inicio"));
            mod.setHorario_Termino(connagenda.rs.getString("Horario_Termino"));
            mod.setValor_Servico(connagenda.rs.getString("Valor_Servico"));
            mod.setDescricao_Servicos(connagenda.rs.getString("Descricao_Servicos"));
            mod.setProduto_Empresa(connagenda.rs.getString("Produtos_Empresa"));
            mod.setProduto_Cliente(connagenda.rs.getString("Produtos_Cliente"));
            mod.setNome_Cliente(NomeCliente);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar a data!!\nErro" +ex);
        }
      connagenda.desconecta();
      return mod;
   
   } 
//--------------------------------------------------------------------------------------------------------------------------------
      public void BuscaNomeCliente(int cod){
          conncliente.conexao();
        try {
            conncliente.executaSQL("SELECT * FROM tbl_cadastroclientesalao WHERE Id_ClienteSalao ='" + cod + "'");
            conncliente.rs.first();
            NomeCliente = conncliente.rs.getString(" Nome_Cliente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o nome do cliente!!\nErro" +ex);
        }
          conncliente.desconecta(); 
     }  
    
}
