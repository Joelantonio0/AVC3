package Principal;

/**
 * Classe que representa a conta da bolsa de valores.
 * Contém informações sobre o valor dos títulos de participação.
 * @author Joel António
 * @version 1.0
 */
public class ContaBolsa {
    private double valorTitulo; // Valor dos títulos de participação

    /**
     * Construtor padrão da classe ContaBolsa.
     */
    public ContaBolsa() {
    }

    /**
     * Construtor da classe ContaBolsa que inicializa o valor dos títulos de participação.
     * @param valorTitulo O valor dos títulos de participação.
     */
    public ContaBolsa(double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }

    // Getters e Setters

    public double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }
}
