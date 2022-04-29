import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario  = oi.nextDouble();
        System.out.println("Percentual de aumento");
        double pa = oi.nextDouble();
        System.out.printf("Seu novo salario é: %.2f" , salario * pa /100 + salario);

    }
}
