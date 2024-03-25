package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe que representa um terreno, subclasse de Imovel.
 * Possui informações específicas de um terreno, como se está em zona urbana e o preço.
 */
public class Terreno extends Imovel {
    private boolean zonaUrbana;
    private double preco;
    
    /**
     * Construtor que inicializa o ano de construção, a área e a localização do terreno.
     * @param anoConstrucao O ano de construção do terreno.
     * @param area A área do terreno.
     * @param localizacao A localização do terreno.
     */
    public Terreno(int anoConstrucao, double area, String localizacao) {
        super(anoConstrucao, area, localizacao);
    }
    
    /**
     * Construtor que inicializa o ano de construção, a área, a localização, se está em zona urbana e o preço do terreno.
     * @param anoConstrucao O ano de construção do terreno.
     * @param area A área do terreno.
     * @param localizacao A localização do terreno.
     * @param zonaUrbana Indica se o terreno está em zona urbana.
     * @param preco O preço do terreno.
     */
    public Terreno(int anoConstrucao, double area, String localizacao, boolean zonaUrbana, double preco) {
        super(anoConstrucao, area, localizacao);
        this.zonaUrbana = zonaUrbana;
        this.preco = preco;
    }
    
    /**
     * Verifica se o terreno está em zona urbana.
     * @return true se o terreno estiver em zona urbana, false caso contrário.
     */
    public boolean isZonaUrbana() {
        return zonaUrbana;
    }

    /**
     * Define se o terreno está em zona urbana.
     * @param zonaUrbana true se o terreno estiver em zona urbana, false caso contrário.
     */
    public void setZonaUrbana(boolean zonaUrbana) {
        this.zonaUrbana = zonaUrbana;
    }

    /**
     * Define o preço do terreno.
     * @param preco O preço do terreno.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém o tipo do imóvel (no caso, "terreno").
     * @return O tipo do imóvel.
     */
    @Override
    String getTipo() {
        return "terreno";
    }
    
    /**
     * Obtém o preço do terreno.
     * @return O preço do terreno.
     */
    @Override
    double getPreco() {
        return this.preco;
    }
    
    /**
     * Exibe os detalhes específicos do terreno.
     */
    @Override
    public void exibirDetalhes() {
        // Método para exibir os detalhes específicos de um terreno
    }

    /**
     * Reserva o terreno.
     */
    @Override
    public void reservar() {
        // Método para reservar um terreno
    }

    /**
     * Vende o terreno.
     */
    @Override
    public void vender() {
        // Método para vender um terreno
    }
}
