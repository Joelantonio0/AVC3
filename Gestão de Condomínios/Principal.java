/**
 * A classe Principal contém o método main e é responsável por inicializar e configurar o sistema de condomínio.
 * Ela cria funcionários, moradores, condomínios e edifícios, e os associa adequadamente.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        // Criação e inicialização dos funcionários
        Funcionario[] funcionario = new Funcionario[10];
        funcionario[0] = new FuncionarioJardineiro("Pedro Ramos", "Jardineiro", 120000, "Flores");
        funcionario[1] = new FuncionarioLimpeza("Dalerio King", "Limpeza", 130000, "Chão e Casa de Banho");
        funcionario[2] = new FuncionarioPicheleiro("Da Rosa Belê", "Picheleiro", 110000, "Picheleiro");
        funcionario[3] = new FuncionarioJardineiro("Ramos João", "Jardineiro", 120000, "Flores");
        funcionario[4] = new FuncionarioLimpeza("King Padrão", "Limpeza", 130000, "Chão e Casa de Banho");
        funcionario[5] = new FuncionarioPicheleiro("Beleza Dois", "Picheleiro", 110000, "Picheleiro");
        funcionario[6] = new FuncionarioJardineiro("Pablo Marçal", "Jardineiro", 120000, "Flores");
        funcionario[7] = new FuncionarioLimpeza("Victória Campos", "Limpeza", 130000, "Chão e Casa de Banho");
        funcionario[8] = new FuncionarioPicheleiro("Zlatan Ibrahimovic", "Picheleiro", 110000, "Picheleiro");
        funcionario[9] = new FuncionarioJardineiro("Cristiano Ronaldo", "Jardineiro", 120000, "Flores");

        // Criação e inicialização dos moradores
        Morador[] morador = new Morador[15];
        morador[0] = new Morador("Antonio Zongo", "Zongo");
        morador[1] = new Morador("Pedro Zongo", "Zongo");
        // Os demais moradores são adicionados da mesma maneira

        // Criação e inicialização dos condomínios
        Condominio[] condominios = new Condominio[3];
        condominios[0] = new Condominio(2);
        condominios[1] = new Condominio(3);
        condominios[2] = new Condominio(2);

        // Criação e inicialização dos edifícios
        Edificio[] edificios1 = new Edificio[2];
        edificios1[0] = new Edificio(2);
        edificios1[1] = new Edificio(1);
        // Os demais edifícios são adicionados da mesma maneira

        // Configuração dos edifícios nos condomínios
        condominios[0].setEdificios(edificios1);
        // Os edifícios restantes são configurados da mesma maneira

        // Criação e inicialização da gestão de condomínio
        GestaoCondominio gestaoCondominio = new GestaoCondominio();
        gestaoCondominio.setCondominio(condominios);
    }
}
