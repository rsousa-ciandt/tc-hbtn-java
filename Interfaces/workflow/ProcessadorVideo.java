import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        canais.stream().forEach(c -> {
            String texto = String.format("%s - %s", video.getArquivo(), video.getFormatoVideo());

            c.notificar(new Mensagem(texto, TipoMensagem.LOG));
        });
    }

    public ArrayList<CanalNotificacao> getCanais() {
        return canais;
    }

    public void setCanais(ArrayList<CanalNotificacao> canais) {
        this.canais = canais;
    }
}
