package DAO;
 
 import java.sql.Statement;
 import java.sql.ResultSet;
 import java.sql.Connection;
 import java.sql.DriverManager;
 import java.sql.SQLException;
 import javax.swing.JOptionPane;
  /**
  *
  * @author: José Walter:
  */
    public class ClassConectaBanco {
    
      public  Statement stm;//Responsável por preparar e realizar a pesquisa no banco de dados:
      public  ResultSet rs;// Responsável por armazenar o resultado de uma pesquisa no Statement:
      private String    driver  = "jdbc.Driver";// Responsável por identificar o serviço de banco de dados:
      private String    caminho = "jdbc:mysql://localhost:3306/salaohiltongodoy";// Responsável por mostrar o caminho para o banco de dados:
      private String    usuario = "root";
      private String    senha   = "afroara";
      public Connection conn; // Responsável por realizar a conexão com o banco de dados:   

//----------------------------------------------------------------------------------------------------------------------------------------

      public void conexao(){// Método reponsável pela conexão com o banco.
          
          try {
               System.setProperty("jdbc.Driver",driver);// Seta a propriedade do driver de conexão.
              conn = DriverManager.getConnection(caminho, usuario, senha);// Realiza a conexão com o banco de dados.
              JOptionPane.showMessageDialog(null, " Conectado com sucesso");// Imprime a menssagem conectado.
          } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, " Erro de conexão \n " + ex);
          }
  }
      
//--------------------------------------------------------------------------------------------------------------------------------------
      
        public void executaSQL(String sql) throws Exception{// Método SQL para salvar os dados quando eles forem enviados para cá.
       try {
          
         stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
         rs = stm.executeQuery(sql);
           //conn.commit ();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, " Erro de ExecuçãoSQL!\n Erro " + ex.getMessage());
       }
     }
   
//-------------------------------------------------------------------------------------------------------------------------------------        
         public void desconecta(){
          try {
              conn.close();
              JOptionPane.showMessageDialog(null, " Desconectado com sucesso");
          } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, " Erro ao se desconectar \n " + ex);
       }
    }
}