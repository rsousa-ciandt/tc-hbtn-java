public class Eletronico implements Item {
    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    private String descricao;
    private double valor;

    @Override
    public String toString() {
        return String.format("[%s] R$ %.6f", descricao, valor);
    }
}
