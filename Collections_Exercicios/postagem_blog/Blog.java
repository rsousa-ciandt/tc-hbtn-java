import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private final List<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) throws Exception {
        if (getPosts().contains(post)) {
            throw new Exception("Postagem jah existente");
        }

        getPosts().add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = getPosts().stream()
                .map(Post::getAutor)
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> map = new TreeMap<>();

        for (Post post: posts) {
            int frequencia = (int) posts.stream()
                    .map(Post::getCategoria)
                    .filter(c -> c.equals(post.getCategoria()))
                    .count();

            map.put(post.getCategoria(), frequencia);
        }

        return map;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        return posts.stream()
                .filter(p -> p.getAutor().equals(autor))
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public Set<Post> obterPostsPorCategoria(Categorias categorias) {
        Set<Post> posts = this.posts.stream()
                .filter(p -> p.getCategoria().equals(categorias))
                .collect(Collectors.toCollection(TreeSet::new));

        return posts;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> map = new TreeMap<>();

        for (Post post: posts) {
            Categorias categoria = post.getCategoria();
            Set<Post> postsPorCategoria = posts.stream()
                    .filter(p -> p.getCategoria().equals(categoria))
                    .collect(Collectors.toSet());

            map.put(categoria, postsPorCategoria);
        }

        return map;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> map = new TreeMap<>();

        for (Post post: posts) {
            Autor autor = post.getAutor();
            Set<Post> postsPorCategoria = posts.stream()
                    .filter(p -> p.getAutor().equals(autor))
                    .collect(Collectors.toCollection(TreeSet::new));

            map.put(autor, postsPorCategoria);
        }

        return map;
    }

    public List<Post> getPosts() {
        return posts;
    }

}
