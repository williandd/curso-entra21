package classes.lanches;

import classes.lanches.Sanduiche;

public class XBurguer extends Sanduiche {
    private boolean aberto;
    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


}

