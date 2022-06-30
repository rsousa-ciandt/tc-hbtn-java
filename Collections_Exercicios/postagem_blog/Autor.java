import java.util.Comparator;
import java.util.Objects;

public class Autor implements Comparator, Comparable {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Autor() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        Autor a1 = (Autor) o1;
        Autor a2 = (Autor) o2;

        return a1.getNome().compareToIgnoreCase(a2.getNome());
    }

    @Override
    public int compareTo(Object o) {
        Autor autor = (Autor) o;

        return getNome().compareToIgnoreCase(autor.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        return nome.equals(autor.getNome()) && sobrenome.equals(autor.sobrenome);
    }

    @Override
    public int hashCode() {
        int hash = 7;

        hash = 31 * hash + (nome == null ? 0 : nome.hashCode());
        hash = 31 * hash + (sobrenome == null ? 0 : sobrenome.hashCode());

        return hash;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
