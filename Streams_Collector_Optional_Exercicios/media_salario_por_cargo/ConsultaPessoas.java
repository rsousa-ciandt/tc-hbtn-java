import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    private static Function<Pessoa, String> extrairCargoPessoa = (Pessoa::getCargo);

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                extrairCargoPessoa,
                                Collectors.averagingDouble(Pessoa::getSalario)
                        )
                );
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                extrairCargoPessoa,
                                Collectors.groupingBy(
                                        Pessoa::getIdade,
                                        Collectors.counting()
                                )
                        )
                );
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        return pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                extrairCargoPessoa,
                                Collectors.counting()
                        )
                );
    }

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        TreeMap<String, TreeSet<Pessoa>> treeMap = pessoas.stream()
                .collect(
                        Collectors.groupingBy(
                                extrairCargoPessoa,
                                () -> new TreeMap<>(Comparator.reverseOrder()),
                                Collectors.toCollection(TreeSet::new)
                        )
                );

        return treeMap;
    }
}
