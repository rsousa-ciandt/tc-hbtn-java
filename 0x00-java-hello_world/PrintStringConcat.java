class PrintStringConcat {
    public static void main(String[] args) {
        String texto1 = "Holberton";
        String texto2 = "School";
        String result = String.format("Bem vindo a %s %s!\n", texto1, texto2);
        System.out.print(result);
    }
}
