package futebol;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma seleção de futebol.
 * @author Joel António
 * @version 1.0
 */
public class Selecao {
    private String nome;
    private List<Jogador> jogadores;

    /**
     * Construtor que inicializa uma seleção de futebol.
     * @param nome O nome da seleção.
     */
    public Selecao(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // Getters e Setters

    /**
     * Obtém o nome da seleção.
     * @return O nome da seleção.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da seleção.
     * @param nome O nome da seleção.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a lista de jogadores da seleção.
     * @return A lista de jogadores da seleção.
     */
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    /**
     * Define a lista de jogadores da seleção.
     * @param jogadores A lista de jogadores da seleção.
     */
    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    

}
