package Principal;

/**
 * Classe que representa a conta corrente de um cliente.
 * Contém informações sobre o saldo e os juros por atraso de pagamento.
 * @author Joel António
 * @version 1.0
 */
public class ContaCorrenta {
    private double saldo; // Saldo da conta corrente
    private double jurosAtrasoPagamento; // Juros por atraso de pagamento

    /**
     * Construtor padrão da classe ContaCorrente.
     */
    public ContaCorrenta() {
    }

    /**
     * Construtor da classe ContaCorrente que inicializa o saldo e os juros por atraso de pagamento.
     * @param saldo O saldo inicial da conta corrente.
     * @param jurosAtrasoPagamento A taxa de juros por atraso de pagamento.
     */
    public ContaCorrenta(double saldo, double jurosAtrasoPagamento) {
        this.saldo = saldo;
        this.jurosAtrasoPagamento = jurosAtrasoPagamento;
    }

    // Getters e Setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJurosAtrasoPagamento() {
        return jurosAtrasoPagamento;
    }

    public void setJurosAtrasoPagamento(double jurosAtrasoPagamento) {
        this.jurosAtrasoPagamento = jurosAtrasoPagamento;
    }

    /**
     * Método para calcular os juros com base em um montante.
     * @param montante O montante sobre o qual calcular os juros.
     * @return Os juros calculados.
     */
    public double calcularJuros(double montante) {
        // Lógica para calcular os juros com base no montante
        return 0.0;
    }

    /**
     * Método para adicionar juros à conta corrente com base em um montante.
     * @param montante O montante sobre o qual adicionar os juros.
     */
    public void adicionarJuros(double montante) {
        // Lógica para adicionar juros à conta corrente com base no montante
    }
}
