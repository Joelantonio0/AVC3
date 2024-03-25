package principal;

import java.util.List;

public interface ClienteService {
    void registrarConta(Cliente cliente);
    Cliente login(String login, String senha);
    List<Imovel> pesquisarImoveis(String criterios);
    boolean reservarImovel(Imovel imovel);
}
