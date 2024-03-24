/**
 * A classe GestaoCondominio é responsável pela gestão e administração de condomínios.
 * Implementa a interface GestaoCondominio_interface.
 * Possui métodos para gerar balancetes, cobrar quotas, gerar relatórios de contas e operações de manipulação de condomínios.
 * 
 * @author Joel António
 * @version 1.0
 */
public class GestaoCondominio implements GestaoCondominio_interface {
    private Condominio[] condominio; // Array de condomínios

    /**
     * Construtor padrão para inicializar um objeto GestaoCondominio.
     */
    public GestaoCondominio() {
        
    }

    /**
     * Método para gerar o balancete do condomínio.
     * 
     * @param condominio o condomínio para o qual o balancete será gerado
     * @return uma mensagem indicando a geração do balancete por condomínio
     */
    @Override
    public String gerarBalancete(Condominio condominio) {
        return "Gerar balancetes por condominio";
    }

    /**
     * Método para cobrar as quotas do condomínio.
     * 
     * @param condominio o condomínio para o qual as quotas serão cobradas
     * @return uma mensagem indicando a cobrança de quotas
     */
    @Override
    public String cobrarQuotas(Condominio condominio) {
        return "Cobrar Quotas";
    }

    /**
     * Método para gerar o relatório de contas de um edifício.
     * 
     * @param edificio o edifício para o qual o relatório será gerado
     * @return uma mensagem indicando a geração do relatório de contas do edifício
     */
    @Override
    public String gerarRelatorioDeContas(Edificio edificio) {
        return "Gerar Relatórios de Contas de Cada Edifício";
    }

    /**
     * Método para criar um novo condomínio.
     * 
     * @return uma mensagem indicando a criação do condomínio
     */
    public String CriarCondominio() {
        return "Criar condominio";
    }

    /**
     * Método para eliminar um condomínio existente.
     * 
     * @return uma mensagem indicando a eliminação do condomínio
     */
    public String eliminarCondominio() {
        return "Eliminar condomínio";
    }

    /**
     * Método para alterar informações de um condomínio.
     * 
     * @return uma mensagem indicando a alteração do condomínio
     */
    public String alterarCondominio() {
        return "Alterar Condomínio";
    }

    /**
     * Método para visualizar informações de um condomínio pelo nome.
     * 
     * @param nome o nome do condomínio a ser visualizado
     * @return uma mensagem indicando a visualização do condomínio
     */
    public String verCondominio(String nome) {
        return "Ver condominio";
    }

    /**
     * Retorna os condomínios gerenciados pela classe.
     * 
     * @return os condomínios gerenciados
     */
    public Condominio[] getCondominio() {
        return condominio;
    }

    /**
     * Define os condomínios gerenciados pela classe.
     * 
     * @param condominio os novos condomínios gerenciados
     */
    public void setCondominio(Condominio[] condominio) {
        this.condominio = condominio;
    }
}
