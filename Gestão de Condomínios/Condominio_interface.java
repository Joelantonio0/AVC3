/**
 * A interface Condominio_interface define os métodos que um objeto Condominio deve implementar.
 * Esses métodos incluem o pagamento de salário para funcionários e o pagamento de quota do condomínio.
 * 
 * @author Joel António
 * @version 1.0
 */
public interface Condominio_interface {
    /**
     * Paga o salário de um funcionário.
     * 
     * @param funcionario o funcionário a ser pago
     * @return uma mensagem indicando o pagamento do salário
     */
    public String pagarSalario(Funcionario funcionario);

    /**
     * Paga a quota do condomínio.
     * 
     * @return uma mensagem indicando o pagamento da quota
     */
    public String pagarQuota();
}
