import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite o valor total de suas vendas");
        int vendas = oi.nextInt();
        System.out.println("Digite seu salario fixo");
        int salario = oi.nextInt();
        System.out.println("Digite o numero de carros vendidos");
        int cv = oi.nextInt();
        System.out.println("Digite sua comissao fixa");
        int comissao = oi.nextInt();
        double salariototal = (100/ vendas  * 105) + salario + cv * comissao;
        System.out.printf("Seu salario final é: %.2f", salariototal);




    }
}
