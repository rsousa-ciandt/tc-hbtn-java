public class Comida implements Item {
    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    private String nome;
    private int calorias;
    private double preco;

    @Override
    public String toString() {
        return String.format("[%s] %d R$ %.6f", nome, calorias, preco);
    }
}
