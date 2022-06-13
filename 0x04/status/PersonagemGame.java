public class PersonagemGame {
    private String nome;
    private String status;
    private int saudeAtual;

    public void tomarDano(int quantidadeDeDano) {
        int novaSaude = saudeAtual - quantidadeDeDano;

        setSaudeAtual(Math.max(novaSaude, 0));
    }

    public void receberCura(int quantidadeDeCura) {
        int novaSaude = saudeAtual + quantidadeDeCura;

        setSaudeAtual(Math.min(novaSaude, 100));
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

        status = this.saudeAtual == 0 ? "morto" : "vivo";
    }

    public String getStatus() {
        return status;
    }

}
