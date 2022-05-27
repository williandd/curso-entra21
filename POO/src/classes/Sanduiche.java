package classes;

public abstract class Sanduiche extends lanche {
    public String[] adicionais = new String[10];

    public void adicionarAdicionial(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;

            }
        }

    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.adicionais[0] != null) {
            System.out.println("-ADICIONAIS-");
            for (String adi : this.adicionais)
                if (adi != null) {
                    System.out.println("--" + adi.toUpperCase() + "--\n");
                }
        }
    }
}
