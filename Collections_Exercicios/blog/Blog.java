import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        getPosts().add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = posts.stream()
                .map(Post::getAutor)
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> map = new TreeMap<>();

        for (Post post: posts) {
            int frequencia = (int) posts.stream()
                    .map(Post::getCategoria)
                    .filter(c -> c.equals(post.getCategoria()))
                    .count();

            map.put(post.getCategoria(), frequencia);
        }

        return map;
    }

    public List<Post> getPosts() {
        return posts;
    }

}
