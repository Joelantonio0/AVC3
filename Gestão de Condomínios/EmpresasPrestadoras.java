/**
 * A classe EmpresasPrestadoras representa uma empresa que presta serviços para um condomínio.
 * Possui um atributo para armazenar o nome da empresa.
 * 
 * @author Joel António
 * @version 1.0
 */
public class EmpresasPrestadoras {
    private String nome; // Nome da empresa prestadora de serviços

    /**
     * Construtor padrão para inicializar uma instância de EmpresasPrestadoras.
     */
    public EmpresasPrestadoras() {

    }

    /**
     * Retorna o nome da empresa prestadora de serviços.
     * 
     * @return o nome da empresa prestadora de serviços
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da empresa prestadora de serviços.
     * 
     * @param nome o novo nome da empresa prestadora de serviços
     */
    public void setNome(String nome) {
        this.nome = nome;
    }   
}
