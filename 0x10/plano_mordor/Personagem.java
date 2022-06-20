import comida.Comida;
import humor.*;

import java.util.Arrays;

public class Personagem {
    private int pontosDeFelicidade;
    private Humor humor;

    public void comer(Comida[] comidas) {
        int pontosDeFelicidade =
                Arrays.stream(comidas)
                .map(Comida::getPontosDeFelicidade)
                .reduce(0, (a, b) -> a + b);

        setPontosDeFelicidade(pontosDeFelicidade);
    }

    @Override
    public String toString() {
        return String.format("%d - %s", pontosDeFelicidade, humor.getClass().getSimpleName());
    }

    public int getPontosDeFelicidade() {
        return pontosDeFelicidade;
    }

    public void setPontosDeFelicidade(int pontosDeFelicidade) {
        this.pontosDeFelicidade = pontosDeFelicidade;

        Humor humor;

        if (pontosDeFelicidade < -5) {
            humor = new Irritado();
        } else if (pontosDeFelicidade < 1) {
            humor = new Triste();
        } else if (pontosDeFelicidade < 16) {
            humor = new Feliz();
        } else {
            humor = new MuitoFeliz();
        }

        setHumor(humor);
    }

    public Humor getHumor() {
        return humor;
    }

    public void setHumor(Humor humor) {
        this.humor = humor;
    }
}
