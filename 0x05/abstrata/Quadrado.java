public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }

    @Override
    public double area() {
        return lado * lado;
    }

    public void setLado(double lado) {
        if (largura < 0) throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");

        this.lado = lado;
    }
}
