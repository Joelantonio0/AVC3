/**
 * A classe FuncionarioJardineiro representa um funcionário responsável pela jardinagem em um condomínio.
 * Herda da classe Funcionario e implementa a interface Funcionario_interface.
 * Além dos atributos herdados da classe Funcionario, possui uma especialidade em plantas.
 * 
 * @author Joel António
 * @version 1.0
 */
public class FuncionarioJardineiro extends Funcionario implements Funcionario_interface {
    private String especialidadePlantas; // Especialidade em plantas do funcionário jardineiro

    /**
     * Construtor para inicializar um objeto FuncionarioJardineiro com nome, função, salário e especialidade em plantas.
     * 
     * @param nome o nome do funcionário
     * @param funcao a função do funcionário
     * @param salario o salário do funcionário
     * @param especialidadePlantas a especialidade em plantas do funcionário jardineiro
     */
    public FuncionarioJardineiro(String nome, String funcao, double salario, String especialidadePlantas) {
        super(nome, funcao, salario);
        this.setEspecialidadePlantas(especialidadePlantas);
    }

    /**
     * Retorna a especialidade em plantas do funcionário jardineiro.
     * 
     * @return a especialidade em plantas do funcionário jardineiro
     */
    public String getEspecialidadePlantas() {
        return especialidadePlantas;
    }

    /**
     * Define a especialidade em plantas do funcionário jardineiro.
     * 
     * @param especialidadePlantas a nova especialidade em plantas do funcionário jardineiro
     */
    public void setEspecialidadePlantas(String especialidadePlantas) {
        this.especialidadePlantas = especialidadePlantas;
    }

    /**
     * Implementação do método para receber o salário do funcionário.
     * 
     * @return uma mensagem indicando que o funcionário recebeu o salário
     */
    @Override
    public String receberSalario() {
        return "Funcionário recebeu salario";
    }

    /**
     * Implementação do método para descrever o trabalho do funcionário jardineiro.
     * 
     * @return uma mensagem indicando o trabalho diário do funcionário jardineiro
     */
    @Override
    public String trabalhar() {
        return "Trabalhar todos os dias úteis do mês";
    }
}
