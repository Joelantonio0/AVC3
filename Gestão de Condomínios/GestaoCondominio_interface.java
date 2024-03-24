/**
 * A interface GestaoCondominio_interface define os métodos necessários para a gestão e administração de condomínios.
 * Esses métodos incluem a geração de balancete, cobrança de quotas e geração de relatórios de contas.
 * 
 * @author Joel António
 * @version 1.0
 */
public interface GestaoCondominio_interface {
    /**
     * Gera o balancete do condomínio.
     * 
     * @param condominio o condomínio para o qual o balancete será gerado
     * @return uma mensagem indicando a geração do balancete por condomínio
     */
    public String gerarBalancete(Condominio condominio);

    /**
     * Cobra as quotas do condomínio.
     * 
     * @param condominio o condomínio para o qual as quotas serão cobradas
     * @return uma mensagem indicando a cobrança de quotas
     */
    public String cobrarQuotas(Condominio condominio);

    /**
     * Gera o relatório de contas do edifício.
     * 
     * @param edificio o edifício para o qual o relatório será gerado
     * @return uma mensagem indicando a geração do relatório de contas do edifício
     */
    public String gerarRelatorioDeContas(Edificio edificio);
}
