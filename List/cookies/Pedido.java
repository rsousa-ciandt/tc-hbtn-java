import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> pedidoCookies;

    public Pedido() {
        setPedidoCookies(new ArrayList<>());
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        getPedidoCookies().add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        return getPedidoCookies().stream().mapToInt(PedidoCookie::getQuantidadeCaixas).sum();
    }

    public int removerSabor(String sabor) {
        int totalCaixasRemovidas = 0;
        Iterator<PedidoCookie> iterator = getPedidoCookies().iterator();

        while (iterator.hasNext()) {
            PedidoCookie next = iterator.next();

            if (next.getSabor().equals(sabor)) {
                iterator.remove();
                totalCaixasRemovidas += next.getQuantidadeCaixas();
            }
        }

        return totalCaixasRemovidas;
    }

    public void setPedidoCookies(ArrayList<PedidoCookie> pedidoCookies) {
        this.pedidoCookies = pedidoCookies;
    }

    public ArrayList<PedidoCookie> getPedidoCookies() {
        return pedidoCookies;
    }
}
