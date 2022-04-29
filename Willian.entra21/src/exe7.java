import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Valor de fabrica do carro");
        int vf  = oi.nextInt();
        int pd = 28;
        int impostos = 45;
        System.out.printf("O valor total do carro é: %d" , (vf * pd)/100 +vf + (vf * impostos)/100 +vf);


    }
}
