import java.util.ArrayList;

public class Agencia {
    String nome;
    ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public boolean adicionarTransacao(String nome, double valorTransacao) {
        Cliente clienteExiste = buscarCliente(nome);

        if (clienteExiste == null) {
            return false;
        }

        int qtdTransacoes = clienteExiste.getTransacoes().size();

        clienteExiste.adicionarTransacao(valorTransacao);

        boolean transacaoFoiAdicionada = clienteExiste.getTransacoes().size() > qtdTransacoes;

        return transacaoFoiAdicionada;
    }

    public boolean novoCliente(String nome, double valorInicial) {
        Cliente clienteExiste = buscarCliente(nome);

        if (clienteExiste != null) {
            return false;
        }

        return getClientes().add(new Cliente(nome, valorInicial));
    }

    public Cliente buscarCliente(String nome) {
        Cliente cliente = null;

        for (Cliente c: getClientes()) {
            if (c.getNome().equals(nome)) {
                cliente = c;
            }
        }

        return cliente;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
