import java.util.UUID;

public class Tarefa {

    private String uuid;
    private String nome;
    private String descricao;
    private boolean commpleta;
    private int ordem;





    private ChecklistItem[] checklist;

    public ChecklistItem[] getChecklist() {
        return checklist;
    }

    public void setChecklist(ChecklistItem[] checklist) {
        this.checklist = checklist;
    }

    public Tarefa(){
        this.setUuid(UUID.randomUUID().toString());

    }




    public void completar(){
        this.setCommpleta(true);
        for (ChecklistItem item : this.getChecklist()){
            if (item != null){
                item.completar();
            }
        }

    }
    public boolean temCheckList(){
        return this.getChecklist() != null;

        }
        public void criarCheckList(int tamanho){
        this.setChecklist(new ChecklistItem[tamanho]);
        }
        public boolean adicionarCheckListItem(ChecklistItem item) {
            for (int i = 0; i < this.getChecklist().length; i++) {
                if (this.getChecklist()[i] == null) {
                    this.getChecklist()[i] = item;
                    return true;

                }

            }
            return false;
        }
    public void setUuid(String uuid){
        this.uuid = uuid;

    }
    public String getUuid(){
        return this.uuid;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCommpleta() {
        return commpleta;
    }

    public void setCommpleta(boolean commpleta) {
        this.commpleta = commpleta;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
