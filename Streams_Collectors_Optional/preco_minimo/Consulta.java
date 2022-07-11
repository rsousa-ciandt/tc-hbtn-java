import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(p -> p.getCategoriaProduto() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                .max((p1, p2) -> {
                    int result = 0;

                    if (p1.getPreco() != p2.getPreco()) {
                        result = p1.getPreco() > p2.getPreco() ? 1 : -1;
                    }

                    return result;
                })
                .get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double preco) {
        return produtos.stream()
                .filter(p -> p.getPreco() >= preco)
                .collect(Collectors.toList());
    }
}
