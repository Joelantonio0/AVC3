package Principal;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa uma carteira de investimentos de um cliente.
 * A carteira contém uma lista de títulos de participação.
 * @author Joel António
 * @version 1.0
 */
public class Carteira {
    private List<TituloParticipacao> titulos; // Lista de títulos na carteira

    /**
     * Construtor padrão da classe Carteira que inicializa a lista de títulos.
     */
    public Carteira() {
        this.titulos = new ArrayList<>();
    }

    /**
     * Construtor da classe Carteira que inicializa a lista de títulos com uma lista fornecida.
     * @param titulos Lista de títulos para inicializar a carteira.
     */
    public Carteira(List<TituloParticipacao> titulos) {
        this.titulos = titulos;
    }

    // Getters e Setters

    public List<TituloParticipacao> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<TituloParticipacao> titulos) {
        this.titulos = titulos;
    }

    /**
     * Método para adicionar um título à carteira com uma determinada quantidade.
     * @param titulo O título a ser adicionado.
     * @param quantidade A quantidade do título a ser adicionada.
     */
    public void adicionarTitulo(TituloParticipacao titulo, int quantidade) {
        // Lógica para adicionar um título à carteira com a quantidade especificada
    }

    /**
     * Método para remover um título da carteira com uma determinada quantidade.
     * @param titulo O título a ser removido.
     * @param quantidade A quantidade do título a ser removida.
     */
    public void removerTitulo(TituloParticipacao titulo, int quantidade) {
        // Lógica para remover um título da carteira com a quantidade especificada
    }

    /**
     * Método para calcular o valor total da carteira somando os valores faciais de todos os títulos.
     * @return O valor total da carteira.
     */
    public double calcularValorTotal() {
        // Lógica para calcular o valor total da carteira somando os valores faciais de todos os títulos
        return 0.0;
    }
}
