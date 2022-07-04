import java.util.ArrayList;

public class Banco {
    String nome;
    ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia == null) {
            return false;
        }

        for (int i = 0; i < agencia.getClientes().size(); i++) {
            Cliente cliente = agencia.getClientes().get(i);

            StringBuilder clienteInfo = new StringBuilder(String.format("Cliente: %s [%d]", cliente.toString(), i + 1));

            if (imprimirTransacoes) {
                for (int j = 0; j < cliente.getTransacoes().size(); j++) {
                    double valorTransacao = cliente.getTransacoes().get(j);

                    clienteInfo.append("\n  ");
                    clienteInfo.append(String.format("[%d] valor %.2f", j + 1, valorTransacao));
                }
            }

            System.out.println(clienteInfo);
        }

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia == null) {
            return false;
        }


        return agencia.adicionarTransacao(nomeCliente, valorTransacao);
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);

        if (agencia == null) {
            return false;
        }

        return agencia.novoCliente(nomeCliente, valorInicial);
    }

    public boolean adicionarAgencia(String nome) {
        Agencia agencia = buscarAgencia(nome);

        if (agencia != null) {
            return false;
        }

        return getAgencias().add(new Agencia(nome));
    }

    public Agencia buscarAgencia(String nome) {
        Agencia agencia = null;

        for (Agencia a: getAgencias()) {
            if (a.getNome().equals(nome)) {
                agencia = a;
            }
        }

        return agencia;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
}
