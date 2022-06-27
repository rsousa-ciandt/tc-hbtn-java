import java.util.Objects;

public class Tarefa {
    private String descricao;
    private int identificador;
    private boolean estahFeita;

    public Tarefa(String descricao, int identificador) {
        setDescricao(descricao);
        setIdentificador(identificador);
    }

    public void modificarDescricao(String descricao) {
        setDescricao(descricao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Tarefa tarefa = (Tarefa) o;

        return identificador == tarefa.identificador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return String.format("[%s]  Id: %d - Descricao: %s\n",
                (isEstahFeita() ? "X" : " "), getIdentificador(), getDescricao()
        );
    }

    public void setDescricao(String descricao) throws IllegalArgumentException {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }

        this.descricao = descricao;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }
}
