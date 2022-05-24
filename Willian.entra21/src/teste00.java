import java.util.Scanner;

public class teste00 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String mes[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro",
                "novembro", "dezembro" };
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i]+ " tem " + dias[i]+ " dias ");


        }
    }
}