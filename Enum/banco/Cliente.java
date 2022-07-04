import java.util.ArrayList;

public class Cliente {
    String nome;
    ArrayList<Double> transacoes;

    public Cliente(String nome, double valorInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();

        adicionarTransacao(valorInicial);
    }

    @Override
    public String toString() {
        return nome;
    }

    public void adicionarTransacao(double valor) {
        getTransacoes().add(valor);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }
}
