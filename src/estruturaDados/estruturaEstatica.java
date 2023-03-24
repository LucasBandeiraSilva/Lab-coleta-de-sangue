package estruturaDados;

public class estruturaEstatica <T>{
    public T[] elementos;
    public int tamanho;

    /**
     * @param capacidade
     */
    public estruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public estruturaEstatica() {
        this(10);
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementoNovo = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementoNovo[i] = this.elementos[i];
            }
            this.elementos = elementoNovo;
        }
    }

    public boolean adiciona(int posicao, T elemento) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("posição invalida");
        }
        for (int i = this.tamanho; i > posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        return false;
    }

    public void remover(int posição) {
        if (!(posição >= 0 && posição < tamanho)) {
            throw new IllegalArgumentException("posição invalida");
        }
        for (int i = posição; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return this.tamanho;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }
}
