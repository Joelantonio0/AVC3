package Principal;

import java.util.Date;
import java.util.List;

/**
 * Classe que representa um corretor da firma de investimentos.
 * Possui informações como número, nome, data de admissão, data de rescisão, telefone,
 * salário base e comissão mensal.
 */
public class Corretor {
    private int numero; // Número do corretor
    private String nome; // Nome do corretor
    private Date dataAdmissao; // Data de admissão do corretor
    private Date dataRescisao; // Data de rescisão do corretor
    private String telefone; // Telefone do corretor
    private double salarioBase; // Salário base do corretor
    private double comissaoMensal; // Comissão mensal do corretor
    
    /**
     * Construtor da classe Corretor que inicializa os atributos.
     * @param numero Número do corretor.
     * @param nome Nome do corretor.
     * @param dataAdmissao Data de admissão do corretor.
     * @param dataRescisao Data de rescisão do corretor.
     * @param telefone Telefone do corretor.
     * @param salarioBase Salário base do corretor.
     * @param comissaoMensal Comissão mensal do corretor.
     */
    public Corretor(int numero, String nome, Date dataAdmissao, Date dataRescisao, String telefone, double salarioBase,
            double comissaoMensal) {
        this.numero = numero;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.dataRescisao = dataRescisao;
        this.telefone = telefone;
        this.salarioBase = salarioBase;
        this.comissaoMensal = comissaoMensal;
    }

    // Getters e Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataRescisao() {
        return dataRescisao;
    }

    public void setDataRescisao(Date dataRescisao) {
        this.dataRescisao = dataRescisao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissaoMensal() {
        return comissaoMensal;
    }

    public void setComissaoMensal(double comissaoMensal) {
        this.comissaoMensal = comissaoMensal;
    }

    /**
     * Método para calcular a comissão mensal do corretor com base no aumento da carteira.
     * @param aumentoCarteira O aumento da carteira do corretor.
     * @return O valor da comissão mensal.
     */
    public double calcularComissaoMensal(double aumentoCarteira) {
        return aumentoCarteira * 0.01; // 1% do aumento da carteira
    }

    /**
     * Método para gerenciar as carteiras dos clientes.
     * @param carteiras Lista de carteiras dos clientes.
     */
    public void gerenciarCarteiras(List<Carteira> carteiras) {
        // Lógica para gerenciar as carteiras dos clientes
    }

    /**
     * Método para emitir uma ordem de compra de títulos de participação.
     * @param titulo O título de participação a ser comprado.
     * @param quantidade A quantidade de títulos a ser comprada.
     * @param valorTransacionado O valor transacionado na compra.
     * @param dataHora A data e hora da transação.
     */
    public void emitirOrdemCompra(TituloParticipacao titulo, int quantidade, double valorTransacionado, Date dataHora) {
        // Lógica para emitir uma ordem de compra
    }

    /**
     * Método para emitir uma ordem de venda de títulos de participação.
     * @param titulo O título de participação a ser vendido.
     * @param quantidade A quantidade de títulos a ser vendida.
     * @param valorTransacionado O valor transacionado na venda.
     * @param dataHora A data e hora da transação.
     */
    public void emitirOrdemVenda(TituloParticipacao titulo, int quantidade, double valorTransacionado, Date dataHora) {
        // Lógica para emitir uma ordem de venda
    }
    public Corretor() {
    	
    }
    /**
     * Método para depositar um montante na conta corrente do corretor.
     * @param montante Quantia a depositar
     * 
     */
    public void depositarMontante(double montante) {
        // Lógica para depositar um montante na conta corrente
    }

    /**
     * Método para levantar um montante na conta corrente do corretor.
     * @param montante Quantia a levantar
     * 
     */
    public void levantarMontante(double montante) {
        // Lógica para levantar um montante da conta corrente
    }
}
