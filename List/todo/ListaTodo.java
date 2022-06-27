import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        setTarefas(new ArrayList<>());
    }

    public void adicionarTarefa(Tarefa tarefa) throws IllegalArgumentException {
        if (getTarefas().contains(tarefa)) {
            throw new IllegalArgumentException(
                    String.format("Tarefa com identificador %d ja existente na lista", tarefa.getIdentificador())
            );
        }

        getTarefas().add(tarefa);
    }

    private Optional<Tarefa> buscarTarefa(int identificador) {
        return getTarefas().stream().filter(t -> t.getIdentificador() == identificador).findFirst();
    }

    public boolean marcarTarefaFeita(int identificador) {
        boolean marcada = false;
        Optional<Tarefa> tarefaOptional = buscarTarefa(identificador);

        if (tarefaOptional.isPresent()) {
            tarefaOptional.get().setEstahFeita(true);
            marcada = true;
        }

        return marcada;
    }

    public boolean desfazerTarefa(int identificador) {
        boolean desmarcada = false;
        Optional<Tarefa> tarefaOptional = buscarTarefa(identificador);

        if (tarefaOptional.isPresent()) {
            tarefaOptional.get().setEstahFeita(false);
            desmarcada = true;
        }

        return desmarcada;
    }

    public void desfazerTodas() {
        getTarefas().stream().forEach(t -> t.setEstahFeita(false));
    }

    public void fazerTodas() {
        getTarefas().stream().forEach(t -> t.setEstahFeita(true));
    }

    public void listarTarefas() {
        String representacao = "";

        for (Tarefa t: getTarefas()) {
            representacao += t.toString();
        }

        System.out.print(representacao);
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
}
