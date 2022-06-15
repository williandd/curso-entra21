public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;

    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista) {
        this.setTamanhoLista(tamanhoLista);
        this.setTarefas(new Tarefa[tamanhoLista]);

    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        if (tarefa.getOrdem() < 0 ||
                tarefa.getOrdem() > this.getTamanhoLista()){
            return false;
        }
        for (int i = 0; i < this.getTamanhoLista(); i++) {
            if (this.tarefas[i] == null) {
                this.tarefas[i] = tarefa;
                return true;
            }else if (this.tarefas[i].getOrdem() == tarefa.getOrdem()){
                break;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int ordem) {
        for (Tarefa t: this.getTarefas()){
            if (t != null && t.getOrdem() == ordem){
                return t;
            }
        }

        return null;
    }

    public boolean alterarOrdemTarefa(int antigaOrdem, int novaOrdem) {
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);
        Tarefa novaTarefa = buscarTarefa(novaOrdem);
        if (tarefaAntiga == null || novaTarefa == null) {
            return false;
        }

        buscarTarefa(antigaOrdem).setOrdem(novaOrdem);
        buscarTarefa(novaOrdem).setOrdem(antigaOrdem);
        return true;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}


