import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite o primeiro valor");
        int valor1 = oi.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2 = oi.nextInt();
        if (valor1 > valor2) {
            System.out.println("O primeiro valor é maior que o segundo");
        }
        else {
            System.out.println("O segundo valor é maior que o primeiro");


        }
    }
}



