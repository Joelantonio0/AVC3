package Principal;

import java.util.Date;

/**
 * Classe que representa um cliente da firma de investimentos.
 * Cada cliente possui um número único, nome, telefone, carteira de investimentos
 * e conta corrente.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Cliente {
    private int numero; // Número único do cliente
    private String nome; // Nome do cliente
    private String telefone; // Número de telefone do cliente
    private Carteira carteiraInvestimentos; // Carteira de investimentos do cliente
    private ContaCorrenta contaCorrente; // Conta corrente do cliente
    
    /**
     * Construtor padrão da classe Cliente.
     */
    public Cliente() {
	}

    // Getters e Setters
    
    /**
     * Obtém o número do cliente.
     * 
     * @return O número do cliente.
     */
    public int getNumero() {
		return numero;
	}

    /**
     * Define o número do cliente.
     * 
     * @param numero O número do cliente.
     */
	public void setNumero(int numero) {
		this.numero = numero;
	}

    /**
     * Obtém o nome do cliente.
     * 
     * @return O nome do cliente.
     */
	public String getNome() {
		return nome;
	}

    /**
     * Define o nome do cliente.
     * 
     * @param nome O nome do cliente.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     * Obtém o telefone do cliente.
     * 
     * @return O telefone do cliente.
     */
	public String getTelefone() {
		return telefone;
	}

    /**
     * Define o telefone do cliente.
     * 
     * @param telefone O telefone do cliente.
     */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

    /**
     * Obtém a carteira de investimentos do cliente.
     * 
     * @return A carteira de investimentos do cliente.
     */
	public Carteira getCarteiraInvestimentos() {
		return carteiraInvestimentos;
	}

    /**
     * Define a carteira de investimentos do cliente.
     * 
     * @param carteiraInvestimentos A carteira de investimentos do cliente.
     */
	public void setCarteiraInvestimentos(Carteira carteiraInvestimentos) {
		this.carteiraInvestimentos = carteiraInvestimentos;
	}

    /**
     * Obtém a conta corrente do cliente.
     * 
     * @return A conta corrente do cliente.
     */
	public ContaCorrenta getContaCorrente() {
		return contaCorrente;
	}

    /**
     * Define a conta corrente do cliente.
     * 
     * @param contaCorrente A conta corrente do cliente.
     */
	public void setContaCorrente(ContaCorrenta contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

    // Outros métodos
    
    /**
     * Construtor parametrizado da classe Cliente.
     * 
     * @param numero O número do cliente.
     * @param nome O nome do cliente.
     * @param telefone O telefone do cliente.
     * @param carteiraInvestimentos A carteira de investimentos do cliente.
     * @param contaCorrente A conta corrente do cliente.
     */
	public Cliente(int numero, String nome, String telefone, Carteira carteiraInvestimentos,
			ContaCorrenta contaCorrente) {
		this.numero = numero;
		this.nome = nome;
		this.telefone = telefone;
		this.carteiraInvestimentos = carteiraInvestimentos;
		this.contaCorrente = contaCorrente;
	}

    /**
     * Método para o cliente comprar títulos de participação.
     * 
     * @param titulo O título de participação a ser comprado.
     * @param quantidade A quantidade de títulos a ser comprada.
     * @param valorTransacionado O valor total transacionado na compra.
     * @param dataHora A data e hora da transação.
     */
	public void comprarTitulos(TituloParticipacao titulo, int quantidade, double valorTransacionado, Date dataHora) {
        // Lógica para o cliente comprar títulos
    }

    /**
     * Método para o cliente vender títulos de participação.
     * 
     * @param titulo O título de participação a ser vendido.
     * @param quantidade A quantidade de títulos a ser vendida.
     * @param valorTransacionado O valor total transacionado na venda.
     * @param dataHora A data e hora da transação.
     */
    public void venderTitulos(TituloParticipacao titulo, int quantidade, double valorTransacionado, Date dataHora) {
        // Lógica para o cliente vender títulos
    }

    /**
     * Método para o cliente depositar um montante na sua conta corrente.
     * 
     * @param montante O montante a ser depositado.
     */
    public void depositarMontante(double montante) {
        // Lógica para o cliente depositar um montante na conta corrente
    }

    /**
     * Método para o cliente levantar um montante da sua conta corrente.
     * 
     * @param montante O montante a ser levantado.
     */
    public void levantarMontante(double montante) {
        // Lógica para o cliente levantar um montante da conta corrente
    }
}
