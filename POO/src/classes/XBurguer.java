package classes;

public class XBurguer extends Sanduiche {
    public boolean aberto;
    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.tipo = "XBurguer";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("-- LANCHE ABERTO --");
        }
    }
}

