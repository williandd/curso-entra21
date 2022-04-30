import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        double c;
        Scanner oi = new Scanner(System.in);

        System.out.println("Qual a temperatura em graus Fahrenheint?");
        c = oi.nextDouble();
        System.out.printf("A temperatura em graus Celcius é cº%.2f" ,   ((c -32)/9) *5 );

    }
}
