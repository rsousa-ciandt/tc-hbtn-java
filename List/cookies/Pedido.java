import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        setCookies(new ArrayList<>());
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        getCookies().add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        return getCookies().stream().mapToInt(PedidoCookie::getQuantidadeCaixas).sum();
    }

    public int removerSabor(String sabor) {
        int totalCaixasRemovidas = 0;
        Iterator<PedidoCookie> iterator = getCookies().iterator();

        while (iterator.hasNext()) {
            PedidoCookie next = iterator.next();

            if (next.getSabor().equals(sabor)) {
                iterator.remove();
                totalCaixasRemovidas += next.getQuantidadeCaixas();
            }
        }

        return totalCaixasRemovidas;
    }

    public void setCookies(ArrayList<PedidoCookie> cookies) {
        this.cookies = cookies;
    }

    public ArrayList<PedidoCookie> getCookies() {
        return cookies;
    }
}
