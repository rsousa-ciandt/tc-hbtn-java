import java.util.Comparator;
import java.util.Objects;

public class Post implements Comparator, Comparable {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Object o) {
        Post post = (Post) o;

        return getTitulo().compareToIgnoreCase(post.getTitulo());
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Post p1 = (Post) o1;
        Post p2 = (Post) o2;

        return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        return autor.equals(post.autor) &&
            titulo.equals(post.titulo);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        int primo = 31;

        hash = hash * primo + (autor == null ? 0 : autor.hashCode());
        hash = hash * primo + (titulo == null ? 0 : titulo.hashCode());
        hash = hash * primo + (corpo == null ? 0 : corpo.hashCode());
        hash = hash * primo + (categoria == null ? 0 : categoria.hashCode());

        return hash;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}
