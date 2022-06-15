import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Estante es = new Estante(5);
    public static void main(String[] args) {
        boolean loop = true;

        System.out.println("Informe a ação desejada: (1) para adicionar item, (2) para buscar e tratar retorno," +
                "(3) para remover item da estante, (4) para mostrar itens da estante, (0) para sair: ");
        int num = in.nextInt();
        switch (num) {
            case 0: loop = false; break;
            case 1:
                adicionarItem(es);
                break;
            case 2:
                buscarEtratarRetorno(es);
            case 3:
                removerItem(es);
                break;
            case 4:
                mostrarItem(es);
                break;


        }
    }

    public static void adicionarItem (Estante e) {
        if (e.estanteCheia()) {
            System.out.println("Sua estante está cheia! Não é possível aidicionar mais itens");
        } else {
            Item i = null;
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.println("Informe o item que deseja adicionar (0) para livro, (1) para DVD");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            System.out.println("Infome o título");
            i.setTitulo(in.nextLine());
            System.out.println("Informe o gênero");
            i.setGenero(in.nextLine());
            System.out.println("Informe o valor: R$");
            i.setValor(in.nextDouble());
            in.nextLine();
            if (i instanceof Livro){
                Livro l = ((Livro) i);
                System.out.println("Informe o autor");
                l.setAutor(in.nextLine());
                System.out.println("Informe a quantidade de páginas:");
                l.setQtdePaginas(in.nextInt());
                System.out.println("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                System.out.println("Informe a edição:");
                l.setEdicao(in.nextInt());
                in.nextLine();
            }else {
                DVD dvd = ((DVD) i);
                System.out.println("Informe o diretor: ");
                dvd.setDiretor(in.nextLine());
                System.out.println("Informe o ano de lançamento: ");
                dvd.setAnoLancamento(in.nextInt());
                System.out.println("Informe a duração do filme: ");
                dvd.setDuracao(in.nextDouble());
            }
            if(!e.adicionarItem(i)){
                System.err.println("Não foi possivel adicionar o item na estante!");
            }else {
                System.out.println("Item adicionado com sucesso!");
            }

        }
    }
    public static void removerItem (Estante e){

    }
    public static void mostrarItem (Estante e){

    }
    public static void buscarEtratarRetorno (Estante e){

    }

}
