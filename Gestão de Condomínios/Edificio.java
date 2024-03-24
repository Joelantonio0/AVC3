/**
 * A classe Edificio representa um edifício dentro de um condomínio.
 * Contém informações como bloco, funcionários e apartamentos.
 * Implementa a interface Edificio_interface.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Edificio implements Edificio_interface {
    private String bloco; // Bloco do edifício
    private Funcionario[] funcionarios = null; // Funcionários do edifício
    private int quantidadeFuncionarios; // Quantidade de funcionários do edifício
    private Apartamento[] apartamentos = null; // Apartamentos do edifício

    /**
     * Construtor para inicializar um objeto Edificio com uma determinada quantidade de funcionários.
     * 
     * @param qtdFuncionarios a quantidade de funcionários do edifício
     */
    public Edificio(int qtdFuncionarios) {
        this.setQuantidadeFuncionarios(qtdFuncionarios);
        funcionarios = new Funcionario[this.quantidadeFuncionarios];
        apartamentos = new Apartamento[10]; // Inicialmente, cada edifício possui 10 apartamentos
    }

    /**
     * Retorna o bloco do edifício.
     * 
     * @return o bloco do edifício
     */
    public String getBloco() {
        return bloco;
    }

    /**
     * Define o bloco do edifício.
     * 
     * @param bloco o novo bloco do edifício
     */
    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    /**
     * Retorna a quantidade de funcionários do edifício.
     * 
     * @return a quantidade de funcionários do edifício
     */
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    /**
     * Define a quantidade de funcionários do edifício.
     * 
     * @param quantidadeFuncionarios a nova quantidade de funcionários do edifício
     */
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    /**
     * Retorna os funcionários do edifício.
     * 
     * @return os funcionários do edifício
     */
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    /**
     * Define os funcionários do edifício.
     * 
     * @param funcionarios os novos funcionários do edifício
     */
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

    /**
     * Retorna os apartamentos do edifício.
     * 
     * @return os apartamentos do edifício
     */
    public Apartamento[] getApartamentos() {
        return apartamentos;
    }

    /**
     * Define os apartamentos do edifício.
     * 
     * @param apartamentos os novos apartamentos do edifício
     */
    public void setApartamentos(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    /**
     * Método para cadastrar um novo funcionário no edifício.
     * 
     * @return true se o cadastro for bem-sucedido, false caso contrário
     */
    public boolean CadastrarFuncionario() {
        return true; // Implementação fictícia, não detalhada neste exemplo
    }

    /**
     * Implementação do método para realizar o pagamento mensal do apartamento.
     * 
     * @param apartamento o apartamento para o qual o pagamento será feito
     * @return uma mensagem indicando a cobrança do aluguel por cada apartamento
     */
    @Override
    public String pagamentoMensal(Apartamento apartamento) {
        return "Cobrar o aluguel por cada apartamento";
    }
}
