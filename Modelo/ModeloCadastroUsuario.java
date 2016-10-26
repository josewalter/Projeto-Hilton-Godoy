
package Modelo;

/**
 *
 * @author: José Walter.
 */
public class ModeloCadastroUsuario {
    private int Codigo;
    private String NomeUsuario;
    private String Permissao;
    private String Login;
    private String SenhaUsuario;

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the NomeUsuario
     */
    public String getNomeUsuario() {
        return NomeUsuario;
    }

    /**
     * @param NomeUsuario the NomeUsuario to set
     */
    public void setNomeUsuario(String NomeUsuario) {
        this.NomeUsuario = NomeUsuario;
    }

    /**
     * @return the Permissao
     */
    public String getPermissao() {
        return Permissao;
    }

    /**
     * @param Permissao the Permissao to set
     */
    public void setPermissao(String Permissao) {
        this.Permissao = Permissao;
    }

    /**
     * @return the Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }

    /**
     * @return the SenhaUsuario
     */
    public String getSenhaUsuario() {
        return SenhaUsuario;
    }

    /**
     * @param SenhaUsuario the SenhaUsuario to set
     */
    public void setSenhaUsuario(String SenhaUsuario) {
        this.SenhaUsuario = SenhaUsuario;
    }
    
}
