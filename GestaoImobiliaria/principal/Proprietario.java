package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa um proprietário de imóveis.
 */
public class Proprietario {
    private String nome;
    private String login;
    private String senha;
    private boolean aprovado;

    /**
     * Construtor padrão.
     */
    public Proprietario() {
    }

    /**
     * Construtor que inicializa o nome, login, senha e estado de aprovação do proprietário.
     * @param nome O nome do proprietário.
     * @param login O login do proprietário.
     * @param senha A senha do proprietário.
     * @param aprovado O estado de aprovação do proprietário.
     */
    public Proprietario(String nome, String login, String senha, boolean aprovado) {
        super();
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.aprovado = aprovado;
    }

    /**
     * Obtém o nome do proprietário.
     * @return O nome do proprietário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do proprietário.
     * @param nome O nome do proprietário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o login do proprietário.
     * @return O login do proprietário.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do proprietário.
     * @param login O login do proprietário.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Obtém a senha do proprietário.
     * @return A senha do proprietário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do proprietário.
     * @param senha A senha do proprietário.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Verifica se o proprietário está aprovado.
     * @return true se o proprietário estiver aprovado, false caso contrário.
     */
    public boolean isAprovado() {
        return aprovado;
    }

    /**
     * Define o estado de aprovação do proprietário.
     * @param aprovado O estado de aprovação do proprietário.
     */
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
    /**
     * Método para o proprietário solicitar registro no sistema.
     */
    public void solicitarRegistro() {
        // Método para o proprietário solicitar registro no sistema
    }

    /**
     * Método para o proprietário cadastrar um imóvel no sistema.
     * @param imovel O imóvel a ser cadastrado.
     */
    public void cadastrarImovel(Imovel imovel) {
        // Método para o proprietário cadastrar um imóvel no sistema
    }

    /**
     * Método para o proprietário remover um imóvel do sistema.
     * @param imovel O imóvel a ser removido.
     */
    public void removerImovel(Imovel imovel) {
        // Método para o proprietário remover um imóvel do sistema
    }
}
