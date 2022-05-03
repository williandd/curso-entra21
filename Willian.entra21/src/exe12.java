import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = oi.nextInt();
        if (valor >=0) {
            System.out.println("O valor é positivo");
        }
        else {
            System.out.println("O valor é negativo");
        }
    }
}
