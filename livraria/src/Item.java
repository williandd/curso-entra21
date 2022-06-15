import java.util.Scanner;

public abstract class Item {


    private String titulo;
    private String genero;
    private double valor;

    private Avaliacao[] avaliacoes = new Avaliacao[30];

    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliacao av = new Avaliacao();
        System.out.println("Informe o nome do avaliador");
        av.setNome(in.nextLine());
        System.out.println("Qual a avaliação(nota) de 0 a 10 ?");
        av.setRating(in.nextDouble());
        in.nextLine();
        System.out.println("Informe algum feedback (opicional): ");
        av.setFeedback(in.nextLine());
        for (int i = 0; i < getAvaliacoes().length ; i++) {
            if (getAvaliacoes()[i] == null){
                getAvaliacoes()[i] = av;
                break;
            }

        }

        }


        public double getTotalRating () {
        double soma = 0;
        int contador = 0;
        for (Avaliacao av : getAvaliacoes()){
            if (av != null) {
                soma += av.getRating();
                contador++;
            }
        }
            return soma/contador;
        }


        public String getTitulo () {
            return titulo;
        }

        public void setTitulo (String titulo){
            this.titulo = titulo;
        }

        public String getGenero () {
            return genero;
        }

        public void setGenero (String genero){
            this.genero = genero;
        }

        public double getValor () {
            return valor;
        }

        public void setValor ( double valor){
            this.valor = valor;
        }

        public Avaliacao[] getAvaliacoes () {
            return avaliacoes;
        }

        public void setAvaliacoes (Avaliacao[]avaliacoes){
            this.avaliacoes = avaliacoes;
        }
    }

