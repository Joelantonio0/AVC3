package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa um apartamento, subclasse de Imovel.
 * Possui informações específicas de um apartamento, como tipologia e preço.
 */
public class Apartamento extends Imovel {
    private String tipologia;
    private double preco;
    
    /**
     * Construtor padrão.
     */
    public Apartamento() {
        super();
    }

    /**
     * Construtor com parâmetros para inicializar a tipologia e o preço do apartamento.
     * @param tipologia A tipologia do apartamento.
     * @param preco O preço do apartamento.
     */
    public Apartamento(String tipologia, double preco) {
        super();
        this.tipologia = tipologia;
        this.preco = preco;
    }
    
    /**
     * Obtém a tipologia do apartamento.
     * @return A tipologia do apartamento.
     */
    public String getTipologia() {
        return tipologia;
    }
    
    /**
     * Define a tipologia do apartamento.
     * @param tipologia A tipologia do apartamento.
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    
    /**
     * Define o preço do apartamento.
     * @param preco O preço do apartamento.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /**
     * Obtém o tipo do imóvel (no caso, "apartamento").
     * @return O tipo do imóvel.
     */
    @Override
    String getTipo() {
        return "apartamento";
    }
    
    /**
     * Obtém o preço do apartamento.
     * @return O preço do apartamento.
     */
    @Override
    double getPreco() {
        return this.preco;
    }
    
    /**
     * Exibe os detalhes específicos do apartamento.
     */
    @Override
    public void exibirDetalhes() {
        // Método para exibir os detalhes específicos de um apartamento
    }

    /**
     * Reserva o apartamento.
     */
    @Override
    public void reservar() {
        // Método para reservar um apartamento
    }

    /**
     * Vende o apartamento.
     */
    @Override
    public void vender() {
        // Método para vender um apartamento
    }
}
