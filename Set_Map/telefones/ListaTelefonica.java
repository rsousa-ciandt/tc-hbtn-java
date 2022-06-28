import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> contatos;

    public ListaTelefonica() {
        this.contatos = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
        boolean contatoExistente = getContatos().containsKey(nome);

        ArrayList<Telefone> telefones = contatoExistente
                ? buscar(nome)
                : new ArrayList<>();

        telefones.add(telefone);

        getContatos().put(nome, telefones);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return contatos.get(nome);
    }

    public void setContatos(HashMap<String, ArrayList<Telefone>> contatos) {
        this.contatos = contatos;
    }

    public HashMap<String, ArrayList<Telefone>> getContatos() {
        return contatos;
    }
}
