package PadroesCriacao.Singleton;

public class LoginBanco {
    private static LoginBanco single_instance = null;
    public String servidor;
    public String login;
    public String senha;
    public String nomeBanco;

    public static LoginBanco getInstance()
    {
        if (single_instance == null)
            single_instance = new LoginBanco();

        return single_instance;
    }

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}