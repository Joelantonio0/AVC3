/**
 * A classe Apartamento representa uma unidade habitacional dentro de um edifício.
 * Possui informações sobre os moradores e o número do apartamento.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Apartamento {
    private Morador[] moradores = new Morador[10]; // Array de moradores do apartamento
    private int numApartamento; // Número do apartamento

    /**
     * Construtor padrão para inicializar um objeto Apartamento.
     */
    public Apartamento() {

    }

    /**
     * Retorna os moradores do apartamento.
     * 
     * @return os moradores do apartamento
     */
    public Morador[] getMoradores() {
        return moradores;
    }

    /**
     * Define os moradores do apartamento.
     * 
     * @param moradores os novos moradores do apartamento
     */
    public void setMoradores(Morador[] moradores) {
        this.moradores = moradores;
    }

    /**
     * Retorna o número do apartamento.
     * 
     * @return o número do apartamento
     */
    public int getNumApartamento() {
        return numApartamento;
    }

    /**
     * Define o número do apartamento.
     * 
     * @param numApartamento o novo número do apartamento
     */
    public void setNumApartamento(int numApartamento) {
        this.numApartamento = numApartamento;
    }

    /**
     * Método para inserir moradores no apartamento.
     * 
     * @return uma mensagem indicando a adição de um morador no apartamento
     */
    public String inserirMoradores() {
        return "Morador adicionado em apartamento";
    }
}
