class PrintStringConcat {
    public static void main(String[] args) {
        String texto1 = "Holberton",
                texto2 = "School",
                result = String.format("Bem vindo a %s %s", texto1, texto2);
        System.out.print(result);
    }
}