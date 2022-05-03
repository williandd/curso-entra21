import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Qual o ano atual");
        int anoatual = oi.nextInt();
        System.out.println("Digite o ano do seu nascimento");
        int nascimento = oi.nextInt();
        if (anoatual - nascimento < 16) {
            System.out.println("Não pode votar");
        }
        else  {
            System.out.println("Pode votar");
        }

        }

    }

