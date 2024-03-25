package principal;

/**
 * @author Joel António
 * @version 1.0
 * Classe principal que contém o método main para executar o programa da imobiliária.
 */
public class Main {

    /**
     * Método principal para iniciar o programa da imobiliária.
     * @param args Argumentos de linha de comando (não utilizado neste programa).
     */
    public static void main(String[] args) {
        // Criar objetos 
        Funcionario _funcionario = new Funcionario(1, "João", "Agência A", 3000.0);
        Cliente _cliente = new Cliente("Maria", "maria123", "senha123");
        Imovel _apartamento = new Apartamento("T2", 150000.0);
        Imovel _terreno = new Terreno(2000, 500.0, "Zona Rural", false, 50000.0);

        // Exibir informações iniciais
        System.out.println("Bem-vindo à Imobiliária CROCHE");
        System.out.println("------------------------------------------");

        // Simular algumas ações do sistema
        _funcionario.registrar();
        _cliente.registrar();
        _cliente.fazerReserva(_apartamento);
        _cliente.realizarCompra(_apartamento);
        _cliente.fazerReserva(_terreno);
        _cliente.realizarCompra(_terreno);

        // Finalizar programa
        System.out.println("------------------------------------------");
        System.out.println("Obrigado por utilizar a Imobiliária CROCHE");
    }
}
