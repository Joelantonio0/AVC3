/**
 * A classe Condominio representa um conjunto de edifícios localizados em uma determinada área.
 * Possui atributos como nome, localidade, quantidade de edifícios e empresas prestadoras de serviços.
 * Esta classe implementa a interface Condominio_interface.
 * 
 * @author [Nome do Autor]
 * @version 1.0
 */
public class Condominio implements Condominio_interface {
    private Edificio[] edificios = null; // Array de edifícios que compõem o condomínio
    private String nome; // Nome do condomínio
    private String localidade; // Localização do condomínio
    private int quantidadeEdificios; // Quantidade de edifícios no condomínio
    private EmpresasPrestadoras[] empresasPrestadoras = new EmpresasPrestadoras[3]; // Empresas prestadoras de serviços no condomínio

    /**
     * Construtor para inicializar um objeto Condominio com uma determinada quantidade de edifícios.
     * 
     * @param qtdEdificios a quantidade de edifícios no condomínio
     */
    public Condominio(int qtdEdificios) {
        this.setQuantidadeEdificios(qtdEdificios);
        edificios = new Edificio[this.getQuantidadeEdificios()];
    }

    /**
     * Define os edifícios que compõem o condomínio.
     * 
     * @param edificios array de edifícios do condomínio
     */
    public void setEdificios(Edificio[] edificios) {
        this.edificios = edificios;
    }

    /**
     * Retorna os edifícios do condomínio.
     * 
     * @return os edifícios do condomínio
     */
    public Edificio[] getEdificios() {
        return edificios;
    }

    /**
     * Retorna o nome do condomínio.
     * 
     * @return o nome do condomínio
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do condomínio.
     * 
     * @param nome o novo nome do condomínio
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a localidade do condomínio.
     * 
     * @return a localidade do condomínio
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * Define a localidade do condomínio.
     * 
     * @param localidade a nova localidade do condomínio
     */
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    /**
     * Retorna a quantidade de edifícios do condomínio.
     * 
     * @return a quantidade de edifícios do condomínio
     */
    public int getQuantidadeEdificios() {
        return quantidadeEdificios;
    }

    /**
     * Define a quantidade de edifícios do condomínio.
     * 
     * @param quantidadeEdificios a nova quantidade de edifícios do condomínio
     */
    public void setQuantidadeEdificios(int quantidadeEdificios) {
        this.quantidadeEdificios = quantidadeEdificios;
    }

    /**
     * Retorna as empresas prestadoras de serviços do condomínio.
     * 
     * @return as empresas prestadoras de serviços do condomínio
     */
    public EmpresasPrestadoras[] getEmpresasPrestadoras() {
        return empresasPrestadoras;
    }

    /**
     * Define as empresas prestadoras de serviços do condomínio.
     * 
     * @param empresasPrestadoras as novas empresas prestadoras de serviços do condomínio
     */
    public void setEmpresasPrestadoras(EmpresasPrestadoras[] empresasPrestadoras) {
        this.empresasPrestadoras = empresasPrestadoras;
    }

    /**
     * Implementação do método para pagar o salário de um funcionário.
     * 
     * @param funcionario o funcionário a ser pago
     * @return uma mensagem indicando que o salário foi pago na hora certa
     */
    @Override
    public String pagarSalario(Funcionario funcionario) {
        return "Salario pago na hora certa";
    }

    /**
     * Implementação do método para pagar a quota do condomínio.
     * 
     * @return uma mensagem indicando que a quota foi paga
     */
    @Override
    public String pagarQuota() {
        return "Pagar quota";
    }
}
