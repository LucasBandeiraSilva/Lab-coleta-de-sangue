package estruturaDados;

public class FilaPrioridade<T> extends Fila<T> {

    @Override
    public void enfileirar(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for (i = 0; i < this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0) {
                break;
            }
        }
        this.adiciona(i, elemento);
    }
}
