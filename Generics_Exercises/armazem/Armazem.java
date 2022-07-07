import java.util.Map;
import java.util.TreeMap;

public class Armazem<I> implements Armazenavel<I> {
    private Map<String, I> itens;

    public Armazem() {
        itens = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String nome, I valor) {
        this.itens.put(nome, valor);
    }

    @Override
    public I obterDoInventario(String nome) {
        return this.itens.get(nome);
    }
}
