package estruturaDados;

public class paciente implements Comparable<paciente> {
    private String paciente;
    private int prioridade;

    public paciente(String paciente, int prioridade) {
        super();
        this.paciente = paciente;
        this.prioridade = prioridade;
    }

    public paciente() {

    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public int compareTo(paciente o) {
        if (this.prioridade > o.getPrioridade()) {
            return 1;
        } else if (this.prioridade < o.getPrioridade()) {
            return -1;
        }
        return 0;
    }
}
