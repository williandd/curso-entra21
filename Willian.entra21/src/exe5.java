import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("anos");
        int anos  = oi.nextInt();
        System.out.println("meses");
        int meses = oi.nextInt();
        System.out.println("dias");
        int dias = oi.nextInt();
        System.out.printf("Você viveu %d dias", (anos*365)+(meses*30)+dias);








    }
}
