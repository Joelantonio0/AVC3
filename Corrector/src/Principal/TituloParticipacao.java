package Principal;

import java.util.Date;

/**
 * Classe que representa um Título de Participação na firma de investimentos.
 * Um título de participação pode ser uma ação ou uma obrigação e está associado a uma empresa.
 * @author Joel António
 * @version 1.0
 */
public class TituloParticipacao {
    private String designacao; // Designação do título
    private Date dataEmissao; // Data de emissão do título
    private double valorFacial; // Valor facial do título
    private String tipo; // Tipo do título (ação ou obrigação)
    private String empresaAssociada; // Empresa associada ao título

    /**
     * Construtor da classe TituloParticipacao que inicializa todas as propriedades.
     * @param designacao Designação do título.
     * @param dataEmissao Data de emissão do título.
     * @param valorFacial Valor facial do título.
     * @param tipo Tipo do título (ação ou obrigação).
     * @param empresaAssociada Empresa associada ao título.
     */
    public TituloParticipacao(String designacao, Date dataEmissao, double valorFacial, String tipo,
            String empresaAssociada) {
        this.designacao = designacao;
        this.dataEmissao = dataEmissao;
        this.valorFacial = valorFacial;
        this.tipo = tipo;
        this.empresaAssociada = empresaAssociada;
    }

    /**
     * Construtor padrão da classe TituloParticipacao.
     */
    public TituloParticipacao() {
    }

    // Getters e Setters

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorFacial() {
        return valorFacial;
    }

    public void setValorFacial(double valorFacial) {
        this.valorFacial = valorFacial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpresaAssociada() {
        return empresaAssociada;
    }

    public void setEmpresaAssociada(String empresaAssociada) {
        this.empresaAssociada = empresaAssociada;
    }
}
