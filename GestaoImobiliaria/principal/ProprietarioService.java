package principal;

public interface ProprietarioService {
    boolean enviarPedidoRegistro(Proprietario proprietario);
    void adicionarImovel(Proprietario proprietario, Imovel imovel);
}
