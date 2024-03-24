/**
 * A interface Edificio_interface define os métodos necessários para um edifício.
 * Esses métodos incluem o pagamento mensal por apartamento.
 * 
 * @author Joel António
 * @version 1.0
 */
public interface Edificio_interface {
    /**
     * Método para realizar o pagamento mensal por apartamento.
     * 
     * @param apartamento o apartamento para o qual o pagamento será feito
     * @return uma mensagem indicando o pagamento mensal por apartamento
     */
    public String pagamentoMensal(Apartamento apartamento);
}

