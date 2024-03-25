package principal;

import java.util.Date;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa uma transação de aluguel de imóvel.
 */
public class TransacaoAluguel extends Transacao {
    private Imovel imovel;
    private double valorAluguel;
    
    /**
     * Construtor que inicializa os atributos da transação de aluguel.
     * @param data A data da transação.
     * @param agencia A agência onde a transação foi realizada.
     * @param vendedor O funcionário responsável pela transação.
     * @param cliente O cliente envolvido na transação.
     */
    public TransacaoAluguel(Date data, String agencia, Funcionario vendedor, Cliente cliente) {
        super(data, agencia, vendedor, cliente);
    }

    /**
     * Construtor que inicializa todos os atributos da transação de aluguel.
     * @param data A data da transação.
     * @param agencia A agência onde a transação foi realizada.
     * @param vendedor O funcionário responsável pela transação.
     * @param cliente O cliente envolvido na transação.
     * @param imovel O imóvel alugado.
     * @param valorAluguel O valor do aluguel.
     */
    public TransacaoAluguel(Date data, String agencia, Funcionario vendedor, Cliente cliente, Imovel imovel,
            double valorAluguel) {
        super(data, agencia, vendedor, cliente);
        this.imovel = imovel;
        this.valorAluguel = valorAluguel;
    }

    /**
     * Obtém o imóvel alugado.
     * @return O imóvel alugado.
     */
    public Imovel getImovel() {
        return imovel;
    }

    /**
     * Define o imóvel alugado.
     * @param imovel O imóvel alugado.
     */
    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    /**
     * Obtém o valor do aluguel.
     * @return O valor do aluguel.
     */
    public double getValorAluguel() {
        return valorAluguel;
    }

    /**
     * Define o valor do aluguel.
     * @param valorAluguel O valor do aluguel.
     */
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
