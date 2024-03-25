package futebol;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma equipa de futebol.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Equipa {
    private String nome;
    private List<Jogador> jogadores;

    /**
     * Construtor que inicializa uma equipa de futebol.
     * 
     * @param nome O nome da equipa.
     */
    public Equipa(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // Getters e Setters
    
    /**
     * Obtém o nome da equipa.
     * 
     * @return O nome da equipa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da equipa.
     * 
     * @param nome O nome da equipa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a lista de jogadores da equipa.
     * 
     * @return A lista de jogadores da equipa.
     */
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    /**
     * Define a lista de jogadores da equipa.
     * 
     * @param jogadores A lista de jogadores da equipa.
     */
    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }


}
