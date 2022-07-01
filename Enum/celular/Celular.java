import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String nome) {
        int posicao = -1;

        for (int i = 0; i < getContatos().size(); i++) {
            Contato contato = getContatos().get(i);

            if (contato.getNome().equals(nome)) {
                posicao = i;
            }
        }

        return posicao;
    }

    public void adicionarContato(Contato contato) throws Exception {
        int posicaoContato = obterPosicaoContato(contato.getNome());

        if (posicaoContato != -1) {
            throw new Exception("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }

        getContatos().add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) throws Exception {
        int posicaoContatoAntigo = obterPosicaoContato(contatoAntigo.getNome());

        if (posicaoContatoAntigo == -1) {
            throw new Exception("Nao foi possivel modificar contato. Contato nao existe");
        }

        int posicaoContatoNovo = obterPosicaoContato(novoContato.getNome());

        if (posicaoContatoNovo != -1 && posicaoContatoAntigo != posicaoContatoNovo) {
            throw new Exception("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }

        getContatos().set(posicaoContatoAntigo, novoContato);
    }

    public void removerContato(Contato contato) throws Exception {
        int posicaoContato = obterPosicaoContato(contato.getNome());

        if (posicaoContato == -1) {
            throw new Exception("Nao foi possivel remover contato. Contato nao existe");
        }

        getContatos().remove(posicaoContato);
    }

    public void listarContatos() {
        for (Contato contato: getContatos()) {
            System.out.println(contato);
        }
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
}
