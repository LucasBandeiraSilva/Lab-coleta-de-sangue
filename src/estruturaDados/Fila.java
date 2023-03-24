package estruturaDados;

public class Fila <T> extends estruturaEstatica<T> {
    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento) {
        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desinfileirar() {
        if (this.estaVazia()) {
            return null;
        }
        T removerElemento = this.elementos[0];
        this.remover(0);
        return removerElemento;

    }
}
