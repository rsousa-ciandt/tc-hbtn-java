public class Numero {
    public static void dividir(int a, int b) {
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.printf("%d / %d = %d\n", a, b, result);
        }
    }
}
