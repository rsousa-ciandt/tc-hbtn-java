import java.util.Arrays;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public double calcularTotal() {
        double total = Arrays
                .stream(getItens())
                .mapToDouble(ip -> ip.getProduto().obterPrecoLiquido() * ip.getQuantidade())
                .sum();

        double totalComDesconto = total - total * (getPercentualDesconto() / 100);

        return  totalComDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }
}
