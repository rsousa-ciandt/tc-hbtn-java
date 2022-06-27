import produtos.Produto;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        setQuantidade(quantidade);
        setProduto(produto);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
