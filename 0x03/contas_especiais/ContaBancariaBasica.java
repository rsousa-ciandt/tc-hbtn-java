import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    protected double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numercao, double taxaJurosAnual) {
        this.saldo = 0;

        this.numeracao = numercao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");

        if (valor > getSaldo()) throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");

        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double porcentagemSaldo = getSaldo() * 0.1;

        return porcentagemSaldo < 10 ? porcentagemSaldo : 10;
    }

    public double calcularJurosMensal() {
        double juros = 0;

        if (getSaldo() > 0) {
            juros = getSaldo() * (getTaxaJurosAnual() / 12 / 100);
        }

        return juros;
    }

    public void aplicarAtualizacaoMensal() {
        double saldoAtualizado = getSaldo() - calcularTarifaMensal() + calcularJurosMensal();

        this.saldo = saldoAtualizado;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }


    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}
