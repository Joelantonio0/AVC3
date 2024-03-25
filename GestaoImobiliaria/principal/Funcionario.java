package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa um funcionário da imobiliária.
 * Armazena informações como código, nome, agência e salário mensal do funcionário.
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private String agencia;
    private double salarioMensal;

    /**
     * Construtor padrão.
     */
	public Funcionario() {
		super();
	}

    /**
     * Construtor que inicializa o código, nome, agência e salário mensal do funcionário.
     * @param codigo O código do funcionário.
     * @param nome O nome do funcionário.
     * @param agencia A agência em que o funcionário trabalha.
     * @param salarioMensal O salário mensal do funcionário.
     */
	public Funcionario(int codigo, String nome, String agencia, double salarioMensal) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.agencia = agencia;
		this.salarioMensal = salarioMensal;
	}

    /**
     * Obtém o código do funcionário.
     * @return O código do funcionário.
     */
	public int getCodigo() {
		return codigo;
	}

    /**
     * Define o código do funcionário.
     * @param codigo O código do funcionário.
     */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

    /**
     * Obtém o nome do funcionário.
     * @return O nome do funcionário.
     */
	public String getNome() {
		return nome;
	}

    /**
     * Define o nome do funcionário.
     * @param nome O nome do funcionário.
     */
	public void setNome(String nome) {
		this.nome = nome;
	}

    /**
     * Obtém a agência em que o funcionário trabalha.
     * @return A agência do funcionário.
     */
	public String getAgencia() {
		return agencia;
	}

    /**
     * Define a agência em que o funcionário trabalha.
     * @param agencia A agência do funcionário.
     */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

    /**
     * Obtém o salário mensal do funcionário.
     * @return O salário mensal do funcionário.
     */
	public double getSalarioMensal() {
		return salarioMensal;
	}

    /**
     * Define o salário mensal do funcionário.
     * @param salarioMensal O salário mensal do funcionário.
     */
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

    /**
     * Método para registrar um novo funcionário no sistema.
     */
	public void registrar() {
		// Método para registrar um novo funcionário no sistema
	}  
}
