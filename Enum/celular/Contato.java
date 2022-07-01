import java.util.Objects;

public class Contato {
    String nome;
    String numero;
    TipoNumero tipoNumero;

//    public Contato() {
//    }

    public Contato(String nome, String numero, TipoNumero tipoNumero) {
        this.nome = nome;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;

        return nome.equals(contato.nome) &&
                numero.equals(contato.numero) &&
                tipoNumero.equals(contato.tipoNumero);
    }

    @Override
    public int hashCode() {
        int hash = 31;
        int primo = 7;

        hash = hash * primo + (nome == null ? 0 : nome.hashCode());
        hash = hash * primo + (numero == null ? 0 : numero.hashCode());
        hash = hash * primo + (tipoNumero == null ? 0 : tipoNumero.hashCode());

        return hash;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s (%s)", getNome(), getNumero(), getTipoNumero());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoNumero getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(TipoNumero tipoNumero) {
        this.tipoNumero = tipoNumero;
    }
}
