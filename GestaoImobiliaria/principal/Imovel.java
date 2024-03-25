package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe abstrata que representa um imóvel.
 * Possui atributos como ano de construção, área e localização.
 */
public abstract class Imovel {
    protected int anoConstrucao;
    protected double area;
    protected String localizacao;

    /**
     * Construtor que inicializa o ano de construção, área e localização do imóvel.
     * @param anoConstrucao O ano de construção do imóvel.
     * @param area A área do imóvel.
     * @param localizacao A localização do imóvel.
     */
    public Imovel(int anoConstrucao, double area, String localizacao) {
        super();
        this.anoConstrucao = anoConstrucao;
        this.area = area;
        this.localizacao = localizacao;
    }

    /**
     * Construtor padrão.
     */
    public Imovel() {
        super();
    }

    /**
     * Obtém o ano de construção do imóvel.
     * @return O ano de construção do imóvel.
     */
    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * Define o ano de construção do imóvel.
     * @param anoConstrucao O ano de construção do imóvel.
     */
    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    /**
     * Obtém a área do imóvel.
     * @return A área do imóvel.
     */
    public double getArea() {
        return area;
    }

    /**
     * Define a área do imóvel.
     * @param area A área do imóvel.
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Obtém a localização do imóvel.
     * @return A localização do imóvel.
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * Define a localização do imóvel.
     * @param localizacao A localização do imóvel.
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    // Métodos abstratos
    abstract String getTipo();
    abstract double getPreco();
    abstract void exibirDetalhes();
    abstract void reservar();
    abstract void vender();
}
