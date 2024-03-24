/**
 * A classe Morador representa um indivíduo que reside em uma determinada residência.
 * Cada morador possui um nome, idade e pertence a uma família.
 * Esta classe permite acessar e modificar os atributos do morador.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Morador {
    private String nome; // O nome do morador
    private int idade; // A idade do morador
    private String nomeDaFamilia; // O nome da família à qual o morador pertence

    /**
     * Cria um novo objeto Morador com o nome e o nome da família fornecidos.
     * A idade do morador é inicializada como 0 por padrão.
     * 
     * @param nome o nome do morador
     * @param nomeDaFamilia o nome da família do morador
     */
    public Morador(String nome, String nomeDaFamilia) {
        this.nome = nome;
        this.nomeDaFamilia = nomeDaFamilia;
    }

    /**
     * Retorna o nome do morador.
     * 
     * @return o nome do morador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do morador.
     * 
     * @param nome o novo nome do morador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a idade do morador.
     * 
     * @return a idade do morador
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do morador.
     * 
     * @param idade a nova idade do morador
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Retorna o nome da família do morador.
     * 
     * @return o nome da família do morador
     */
    public String getNomeDaFamilia() {
        return nomeDaFamilia;
    }

    /**
     * Define o nome da família do morador.
     * 
     * @param nomeDaFamilia o novo nome da família do morador
     */
    public void setNomeDaFamilia(String nomeDaFamilia) {
        this.nomeDaFamilia = nomeDaFamilia;
    }
}

