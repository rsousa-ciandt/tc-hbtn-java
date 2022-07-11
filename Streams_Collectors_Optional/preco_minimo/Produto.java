public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private CategoriaProduto categoriaProduto;

    public Produto(int codigo, String nome, CategoriaProduto categoriaProduto, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoriaProduto = categoriaProduto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s %s R$ %.2f", codigo, nome, categoriaProduto, preco);
    }
}
