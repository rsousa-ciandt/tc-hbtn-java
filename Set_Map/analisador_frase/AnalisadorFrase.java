import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String fraseTratada = frase
                .replace("?", "")
                .replace("!", "")
                .replace(".", "");

        List<String> palavras = Arrays.stream(fraseTratada.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        palavras.forEach(s -> {
            int frequencia = Collections.frequency(palavras, s);
            treeMap.put(s, frequencia);
        });

        return treeMap;
    }
}
