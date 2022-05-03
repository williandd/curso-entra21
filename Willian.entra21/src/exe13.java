import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Informe o número de maçãs compradas");
        int valor = oi.nextInt();
        if (valor < 12) {
            System.out.printf("Valor da compra: R$%.2f", valor * 1.3);
        }
        else {
            System.out.printf("Valor da compra: R$%.2f", valor * 1.0);
        }
        }
    }

