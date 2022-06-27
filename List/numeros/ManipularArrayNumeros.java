import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> lista, Integer elemento) {
        return lista.indexOf(elemento);
    }

    public static void adicionarNumero(List<Integer> lista, Integer elemento) throws Exception {
        int posicaoElemento = buscarPosicaoNumero(lista, elemento);

        if (posicaoElemento != -1) {
            throw  new Exception("Numero jah contido na lista");
        }

        lista.add(elemento);
    }

        public static void removerNumero(List<Integer> lista, Integer elemento) throws Exception {
        int posicaoElemento = buscarPosicaoNumero(lista, elemento);

        if (posicaoElemento == -1) {
            throw  new Exception("Numero nao encontrado na lista");
        }

        lista.remove(posicaoElemento);
    }

    public static void substituirNumero(List<Integer> lista, Integer numeroSubstituir, Integer numeroSubstituto) {
        int posicaoElemento = buscarPosicaoNumero(lista, numeroSubstituir);

        if(posicaoElemento == -1) {
            lista.add(numeroSubstituto);
        } else {
            lista.set(posicaoElemento, numeroSubstituto);
        }
    }

}