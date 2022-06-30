import java.util.Objects;

public class Post {
    private String autor;
    private String titulo;
    private String corpo;
    private String categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        return autor.equals(post.autor) &&
            titulo.equals(post.titulo) &&
            corpo.equals(post.corpo) &&
            categoria.equals(post.categoria);
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
