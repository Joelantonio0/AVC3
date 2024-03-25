package principal;

public interface FuncionarioService {
    void registrarVenda(Funcionario vendedor, TransacaoVenda transacao);
    void registrarAluguel(Funcionario vendedor, TransacaoAluguel transacao);
}
