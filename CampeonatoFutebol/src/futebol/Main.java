package futebol;

/**
 * Classe principal que executa o programa para simular o Campeonato Europeu de Futebol.
 * 
 * @author Joel António
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que inicia a simulação do Campeonato Europeu de Futebol.
     * 
     * @param args Argumentos da linha de comando (não utilizado).
     */
    public static void main(String[] args) {
        // Cria uma instância do CampeonatoEuropeu
        CampeonatoEuropeu euro2024 = new CampeonatoEuropeu();

        // Inicia o campeonato
        euro2024.iniciar();

        // Registra as seleções participantes
        euro2024.registrarSelecoes();

        // Cria os grupos para a fase de grupos
        euro2024.criarGrupos();

        // Simula os jogos da fase de grupos
        euro2024.jogarFaseDeGrupos();

        // Classifica os times de cada grupo
        euro2024.classificarTimes();

        // Simula as fases finais do campeonato
        euro2024.jogarFasesFinais();

        // Premia os melhores jogadores do campeonato
        euro2024.premiarMelhoresJogadores();

        // Atualiza os registros com os resultados finais
        euro2024.atualizarRegistros();

        // Exibe as estatísticas finais do campeonato
        euro2024.exibirEstatisticas();
    }

}
