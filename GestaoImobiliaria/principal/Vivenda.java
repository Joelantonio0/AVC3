package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa uma vivenda, subclasse de Imovel.
 * Possui informações específicas de uma vivenda, como tipologia e preço.
 */
public class Vivenda extends Imovel {
    private String tipologia;
    private double preco;
    
    /**
     * Construtor que inicializa o ano de construção, a área e a localização da vivenda.
     * @param anoConstrucao O ano de construção da vivenda.
     * @param area A área da vivenda.
     * @param localizacao A localização da vivenda.
     */
    public Vivenda(int anoConstrucao, double area, String localizacao) {
        super(anoConstrucao, area, localizacao);
    }
    
    /**
     * Construtor que inicializa o ano de construção, a área, a localização, a tipologia e o preço da vivenda.
     * @param anoConstrucao O ano de construção da vivenda.
     * @param area A área da vivenda.
     * @param localizacao A localização da vivenda.
     * @param tipologia A tipologia da vivenda.
     * @param preco O preço da vivenda.
     */
    public Vivenda(int anoConstrucao, double area, String localizacao, String tipologia, double preco) {
        super(anoConstrucao, area, localizacao);
        this.tipologia = tipologia;
        this.preco = preco;
    }
    
    /**
     * Obtém o tipo do imóvel (no caso, "vivenda").
     * @return O tipo do imóvel.
     */
    @Override
    String getTipo() {
        return "vivenda";
    }
    
    /**
     * Obtém o preço da vivenda.
     * @return O preço da vivenda.
     */
    @Override
    double getPreco() {
        return this.preco;
    }
    
    /**
     * Obtém a tipologia da vivenda.
     * @return A tipologia da vivenda.
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Define a tipologia da vivenda.
     * @param tipologia A tipologia da vivenda.
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    /**
     * Define o preço da vivenda.
     * @param preco O preço da vivenda.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Exibe os detalhes específicos da vivenda.
     */
    @Override
    public void exibirDetalhes() {
        // Método para exibir os detalhes específicos de uma vivenda
    }

    /**
     * Reserva a vivenda.
     */
    @Override
    public void reservar() {
        // Método para reservar uma vivenda
    }

    /**
     * Vende a vivenda.
     */
    @Override
    public void vender() {
        // Método para vender uma vivenda
    }
}
