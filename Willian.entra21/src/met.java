import java.util.Scanner;

public class met {
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite algo");
        String algo = oi.nextLine();
        System.out.println("Lenght:" + algo.length());
        System.out.println("Empty:" + algo.isEmpty());
        System.out.println("Uppercase:" + algo.toUpperCase());
        System.out.println("Lowercase:" + algo.toLowerCase());
    }
}
