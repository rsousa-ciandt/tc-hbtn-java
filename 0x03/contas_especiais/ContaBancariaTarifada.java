import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numercao, double taxaJurosAnual) {
        super(numercao, taxaJurosAnual);
    }

    public void aplicarTarifaTransacao() {
        this.saldo -= 0.10;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        aplicarTarifaTransacao();
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        aplicarTarifaTransacao();
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
