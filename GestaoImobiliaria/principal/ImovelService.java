package principal;

import java.util.List;

public interface ImovelService {
    List<Imovel> pesquisarImoveis(String criterios);
    boolean reservarImovel(Imovel imovel);
}
