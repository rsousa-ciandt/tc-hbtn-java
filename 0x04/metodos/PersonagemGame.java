public class PersonagemGame {
    private String nome;
    private int saudeAtual;

    public void tomarDano(int quantidadeDeDano) {
        saudeAtual -= quantidadeDeDano;

        saudeAtual = Math.max(saudeAtual, 0);
    }

    public void receberCura(int quantidadeDeCura) {
        saudeAtual += quantidadeDeCura;

        saudeAtual = Math.min(saudeAtual, 100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }
}
