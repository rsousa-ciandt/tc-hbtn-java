public class Jornal extends Midia {
    private int quantidadeArtgios;

    public Jornal(String nome, int quantidadeArtgios) {
        super(nome);
        this.quantidadeArtgios = quantidadeArtgios;
    }

    public int getQuantidadeArtgios() {
        return quantidadeArtgios;
    }
}
