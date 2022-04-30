import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        double media;
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite sua primeira nota");
        double nota1 = oi.nextDouble();
        System.out.println("Digite sua segunda nota");
        double nota2 = oi.nextDouble();
        System.out.println("Digite sua terceira nota");
        double nota3 = oi.nextDouble();
        System.out.printf("Sua média final é: %.2f" , ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);

    }
}
