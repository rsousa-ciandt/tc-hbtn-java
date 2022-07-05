import atividades.Atividade;

import java.util.ArrayList;

public class Workflow {
    private ArrayList<Atividade> atividades;

    public Workflow() {
        atividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        getAtividades().add(atividade);
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }
}
