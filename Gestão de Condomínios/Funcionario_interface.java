/**
 * A interface Funcionario_interface define os métodos necessários para funcionários.
 * Esses métodos incluem receber salário e descrever o trabalho.
 * 
 * @author Joel António
 * @version 1.0
 */
public interface Funcionario_interface {
    /**
     * Método para receber o salário do funcionário.
     * 
     * @return uma mensagem indicando que o funcionário recebeu o salário
     */
    public String receberSalario();

    /**
     * Método para descrever o trabalho do funcionário.
     * 
     * @return uma mensagem indicando o trabalho do funcionário
     */
    public String trabalhar();
}
