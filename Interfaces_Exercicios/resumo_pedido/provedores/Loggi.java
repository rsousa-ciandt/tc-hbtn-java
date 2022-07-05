package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double precoFrete = peso > 5000 ? valor * 0.12 : valor * 0.04;

        return new Frete(precoFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
