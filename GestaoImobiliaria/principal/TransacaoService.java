package principal;

import java.util.List;

public interface TransacaoService {
    void registrarVenda(TransacaoVenda transacao);
    void registrarAluguel(TransacaoAluguel transacao);
    List<Transacao> listarTransacoes();
}
