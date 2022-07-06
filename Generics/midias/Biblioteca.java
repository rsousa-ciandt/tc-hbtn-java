import java.util.ArrayList;

public class Biblioteca<T extends Midia>{

    private ArrayList<T> midias;

    public Biblioteca() {
        midias = new ArrayList<>();
    }

    public void adicionarMidia(T t) {
        obterListaMidias().add(t);
    }

    public ArrayList<T> obterListaMidias() {
        return midias;
    }
}
