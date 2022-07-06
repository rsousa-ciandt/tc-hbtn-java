public class Jornal extends Midia {
    private int quantidadeArtigos;

    public Jornal(String nome, int quantidadeArtgios) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtgios;
    }

    public int getQuantidadeArtigos() {
        return quantidadeArtigos;
    }
}
