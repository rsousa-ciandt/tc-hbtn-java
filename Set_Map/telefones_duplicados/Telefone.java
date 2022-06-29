import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Telefone telefone = (Telefone) o;

        return codigoArea.equals(telefone.codigoArea) && numero.equals(telefone.numero);
    }

    @Override
    public int hashCode() {
        int primo = 31;
        int hash = 7;

        hash = primo * hash + ((codigoArea == null) ? 0 : codigoArea.hashCode());
        hash = primo * hash + ((numero == null) ? 0 : numero.hashCode());

        return hash;
    }

    @Override
    public String toString() {
        return String.format("(%s) %s", codigoArea, numero);
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public String getNumero() {
        return numero;
    }
}
