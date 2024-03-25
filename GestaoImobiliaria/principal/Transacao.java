package principal;

import java.util.Date;

/**
 * @author Joel António
 * @version 1.0
 * Classe abstrata que representa uma transação envolvendo um imóvel.
 */
public abstract class Transacao {
    private Date data;
    private String agencia;
    private Funcionario vendedor;
    private Cliente cliente;

    /**
     * Construtor que inicializa os atributos da transação.
     * @param data A data da transação.
     * @param agencia A agência onde a transação ocorreu.
     * @param vendedor O funcionário que realizou a transação.
     * @param cliente O cliente envolvido na transação.
     */
    public Transacao(Date data, String agencia, Funcionario vendedor, Cliente cliente) {
        this.data = data;
        this.agencia = agencia;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    /**
     * Construtor padrão.
     */
    public Transacao() {
    }

    /**
     * Obtém a data da transação.
     * @return A data da transação.
     */
    public Date getData() {
        return data;
    }

    /**
     * Define a data da transação.
     * @param data A data da transação.
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Obtém a agência onde a transação ocorreu.
     * @return A agência onde a transação ocorreu.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define a agência onde a transação ocorreu.
     * @param agencia A agência onde a transação ocorreu.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Obtém o funcionário que realizou a transação.
     * @return O funcionário que realizou a transação.
     */
    public Funcionario getVendedor() {
        return vendedor;
    }

    /**
     * Define o funcionário que realizou a transação.
     * @param vendedor O funcionário que realizou a transação.
     */
    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * Obtém o cliente envolvido na transação.
     * @return O cliente envolvido na transação.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente envolvido na transação.
     * @param cliente O cliente envolvido na transação.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
