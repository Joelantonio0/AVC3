package futebol;

/**
 * Classe que representa o resultado de um jogo de futebol.
 * Contém informações sobre gols marcados, cartões e outros detalhes do jogo.
 * @author Joel António
 * @version 1.0
 */
public class Resultado {
    private int golsTimeCasa; // Número de gols marcados pelo time da casa
    private int golsTimeVisitante; // Número de gols marcados pelo time visitante
    private int cartoesAmarelosTimeCasa; // Número de cartões amarelos recebidos pelo time da casa
    private int cartoesAmarelosTimeVisitante; // Número de cartões amarelos recebidos pelo time visitante
    private int cartoesVermelhosTimeCasa; // Número de cartões vermelhos recebidos pelo time da casa
    private int cartoesVermelhosTimeVisitante; // Número de cartões vermelhos recebidos pelo time visitante
    
    /**
     * Método para verificar se o jogo terminou em empate.
     * @return true se o jogo terminou em empate, false caso contrário.
     */
    public boolean isEmpate() {
        return golsTimeCasa == golsTimeVisitante;
    }
    
    /**
     * Método para verificar se o time da casa venceu o jogo.
     * @return true se o time da casa venceu, false caso contrário.
     */
    public boolean isVitoriaTimeCasa() {
        return golsTimeCasa > golsTimeVisitante;
    }
    
    /**
     * Método para verificar se o time visitante venceu o jogo.
     * @return true se o time visitante venceu, false caso contrário.
     */
    public boolean isVitoriaTimeVisitante() {
        return golsTimeVisitante > golsTimeCasa;
    }
    
    /**
     * Método para exibir o resultado do jogo.
     */
    public void exibirResultado() {
        System.out.println("Resultado: " + golsTimeCasa + " - " + golsTimeVisitante);
    }

    // Getters e Setters

    /**
     * Obtém o número de gols marcados pelo time da casa.
     * @return O número de gols marcados pelo time da casa.
     */
    public int getGolsTimeCasa() {
        return golsTimeCasa;
    }

    /**
     * Define o número de gols marcados pelo time da casa.
     * @param golsTimeCasa O número de gols marcados pelo time da casa.
     */
    public void setGolsTimeCasa(int golsTimeCasa) {
        this.golsTimeCasa = golsTimeCasa;
    }

    /**
     * Obtém o número de gols marcados pelo time visitante.
     * @return O número de gols marcados pelo time visitante.
     */
    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    /**
     * Define o número de gols marcados pelo time visitante.
     * @param golsTimeVisitante O número de gols marcados pelo time visitante.
     */
    public void setGolsTimeVisitante(int golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    /**
     * Obtém o número de cartões amarelos recebidos pelo time da casa.
     * @return O número de cartões amarelos recebidos pelo time da casa.
     */
    public int getCartoesAmarelosTimeCasa() {
        return cartoesAmarelosTimeCasa;
    }

    /**
     * Define o número de cartões amarelos recebidos pelo time da casa.
     * @param cartoesAmarelosTimeCasa O número de cartões amarelos recebidos pelo time da casa.
     */
    public void setCartoesAmarelosTimeCasa(int cartoesAmarelosTimeCasa) {
        this.cartoesAmarelosTimeCasa = cartoesAmarelosTimeCasa;
    }

    /**
     * Obtém o número de cartões amarelos recebidos pelo time visitante.
     * @return O número de cartões amarelos recebidos pelo time visitante.
     */
    public int getCartoesAmarelosTimeVisitante() {
        return cartoesAmarelosTimeVisitante;
    }

    /**
     * Define o número de cartões amarelos recebidos pelo time visitante.
     * @param cartoesAmarelosTimeVisitante O número de cartões amarelos recebidos pelo time visitante.
     */
    public void setCartoesAmarelosTimeVisitante(int cartoesAmarelosTimeVisitante) {
        this.cartoesAmarelosTimeVisitante = cartoesAmarelosTimeVisitante;
    }

    /**
     * Obtém o número de cartões vermelhos recebidos pelo time da casa.
     * @return O número de cartões vermelhos recebidos pelo time da casa.
     */
    public int getCartoesVermelhosTimeCasa() {
        return cartoesVermelhosTimeCasa;
    }

    /**
     * Define o número de cartões vermelhos recebidos pelo time da casa.
     * @param cartoesVermelhosTimeCasa O número de cartões vermelhos recebidos pelo time da casa.
     */
    public void setCartoesVermelhosTimeCasa(int cartoesVermelhosTimeCasa) {
        this.cartoesVermelhosTimeCasa = cartoesVermelhosTimeCasa;
    }

    /**
     * Obtém o número de cartões vermelhos recebidos pelo time visitante.
     * @return O número de cartões vermelhos recebidos pelo time visitante.
	*/
    public int getCartoesVermelhosTimeVisitante() {
        return cartoesVermelhosTimeVisitante;
    }
    /**
     * Define o número de cartões vermelhos recebidos pelo time visitante.
     * @param cartoesVermelhosTimeCasa O número de cartões vermelhos recebidos pelo time visitante.
     */
    public void setCartoesVermelhosTimeVisitante(int cartoesVermelhosTimeVisitante) {
        this.cartoesVermelhosTimeVisitante = cartoesVermelhosTimeVisitante;
    }
}
