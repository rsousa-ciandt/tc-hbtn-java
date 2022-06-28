import java.util.*;
import java.util.stream.Collectors;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] numeros) {

        HashSet<Integer> numerosUnicos = new HashSet<>();
        TreeSet<Integer> numerosDuplicados = new TreeSet<>();

        Arrays.stream(numeros).forEach(n -> {
            boolean foiAdicionado = numerosUnicos.add(n);

            if (!foiAdicionado) numerosDuplicados.add(n);
        });

        return numerosDuplicados;
    }
}
