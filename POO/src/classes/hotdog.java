package classes;

public class hotdog extends Sanduiche {
    public hotdog() {
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Milho");
        this.tipo = "Hot Dog";
    }
}
