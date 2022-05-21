import java.util.Scanner;

public class matrixexe {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Qual a quantidade de linhas");
        int linhas = oi.nextInt();
        System.out.println("Qual a quantidade de colunas");
        int colunas = oi.nextInt();
        for (int i =0 ; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("#");
            }

            System.out.println("");
        }



        }


    }





