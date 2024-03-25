package Principal;

import java.util.Date;

/**
 * Classe principal que contém o método main para simular o funcionamento do sistema de investimentos.
 * @author Joel António
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que contém as simulações do sistema de investimentos.
     * @param args Os argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) {
        // Criando um corretor
        Corretor corretor = new Corretor();
        corretor.setNumero(1);
        corretor.setNome("João");
        corretor.setDataAdmissao(new Date());
        corretor.setTelefone("123456789");
        corretor.setSalarioBase(2000);

        // Criando um cliente
        Cliente cliente = new Cliente();
        cliente.setNumero(1);
        cliente.setNome("Maria");
        cliente.setTelefone("987654321");

        // Criando títulos de participação
        TituloParticipacao acao = new TituloParticipacao();
        acao.setDesignacao("Ação A");
        acao.setDataEmissao(new Date());
        acao.setValorFacial(100.0);
        acao.setTipo("Ação");
        acao.setEmpresaAssociada("Empresa X");

        TituloParticipacao obrigacao = new TituloParticipacao();
        obrigacao.setDesignacao("Obrigação B");
        obrigacao.setDataEmissao(new Date());
        obrigacao.setValorFacial(50.0);
        obrigacao.setTipo("Obrigação");
        obrigacao.setEmpresaAssociada("Empresa Y");

        // Criando uma carteira para o cliente e adicionando títulos
        Carteira carteiraCliente = new Carteira();
        carteiraCliente.adicionarTitulo(acao, 10);
        carteiraCliente.adicionarTitulo(obrigacao, 20);
        cliente.setCarteiraInvestimentos(carteiraCliente);

        // Simulando uma transação: cliente compra ações
        cliente.comprarTitulos(acao, 5, 110.0, new Date());

        // Simulando uma transação: cliente vende obrigações
        cliente.venderTitulos(obrigacao, 10, 55.0, new Date());

        // Simulando uma transação: corretor emite ordem de compra
        corretor.emitirOrdemCompra(acao, 3, 105.0, new Date());

        // Simulando uma transação: corretor emite ordem de venda
        corretor.emitirOrdemVenda(obrigacao, 5, 48.0, new Date());
    }
}
