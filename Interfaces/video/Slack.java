public class Slack implements CanalNotificacao {
    @Override
    public void notificar(Mensagem mensagem) {
        String nomeClasseUpperCase = getClass().getSimpleName().toUpperCase();
        String texto = String.format("[%s] {%s} - %s", nomeClasseUpperCase, mensagem.tipoMensagem, mensagem.texto);

        System.out.println(texto);
    }
}
