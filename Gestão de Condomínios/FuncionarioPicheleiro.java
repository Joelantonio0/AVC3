/**
 * A classe FuncionarioPicheleiro representa um funcionário responsável pela manutenção de canalizações em um condomínio.
 * Herda da classe Funcionario e implementa a interface Funcionario_interface.
 * Além dos atributos herdados da classe Funcionario, possui especialidades em canalizações.
 * 
 * @author Joel António
 * @version 1.0
 */
public class FuncionarioPicheleiro extends Funcionario implements Funcionario_interface {
    private String especialidadesPicha; // Especialidades em canalizações do funcionário picheleiro

    /**
     * Construtor para inicializar um objeto FuncionarioPicheleiro com nome, função, salário e especialidades em canalizações.
     * 
     * @param nome o nome do funcionário
     * @param funcao a função do funcionário
     * @param salario o salário do funcionário
     * @param especialidadesPicha as especialidades em canalizações do funcionário picheleiro
     */
    public FuncionarioPicheleiro(String nome, String funcao, double salario, String especialidadesPicha) {
        super(nome, funcao, salario);
        this.setEspecialidadesPicha(especialidadesPicha);
    }

    /**
     * Retorna as especialidades em canalizações do funcionário picheleiro.
     * 
     * @return as especialidades em canalizações do funcionário picheleiro
     */
    public String getEspecialidadesPicha() {
        return especialidadesPicha;
    }

    /**
     * Define as especialidades em canalizações do funcionário picheleiro.
     * 
     * @param especialidadesPicha as novas especialidades em canalizações do funcionário picheleiro
     */
    public void setEspecialidadesPicha(String especialidadesPicha) {
        this.especialidadesPicha = especialidadesPicha;
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
     * Implementação do método para descrever o trabalho do funcionário picheleiro.
     * 
     * @return uma mensagem indicando o trabalho diário do funcionário picheleiro
     */
    @Override
    public String trabalhar() {
        return "Trabalhar todos os dias úteis do mês";
    }
}
