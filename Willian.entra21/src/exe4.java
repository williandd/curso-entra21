import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a base");
        double base = in.nextDouble();
        System.out.println("Informe a altura");
        double altura = in.nextDouble();
        double area = base * altura;
        double per = base * 2 + altura * 2;
        System.out.printf("Area: %2f\n" , area);
        System.out.printf("Perimetro: %.2f" , per);



    }
}
