import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais;

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

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void setCanais(List<CanalNotificacao> canais) {
        this.canais = canais;
    }
}
