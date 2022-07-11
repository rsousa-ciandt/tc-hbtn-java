import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;
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

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(p ->
                        p.getProdutos()
                                .stream()
                                .anyMatch(produto -> produto.getCategoriaProduto().equals(CategoriaProduto.ELETRONICO))
                )
                .collect(Collectors.toList());
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream()
                .peek(p -> {
                    if (p.getCategoriaProduto().equals(CategoriaProduto.ELETRONICO)) {
                        p.setPreco(p.getPreco() * 0.85);
                    }
                })
                .collect(Collectors.toList());

    }
}
