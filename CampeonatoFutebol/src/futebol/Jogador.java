package futebol;

import java.util.List;

/**
 * Classe que representa um jogador de futebol.
 * @author Joel António
 * @version 1.0
 */
public class Jogador {
    private String nome;
    private int numero;
    private String posicao;
    private List<String> estatisticas;

    /**
     * Construtor que inicializa um jogador de futebol.
     * @param nome O nome do jogador.
     * @param numero O número do jogador.
     * @param posicao A posição do jogador em campo.
     */
    public Jogador(String nome, int numero, String posicao) {
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    // Getters e Setters

    /**
     * Obtém o nome do jogador.
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do jogador.
     * @param nome O nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o número do jogador.
     * @return O número do jogador.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do jogador.
     * @param numero O número do jogador.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém a posição do jogador em campo.
     * @return A posição do jogador em campo.
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * Define a posição do jogador em campo.
     * @param posicao A posição do jogador em campo.
     */
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    /**
     * Obtém as estatísticas do jogador.
     * @return A lista de estatísticas do jogador.
     */
    public List<String> getEstatisticas() {
        return estatisticas;
    }

    /**
     * Define as estatísticas do jogador.
     * @param estatisticas A lista de estatísticas do jogador.
     */
    public void setEstatisticas(List<String> estatisticas) {
        this.estatisticas = estatisticas;
    }

    // Outros métodos

}
