import java.util.List;
import java.util.stream.Collectors;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro<Produto> filtro) {
        return produtos.stream().filter(filtro).collect(Collectors.toList());
    }
}
