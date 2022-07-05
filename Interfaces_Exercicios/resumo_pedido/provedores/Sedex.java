package provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double precoFrete = peso > 1000 ? valor * 0.1 : valor * 0.05;

        return new Frete(precoFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
