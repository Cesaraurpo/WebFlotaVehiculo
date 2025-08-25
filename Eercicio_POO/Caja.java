import java.util.Objects;

public class Caja<T> {
    private T valor;

    public Caja(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Caja con: " + valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Caja)) return false;
        Caja<?> caja = (Caja<?>) o;
        return Objects.equals(valor, caja.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }
}
