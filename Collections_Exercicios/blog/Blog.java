import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private final List<Post> postagens = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        getPostagens().add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = postagens.stream()
                .map(Post::getAutor)
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> map = new TreeMap<>();

        for (Post post: postagens) {
            int frequencia = (int) postagens.stream()
                    .map(Post::getCategoria)
                    .filter(c -> c.equals(post.getCategoria()))
                    .count();

            map.put(post.getCategoria(), frequencia);
        }

        return map;
    }

    public List<Post> getPostagens() {
        return postagens;
    }

}
