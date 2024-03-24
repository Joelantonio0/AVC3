/**
 * A classe Funcionario é uma classe abstrata que representa um funcionário de um condomínio.
 * Contém informações como nome, função, idade, salário, morada e género.
 * 
 * Nota: Esta classe é abstrata e não pode ser instanciada diretamente.
 * 
 * @author Joel António
 * @version 1.0
 */
public abstract class Funcionario {
    private String nome; // Nome do funcionário
    private String funcao; // Função do funcionário
    private int idade; // Idade do funcionário
    private double salario; // Salário do funcionário
    private String morada; // Morada do funcionário
    private String genero; // Género do funcionário

    /**
     * Construtor para inicializar um objeto Funcionario com nome, função e salário.
     * 
     * @param nome o nome do funcionário
     * @param funcao a função do funcionário
     * @param salario o salário do funcionário
     */
    public Funcionario(String nome, String funcao, double salario) {
        this.setNome(nome);
        this.setFuncao(funcao);
        this.setSalario(salario);
    }

    /**
     * Retorna o nome do funcionário.
     * 
     * @return o nome do funcionário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionário.
     * 
     * @param nome o novo nome do funcionário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a morada do funcionário.
     * 
     * @return a morada do funcionário
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Define a morada do funcionário.
     * 
     * @param morada a nova morada do funcionário
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Retorna a idade do funcionário.
     * 
     * @return a idade do funcionário
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do funcionário.
     * 
     * @param idade a nova idade do funcionário
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Retorna o género do funcionário.
     * 
     * @return o género do funcionário
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Define o género do funcionário.
     * 
     * @param genero o novo género do funcionário
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Retorna o salário do funcionário.
     * 
     * @return o salário do funcionário
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do funcionário.
     * 
     * @param salario o novo salário do funcionário
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Retorna a função do funcionário.
     * 
     * @return a função do funcionário
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * Define a função do funcionário.
     * 
     * @param funcao a nova função do funcionário
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
