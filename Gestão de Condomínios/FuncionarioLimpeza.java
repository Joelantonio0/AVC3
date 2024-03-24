/**
 * A classe FuncionarioLimpeza representa um funcionário responsável pela limpeza em um condomínio.
 * Herda da classe Funcionario e implementa a interface Funcionario_interface.
 * Além dos atributos herdados da classe Funcionario, possui uma especialidade.
 * 
 * @author Joel António
 * @version 1.0
 */
public class FuncionarioLimpeza extends Funcionario implements Funcionario_interface {
    private String especialidade; // Especialidade do funcionário de limpeza

    /**
     * Construtor para inicializar um objeto FuncionarioLimpeza com nome, função, salário e especialidade.
     * 
     * @param nome o nome do funcionário
     * @param funcao a função do funcionário
     * @param salario o salário do funcionário
     * @param especialidade a especialidade do funcionário de limpeza
     */
    public FuncionarioLimpeza(String nome, String funcao, double salario, String especialidade) {
        super(nome, funcao, salario);
        this.setEspecialidade(especialidade);
    }

    /**
     * Retorna a especialidade do funcionário de limpeza.
     * 
     * @return a especialidade do funcionário de limpeza
     */
    public String getEspecialidade() {
        return especialidade;
    }

    /**
     * Define a especialidade do funcionário de limpeza.
     * 
     * @param especialidade a nova especialidade do funcionário de limpeza
     */
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    /**
     * Implementação do método para receber o salário do funcionário.
     * 
     * @return uma mensagem indicando que o funcionário recebeu o salário
     */
    @Override
    public String receberSalario() {
        return "Funcionario Recebeu salario";
    }

    /**
     * Implementação do método para descrever o trabalho do funcionário de limpeza.
     * 
     * @return uma mensagem indicando o trabalho diário do funcionário de limpeza
     */
    @Override
    public String trabalhar() {
        return "Trabalhar todos os dias úteis do mês";
    }
}
