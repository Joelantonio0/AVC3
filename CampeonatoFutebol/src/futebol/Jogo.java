package futebol;

import java.util.Date;

/**
 * Classe que representa um jogo de futebol.
 * @author Joel António
 * @version 1.0
 */
public class Jogo {
    private Date data;
    private Equipa equipaCasa;
    private Equipa equipaVisitante;
    private int golosCasa;
    private int golosVisitante;

    /**
     * Construtor que inicializa um jogo de futebol.
     * @param data A data do jogo.
     * @param equipaCasa A equipa da casa.
     * @param equipaVisitante A equipa visitante.
     */
    public Jogo(Date data, Equipa equipaCasa, Equipa equipaVisitante) {
        this.data = data;
        this.equipaCasa = equipaCasa;
        this.equipaVisitante = equipaVisitante;
    }

    // Getters e Setters

    /**
     * Obtém a data do jogo.
     * @return A data do jogo.
     */
    public Date getData() {
        return data;
    }

    /**
     * Define a data do jogo.
     * @param data A data do jogo.
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Obtém a equipa da casa.
     * @return A equipa da casa.
     */
    public Equipa getEquipaCasa() {
        return equipaCasa;
    }

    /**
     * Define a equipa da casa.
     * @param equipaCasa A equipa da casa.
     */
    public void setEquipaCasa(Equipa equipaCasa) {
        this.equipaCasa = equipaCasa;
    }

    /**
     * Obtém a equipa visitante.
     * @return A equipa visitante.
     */
    public Equipa getEquipaVisitante() {
        return equipaVisitante;
    }

    /**
     * Define a equipa visitante.
     * @param equipaVisitante A equipa visitante.
     */
    public void setEquipaVisitante(Equipa equipaVisitante) {
        this.equipaVisitante = equipaVisitante;
    }

    /**
     * Obtém o número de golos marcados pela equipa da casa.
     * @return O número de golos marcados pela equipa da casa.
     */
    public int getGolosCasa() {
        return golosCasa;
    }

    /**
     * Define o número de golos marcados pela equipa da casa.
     * @param golosCasa O número de golos marcados pela equipa da casa.
     */
    public void setGolosCasa(int golosCasa) {
        this.golosCasa = golosCasa;
    }

    /**
     * Obtém o número de golos marcados pela equipa visitante.
     * @return O número de golos marcados pela equipa visitante.
     */
    public int getGolosVisitante() {
        return golosVisitante;
    }

    /**
     * Define o número de golos marcados pela equipa visitante.
     * @param golosVisitante O número de golos marcados pela equipa visitante.
     */
    public void setGolosVisitante(int golosVisitante) {
        this.golosVisitante = golosVisitante;
    }


}
