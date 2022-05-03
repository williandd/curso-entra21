import java.util.Scanner;

public class exe17 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Hora de inicio do jogo");
        int inicio = oi.nextInt();
        System.out.println("Horario do fim do jogo");
        int fim = oi.nextInt();
        if (inicio > fim) {
            System.out.printf("Duração do jogo : %d", 24 - (inicio - fim));
        }
        else {
            System.out.printf("Duração do jogo %d", fim - inicio);
        }

    }

}
