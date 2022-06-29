import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> contatos;

    public ListaTelefonica() {
        this.contatos = new HashMap<>();
    }

    public HashSet<Telefone> adicionarTelefone(String nome, Telefone telefone) throws Exception {
        boolean contatoExistente = getContatos().containsKey(nome);

        HashSet<Telefone> telefones = contatoExistente
                ? buscar(nome)
                : new HashSet<>();

        boolean telefoneJaExiste = getContatos().keySet()
                .stream().anyMatch(c -> !c.equals(nome) && buscar(c).contains(telefone));

        if (telefoneJaExiste) {
            throw new Exception("Telefone jah pertence a outra pessoa");
        }

        boolean foiAdicionado = telefones.add(telefone);

        if (!foiAdicionado) {
            throw new Exception("Telefone jah existente para essa pessoa");
        }

        getContatos().put(nome, telefones);

        return telefones;
    }

    public HashSet<Telefone> buscar(String nome) {
        return contatos.get(nome);
    }

    public void setContatos(HashMap<String, HashSet<Telefone>> contatos) {
        this.contatos = contatos;
    }

    public HashMap<String, HashSet<Telefone>> getContatos() {
        return contatos;
    }
}
