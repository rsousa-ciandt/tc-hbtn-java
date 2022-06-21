public class Numeros0a99 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.print(i + (i == 99 ? "" : ", "));
        }
        System.out.println();
    }
}
