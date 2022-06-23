public class ContaBancariaControlada extends ContaBancariaBasica {
    private double saldoMinimo;
    private double valorPenalidade;

    public ContaBancariaControlada(String numercao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numercao, taxaJurosAnual);

        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();

        if (this.getSaldo() < getSaldoMinimo()) {
            this.saldo -= getValorPenalidade();
        }
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }
}
