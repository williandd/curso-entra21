import java.util.Scanner;

public class pairprogramming {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos");
        int alunos = oi.nextInt();
        System.out.println("Digite o número de questões da prova");
        int questoes = oi.nextInt();
        String pateta = oi.nextLine();
        String[] gabarito = {"a", "b", "c", "d", "e"};
        int nota = 10 / questoes;
        int[] notasfinais = new int[alunos];


        String[][] turma = new String[alunos][questoes + 1]; // lista de nomes dos alunos e questões
        int[] notas = new int[alunos];       // lista de notas dos alunos
        /* Inserção dos alunos  */
        for (int i = 0; i < alunos; i++) {
            System.out.println("Digite o nome do aluno");
            turma[i][0] = oi.nextLine();


            for (int k = 1; k <= questoes; k++) {

                System.out.println("Digite a resposta");
                String resposta = oi.nextLine();


                turma[i][k] = resposta;
            }
        }
        int x = 0;
        int z = 0;
        for (int m = 0; m < alunos; m++) {

            for (int n = 1; n <= questoes; n++) {
                if (turma[m][n].equals(gabarito[m])) {
                    z = z + nota;
                    notasfinais[x] = z;
                    x++;
                }
            }
        }

        for (int p = 0; p < alunos; p++) {

            System.out.println(turma[p][0] +"    " + notasfinais[p]);
        }


    }

}










