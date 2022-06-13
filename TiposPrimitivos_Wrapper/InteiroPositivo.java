import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class InteiroPositivo {
    Integer valor;

    public InteiroPositivo (Integer valor) throws Exception {
        setValor(valor);
    }

    public  InteiroPositivo (String valor) throws Exception {
        try {
            int valorParseado = Integer.parseInt(valor);

            if (valorParseado < 0) throw new NumberFormatException();

            setValor(valorParseado);
        } catch (NumberFormatException nfe) {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }
    }

    public boolean ehPrimo() {
        boolean result = false;

        if (valor % 2 != 0) {
            long divisors = IntStream.range(1, valor / 2).filter(v -> valor % v == 0).count();

            if (divisors == 1) {
                result = true;
            }
        } else if (valor == 2) {
            result = true;
        }

        return result;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) throws Exception {
        if (valor < 0) {
            throw new Exception("Valor nao eh um valor inteiro positivo");
        }

        this.valor = valor;
    }
}
