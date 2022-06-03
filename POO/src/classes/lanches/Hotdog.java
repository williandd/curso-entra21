package classes.lanches;

public class Hotdog extends Sanduiche {
    public Hotdog() {
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Milho");
        this.tipo = "Hot Dog";
    }
}
