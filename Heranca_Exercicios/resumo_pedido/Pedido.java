import produtos.Produto;

import java.util.Arrays;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        setPercentualDesconto(percentualDesconto);
        setItens(itens);
    }

    public void apresentarResumoPedido() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("------- RESUMO PEDIDO -------\n");

        for (ItemPedido itemPedido: getItens()) {
            Produto produto = itemPedido.getProduto();
            String tipo = produto.getClass().getSimpleName();

            stringBuilder.append(
                    String.format("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                            tipo, produto.getTitulo(), produto.obterPrecoLiquido(), itemPedido.getQuantidade(), itemPedido.getTotal())
            );
        }

        stringBuilder.append("----------------------------\n");
        stringBuilder.append(String.format("DESCONTO: %.2f\n", getValorDesconto()));
        stringBuilder.append(String.format("TOTAL PRODUTOS: %.2f\n", getTotalProdutos()));
        stringBuilder.append("----------------------------\n");
        stringBuilder.append(String.format("TOTAL PEDIDO: %.2f\n", calcularTotal()));

        System.out.println(stringBuilder.toString());
    }

    public double getTotalProdutos() {
        return Arrays
                .stream(getItens())
                .mapToDouble(ItemPedido::getTotal)
                .sum();
    }

    public double getValorDesconto() {
        return getTotalProdutos() * getPercentualDesconto() / 100;
    }

    public double calcularTotal() {
        return getTotalProdutos() - getValorDesconto();
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
