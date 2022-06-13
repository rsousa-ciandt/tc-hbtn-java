import java.text.NumberFormat;

class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        String valorFormatado = NumberFormat.getCurrencyInstance().format(valor).replace("$", "R$ ");

        System.out.printf("Valor: %s\nTaxa: %.2f%%\n", valorFormatado, taxa);
    }
}
