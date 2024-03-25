package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa um cliente da imobiliária.
 * Armazena informações como nome, login e senha do cliente.
 */
public class Cliente {
    private String nome;
    private String login;
	private String senha;
	
    /**
     * Construtor padrão.
     */
    public Cliente() {
		super();
	}

    /**
     * Construtor que inicializa o nome, login e senha do cliente.
     * @param nome O nome do cliente.
     * @param login O login do cliente.
     * @param senha A senha do cliente.
     */
	public Cliente(String nome, String login, String senha) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

    /**
     * Obtém o nome do cliente.
     * @return O nome do cliente.
     */
	public String getNome() {
		return nome;
	}

    /**
     * Define o nome do cliente.
     * @param nome O nome do cliente.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     * Obtém o login do cliente.
     * @return O login do cliente.
     */
	public String getLogin() {
		return login;
	}

    /**
     * Define o login do cliente.
     * @param login O login do cliente.
     */
	public void setLogin(String login) {
		this.login = login;
	}

    /**
     * Obtém a senha do cliente.
     * @return A senha do cliente.
     */
	public String getSenha() {
		return senha;
	}

    /**
     * Define a senha do cliente.
     * @param senha A senha do cliente.
     */
	public void setSenha(String senha) {
		this.senha = senha;
	}

    /**
     * Método para registrar um novo cliente no sistema.
     */
	 public void registrar() {
	        // Método para registrar um novo cliente no sistema
	    }

    /**
     * Método para o cliente fazer uma reserva de um imóvel.
     * @param imovel O imóvel a ser reservado.
     */
	    public void fazerReserva(Imovel imovel) {
	        // Método para o cliente fazer uma reserva de um imóvel
	    }

    /**
     * Método para o cliente realizar a compra de um imóvel.
     * @param imovel O imóvel a ser comprado.
     */
	    public void realizarCompra(Imovel imovel) {
	        // Método para o cliente realizar a compra de um imóvel
	    }
	
}
