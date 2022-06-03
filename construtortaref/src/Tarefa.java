import java.util.UUID;

public class Tarefa {
    private String uuid;
    private String nome;
    private String descricao;
    private boolean commpleta;
    private int ordem;

    public Tarefa(){
        this.setUuid(UUID.randomUUID().toString());

    }
    public void completar(){
        this.setCommpleta(true);

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
