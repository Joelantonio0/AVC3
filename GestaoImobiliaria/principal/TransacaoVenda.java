package principal;

import java.util.Date;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa uma transação de venda de imóvel.
 */
public class TransacaoVenda extends Transacao {
    private Imovel imovel;

    /**
     * Construtor que inicializa os atributos da transação de venda.
     * @param data A data da transação.
     * @param agencia A agência onde a transação foi realizada.
     * @param vendedor O funcionário responsável pela transação.
     * @param cliente O cliente envolvido na transação.
     * @param imovel O imóvel vendido.
     */
    public TransacaoVenda(Date data, String agencia, Funcionario vendedor, Cliente cliente, Imovel imovel) {
        super(data, agencia, vendedor, cliente);
        this.imovel = imovel;
    }

    /**
     * Construtor que inicializa os atributos da transação de venda.
     * @param data A data da transação.
     * @param agencia A agência onde a transação foi realizada.
     * @param vendedor O funcionário responsável pela transação.
     * @param cliente O cliente envolvido na transação.
     */
    public TransacaoVenda(Date data, String agencia, Funcionario vendedor, Cliente cliente) {
        super(data, agencia, vendedor, cliente);
    }

    /**
     * Obtém o imóvel vendido.
     * @return O imóvel vendido.
     */
    public Imovel getImovel() {
        return imovel;
    }

    /**
     * Define o imóvel vendido.
     * @param imovel O imóvel vendido.
     */
    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
}
