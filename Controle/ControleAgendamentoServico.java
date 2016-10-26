
package Controle;

import DAO.ClassConectaBanco;
import Modelo.ModeloAgendamentoServico;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author: José Walter.
 */
public class ControleAgendamentoServico {
    ClassConectaBanco connagenda = new ClassConectaBanco();
    ModeloAgendamentoServico mod = new ModeloAgendamentoServico();
    
//----------------------------------------------------------------------------------------------------------------------    
    
    public void SalvarAgendamento(ModeloAgendamentoServico mod){
        connagenda.conexao();
        try {
            PreparedStatement pst = connagenda.conn.prepareStatement("INSERT INTO tbl_agendamentoservico"
            + " ( Nome_Cliente, Servicos_Serem_Realizados, Dia_Semana, Data_Servico, Horario_Inicio, "
            + " Horario_Termino, Valor_Servico, Descricao_Servicos, Produtos_Empresa, Produtos_Cliente)"
            + " VALUES (?,?,?,?,?,?,?,?,? )");
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
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao salvar o registro !\n Erro: " + ex);
        }
        connagenda.desconecta();
    }
    
//----------------------------------------------------------------------------------------------------------------------

    public void EditarAgendamento(ModeloAgendamentoServico mod){
      connagenda.conexao();
      
        try {
            PreparedStatement pst = connagenda.conn.prepareStatement("UPDATE tbl_agendamentoservico"
            + " SET  Nome_Cliente =?, Servicos_Serem_Realizados = ?, Dia_Semana = ?, Data_Servico = ?, "
            + " Horario_Inicio = ?, Horario_Termino =?, Valor_Servico = ?, Descricao_Servicos = ?, "
            + " Produtos_Empresa = ?, Produtos_Cliente = ? WHERE Id_Agendamento = ?");
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
            pst.setInt(11, mod.getId_Agendamento());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o registro !\n Erro: " + ex);
        }
            
      connagenda.desconecta();
    }    
 
//----------------------------------------------------------------------------------------------------------------------    
    
    public void ExcluirAgendamento(ModeloAgendamentoServico mod){
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
}
