package Principal;

import java.util.Date;

/**
 * Classe que representa uma ordem de venda de títulos de participação.
 * Contém informações como o título a ser vendido, a quantidade, o valor transacionado e a data e hora da transação.
 * @author Joel António
 * @version 1.0
 */
public class OrdemVenda {
    private TituloParticipacao titulo; // Título de participação a ser vendido
    private int quantidade; // Quantidade de títulos a ser vendida
    private double valorTransacionado; // Valor transacionado na venda
    private Date dataHora; // Data e hora da transação

    /**
     * Construtor da classe OrdemVenda que inicializa os atributos.
     * @param titulo O título de participação a ser vendido.
     * @param quantidade A quantidade de títulos a ser vendida.
     * @param valorTransacionado O valor transacionado na venda.
     * @param dataHora A data e hora da transação.
     */
    public OrdemVenda(TituloParticipacao titulo, int quantidade, double valorTransacionado, Date dataHora) {
        this.titulo = titulo;
        this.quantidade = quantidade;
        this.valorTransacionado = valorTransacionado;
        this.dataHora = dataHora;
    }

    // Getters e Setters

    public TituloParticipacao getTitulo() {
        return titulo;
    }

    public void setTitulo(TituloParticipacao titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTransacionado() {
        return valorTransacionado;
    }

    public void setValorTransacionado(double valorTransacionado) {
        this.valorTransacionado = valorTransacionado;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
}
