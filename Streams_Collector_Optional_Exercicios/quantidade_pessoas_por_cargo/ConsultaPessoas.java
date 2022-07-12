import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        Function<Pessoa, String> extrairCargo = (Pessoa::getCargo);

        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                extrairCargo,
                                Collectors.counting()
                        )
                );
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> treeMap = pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                Pessoa::getCargo,
                                () -> new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.toCollection(TreeSet::new)
                        )
                );

        return treeMap;
    }
}
